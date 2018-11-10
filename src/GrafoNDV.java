/**
 * Clase que modela un Grafo No Dirigido Valuado con indexado de v�rtices por enteros.
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class GrafoNDV extends MatrizAdyacencia implements Grafo {

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
    public void insertarArco(int vInicio, int vFin, float valor) {

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
    public float[][] arcos() {
        return new float[0][];
    }

    @Override
    public int[] adyacentes(int vertice) {
        return new int[0];
    }

}