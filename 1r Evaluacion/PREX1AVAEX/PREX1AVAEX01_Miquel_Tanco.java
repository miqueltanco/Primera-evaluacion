public class PREX1AVAEX01_Miquel_Tanco {

	public static int CAT_EMPLEAT = 0;
	public static int CAT_ENCARREGAT = 1;
	public static int CAT_DIRECTIU = 2;
	public static int ANT_JUNIOR = 0;
	public static int ANT_SENIOR = 1;
	public static int ANT_EXPERT = 2;
	
	private String nom;
	private int edat;
	private int categoria;
	private int antiguitat;
	
	//**CONSTRUCTOR
	
		public PREX1AVAEX01_Miquel_Tanco(String nom, int edat, int categoria, int antiguitat) throws IllegalArgumentException {
			this.nom = nom;
			this.edat = edat;
			
			if (categoria < 0 || categoria > 3){ 
				throw new IllegalArgumentException("Error categoria incorrecta");
			}
			
			if (antiguitat < 0 || antiguitat > 3){ 
				throw new IllegalArgumentException("Error categoria incorrecta");
			}
			this.categoria = categoria;
			this.antiguitat = antiguitat;
		}
	
	//**GETTERS AND SETTERS**
	
	public String consultaNom() {
		return nom;
	}
	public void canviaNom(String nom) {
		this.nom = nom;
	}

	public int consultaEdat() {
		return edat;
	}

	public void canviaEdat(int edat) {
		this.edat = edat;
	}

	public int consultaCategoria() {
		return categoria;
	}
	
	public void canviaCategoria(int categoria) throws IllegalArgumentException {
		
		if (categoria < 0 || categoria > 3){ 
			throw new IllegalArgumentException("Error categoria incorrecta");
		}
		
		this.categoria = categoria;
	}

	public int consultaAntiguitat() {
		return antiguitat;
	}

	public void canviaAntiguitat(int antiguitat) throws IllegalArgumentException {
		
		if (antiguitat < 0 || antiguitat > 3){ 
			throw new IllegalArgumentException("Error categoria incorrecta");
		}
		
		this.antiguitat = antiguitat;
	}
	
	public double calculateSou() {
		
		double salario=1;
		double plus=1;
		
		switch (categoria) {
			case 1: 
				salario = 900*1.15;
				break;
			case 2: 
				salario = 900*1.35;
				break;
			case 3: 
				salario = 900*1.60;
				break;
		}
		
		switch (antiguitat) {
		case 1: 
			plus = 150;
			break;
		case 2: 
			plus = 300;
			break;
		case 3: 
			plus = 600;
			break;
	}
		salario = salario+plus;
		return salario;
	}
}
