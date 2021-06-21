
public class ValidacaoEstado {
public static boolean valid(String estado) {	
	String estados[]= {"RR","AP","AM","PA","AC","RO","TO","MA","PI","CE","RN","PB","PE","AL","SE","BA","MT","DF","GO","MS","MG","ES","RJ","SP","PR","SC","RS"};
	for (int i=0;i<estados.length;i++) {
		if(estado.equalsIgnoreCase(estados[i])) {
			return true;
		}
	
	}
	return false;

}}
