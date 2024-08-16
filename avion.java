package volable;

public class avion implements Volable {
	private String modelo;
	
	public avion(String modelo) {
        this.modelo = modelo;
    }
	
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public void volar() {
        System.out.println("El avión de modelo " + modelo + " esta volando");
    }

   
    public void aterrizar() {
    	System.out.println("El avión de modelo " + modelo + " esta aterrizando");
    }
}
