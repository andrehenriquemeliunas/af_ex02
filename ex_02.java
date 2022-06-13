import java.util.Scanner;
public class ex_02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);//Abre o scanner
		int vetA[] = new int[5];//Declaração do vetor a do exercício
		int vetB[] = new int[5];//Declaração do vetor b do exercício
		int x;//Declaração da variável x
		int c = 0;// Decalração da variável c

		for (x = 0; x < 5; x++) {// Laço de repetição for, fazendo com  que pessa os valores dos vetores 5 vezes
			System.out.print("------------------- \n");
			System.out.printf("Vetor A: ");//Pergunta os valores do vetor a
			vetA[x] = s.nextInt();//Armazena esse valores na var vetA como parâmetro x
			System.out.printf("Vetor B: ");//Pergunta os valores do vetor b
			vetB[x] = s.nextInt();//Armazena esse valores na var vetB como parâmetro x
		}
		for(x = 1; x < 5; x++){//Laço de repetição for, fazendo as soma dos vetores 4x
			c = c + (vetA[x] * vetB[x]);//Faz a soma e guarda na variável c
		}
		System.out.print(c);//Exibe o resultado de c
		s.close();//Fecha o scanner
	}
}