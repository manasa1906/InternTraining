package hashcode_Equals;

public class hashcode_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    String str = "Name";
		    String str1 = new String("Name");
		    
		    if (str.equals(str1))
		        System.out.println("Both contain same content");
		    else
		        System.out.println("Both doesn't contain same content");

		    if (str == str1)
		        System.out.println("Both contain same reference");
		    else
		        System.out.println("Both doesn't contain same reference");
		    
		    System.out.println(str.hashCode());
		    System.out.println(str1.hashCode());

	}

}
