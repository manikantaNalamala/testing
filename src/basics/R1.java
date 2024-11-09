package basics;

public class R1 {

	public static void main(String[] args) {
		
		Base hkhkj= new Derived();
System.out.println();
	}

}

class Base {
	static {
		System.out.println("1");
	}

}
class Derived extends Base {
	static {
		System.out.println("2");
	}

}
