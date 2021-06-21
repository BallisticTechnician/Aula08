
public class ValidacaoBissext {
	public static boolean bissextcalc(int ano) {
		if (((ano%4==0)&&(ano%100!=0))||(ano%400==0)) {
			return true;
		}
		
		
		return false;
	}
}
