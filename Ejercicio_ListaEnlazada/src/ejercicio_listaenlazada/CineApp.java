package ejercicio_listaenlazada;
/**
 *
 * @author Ucortes227
 * 
 */
public class CineApp {

    public static void main(String[] args) {
        
        //Creamos la cola, con el numero de personas
        ListaEnlazada<Persona> cola = new ListaEnlazada<>();
        
        //se genera la cola
        generarCola(cola);
        
       
        double recaudacion;
        double recaudacionTotal=0;
        Persona espectadorActual;
        int edadActual;
        
        //se recorre la cola
        while(!cola.estaVacia()){
            
            
            espectadorActual=cola.devolverPrimero();
            edadActual=espectadorActual.getEdad();
            
           
            if(edadActual>=5 && edadActual<=10){
                recaudacion=1;
            }else if(edadActual>=11 && edadActual<=17){
                recaudacion=2.5;
            }else{
                recaudacion=3.5;
            }
            recaudacionTotal+=recaudacion;
            
            
            System.out.println("Una persona de "+edadActual+" años se le ha cobrado " +recaudacion+ " euros");
            
            //ell espactor se remueve de la cola
           
            cola.quitarPrimero();
            
        }
        
        
        System.out.println("La recaudación es de "+recaudacionTotal+" euros");
        
    }
    
    /**
     * Genera una cola de personas
     * @param cola
     */
    public static void generarCola(ListaEnlazada<Persona> cola){
        
       int numeroPersonas=generaNumeroAleatorio(1,50);
        
       for(int i=0;i<numeroPersonas;i++){
           cola.insertarUltimo(new Persona(generaNumeroAleatorio(5, 60)));
       } 
        
    }
    


    public static int generaNumeroAleatorio(int minimo, int maximo){
        
        int num=(int)Math.floor(Math.random()*(minimo-(maximo+1))+(maximo+1));
        return num;
    }
    
}
