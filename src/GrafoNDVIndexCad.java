import java.util.ArrayList;

/**
 * Clase que modela un grafo no dirigido valuado (con etiquetas positivas y que toman valores reales no negativos)
 * con indexaci�n de cadenas en lugar de indexacion de enteros.
 * Permite asociar el nombre de las ciuades a los v�rtices del grafo
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class GrafoNDVIndexCad extends GrafoNDV {

    /**
     * Colecci�n de nombres de ciudades del mapa de carreteras. Permite establecer un �ndice num�rico �nico a cada ciudad
     */
    private ArrayList<String> diccionarioCiudades;

    /**
     * Constructor parametrizado de la clase. Inicializa un grafo no dirigido y valuado con idexado por cadenas
     * de un tama�o inicial dado
     *
     * @param nVerticesInic N�mero de v�rtices inciales
     */
    public GrafoNDVIndexCad(int nVerticesInic) {
        super(nVerticesInic);
        // TODO - implement GrafoNDVIndexCad.GrafoNDVIndexCad
    }

    /**
     * A�ade el nombre de una ciudad a la lista de ciudades que se convertir�n en v�rtices del grafo
     *
     * @param nombreCiudad Nombre de la ciudad a registrar
     */
    public void a�adirCiudad(String nombreCiudad) {
        // TODO - implement GrafoNDVIndexCad.a�adirCiudad
    }

    /**
     * @return Devuelve el conjunto de v�rtices del grafo
     */
    public int[] vertices() {
        // TODO - implement GrafoNDVIndexCad.vertices
        return new int[0];
    }

    /**
     * @param indice �ndice asociado a un v�rtice del grafo y una ciudad
     * @return El nombre de la ciudad equivalente al �ndice indicado
     */
    private String ciudadEquivalente(int indice) {
        // TODO - implement GrafoNDVIndexCad.ciudadEquivalente
        return null;
    }

    /**
     * @param nombreCiudad Nombre de la ciudad mapeada a un v�rtice del grafo
     * @return El �ndice num�rico mapeado al nombre de una ciudad
     */
    private int indiceEquivalente(String nombreCiudad) {
        // TODO - implement GrafoNDVIndexCad.indiceEquivalente
        return 0;
    }

}