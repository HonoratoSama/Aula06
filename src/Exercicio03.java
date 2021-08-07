import java.util.Random;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int[] num = new int[50];
		int qtd37 = 0,par = 0,menor3 = 0,impar = 0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = rd.nextInt(10);
			System.out.println(i+1+"o Numero Gerado: "+ num[i]);			
	    }
		for (int i=0;i<num.length;i++) {
			if(num[i] % 2 == 0 ) {
				par = par + 1;
			}else {
				impar = impar + 1;
			}
			if(num[i] < 3) {
				menor3 = menor3 + 1;
			}else if (num[i] < 8) {
				qtd37 = qtd37 + 1;
			}
		}
		System.out.println("A quantidade de números entre 3 e 7 é: "+ qtd37);
		System.out.println("Quantidade de números pares é: " + par);
		System.out.println("A quantidade de números menores que 3 é: " + menor3);
		System.out.println("Quantidade de números ímpares é: "+ impar);
		sc.close();
    }
}