/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.repository;

import gov.deajVpar.ApiGestionContratos.entity.RolUsuario;
import gov.deajVpar.ApiGestionContratos.entity.Usuario;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo F
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    public Optional<Usuario> findByUserNameAndPasswordAndEstado(String userName, String password, boolean estado);
    public Optional<Usuario> findByUserNameAndEstado(String userName, boolean estado);
    public List<Usuario> findByEstado(boolean eliminado);
    public List<Usuario> findByRolUsuarioAndEstado(RolUsuario rol,boolean estado);
}
