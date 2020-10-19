/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

/**
 *
 * 
 */
public class Entrenador extends SeleccionFutbol {

    private String idFederacion;

    public Entrenador() {
        super();
    }
// getter y setter

    public Entrenador(int id, String Nombre, String Apellidos, int Edad, String idFederacion) {
        super(id, Nombre, Apellidos, Edad);
        this.idFederacion = idFederacion;
    }

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String Partido() {
        return "Dirigir en el partido"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Viajar() {
        return "Estar presente en el partido"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String Concentrarse() {
        return "Tactica para el partido"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
