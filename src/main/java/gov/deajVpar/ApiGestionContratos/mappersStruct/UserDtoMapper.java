/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.UsuarioDto;
import gov.deajVpar.ApiGestionContratos.entity.GeneroPersona;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.entity.UsuarioAdministrador;
import gov.deajVpar.ApiGestionContratos.service.TipoDocumentoService;
import java.time.LocalDate;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Jairo F
 */
@Mapper
public abstract class UserDtoMapper {
    
    
    private TipoDocumentoService tipoDocService;

   
    public UsuarioDto toDTO(Usuario usuario) {
        UsuarioDto instance = new UsuarioDto();
        instance.setId(usuario.getId());
        instance.setFechaNacimiento(usuario.getDatosPersona().getFechaNacimiento());
        instance.setGenero(usuario.getDatosPersona().getGenero().toString());
        instance.setNoDocumento(usuario.getDatosPersona().getNoDocumento());
        instance.setPassword(usuario.getPassword());
        instance.setTipoDocumento(TipoDocumentoDtoMapper.INSTANCE.toDto(usuario.getDatosPersona().getTipoDocumento()));
        instance.setUserName(usuario.getUserName());
        instance.setpApellido(usuario.getDatosPersona().getpApellido());
        instance.setpNombre(usuario.getDatosPersona().getpNombre());
        instance.setsApellido(usuario.getDatosPersona().getsApellido());
        instance.setsNombre(usuario.getDatosPersona().getsNombre());
        instance.setUserType(usuario.getUserType());
        return instance;
    }
    
    public UsuarioAdministrador toObj(UsuarioDto dto)
    {   
        UsuarioAdministrador instance=new UsuarioAdministrador();
        instance.setId(dto.getId());
        instance.getDatosPersona().setFechaNacimiento(dto.getFechaNacimiento());
        instance.getDatosPersona().setGenero(GeneroPersona.get(dto.getGenero()));
        instance.getDatosPersona().setNoDocumento(dto.getNoDocumento());
        instance.setPassword(dto.getPassword());
        instance.getDatosPersona().setTipoDocumento(TipoDocumentoDtoMapper.INSTANCE.toObj(dto.getTipoDocumento()));
        instance.setUserName(dto.getUserName());
        instance.getDatosPersona().setpApellido(dto.getpApellido());
        instance.getDatosPersona().setpNombre(dto.getpNombre());
        instance.getDatosPersona().setsApellido(dto.getsApellido());
        instance.getDatosPersona().setsNombre(dto.getsNombre());
        
        
        return instance;
    }
    
}
