package reflection;

public class ClassToReflect {
	
	private final String cString;
	private final int cInt;
	
	
	
	public ClassToReflect(String cString, int cInt) {
		super();
		this.cString = cString;
		this.cInt = cInt;
	}

	public ClassToReflect(String cString) {
		this(cString, -1);

	}

	public ClassToReflect(int cInt) {
		this("Nothing", cInt);
	}

	public ClassToReflect() {
		this("Nothing", -1);
	}
	
	public String getcString() {
		return cString;
	}
	
	

	public int getcInt() {
		return cInt;
	}
	
}
