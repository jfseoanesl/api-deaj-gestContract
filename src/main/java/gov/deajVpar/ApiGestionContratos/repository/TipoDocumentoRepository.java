/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.repository;

import gov.deajVpar.ApiGestionContratos.entity.TipoDocumento;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo F
 */
public interface TipoDocumentoRepository extends JpaRepository <TipoDocumento, Long> {
    
    public Optional<TipoDocumento> findByDescripcion(String descripcion);
    
}
