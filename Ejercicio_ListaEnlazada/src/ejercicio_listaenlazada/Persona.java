package ejercicio_listaenlazada;

/**
 * @author Ucortes227
 */
public class Persona {
    
    private int edad;
    
    /**
     * Constructor
     * @param edad
     */
    public Persona(int edad){
        this.edad=edad;
    }

    /**
     * Devuelve la edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Modifica la edad
     * @param edad Valor edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
