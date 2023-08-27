package Empleados;
import java.util.List;
public class TecnicoMantenimiento extends Empleado{
    private List<String> equiposPermitidos;
    private List<String> herramientasPermitidas;


    /**
     * Constructor de la clase TecnicoMantenimiento
     *
     * @param CI           Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre       Nombre completo del empleado
     * @param salario      Salario mensual del empleado
     * @param fechaEntrada Fecha en la que el empleado ingresó a la empresa
     * @param equiposPermitidos Equipos sobre los cuales el tecnico tiene permitido trabajar
     * @param herramientasPermitidas Herramientas que el tecnico tiene permitido retirar
     */
    public TecnicoMantenimiento(int CI, String nombre, int salario, int fechaEntrada, List<String> equiposPermitidos, List<String> herramientasPermitidas) {
        super(CI, nombre, salario, fechaEntrada);
        this.equiposPermitidos = equiposPermitidos;
        this.herramientasPermitidas = herramientasPermitidas;
    }
    public List<String> getEquiposPermitidos() {
        return equiposPermitidos;
    }

    public List<String> getHerramientasPermitidas() {
        return herramientasPermitidas;
    }

    public void setEquiposPermitidos(List<String> equiposPermitidos) {
        this.equiposPermitidos = equiposPermitidos;
    }

    public void setHerramientasPermitidas(List<String> herramientasPermitidas) {
        this.herramientasPermitidas = herramientasPermitidas;
    }

    /**
     * El tecnico reporta un mantenimiento que ha realizado
     * @param equipoMantenimiento El codigo del equipo sobre el que se ha trabajado. Debe exisitir dentro de la lista de equipos permitidos del tecnico
     */
    public void reportarMantenimiento (String equipoMantenimiento){
        System.out.printf("\nEl tecnico %s ha realizado mantemiento sobre el equipo %s", this.getNombreCompleto(), equipoMantenimiento);
    }

    /**
     * El tecnico solicita un repuesto
     * @param repuestoASolicitar Codigo del repuesto a ser requerido
     */
    public void solicitarRepuestos (String repuestoASolicitar){
        System.out.printf("\nEl tecnico %s solicita el repuesto %s", this.getNombreCompleto(), repuestoASolicitar);
    }

    /**
     * El tecnico da de baja un equipo defectuoso
     * @param equipoBaja Codigo del equipo a dar de baja
     */
    public void reportarBaja (String equipoBaja){
        System.out.printf("\nEl tecnico %s ha dado de baja el equipo %s", this.getNombreCompleto(), equipoBaja);
    }
}
