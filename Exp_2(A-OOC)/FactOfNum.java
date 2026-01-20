public class FactOfNum{
	public static void main( String[] args){

		int n=5;
	System.out.println("Number to find factorial: " +n);
		int fact = 1;

		for(int i=1; i<=n; i++){ 
			fact = fact * i;
		} 
		System.out.println("Factorial is : " +fact);
	}
}