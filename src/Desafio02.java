import java.util.Scanner;
public class Desafio02 {
	/*Para um ano ser bissexto ele deve ser m�ltiplo de 4, mas n�o ser m�ltiplo de 100 (com exce��o dos anos que forem m�ltiplos de 400).
Crie um programa com uma fun��o que receba um ano em uma vari�vel inteira, fa�a os testes para verificar se ele � bissexto, e retorne uma String dizendo �O ano informado � bissexto� ou �O ano informado n�o � bissexto).
A main do seu programa deve conter a digita��o do ano, a chamada da fun��o e a exibi��o do texto retornado.


	 * */
	public static void main(String[] args) {
	Scanner leitor = new Scanner(System.in);
	int ano;
	System.out.println("Entre com o ano que deseja saber :");
	ano = leitor.nextInt();
	if (ValidacaoBissext.bissextcalc(ano)) {
		System.out.println("Ano � bissexto");
		System.exit(1);
	}
		System.out.println("Ano n�o � bissexto");
		System.exit(1);
	}
}
