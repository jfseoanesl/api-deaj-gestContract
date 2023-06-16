/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gov.deajVpar.ApiGestionContratos.mappersStruct;

import gov.deajVpar.ApiGestionContratos.dtos.PersonaDto;
import gov.deajVpar.ApiGestionContratos.entity.GeneroPersona;
import gov.deajVpar.ApiGestionContratos.entity.Persona;
import gov.deajVpar.ApiGestionContratos.entity.PersonaJuridica;
import gov.deajVpar.ApiGestionContratos.entity.PersonaNatural;
import gov.deajVpar.ApiGestionContratos.entity.TipoPersona;
import java.util.ArrayList;
import org.mapstruct.Mapper;

/**
 *
 * @author Jairo F
 */
@Mapper(componentModel = "spring")
public abstract class PersonaDtoMapper {
    private TipoDocumentoMapperDto mapperTipo;

    public PersonaDtoMapper() {
        this.mapperTipo = new TipoDocumentoMapperDtoImp();
    }
    
    

    public PersonaDto toDto(Persona obj) {
        PersonaDto dto = new PersonaDto();
        dto.setIdPersona(obj.getIdPersona());
        dto.setTipoDocumento(this.mapperTipo.toDto(obj.getTipoDocumento()));
        dto.setListContratosSuscritos(new ArrayList());
        dto.setNoDocumento(obj.getNoDocumento());
        
        if (obj instanceof PersonaNatural) {
            PersonaNatural pn = (PersonaNatural)obj;
            dto.setFechaNacimiento(pn.getFechaNacimiento());
            dto.setGenero(pn.getGenero().toString());
            dto.setTipoPersona(TipoPersona.NATURAL.toString());
            dto.setpApellido(pn.getpApellido());
            dto.setpNombre(pn.getpNombre());
            dto.setsApellido(pn.getsApellido());
            dto.setsNombre(pn.getsNombre());
        } else {
            PersonaJuridica pj = (PersonaJuridica)obj;
            dto.setTipoPersona(TipoPersona.JURIDICA.toString());
            dto.setNombreEmpresa(pj.getNombreEmpresa());
        }
        
        return dto;

    }

    public Persona toObj(PersonaDto dto) {
        Persona obj=null;
        TipoPersona tipo = dto.getTipoDocumento().getTipoPersona();
        if(tipo==TipoPersona.NATURAL){
            PersonaNatural pn = new PersonaNatural();
             pn.setFechaNacimiento(dto.getFechaNacimiento());
             if(dto.getGenero()!=null)
                pn.setGenero(GeneroPersona.get(dto.getGenero()));
             
             pn.setpApellido(dto.getpApellido());
             pn.setpNombre(dto.getpNombre());
             pn.setsApellido(dto.getsApellido());
             pn.setsNombre(dto.getsNombre());
             obj = pn;
        
        }
        else{
            
            PersonaJuridica pj = new PersonaJuridica();
            pj.setNombreEmpresa(dto.getNombreEmpresa());
        
        }
         obj.setNoDocumento(dto.getNoDocumento());
         obj.setIdPersona(dto.getIdPersona());
         obj.setTipoDocumento(this.mapperTipo.toObj(dto.getTipoDocumento()));
         obj.setListContratosSuscritos(new ArrayList());
         
         return obj;
    }

}
