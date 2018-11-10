import java.util.ArrayList;

/**
 * Clase que modela un grafo no dirigido valuado (con etiquetas positivas y que toman valores reales no negativos)
 * con indexaci�n de cadenas en lugar de indexacion de enteros.
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class GrafoNDVIndexCad extends GrafoNDV {

    /**
     * Colecci�n cadenas. Permite establecer un �ndice num�rico �nico a cada cadena
     */
    private ArrayList<String> diccionarioCadenas;

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
     * @param cadena Cadena con la que indexar un v�rtice
     */
    public void insertarVertice(String cadena) {
        // TODO - implement GrafoNDVIndexCad.a�adirCiudad
    }

    /**
     * Inserta un arco etiquetado
     *
     * @param vInicio V�rtice inicial
     * @param vFin    Vertice final
     * @param valor   Etiqueta del arco
     */
    public void insertarArco(String vInicio, String vFin, float valor) {

    }

    /**
     * @param vInicio V�rtice inicial
     * @param vFin    V�rtice final
     * @return Valor de la etiqueta del arco que une dos v�rtices
     */
    public float obtenerValorArco(String vInicio, String vFin) {
        return 0;
    }

    /**
     * @param vertice V�rtice del que obtener sus adyacentes
     * @return V�rtices adyacentes al v�rtice indicado
     */
    public int[] adyacentes(String vertice) {
        return new int[0];
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
     * @return Cadena equivalente al �ndice indicado
     */
    private String cacenaEquivalente(int indice) {
        // TODO - implement GrafoNDVIndexCad.ciudadEquivalente
        return null;
    }

    /**
     * @param cadena Cadena mapeada a un v�rtice del grafo
     * @return El �ndice num�rico mapeado a una cadena
     */
    private int indiceEquivalente(String cadena) {
        // TODO - implement GrafoNDVIndexCad.indiceEquivalente
        return 0;
    }

}