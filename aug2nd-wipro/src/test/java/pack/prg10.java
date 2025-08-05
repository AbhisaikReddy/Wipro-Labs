package pack;

public class prg10 {
	public void toCheckPostive(String str) {
		boolean isPositive = true;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) <= str.charAt(i - 1)) {
				isPositive = false;
				break;
			}
		}

		if (isPositive) {
			System.out.println(str + " is a positive string");
		} else {
			System.out.println(str + " is not a positive string");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		prg10 obj = new prg10();
		obj.toCheckPostive("ABHI");
		obj.toCheckPostive("APPLE");

	}

}
