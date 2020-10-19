/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;


public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;

    public Futbolista() {
        super();
    }
// getter y setter

    public Futbolista(int id, String Nombre, String Apellidos, int Edad, int dorsal, String demarcacion ) {
        super(id, Nombre, Apellidos, Edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }
    

    @Override
    public String Partido() {
        return "Jugar el partido"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Viajar() {
        return "Para jugar el partido"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Concentrarse() {
        return "Alistandose para el partido"; //To change body of generated methods, choose Tools | Templates.
    }
   
  
}
