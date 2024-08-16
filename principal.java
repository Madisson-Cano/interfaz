package volable;

public class principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pajaro pajaro = new pajaro("parrow");
        avion avion = new avion("Boeing 747");
        
        pajaro.volar();
        pajaro.aterrizar();

        avion.volar();
        avion.aterrizar();

	}
	
}
