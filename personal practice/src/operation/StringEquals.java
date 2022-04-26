package operation;

public class StringEquals {

	public static void main(String[] args) {
		String strVar1 = "dlwlrma";
		String strVar2 = "dlwlrma";
		String strVar3 = new String("dlwlrma");
		
		System.out.println(strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
	}

}
