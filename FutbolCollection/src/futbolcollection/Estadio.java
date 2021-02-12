
package futbolcollection;

public class Estadio {
    String nombre = "";
    int inauguracion = 0;
    int capacidad = 0;
    int largo = 0;
    int ancho = 0;
    
    public Estadio(String nombre, int i, int c, int l, int a) {
	    this.nombre = nombre;
	    this.inauguracion = i;
	    this.capacidad = c;
	    this.largo = l;
	    this.ancho = a;
    }
}