package pa19_Command;

public class MainEntry {

	public static void main(String[] args) {
		Command clearCmd = new ClearCommand();
		clearCmd.run();

		Command yellowColorCmd = new ColorCommand(ColorCommand.Color.YELLOW);
		yellowColorCmd.run();
		
		Command moveCmd = new MoveCommand(10, 1);
		moveCmd.run();

		Command printCmd = new PrintCommand("안녕하세요! 디자인패턴!");
		printCmd.run();

		Command moveCmd2 = new MoveCommand(15, 5);
		moveCmd2.run();
		
		printCmd.run();

		Command moveCmd3 = new MoveCommand(25, 8);
		moveCmd3.run();
		
		Command greenColorCmd = new ColorCommand(ColorCommand.Color.GREEN);
		greenColorCmd.run();
		
		printCmd.run();
	}
}
