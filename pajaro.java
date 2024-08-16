package volable;

public class pajaro implements Volable {
	
	  private String especie;	
	  
	  public pajaro(String especie) {
	        this.especie = especie;
	    }

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	public void volar() {
        System.out.println("El pajaro de especie " + especie + " esta volando");
    }

    public void aterrizar() {
    	System.out.println("El pajaro de especie " + especie + " esta aterrizando");
    }
}
