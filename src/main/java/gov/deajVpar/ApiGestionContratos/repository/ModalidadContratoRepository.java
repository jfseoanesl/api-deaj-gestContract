/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.repository;

import gov.deajVpar.ApiGestionContratos.entity.ModalidadContrato;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Jairo F
 */
public interface ModalidadContratoRepository extends JpaRepository<ModalidadContrato, Long> {
    public List<ModalidadContrato> findByEliminado(boolean eliminado);
}
