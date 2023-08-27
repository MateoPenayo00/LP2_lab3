package Empleados;

public class Gerente extends Empleado {

    /**
     * Constructor de la clase empleado
     *
     * @param CI           Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre       Nombre completo del empleado
     * @param salario      Salario mensual del empleado
     * @param fechaEntrada Fecha en la que el empleado ingresó a la empresa
     */
    public Gerente(int CI, String nombre, int salario, int fechaEntrada) {
        super(CI, nombre, salario, fechaEntrada);
    }

    /**
     * Metodo para entregar un bono a un empleado
     * @param empleadoABonificar Empleado que recibirá el bono
     * @param montoBono Monto del bono a ser agregado al siguiente salario mensual
     */
    public void entregarBono (Empleado empleadoABonificar, int montoBono){
        empleadoABonificar.recibirBono(montoBono);
    }
    /**
     * Genera una amonestacion a ser guardado en una base de datos
     * @param empleadoAAmonestar Empleado a ser amonestado
     * @param motivoAmonestacion Motivo por el que el empleado fue amonestado
     */
    public void generarAmonestacion  (Empleado empleadoAAmonestar, String motivoAmonestacion){
        System.out.printf("\nEl empleado %s ha sido amonestado por motivo %s", this.getNombreCompleto(), motivoAmonestacion);
    }

    /**
     * Metodo para generar un cronograma de actividades, actualmente no tiene implementacion
     */
    public void generarCronograma (){

    }

    /**
     * Metodo para generar un reporte de un empleado desde una base de datos, actualmente no tiene una implementacion
     * @param empleado Empleado a ser analizado
     */
    public void generarReporteEmpleado(Empleado empleado){

    }
}
