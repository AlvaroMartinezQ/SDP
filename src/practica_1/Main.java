package practica_1;

public class Main {
    public static void main(String[] args) {
        Complejidad complejidad = new Complejidad(1000);
        complejidad.ejecutarAlgoritmos();
        complejidad.imprimeTiempos();
        complejidad.guardarDatos("tiempos.csv");
    }
}
