package pa22_Interpreter;

public interface Expression {
	boolean parse(Context context);
	boolean run();
}
