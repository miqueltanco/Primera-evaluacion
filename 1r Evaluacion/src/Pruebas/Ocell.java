package Pruebas;

public class Ocell {

	String nombre;
	int edad;
	int peso;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public static void main (String args[]) {
		
		Ocell Javier;
		Javier = new Ocell();
		
		String color="blanco";
		
		Javier.setEdad(16);
		//sysout  y cntrl+space
		System.out.println(Javier.edad);
		System.out.println(color);
	}
}

