package Empleados;

public class Operador extends Informatico {


    /**
     * Constructor de la clase Informatico
     *
     * @param CI            Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre        Nombre completo del empleado
     * @param salario       Salario mensual del empleado
     * @param fechaEntrada  Fecha en la que el empleado ingresó a la empresa
     * @param nivelDeAcceso Determina el nivel de acceso de seguridad del empleado
     */
    public Operador(int CI, String nombre, int salario, int fechaEntrada, String nivelDeAcceso) {
        super(CI, nombre, salario, fechaEntrada, nivelDeAcceso);
    }

    /**
     * El operador solicita apoyo informatico de un tecnico
     * @param motivoApoyo Motivo por el que el operador solicita poyo
     */
    public void solicitarApoyo(String motivoApoyo){
        System.out.printf("El operador %s solicita apoyo por %s", this.getNombreCompleto(), motivoApoyo);
    }
}
