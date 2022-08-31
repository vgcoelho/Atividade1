import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		double nota1, nota2, media;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Primeiro Bimestre Digite a nota:");
		nota1 = input.nextDouble();
		nota1 = nota1 * 2;
		
		System.out.println("Segundo Bimestre Digite sua nota:");
		nota2 = input.nextDouble();
		nota2 = nota2 * 3;
		
		
		media = (nota1 + nota2) / 5;
		
		
		System.out.println("O resultado da media das notas apresentadas foram:" +media);
		

	}

}
