import java.util.Scanner;

public class NombresCompletos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(name());
	}
	
	public static String name(){
		
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe tu nombre");
		 String nombre = sc.nextLine();
		 System.out.println("Escribe tu apellido");
		 String apellido = sc.nextLine();
		 
		 String completo = nombre + " " + apellido;
		 
		 return("Bienvenido" + " "+ completo);
	}

}
