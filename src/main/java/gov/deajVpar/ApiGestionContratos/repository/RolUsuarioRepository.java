/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.repository;

import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo F
 */
public interface RolUsuarioRepository extends JpaRepository<RolUsuario,Long> {
    
    public Optional<RolUsuario> findByNombreRol(String nombre);
}
