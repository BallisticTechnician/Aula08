import java.util.Scanner;
public class Desafio01 {
	/*É muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma função que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou não. Caso exista, a função deve retornar um boolean true. Caso não exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digitação do estado, a chamada da função e a exibição de uma mensagem para afirmar se o estado existe ou não, dependendo do que a função retornar.
	public
	 * */
	public static void main(String[] args) {
	String estado;
	Scanner leitor = new Scanner(System.in);
	System.out.println("Entre com a sigla do estado que mora :");
	estado = leitor.next();
	if(ValidacaoEstado.valid(estado)) {
		System.out.println("Estado existe");
		System.exit(1);
	}
	System.out.println("Estado não existe, ou entrada invalida");
	System.exit(1);
	
	}
}
