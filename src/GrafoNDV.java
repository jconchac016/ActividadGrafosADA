/**
 * Clase que modela un Grafo No Dirigido Valuado con indexado de v�rtices por enteros.
 * <p>
 * El tipo gen�rico T representa el tipo de las celdas de la matriz de adyacencia asociada al grafo
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class GrafoNDV<T> extends MatrizAdyacencia implements Grafo {

    /**
     * Constructor parametrizado de la clase. Instancia un grafo no dirigido valuado
     *
     * @param nVerticesInic N�mero de v�rtices iniciales del grafo
     */
    public GrafoNDV(int nVerticesInic) {
        super(nVerticesInic);
        // TODO - implement GrafoNDV.GrafoNDV
    }

    @Override
    public void crear() {

    }

    @Override
    public void insertarVertice(int vertice) {

    }

    @Override
    public void insertarArco(int vInicio, int vFin, Object valor) {

    }

    @Override
    public void borrarVertice(int vertice) {

    }

    @Override
    public void borrarArco(int vInicio, int vFin) {

    }

    @Override
    public boolean vacio() {
        return false;
    }

    @Override
    public int[] vertices() {
        return new int[0];
    }

    @Override
    public Object[][] arcos() {
        return new Object[0][];
    }

    @Override
    public int[] adyacentes(int vertice) {
        return new int[0];
    }

}