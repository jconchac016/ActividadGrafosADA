/**
 * Clase principal que contiene el punto de entrada al programa.
 * Encargada de manejar el flujo de ejecuci�n
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class Main {

    /**
     * TODO Documentar el algoritmo de c�lculo de �rboles de expansi�n m�nimos
     *
     * @param grafoEntrada Grafo del que calcular su �rbol de expasi�n m�nimo
     * @return �rbol de expasi�n m�nimo
     */
    private static GrafoNDVIndexCad calcularExpansionMinima(GrafoNDVIndexCad grafoEntrada) {
        // TODO - implement Main.calcularExpansionMinima
        return null;
    }

    /**
     * TODO Documentar el algoritmo de c�lculo de caminos m�nimos
     *
     * @param grafoEntrada Grafo que represente el mapa de carreteras
     * @param cInicial     Nombre de la ciudad de partida
     * @param cFinal       Nombre de la ciudad de destino
     */
    private static void calcularMinimoCamino(GrafoNDVIndexCad grafoEntrada, String cInicial, String cFinal) {
        // TODO - implement Main.calcularMinimoCamino
    }

    public static void main(String[] args) {
        Lector lector = new Lector();                           // Lector del flujo de entrada est�ndar
        Escritor escritor = new Escritor();                     // Escritor del flujo de salida est�ndar

        int n;                                                  // N�mero de ciudades del mapa
        int d;                                                  // N�mero de carreteras del mapa
        int p;                                                  // N�mero de preguntas
        GrafoNDVIndexCad mapaCarreteras;                        // Grafo del mapa de carreteras (v�rtices -> ciudades)

        n = lector.leerNumero();                                // Lee el n�mero de ciudades del mapa
        mapaCarreteras = new GrafoNDVIndexCad(n);               // Inicializa el mapa con las ciudades iniciales
        for (int i = 0; i < n; i++) {                           // A�ade las ciudades al mapa
            mapaCarreteras.a�adirCiudad(lector.leerLinea());
        }
    }

}