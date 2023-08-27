package Empleados;

public class Informatico extends Empleado{
    private String nivelDeAcceso;
    /**
     * Constructor de la clase Informatico
     *
     * @param CI           Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre       Nombre completo del empleado
     * @param salario      Salario mensual del empleado
     * @param fechaEntrada Fecha en la que el empleado ingresó a la empresa
     * @param nivelDeAcceso Determina el nivel de acceso de seguridad del empleado
     */
    public Informatico(int CI, String nombre, int salario, int fechaEntrada, String nivelDeAcceso) {
        super(CI, nombre, salario, fechaEntrada);
        this.nivelDeAcceso = nivelDeAcceso;
    }

    public String getNivelDeAcceso() {
        return nivelDeAcceso;
    }

    public void setNivelDeAcceso(String nivelDeAcceso) {
        this.nivelDeAcceso = nivelDeAcceso;
    }

    /**
     * Reporta que el informatico a ayudado a un usuario
     * @param usuario Empleado ayudado
     * @param apoyoDescripcion Descripcion del trabajo que ha hecho el informatico
     */
    public void reportarApoyoAUsuario (Empleado usuario, String apoyoDescripcion){
        System.out.printf("El informatico %s ha ayudado al empleado %s en %s", this.getNombreCompleto(), usuario.getNombreCompleto(), apoyoDescripcion);
    }
}

