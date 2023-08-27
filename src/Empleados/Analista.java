package Empleados;

public class Analista extends Informatico{

    /**
     * Constructor de la clase Informatico
     *
     * @param CI            Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre        Nombre completo del empleado
     * @param salario       Salario mensual del empleado
     * @param fechaEntrada  Fecha en la que el empleado ingresó a la empresa
     * @param nivelDeAcceso Determina el nivel de acceso de seguridad del empleado
     */
    public Analista(int CI, String nombre, int salario, int fechaEntrada, String nivelDeAcceso) {
        super(CI, nombre, salario, fechaEntrada, nivelDeAcceso);
    }

    /**
     * El analista comprueba la funcionalidad de un sistema y manda una conclusion de su analisis
     * @param sistemaProbado El sistema que ha sido analizado
     * @param conclusion Resumen de los resultados del analisis
     */
    public void probarFuncionalidad(String sistemaProbado, String conclusion){
        System.out.printf("El analsta %s ha probado el sistema %s y ha concluido %s", this.getNombreCompleto(), sistemaProbado, conclusion);
    }
}
