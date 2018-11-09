/**
 * Clase que modela una matriz cuadrada de ocupaci�n variable entre 1 y 20 nodos (ambos inclusive).
 * Representa la matriz adyacencia tanto de grafos valuados como no valuados.Es de orden igual al n�mero
 * de v�rtices del grafo.
 * <p>
 * El tipo gen�rico T representa el tipo de las celdas de la matriz de adyacencia asociada al grafo
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class MatrizAdyacencia<T> {

    private T[][] matrizAdy;

    /**
     * Orden de la matriz. N�mero de nodos que puede alojar
     */
    private int orden;

    /**
     * Constructor parametrizado de la clase. Inicializa la matriz con un orden dado
     *
     * @param orden Orden de la matriz a inicializar
     */
    public MatrizAdyacencia(int orden) {
        // TODO - implement MatrizAdyacencia.MatrizAdyacencia
    }

    /**
     * Cambia el valor de una celda de la matriz. Es una operaci�in destructiva, sobreescribe el antiguo valor
     *
     * @param valor Valor a insertar
     */
    protected void modificarCelda(T valor) {
        // TODO - implement MatrizAdyacencia.modificarCelda
    }

    /**
     * @param fila    Fila de la matriz a seleccionar
     * @param columna Columna de la matriz a seleccionar
     * @return Valor de la celda pedida
     */
    protected T obtenerValorCelda(int fila, int columna) {
        // TODO - implement MatrizAdyacencia.obtenerValorCelda
        return null;
    }

    /**
     * Inicializa la fila y columna equivalente al �ndice doble [indice,indice], incrementando en 1 el orden de la matriz
     *
     * @param indice indice que indique la fila y columna a inicializar
     */
    protected void insertarIndice(int indice) {
        // TODO - implement MatrizAdyacencia.insertarIndice
    }

    /**
     * Rellena con el valor nulo un �ndice conjunto de fila y columna, decrementando en 1 el orden de la matriz
     *
     * @param indice Indice a borrar
     */
    protected void borrarIndice(int indice) {
        // TODO - implement MatrizAdyacencia.borrarIndice
    }

    /**
     * Modifica el orden de la matriz. Un incremento positivo incrementa el orden y un incremento negativo lo decrementa
     *
     * @param incremento Valor en el que variar el orden de la matriz
     */
    private void incrementarOrden(int incremento) {
        // TODO - implement MatrizAdyacencia.incrementarOrden
    }

    /**
     * @return Devuelve el orden de la matriz
     */
    public int getOrden() {
        return orden;
    }

    /**
     * @return La matriz de adyacencia
     */
    public T[][] getMatrizAdy() {
        // TODO - implement MatrizAdyacencia.getMatrizAdy
        return null;
    }

}