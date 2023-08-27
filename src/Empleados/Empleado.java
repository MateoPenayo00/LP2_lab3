package Empleados;

/**
 * Esta clase es encargada de manejar el empleado en todas las áreas posibles
 * Será definida de forma más específica conforme se revise el rol a profundidad
 */
abstract public class Empleado {
    private int cedulaIdentidad;
    private String nombreCompleto;
    private String cargo;
    private int salario;
    private int fechaDeEntrada;

    /**
     * Constructor de la clase empleado
     * @param CI Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre Nombre completo del empleado
     * @param salario Salario mensual del empleado
     * @param fechaEntrada Fecha en la que el empleado ingresó a la empresa
     */
    public Empleado (int CI, String nombre, int salario, int fechaEntrada){
        this.cedulaIdentidad = CI;
        this.nombreCompleto = nombre;
        this.salario = salario;
        this.fechaDeEntrada = fechaEntrada;
    }

    public int getCedulaIdentidad() {
        return cedulaIdentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getCargo() {
        return cargo;
    }

    public int getSalario() {
        return salario;
    }

    public int getFechaDeEntrada() {
        return fechaDeEntrada;
    }

    public void setCedulaIdentidad(int cedulaIdentidad) {
        this.cedulaIdentidad = cedulaIdentidad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public void setFechaDeEntrada(int fechaDeEntrada) {
        this.fechaDeEntrada = fechaDeEntrada;
    }

    /**
     * Metodo para marcar la hora de entrada del empleado, deberia comunicarse con una interfaz u otro sistema que controle el cumplimiento de horario de los empleados
     * @param horaDeEntrada String en formato hh:mm:ss
     */
    public void marcarEntrada (String horaDeEntrada){
        System.out.printf("\nEl empleado %s ha llegado a la hora %s", this.getNombreCompleto(), horaDeEntrada);
    }

    /**
     * Metodo para marcar la hora de salida del empleado, deberia comunicarse con una interfaz u otro sistema que controle el cumplimiento de horario de los empleados
     * @param horaDeSalida String en formato hh:mm:ss
     */
    public void marcarSalida (String horaDeSalida){
        System.out.printf("\nEl empleado %s ha llegado a la hora %s", this.getNombreCompleto(), horaDeSalida);
    }

    /**
     * Metodo para asignar un bono a un empleado, generalmente debe ser llamado por un gerente
     * @param montoBono Monto del bono a ser agregado al siguiente salario mensual del empleado
     */
    public void recibirBono (int montoBono){
        this.setSalario(this.getSalario() + montoBono);
        System.out.printf("\nEl empleado %s ha recibido un bono de %d! Su salario del siguiente mes es %d", this.getNombreCompleto(), montoBono, this.getSalario());
    }
}
