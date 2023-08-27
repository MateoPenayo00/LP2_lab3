package Empleados;

public class Main {
    public static void main(String[] args) {
        Informatico MateoP = new Informatico(4773875, "Mateo Penayo", 7000000, 1989, "Maximo");
        MateoP.marcarEntrada("09:07:56");
        MateoP.marcarSalida("19:11:33");
    }
}