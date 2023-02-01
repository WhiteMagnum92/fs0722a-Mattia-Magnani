package esercizio3;

public class Pt1 {

	public static void main(String[] args) {
		
		System.out.println(stringaPariDispari("ciaone"));
		System.out.println(stringaPariDispari("ciaoneone"));

		System.out.println(annoBisestile(1992));
		System.out.println(annoBisestile(1993));
		
	}

	public static boolean stringaPariDispari(String str) {
		if(str.length()%2==0) {
			return true;
		}else {
			return false;
		}	
	}
	
	public static boolean annoBisestile(int anno) {
		if(anno%4==0) {
			return true;
		}else if(anno%100==0 && anno%400==0) {
			return true;
		}else {
			return false;
		}
		
	}
	
}
