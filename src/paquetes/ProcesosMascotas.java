package paquetes;

import javax.swing.JOptionPane;

public class ProcesosMascotas {

	String nombre;
    String especie;
    int edad;
    String identificacion;
    public  ProcesosMascotas() {

    }
    
    public void name(	String nombre,String especie,int edad,String identificacion) {

    	  this.nombre = nombre;
    	  this.especie = especie;
    	  this.edad = edad;
    	  this.identificacion = identificacion;
	}

    
    
    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public int getEdad() {
        return edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }
    
    
    public void ingresar() {
        nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de la mascota:");
        especie = JOptionPane.showInputDialog(null, "Ingrese la especie de la mascota:");
        String edadStr = JOptionPane.showInputDialog(null, "Ingrese la edad de la mascota:");
        edad = Integer.parseInt(edadStr);
        identificacion = JOptionPane.showInputDialog(null, "Ingrese la identificación de la mascota:");
    }

    public void imprimir() {
        String informacion = "Nombre: " + nombre + "\n" +
                "Especie: " + especie + "\n" +
                "Edad: " + edad + "\n" +
                "Identificación: " + identificacion;
        JOptionPane.showMessageDialog(null, informacion);
    }
    
    public void hacerSonido() {
        String sonido = "";
        if (especie.equalsIgnoreCase("Perro")) {
            sonido = "¡Guau guau!";
        } else if (especie.equalsIgnoreCase("Gato")) {
            sonido = "¡Miau miau!";
        } else {
            sonido = "No se ha implementado un sonido para esta especie.";
        }
        JOptionPane.showMessageDialog(null, sonido);
    }
}
