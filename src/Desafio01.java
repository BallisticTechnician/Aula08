import java.util.Scanner;
public class Desafio01 {
	/*� muito comum que programas que realizam cadastros de pessoas precisem validar a sigla do estado a que elas pertencem.
Crie uma fun��o que receba uma String contendo a sigla de um estado e verifique se esse estado existe ou n�o. Caso exista, a fun��o deve retornar um boolean true. Caso n�o exista, ele deve retornar um boolean false.
A main do seu programa deve conter a digita��o do estado, a chamada da fun��o e a exibi��o de uma mensagem para afirmar se o estado existe ou n�o, dependendo do que a fun��o retornar.
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
	System.out.println("Estado n�o existe, ou entrada invalida");
	System.exit(1);
	
	}
}
