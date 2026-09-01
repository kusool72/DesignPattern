package pa06_Singleton;

public class MainEntry {

	public static void main(String[] args) {
		King king = King.getInstance();
		
		king.say();
		
		King kin2 = King.getInstance();
		if(king == kin2) {
			System.out.println("same object");
		} else {
			System.out.println("different object");
		}
	}

}
