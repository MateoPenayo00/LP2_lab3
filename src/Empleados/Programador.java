package Empleados;
import java.util.List;

public class Programador extends Informatico{
    private List<String> lenguajesConocidos;
    /**
     * Constructor de la clase Informatico
     *
     * @param CI            Cedula de identidad del empleado, sin guiones ni puntos
     * @param nombre        Nombre completo del empleado
     * @param salario       Salario mensual del empleado
     * @param fechaEntrada  Fecha en la que el empleado ingresó a la empresa
     * @param nivelDeAcceso Determina el nivel de acceso de seguridad del empleado
     * @param lenguajesConocidos Lista de lenguajes que el programador maneja
     */
    public Programador(int CI, String nombre, int salario, int fechaEntrada, String nivelDeAcceso, List<String> lenguajesConocidos) {
        super(CI, nombre, salario, fechaEntrada, nivelDeAcceso);
        this.lenguajesConocidos = lenguajesConocidos;
    }
    public List<String> getLenguajesConocidos() {
        return lenguajesConocidos;
    }
    public void setLenguajesConocidos(List<String> lenguajesConocidos) {
        this.lenguajesConocidos = lenguajesConocidos;
    }

    /**
     * Metodo apra reportar la finalizacion de un programa hecha por el programador
     * @param programa Nombre del programa realizado por el programador
     */
    public void reportarProgama (String programa){
        System.out.printf("\nEl programador %s ha realizado un programa: %s", this.getNombreCompleto(), programa);
    }
}
