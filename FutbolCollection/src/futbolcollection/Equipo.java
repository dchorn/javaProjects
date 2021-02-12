
package futbolcollection;

import java.util.concurrent.TimeUnit;

public class Equipo {
    String nombre = "";
    int pg = 0;
    int pp = 0;
    int pe = 0;
    int gf = 0;
    Estadio estadio;
    Cromo[] cromos = new Cromo[18];
    
    // Hacer constructor de Equipo (mi parte Valencia , Valladolid, Villareal)

    public Equipo (String nombre, int pg, int pp, int pe, int gf, Estadio e) {
	    this.nombre = nombre;
	    this.pg = pg;
	    this.pp = pp;
	    this.pe = pe;
	    this.gf = gf;
	    this.estadio = e;
	    try {
            TimeUnit.SECONDS.sleep(0);
        } catch (InterruptedException ex) {
        //    Logger.getLogger(Equipo.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Inicializado "+this.nombre);
    }
}