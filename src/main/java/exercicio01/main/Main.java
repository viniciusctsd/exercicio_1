package exercicio01.main;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();	
		app.start();
		

	}

	private void start() {
		
		int idade = 15;
		
		System.out.println("A idade é de " + idade + " anos");
		
		idade = (idade + 5);
		idade = (idade * 2);
		
		System.out.println("O resultado da idade + 5 * 2 é:");
		System.out.println("Resultado 1 : "+idade);
		System.out.println("");
		System.out.println("O resultado 1 menos - 5 é: ");
		idade = (idade - 5);
		System.out.println("Resultado 2 : "+ idade);
	}

}
