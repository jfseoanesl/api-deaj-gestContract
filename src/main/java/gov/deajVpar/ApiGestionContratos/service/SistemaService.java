/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.service;

import gov.deajVpar.ApiGestionContratos.dtos.UsuarioDto;
import gov.deajVpar.ApiGestionContratos.entity.Dpto;
import gov.deajVpar.ApiGestionContratos.entity.GeneroPersona;
import gov.deajVpar.ApiGestionContratos.entity.Persona;
import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Sistema;
import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioAdministrador;
import gov.deajVpar.ApiGestionContratos.repository.SistemaRepository;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 *
 * @author Jairo F
 */
@Service
public class SistemaService {

    private SistemaRepository repository;
    private TipoDocumentoService tipoDocumentoService;
    private RolUsuarioService rolUsuarioService;
    private DptoService dptoService;
    private ModalidadContratoService modalidadContratoService;
    private TipoContratoService tipoContratoService;
    private UsuarioAdministradorService usuarioAdmonService;

    public SistemaService(SistemaRepository repository, TipoDocumentoService tipoDocumentoService, RolUsuarioService rolUsuarioService, DptoService dptoService, ModalidadContratoService modalidadContratoService, TipoContratoService tipoContratoService, UsuarioAdministradorService usuarioAdmonService) {
        this.repository = repository;
        this.tipoDocumentoService = tipoDocumentoService;
        this.rolUsuarioService = rolUsuarioService;
        this.dptoService = dptoService;
        this.modalidadContratoService = modalidadContratoService;
        this.tipoContratoService = tipoContratoService;
        this.usuarioAdmonService = usuarioAdmonService;
    }

           
    public Sistema save(Sistema sistema) {

        this.repository.save(sistema);
        return sistema;
        
    }

    
    public Sistema get() {
        List<Sistema> sistemas = this.repository.findAll();
        if (sistemas.size() > 0) {
            return sistemas.get(0);
        } else {
            return new Sistema();
        }
    }
    
   
    @Transactional
    public void inicializarSistema(Sistema sistema, List<Dpto> dptos, UsuarioDto user) throws Exception {
        this.tipoDocumentoService.initialize();
        this.modalidadContratoService.initialize();
        this.tipoContratoService.initialize();
        this.dptoService.saveAll(dptos);
        this.rolUsuarioService.initialize();
        UsuarioAdministrador admon = this.userDataDtoToUserAdmon(user);
        this.usuarioAdmonService.save(admon);
        sistema.setInicializado(true);
        this.save(sistema);
//        throw new DataIntegrityViolationException("Throwing exception for demoing Rollback!!!");
    }
    
    public UsuarioAdministrador userDataDtoToUserAdmon(UsuarioDto dataUser){
        
        TipoDocumento tipoDoc = this.tipoDocumentoService.findByDescripcion(dataUser.getTipoDocumento().getDescripcion()).get();
        Persona persona = new PersonaNatural(dataUser.getpNombre(), 
                                             dataUser.getsNombre(), 
                                             dataUser.getpApellido(),
                                             dataUser.getsApellido(), 
                                             GeneroPersona.get(dataUser.getGenero()), 
                                             dataUser.getFechaNacimiento(), 
                                             tipoDoc, 
                                             dataUser.getNoDocumento());
        
        RolUsuario rol = this.rolUsuarioService.findByNombreRol("Administrador").get();
        UsuarioAdministrador user = new UsuarioAdministrador((PersonaNatural) persona, 
                                                dataUser.getUserName(), 
                                                //PasswordEncoder.get().encode(dataUser.getPassword()), 
                                                dataUser.getPassword(),
                                                rol, 
                                                null, null);
        
        return user;
    
    }
    
    
    

}
