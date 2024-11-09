package basics;

public class LeapYear {

	public static boolean Leap(int year) {

		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				}
				return false;

			} else

				return true;
		} else

			return false;
	}

	public static void main(String[] args) {
		int year = 2023;
		System.out.println(Leap(year));

	}

}
