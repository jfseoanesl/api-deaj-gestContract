/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.controllers;

import gov.deajVpar.ApiGestionContratos.dtos.LoginDto;
import gov.deajVpar.ApiGestionContratos.dtos.PermisoUserDto;
import gov.deajVpar.ApiGestionContratos.dtos.SesionUserDto;
import gov.deajVpar.ApiGestionContratos.dtos.UsuarioDto;
import gov.deajVpar.ApiGestionContratos.entity.PermisoUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import gov.deajVpar.ApiGestionContratos.mappersStruct.DeajMapperImp;
import gov.deajVpar.ApiGestionContratos.mappersStruct.PermisoUserDtoMapper;
import gov.deajVpar.ApiGestionContratos.mappersStruct.UsuarioDtoMapperImp;
import gov.deajVpar.ApiGestionContratos.service.LoginService;
import gov.deajVpar.ApiGestionContratos.utility.PasswordEncoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jairo F
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService service;

    public LoginController() {
    }

    @PostMapping("/initLogin")
    public SesionUserDto login(@RequestBody LoginDto dto) {

        //Usuario userLogin = this.service.login(dto.getUsername(), dto.getPassword());
        Usuario userLogin = this.service.login(dto.getUsername());
        SesionUserDto sesion = new SesionUserDto();
        sesion.setEstado(false);
        if (userLogin != null) {
            if (PasswordEncoder.verifiedPasswordEncrypted(dto.getPassword(), userLogin.getPassword())) {
          
                sesion.setFechaLogin(LocalDate.now());
                sesion.setEstado(true);
                sesion.setUserRol(userLogin.getRolUsuario().getNombreRol());
                sesion.setUserType(userLogin.getUserType());
                List<PermisoUserDto> permisosDto = new ArrayList();
                for (PermisoUsuario p : userLogin.getRolUsuario().getListPermisosUsuario()) {
                    PermisoUserDto pDto = PermisoUserDtoMapper.INSTANCE.toDto(p);
                    permisosDto.add(pDto);
                }
                sesion.setUserPermisos(permisosDto);
                UsuarioDtoMapperImp mapper = new UsuarioDtoMapperImp();
                UsuarioDto userDto = mapper.toDTO(userLogin);
                sesion.setUser(userDto);
                DeajMapperImp mapperDeaj = new DeajMapperImp();
                sesion.setUserDeaj(mapperDeaj.toDTO(userLogin.getDireccionSeccional()));
            } else {
                sesion.setEstado(false);
            }
        } else {
            sesion.setEstado(false);
        }
        return sesion;

    }

}
