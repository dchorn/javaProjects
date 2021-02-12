
package futbolcollection;

import java.util.Scanner;

public class programaPrincipal {
	
    static Scanner sc = new Scanner(System.in);
    
    public static void main (String[]args){

        
        // Inicializamos el programa
        
        Album album = new Album();
        
        // Forma reutilizar la misma variable para todos los equipos
        
        inicializarEquipo(album);
        //String[] arr = altaDeCromoScann();
        //altaDeCromo(album, arr[0], arr[1], Integer.parseInt(arr[2]), Integer.parseInt(arr[3]));
        altaDeCromo(album, "Jose", "Perez", 0, 0);
        altaDeCromo(album, "Manolito", "asda", 0, 5);
        altaDeCromo(album, "Denys", "Chorny", 0, 2);
        altaDeCromo(album, "Andres", "Gimenez", 0, 8);
        altaDeCromo(album, "Jimmy", "Rubio", 0, 10);
        
        listaCromo(album, 0);
        
        bajaDeCromo(album, 0, 0);
        
        System.out.println();
        listaCromo(album , 0);
        System.out.println();
        listarEquipos(album);
        sc.close();
    }
    
    //Método para evitar escribir cada vez System.out....
    public static void print(String texto){
        System.out.println(texto);
    }
    
    public static void inicializarEquipo(Album album){
            
        // Inicialización alaves
        Estadio estadio = new Estadio("Mendizorroza",1924,19840,105,68);
        Equipo equipo = new Equipo("Alaves", 163,228,103,571, estadio);
        album.equipos[0] = equipo;
        
        // Inicialización Valencia
        estadio = new Estadio("Mestalla", 1923,55000,105,70);
        equipo = new Equipo("Valencia CF", 1238,650,890,4560, estadio);
        album.equipos[1] = equipo;
        
        // Inicializanco Valladolid
        estadio = new Estadio("José Zorrilla", 1982,27618,105,68);
        equipo = new Equipo("R. Valladolid CF", 482,410,650,1831, estadio);
        album.equipos[2] = equipo;

        // Inicializanco Villarreal
        estadio = new Estadio("Estadio de la cerámica", 1923,23500,105,68);
        equipo = new Equipo("Villareal CF", 312,199,249,1061, estadio);
        album.equipos[3] = equipo;
        
        //Inicialización del CA Osasuna
        estadio = new Estadio("El Sadar",1967,24481,104,67);
        equipo = new Equipo("CA Osasuna",438,577,339,1354,estadio);
        album.equipos[4] = equipo;
        
        //Inicialización del Real Sociedad
        estadio = new Estadio("Reale Arena",1993,40000,105,70);
        equipo = new Equipo("Real Sociedad",907,906,603,3395,estadio);
        album.equipos[5] = equipo;
        
        //Inicialización del Sevilla FC
        estadio = new Estadio("Ramón Sánchez-Pizjuán",1958,43883,105,70);
        equipo = new Equipo("Sevilla FC",1043,920,559,3845,estadio);
        album.equipos[6] = equipo;
          
        // Forma acortada de hacerlo
        album.equipos[7] = new Equipo("SD Eibar", 71, 98, 59, 268, new Estadio("Ipurua", 1947, 8100, 103, 65));
        album.equipos[8] = new Equipo("Getafe CF", 191, 231, 148, 653, new Estadio("Coliseum Alfonso Pérez", 1998, 17000, 105, 70));
        album.equipos[9] = new Equipo("Granada CF", 234, 263, 183, 871, new Estadio("Nuevo Los Cármenes", 1995, 19336, 105, 69));
        
        //Forma de hacerlo creando diferentes variables
        //Inicialización del RealBetis
        Estadio benitoVillamarin = new Estadio("Benito Villamarin",1929,60721,105,68);
        Equipo realBetis = new Equipo("Real Betis",648,729,1842,2314,benitoVillamarin);
        album.equipos[10] = realBetis;

        //Inicialización del CadizFC
        Estadio ramonDeCarranza = new Estadio("Ramon de Carranza",1955,25033,104,65);
        Equipo cadiz = new Equipo("Cadiz CF",104,217,125,391,ramonDeCarranza);
        album.equipos[11] = cadiz;
        
        //Inicialización del RCCelta
        Estadio abancaBalaidos = new Estadio("Abanca Balaidos",1928,29000,105,69);
        Equipo celta = new Equipo("Celta",616,770,426,2427,abancaBalaidos);
        album.equipos[12] = celta;
        //System.out.println(a.equipos[0].estadio.nombre);
        //System.out.println(a.equipos[1].estadio.nombre);
    }
    
    // Pide por terminal que introduzcas los diferentes atributos del cromo para darle de alta
    public static String[] altaDeCromoScann() {
    	String[] array = new String[4];
    	System.out.print("Nombre del cromo: ");
    	array[0] = sc.nextLine();
    	System.out.print("Apellido del cromo: ");
    	array[1] = sc.nextLine();
    	System.out.print("numero del cromo: ");
    	array[2] = sc.nextLine();
    	System.out.print("Equipo del cromo: ");
    	array[3] =  sc.nextLine();
    	
    	return array;
    }
    
    // Nos muestra la lista de todos los equipos que tenemos
    public static void listarEquipos(Album album){
        for(int i = 0; i < album.equipos.length; i++){
        	if (album.equipos[i] != null) {
	            System.out.println("ID:" + i + " " + album.equipos[i].nombre + "\n");
	            }
        	}
        }
    
    // Nos muestra la lista de los cromos de un equipo
    public static void listaCromo(Album album, int equipo){
        for (int i = 0; i < album.equipos[equipo].cromos.length; i++) {
        	if (album.equipos[equipo].cromos[i] != null) {
        		System.out.print(album.equipos[equipo].cromos[i].nombre + " " + album.equipos[equipo].cromos[i].apellido + "\n");
        	}
        }
    }
    
    // Damos de alta a un cromo y lo guardamos en el equipo
    public static void altaDeCromo(Album album, String nombre, String apellido, int idEquipo, int numero) {
    	Cromo cromo = new Cromo(nombre, apellido, numero, album.equipos[idEquipo]);
    	album.equipos[idEquipo].cromos[numero] = cromo;
    }
    
    // Damos de baja a un cromo eliminandolo
    public static void bajaDeCromo(Album album, int equipo, int numero) {
    	album.equipos[equipo].cromos[numero] = null;
    }
           
}