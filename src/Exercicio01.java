import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ordem;
		String[] atividade = new String[5];
		
		for(int i=0;i<atividade.length;i++) {
			System.out.println("Digite a "+ (i+1) +"a Atividade: ");
			atividade[i] = sc.next();
		}
		
		System.out.println("Digite 1 para listar as Atividades na ordem Digitada ou 2 para exibir na ordem Inversa");
		ordem = sc.nextInt();
		
		switch(ordem) {
		case 1:
			for(int i=0; i < atividade.length; i++) {
				System.out.println("Atividade: " + atividade[i]);
			}
			break;
		case 2:
			for(int i=atividade.length-1;i>=0;i--) {
				System.out.println("Atividade: " + atividade[i]);
			}
			break;
		default:
			System.out.println("favor digitar um valor entre 1 e 2");
			break;
		}
		
		sc.close();

	}

}
