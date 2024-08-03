package basics;

public class TryCatchFlow {

	public static int ma() {
		String s1 = "MAni";
		// 1 OBJECT= NEW= HEAP AREA
		// 1 OBJECT= LITERAL=SCP
		String s2 = new String("MAni");// SCP STRING CONSTANT POOL AREA
		
		//System.out.println(s1 == s2);
		//System.out.println(s1.intern().hashCode() == s2.hashCode());
		
		try {
			System.out.println(10 / 0);
			return 1;
		} catch (Exception e) {
			return 2;
		} finally {
			System.exit(0);
			return 3;
		}

	}

	public static void main(String[] args) {
		System.out.println(ma());
	}

}
