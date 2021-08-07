import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;
		String[] aluno = new String[5];
		double[] nota = new double[5];
		
		for(int i=0;i<aluno.length;i++) {
			System.out.println("Digite o nome do Aluno : ");
			aluno[i] = sc.next();
			System.out.println("Digite a nota do Aluno : ");
			nota[i] = sc.nextDouble();
			media = nota[i] + media;
			
		}
		media = media / aluno.length;
		System.out.println("A média da sala é: " + media);
		for(int i=0;i<aluno.length;i++) {
			if(nota[i] < media) {
				System.out.println("Chamar o aluno "+ aluno[i]+" para conversar");
			}
		}
		sc.close();
	}

}
