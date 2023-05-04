package gov.deajVpar.ApiGestionContratos.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jairo F
 */
@Entity
public class Contrato implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idContrato;
    @NotBlank
    private String noProceso;
    @Min(2000)
    @Max(3000)
    private int aInicioVigencia;
    @Min(2000)
    @Max(3000)
    private int aFinVigencia;
    @Column
    private String noContrato;
    @NotNull
    private EstadoContrato estadoContrato;
    @NotNull
    private EtapaContractual etapaContrato;
    @NotBlank
    private String objetoContrato;
    @NotNull
    private LocalDate fechaInicioEjecucion;
    @NotNull
    private LocalDate fechaFinEjecucion;
    @Min(1)
    private int duracionContrato; // meses
    @Min(1)
    private double cuantiaInicialContrato;
    @Min(1)
    private double cuantiaFinalContrato;
    @Min(0)
    @Max(1)
    private double pEjecucionFinanciera;
    @Min(0)
    @Max(1)
    private double pEjecucionFisica;
    private LocalDate fechaInicioProceso;
    @NotBlank
    private String enlaceSecop;
    private String enlaceWeb;
    private LocalDate fechaPublicacionSecop;
    private LocalDate fechaAperturaProceso;
    private LocalDate fechaCierreProceso;
    @NotNull
    private LocalDate fechaSuscripcionContrato;
    private LocalDate fechaAdjudicacionContrato;
    @NotNull
    private LocalDate fechaTerminacionContrato;
    private LocalDate fechaLiquidacionContrato;
    private LocalDate fechaDesignacionInterventor;
    private LocalDate fechaCierreContrato;
    
    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<LugarEjecucion> lugarEjecucion;
    @ManyToOne
    @JoinColumn(name = "contratista_id")
    private Persona contratistaAdjudicado;
    @ManyToOne
    @JoinColumn(name = "modalidad_id")
    private ModalidadContrato modalidad;
    @ManyToOne
    @JoinColumn(name = "submodalidad_id")
    private SubModalidadContrato subModalidad;
    @ManyToOne
    @JoinColumn(name = "tipocontrato_id")
    private TipoContrato tipoContrato;
    @ManyToOne
    @JoinColumn(name = "direccionseccional_id")
    private DireccionSeccional direccion;
    @ManyToOne
    @JoinColumn(name = "supervisor_id")
    private UsuarioSupervisor supervisor;
    @OneToMany(mappedBy = "contrato", cascade = CascadeType.ALL)
    private List<InformeSupervisor> listInformesSupervicion;
    @OneToMany(mappedBy = "contrato")
    private List<AlertaContrato> listHistoricoAlertas;
    @OneToMany(mappedBy = "contrato")
    private List<AnotacionContrato> listAnotacionesContrato;
    private boolean eliminado;
    
    public Contrato() {
//        this.eliminado=false;
//        DireccionSeccional direccion = new DireccionSeccional("Direccion seccional de valledupar", new UsuarioAdministrador());
//        
//        RolUsuario rol = new RolUsuario("Administradot", new UsuarioAdministrador());
//        PermisoUsuario permiso = new PermisoUsuario(Modulo.ALL, true, true, true, true, rol);
//        rol.getListPermisosUsuario().add(permiso);
//        TipoDocumento tipoCC = new TipoDocumento("CC", TipoPersona.NATURAL);
//        PersonaNatural persona = new PersonaNatural("jairo", "francisco", "seoanes", "leon", GeneroPersona.MASCULINO, LocalDate.of(1985, Month.MARCH, 5), tipoCC, "77097016");
//        Usuario admin = new UsuarioAdministrador(persona, "jfsl", "12345", rol, direccion, new UsuarioAdministrador());
//        
//        this.noProceso = "015-2018";
//        this.aInicioVigencia=2018;
//        this.aFinVigencia=2019;
//        this.noContrato="052";
//        this.estadoContrato = EstadoContrato.EJECUCION;
//        this.etapaContrato= EtapaContractual.CONTRACTUAL;
//        this.objetoContrato="Contratar en nombre de la nacion y del consejo superior de la judicatura"
//                            +" el arrendamiento de oficinas del edificio torre premiun de valledupar" ;
//        this.fechaInicioEjecucion= LocalDate.of(2018, Month.NOVEMBER, 1);
//        this.fechaFinEjecucion=LocalDate.of(2019, Month.OCTOBER, 31);
//        this.duracionContrato=12;
//        this.cuantiaInicialContrato=418300000;
//        this.cuantiaFinalContrato=418300000;
//        this.pEjecucionFinanciera=0;
//        this.pEjecucionFisica=0;
//        this.fechaInicioProceso=LocalDate.of(2018, Month.OCTOBER, 30);
//        
//        this.enlaceSecop="https://www.contratos.gov.co/";
//        this.enlaceWeb="https://www.contratos.gov.co/";
//        this.fechaPublicacionSecop=LocalDate.of(2018, Month.OCTOBER, 30);;
//        this.fechaAperturaProceso=LocalDate.of(2018, Month.OCTOBER, 30);;
//        this.fechaCierreProceso=null;
//        this.fechaSuscripcionContrato=LocalDate.of(2018, Month.OCTOBER, 30);;
//        this.fechaAdjudicacionContrato=LocalDate.of(2018, Month.OCTOBER, 30);;
//        this.fechaTerminacionContrato=LocalDate.of(2019, Month.OCTOBER, 31);
//        this.fechaLiquidacionContrato=null;
//        this.fechaDesignacionInterventor=null;
//        this.fechaCierreContrato=null;
//        
//        Dpto dpto = new Dpto(123, "Cesar");
//        Ciudad ciudad = new Ciudad("100", "Valledupar", dpto);
//        Ciudad ciudad2 = new Ciudad("200", "La Paz", dpto);
//        LugarEjecucion lugar1 = new LugarEjecucion(dpto, ciudad, "Calle 38a #5a-31", this);
//        LugarEjecucion lugar2 = new LugarEjecucion(dpto, ciudad, "Edificio caja agraria, calle 16 # 9-44", this);
//        this.lugarEjecucion = new ArrayList();
//        this.lugarEjecucion.add(lugar1);
//        this.lugarEjecucion.add(lugar2);
//        
//        TipoDocumento tipo = new TipoDocumento("nit", TipoPersona.JURIDICA);
//        Persona contratista = new PersonaJuridica("Inversiones guatapuri", tipo, "900579115-1");
//        this.contratistaAdjudicado= contratista;
//        
//        ModalidadContrato modalidad = new ModalidadContrato("Contratacion directa", "Contratacion directa", new UsuarioJuridica()); 
//        SubModalidadContrato subModalidad = new SubModalidadContrato("Subcontratacion", "Sub modalidad", modalidad, new UsuarioJuridica());
//        this.modalidad=modalidad;
//        this.subModalidad=subModalidad;
////        
//        TipoContrato tipoCOntrato = new TipoContrato("Arrendamiento", new UsuarioJuridica());
//        this.tipoContrato=tipoContrato;
//    
//        
//        this.direccion=direccion;
//        UsuarioSupervisor supervisor = new UsuarioSupervisor(persona, "jfsl", "12345", rol, direccion, admin);
//        this.supervisor=supervisor;
    
        
    }

    /**
     * @return the idContrato
     */
    public Long getIdContrato() {
        return idContrato;
    }

    /**
     * @param idContrato the idContrato to set
     */
    public void setIdContrato(Long idContrato) {
        this.idContrato = idContrato;
    }

    /**
     * @return the noProceso
     */
    public String getNoProceso() {
        return noProceso;
    }

    /**
     * @param noProceso the noProceso to set
     */
    public void setNoProceso(String noProceso) {
        this.noProceso = noProceso;
    }

    /**
     * @return the aInicioVigencia
     */
    public int getaInicioVigencia() {
        return aInicioVigencia;
    }

    /**
     * @param aInicioVigencia the aInicioVigencia to set
     */
    public void setaInicioVigencia(int aInicioVigencia) {
        this.aInicioVigencia = aInicioVigencia;
    }

    /**
     * @return the aFinVigencia
     */
    public int getaFinVigencia() {
        return aFinVigencia;
    }

    /**
     * @param aFinVigencia the aFinVigencia to set
     */
    public void setaFinVigencia(int aFinVigencia) {
        this.aFinVigencia = aFinVigencia;
    }

    /**
     * @return the noContrato
     */
    public String getNoContrato() {
        return noContrato;
    }

    /**
     * @param noContrato the noContrato to set
     */
    public void setNoContrato(String noContrato) {
        this.noContrato = noContrato;
    }

    /**
     * @return the estadoContrato
     */
    public EstadoContrato getEstadoContrato() {
        return estadoContrato;
    }

    /**
     * @param estadoContrato the estadoContrato to set
     */
    public void setEstadoContrato(EstadoContrato estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    /**
     * @return the etapaContrato
     */
    public EtapaContractual getEtapaContrato() {
        return etapaContrato;
    }

    /**
     * @param etapaContrato the etapaContrato to set
     */
    public void setEtapaContrato(EtapaContractual etapaContrato) {
        this.etapaContrato = etapaContrato;
    }

    /**
     * @return the objetoContrato
     */
    public String getObjetoContrato() {
        return objetoContrato;
    }

    /**
     * @param objetoContrato the objetoContrato to set
     */
    public void setObjetoContrato(String objetoContrato) {
        this.objetoContrato = objetoContrato;
    }

    /**
     * @return the fechaInicioEjecucion
     */
    public LocalDate getFechaInicioEjecucion() {
        return fechaInicioEjecucion;
    }

    /**
     * @param fechaInicioEjecucion the fechaInicioEjecucion to set
     */
    public void setFechaInicioEjecucion(LocalDate fechaInicioEjecucion) {
        this.fechaInicioEjecucion = fechaInicioEjecucion;
    }

    /**
     * @return the fechaFinEjecucion
     */
    public LocalDate getFechaFinEjecucion() {
        return fechaFinEjecucion;
    }

    /**
     * @param fechaFinEjecucion the fechaFinEjecucion to set
     */
    public void setFechaFinEjecucion(LocalDate fechaFinEjecucion) {
        this.fechaFinEjecucion = fechaFinEjecucion;
    }

    /**
     * @return the duracionContrato
     */
    public int getDuracionContrato() {
        return duracionContrato;
    }

    /**
     * @param duracionContrato the duracionContrato to set
     */
    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    /**
     * @return the cuantiaInicialContrato
     */
    public double getCuantiaInicialContrato() {
        return cuantiaInicialContrato;
    }

    /**
     * @param cuantiaInicialContrato the cuantiaInicialContrato to set
     */
    public void setCuantiaInicialContrato(double cuantiaInicialContrato) {
        this.cuantiaInicialContrato = cuantiaInicialContrato;
    }

    /**
     * @return the cuantiaFinalContrato
     */
    public double getCuantiaFinalContrato() {
        return cuantiaFinalContrato;
    }

    /**
     * @param cuantiaFinalContrato the cuantiaFinalContrato to set
     */
    public void setCuantiaFinalContrato(double cuantiaFinalContrato) {
        this.cuantiaFinalContrato = cuantiaFinalContrato;
    }

    /**
     * @return the pEjecucionFinanciera
     */
    public double getpEjecucionFinanciera() {
        return pEjecucionFinanciera;
    }

    /**
     * @param pEjecucionFinanciera the pEjecucionFinanciera to set
     */
    public void setpEjecucionFinanciera(double pEjecucionFinanciera) {
        this.pEjecucionFinanciera = pEjecucionFinanciera;
    }

    /**
     * @return the pEjecucionFisica
     */
    public double getpEjecucionFisica() {
        return pEjecucionFisica;
    }

    /**
     * @param pEjecucionFisica the pEjecucionFisica to set
     */
    public void setpEjecucionFisica(double pEjecucionFisica) {
        this.pEjecucionFisica = pEjecucionFisica;
    }

    /**
     * @return the fechaInicioProceso
     */
    public LocalDate getFechaInicioProceso() {
        return fechaInicioProceso;
    }

    /**
     * @param fechaInicioProceso the fechaInicioProceso to set
     */
    public void setFechaInicioProceso(LocalDate fechaInicioProceso) {
        this.fechaInicioProceso = fechaInicioProceso;
    }

    /**
     * @return the enlaceSecop
     */
    public String getEnlaceSecop() {
        return enlaceSecop;
    }

    /**
     * @param enlaceSecop the enlaceSecop to set
     */
    public void setEnlaceSecop(String enlaceSecop) {
        this.enlaceSecop = enlaceSecop;
    }

    /**
     * @return the enlaceWeb
     */
    public String getEnlaceWeb() {
        return enlaceWeb;
    }

    /**
     * @param enlaceWeb the enlaceWeb to set
     */
    public void setEnlaceWeb(String enlaceWeb) {
        this.enlaceWeb = enlaceWeb;
    }

    /**
     * @return the fechaPublicacionSecop
     */
    public LocalDate getFechaPublicacionSecop() {
        return fechaPublicacionSecop;
    }

    /**
     * @param fechaPublicacionSecop the fechaPublicacionSecop to set
     */
    public void setFechaPublicacionSecop(LocalDate fechaPublicacionSecop) {
        this.fechaPublicacionSecop = fechaPublicacionSecop;
    }

    /**
     * @return the fechaAperturaProceso
     */
    public LocalDate getFechaAperturaProceso() {
        return fechaAperturaProceso;
    }

    /**
     * @param fechaAperturaProceso the fechaAperturaProceso to set
     */
    public void setFechaAperturaProceso(LocalDate fechaAperturaProceso) {
        this.fechaAperturaProceso = fechaAperturaProceso;
    }

    /**
     * @return the fechaCierreProceso
     */
    public LocalDate getFechaCierreProceso() {
        return fechaCierreProceso;
    }

    /**
     * @param fechaCierreProceso the fechaCierreProceso to set
     */
    public void setFechaCierreProceso(LocalDate fechaCierreProceso) {
        this.fechaCierreProceso = fechaCierreProceso;
    }

    /**
     * @return the fechaSuscripcionContrato
     */
    public LocalDate getFechaSuscripcionContrato() {
        return fechaSuscripcionContrato;
    }

    /**
     * @param fechaSuscripcionContrato the fechaSuscripcionContrato to set
     */
    public void setFechaSuscripcionContrato(LocalDate fechaSuscripcionContrato) {
        this.fechaSuscripcionContrato = fechaSuscripcionContrato;
    }

    /**
     * @return the fechaAdjudicacionContrato
     */
    public LocalDate getFechaAdjudicacionContrato() {
        return fechaAdjudicacionContrato;
    }

    /**
     * @param fechaAdjudicacionContrato the fechaAdjudicacionContrato to set
     */
    public void setFechaAdjudicacionContrato(LocalDate fechaAdjudicacionContrato) {
        this.fechaAdjudicacionContrato = fechaAdjudicacionContrato;
    }

    /**
     * @return the fechaTerminacionContrato
     */
    public LocalDate getFechaTerminacionContrato() {
        return fechaTerminacionContrato;
    }

    /**
     * @param fechaTerminacionContrato the fechaTerminacionContrato to set
     */
    public void setFechaTerminacionContrato(LocalDate fechaTerminacionContrato) {
        this.fechaTerminacionContrato = fechaTerminacionContrato;
    }

    /**
     * @return the fechaLiquidacionContrato
     */
    public LocalDate getFechaLiquidacionContrato() {
        return fechaLiquidacionContrato;
    }

    /**
     * @param fechaLiquidacionContrato the fechaLiquidacionContrato to set
     */
    public void setFechaLiquidacionContrato(LocalDate fechaLiquidacionContrato) {
        this.fechaLiquidacionContrato = fechaLiquidacionContrato;
    }

    /**
     * @return the fechaDesignacionInterventor
     */
    public LocalDate getFechaDesignacionInterventor() {
        return fechaDesignacionInterventor;
    }

    /**
     * @param fechaDesignacionInterventor the fechaDesignacionInterventor to set
     */
    public void setFechaDesignacionInterventor(LocalDate fechaDesignacionInterventor) {
        this.fechaDesignacionInterventor = fechaDesignacionInterventor;
    }

    /**
     * @return the fechaCierreContrato
     */
    public LocalDate getFechaCierreContrato() {
        return fechaCierreContrato;
    }

    /**
     * @param fechaCierreContrato the fechaCierreContrato to set
     */
    public void setFechaCierreContrato(LocalDate fechaCierreContrato) {
        this.fechaCierreContrato = fechaCierreContrato;
    }

    /**
     * @return the lugarEjecucion
     */
    public List<LugarEjecucion> getLugarEjecucion() {
        return lugarEjecucion;
    }

    /**
     * @param lugarEjecucion the lugarEjecucion to set
     */
    public void setLugarEjecucion(List<LugarEjecucion> lugarEjecucion) {
        this.lugarEjecucion = lugarEjecucion;
    }

    /**
     * @return the contratistaAdjudicado
     */
    public Persona getContratistaAdjudicado() {
        return contratistaAdjudicado;
    }

    /**
     * @param contratistaAdjudicado the contratistaAdjudicado to set
     */
    public void setContratistaAdjudicado(Persona contratistaAdjudicado) {
        this.contratistaAdjudicado = contratistaAdjudicado;
    }

    /**
     * @return the modalidad
     */
    public ModalidadContrato getModalidad() {
        return modalidad;
    }

    /**
     * @param modalidad the modalidad to set
     */
    public void setModalidad(ModalidadContrato modalidad) {
        this.modalidad = modalidad;
    }

    /**
     * @return the subModalidad
     */
    public SubModalidadContrato getSubModalidad() {
        return subModalidad;
    }

    /**
     * @param subModalidad the subModalidad to set
     */
    public void setSubModalidad(SubModalidadContrato subModalidad) {
        this.subModalidad = subModalidad;
    }

    /**
     * @return the tipoContrato
     */
    public TipoContrato getTipoContrato() {
        return tipoContrato;
    }

    /**
     * @param tipoContrato the tipoContrato to set
     */
    public void setTipoContrato(TipoContrato tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    /**
     * @return the direccion
     */
    public DireccionSeccional getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(DireccionSeccional direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the supervisor
     */
    public UsuarioSupervisor getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(UsuarioSupervisor supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the listInformesSupervicion
     */
    public List<InformeSupervisor> getListInformesSupervicion() {
        return listInformesSupervicion;
    }

    /**
     * @param listInformesSupervicion the listInformesSupervicion to set
     */
    public void setListInformesSupervicion(List<InformeSupervisor> listInformesSupervicion) {
        this.listInformesSupervicion = listInformesSupervicion;
    }

    /**
     * @return the listHistoricoAlertas
     */
    public List<AlertaContrato> getListHistoricoAlertas() {
        return listHistoricoAlertas;
    }

    /**
     * @param listHistoricoAlertas the listHistoricoAlertas to set
     */
    public void setListHistoricoAlertas(List<AlertaContrato> listHistoricoAlertas) {
        this.listHistoricoAlertas = listHistoricoAlertas;
    }

    /**
     * @return the listAnotacionesContrato
     */
    public List<AnotacionContrato> getListAnotacionesContrato() {
        return listAnotacionesContrato;
    }

    /**
     * @param listAnotacionesContrato the listAnotacionesContrato to set
     */
    public void setListAnotacionesContrato(List<AnotacionContrato> listAnotacionesContrato) {
        this.listAnotacionesContrato = listAnotacionesContrato;
    }

    @Override
    public String toString() {
        return "Contrato{" + "idContrato=" + idContrato + ", noProceso=" + noProceso + ", aInicioVigencia=" + aInicioVigencia + ", aFinVigencia=" + aFinVigencia + ", noContrato=" + noContrato + ", estadoContrato=" + estadoContrato + ", etapaContrato=" + etapaContrato + ", objetoContrato=" + objetoContrato + ", fechaInicioEjecucion=" + fechaInicioEjecucion + ", fechaFinEjecucion=" + fechaFinEjecucion + ", duracionContrato=" + duracionContrato + ", cuantiaInicialContrato=" + cuantiaInicialContrato + ", cuantiaFinalContrato=" + cuantiaFinalContrato + ", pEjecucionFinanciera=" + pEjecucionFinanciera + ", pEjecucionFisica=" + pEjecucionFisica + ", fechaInicioProceso=" + fechaInicioProceso + ", enlaceSecop=" + enlaceSecop + ", enlaceWeb=" + enlaceWeb + ", fechaPublicacionSecop=" + fechaPublicacionSecop + ", fechaAperturaProceso=" + fechaAperturaProceso + ", fechaCierreProceso=" + fechaCierreProceso + ", fechaSuscripcionContrato=" + fechaSuscripcionContrato + ", fechaAdjudicacionContrato=" + fechaAdjudicacionContrato + ", fechaTerminacionContrato=" + fechaTerminacionContrato + ", fechaLiquidacionContrato=" + fechaLiquidacionContrato + ", fechaDesignacionInterventor=" + fechaDesignacionInterventor + ", fechaCierreContrato=" + fechaCierreContrato + ", lugarEjecucion=" + lugarEjecucion + ", contratistaAdjudicado=" + contratistaAdjudicado + ", modalidad=" + modalidad + ", subModalidad=" + subModalidad + ", tipoContrato=" + tipoContrato + ", direccion=" + direccion + ", supervisor=" + supervisor + '}';
    }

    /**
     * @return the idContrato
     */
    

    
    
}
