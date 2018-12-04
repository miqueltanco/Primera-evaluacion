
public class Cavall {

	float altura;
	int edad;
	int peso;
	String color;
	boolean propietario;
	String raza;
	String sexo;
	static String nombrepropietario="Mario";
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPropietario() {
		return propietario;
	}
	public void setPropietario(boolean propietario) {
		this.propietario = propietario;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public static String getNombrepropietario() {
		return nombrepropietario;
	}
	public static void setNombrepropietario(String nombrepropietario) {
		Cavall.nombrepropietario = nombrepropietario;
	}
	
	public String correr() {
		return "está corriendo";
	}
	
}
