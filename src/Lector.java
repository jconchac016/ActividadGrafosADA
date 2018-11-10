import java.io.IOException;
import java.io.InputStream;

/**
 * Clase que implementa una serie de operaciones de lectura del flujo est�ndar
 *
 * @author Juan Pablo Garc�a Plaza P�rez - Jose �ngel Concha Carrasco
 */
public class Lector {

    /**
     * Flujo de entrada est�ndar
     */
    private InputStream entradaEstandar;

    /**
     * Constructor por defecto de la clase. Inicializa el flujo de entrada est�ndar
     */
    public Lector() {
        entradaEstandar = System.in;
    }

    /**
     * @return N�mero le�do del flujo de entrada est�ndar
     */
    public int leerNumero() {
        return Integer.parseInt(leerLinea());
    }

    /**
     * @return L�nea le�da del flujo de entrada est�ndar
     */
    public String leerLinea() {
        int sigByte = -1;
        StringBuilder sb = new StringBuilder();

        do {
            try {
                sigByte = entradaEstandar.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            sb.append((char) sigByte);
        } while (sigByte != '\n');

        return sb.toString().trim();
    }

}