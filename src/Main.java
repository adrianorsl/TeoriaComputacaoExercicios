import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		Verificador numeros = new Verificador();
		String resultado;
		
		numeros.setA(ler.next());
		resultado = numeros.verificador(numeros.getA());
		
		System.out.println(resultado);
		
		
		
		
	}

}
