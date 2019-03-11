package minijuego;

public class Enemigos{
	private String nombre;
	private String clase;
	private int vida;
	private int ataque;
	private int resistencia;
	
	public Enemigos(String nombre, String clase, int vida, int ataque, int resistencia) {
		this.nombre = nombre;
		this.clase = clase;
		this.vida = vida;
		this.ataque = ataque;
		this.resistencia = resistencia;
	
	}
	
	public static void saltar(Enemigos e) {
		System.out.println("El enemigo esta saltando");
	}

    public static void atacar(Enemigos e) {
	System.out.println("El enemigo esta atacando");
	}
	
    public static void hacerse_el_muerto(Enemigos e) {
	System.out.println("El enemigo esta haciendose el muerto");
	}
	
    public String getNombre() {
		return this.nombre; 
	}
	
    public String getClase() {
  		return this.clase; 
  	}
	
    public int getVida() {
  		return this.vida; 
  	}
    
    public int getAtaque() {
  		return this.ataque; 
  	}
    public int getReistencia() {
  		return this.resistencia; 
  	}
    
    public void setVida(int e) {
    	this.vida = e;
    }
  

}
