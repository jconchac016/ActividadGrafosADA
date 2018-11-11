import java.util.ArrayList;

/**
 * Clase principal que contiene el punto de entrada al programa.
 * Encargada de manejar el flujo de ejecuci�n del programa
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class Main {

    /**
     * TODO Documentar el algoritmo de c�lculo de caminos m�nimos
     *
     * @param grafoEntrada Grafo que represente el mapa de carreteras
     * @param cInicial     Nombre de la ciudad de partida
     * @param cFinal       Nombre de la ciudad de destino
     * @return Cadena con el recorrido m�s corto y su longitud
     */
    private static String calcularMinimoCamino(GrafoNDVIndexCad grafoEntrada, String cInicial, String cFinal) {
        // TODO - implement Main.calcularMinimoCamino
        return null;
    }

    /**
     * TODO Documentar el algoritmo de c�lculo de �rboles de expansi�n m�nimos
     *
     * @param grafoEntrada Grafo del que calcular su �rbol de expasi�n m�nimo
     * @param grafoRes     �rbol de expansi�n m�nimo del grafo de entrada
     * @return Suma de los valores de las etiquetas del �rbol de expasi�n m�nimo
     */
    private static float calcularExpansionMinima(GrafoNDVIndexCad grafoEntrada,
                                                 GrafoNDVIndexCad grafoRes) {
        float sumaEtiquetas = 0;                                // Suma total del valor de las etiquetas
        ArrayList<String> cjtoVertices = new ArrayList<>();     // Cjto de v�rtices del grafo resultado
        String[] verticesEntrada = grafoEntrada.verticesCadena();// Cjo de v�rtices del grafo de entrada
        String[] adyacentes;                                    //Adyacentes a cada v�rtice seleccionado
        String u;                                               // V�rtice actual
        String v;                                               // V�rtice adyacente

        for (int i = 0; cjtoVertices.size() < verticesEntrada.length; i++) {
            cjtoVertices.add(verticesEntrada[i]);               // A�ade el v�rtice actual a los visitados
            u = verticesEntrada[i];
            adyacentes = grafoEntrada.adyacentes(cjtoVertices.get(i));// Obtiene sus adyacentes

            String minimo = adyacentes[0];                      // V�rtice final que hace el arco m�nimo
            for (int j = 1; j < adyacentes.length; j++) {       // Busca el camino m�nimo con el v�rtice actual
                v = adyacentes[j];

                if (grafoEntrada.obtenerValorArco(u, v) > grafoEntrada.obtenerValorArco(u, minimo)) {
                    minimo = v;                                 // Actualiza el v�rtice m�nimo
                }
            }

            sumaEtiquetas += grafoEntrada.obtenerValorArco(u, minimo);
        }

        return sumaEtiquetas;
    }

    public static void main(String[] args) {
        Lector lector = new Lector();                           // Lector del flujo de entrada est�ndar
        Escritor escritor = new Escritor();                     // Escritor del flujo de salida est�ndar

        int n;                                                  // N�mero de ciudades del mapa
        int d;                                                  // N�mero de carreteras del mapa
        int p;                                                  // N�mero de preguntas
        String[][] preguntas;                                   // Campos de las preguntas sobre caminos m�nimos
        GrafoNDVIndexCad mapaCarreteras;                        // Grafo del mapa de carreteras (v�rtices -> ciudades)
        GrafoNDVIndexCad minimasCarreteras;                     // Grafo con las carreteras m�nimas para conectar toda ciudad

        // *** LECTURA DE DATOS ***

        n = lector.leerNumero();                                // Lee el n�mero de ciudades del mapa
        mapaCarreteras = new GrafoNDVIndexCad(n);               // Inicializa el mapa con las ciudades iniciales
        for (int i = 0; i < n; i++) {                           // A�ade las ciudades al mapa
            mapaCarreteras.insertarVertice(lector.leerLinea());
        }

        d = lector.leerNumero();                                // Lee el n�mero de carreteras del mapa
        String[] datos;                                         // Campos de la l�nea: 2 ciudades y 1 distancia
        for (int i = 0; i < d; i++) {
            datos = lector.leerLinea().split(" ");        // Divide la l�nea en sus campos
            // Inserta la ciudad en el mapa de carreteras
            mapaCarreteras.insertarArco(datos[0], datos[1], Float.parseFloat(datos[2]));
        }

        // *** PROBLEMA 1 ***

        p = lector.leerNumero();                                // Lee el n�mero de preguntas acerca de caminos m�nimos
        preguntas = new String[p][];                            // Inicializa la matriz de preguntas
        // Datos de la l�nea: 2 ciudades
        for (int i = 0; i < p; i++) {
            preguntas[i] = lector.leerLinea().split(" "); // Divide la l�nea en sus campos
            // Calcula el cam�no m�nimo y lo escribe
            escritor.escribirLinea(calcularMinimoCamino(mapaCarreteras, preguntas[i][0], preguntas[i][1]));
        }
        escritor.escribirLinea("");                             // Nueva l�nea

        // *** PROBLEMA 2 ***

        // Convierte el mapa de carreteras tal que todas las ciudades est�n conectadas y el coste de repararlas sea m�nimo
        minimasCarreteras = new GrafoNDVIndexCad(mapaCarreteras.getOrden());
        // Escribe el coste de reparar las m�nimas carreteras
        escritor.escribirLinea(String.valueOf(calcularExpansionMinima(mapaCarreteras, minimasCarreteras)));
        // TODO Escribir el coste total de rehabilitaci�n de carreteras

        // Calcula los caminos m�nimos a partir del nuevo mapa de carreteras
        for (int i = 0; i < p; i++) {
            // Calcula el cam�no m�nimo y lo escribe
            escritor.escribirLinea(calcularMinimoCamino(minimasCarreteras, preguntas[i][0], preguntas[i][1]));
        }
    }

}