package hw123;

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(3,5);
		Complex c2 = new Complex(5,2);
		Complex operator = new Complex();
		operator.add(c1, c2);
		operator.subtract(c1, c2);
		operator.printComplex(c2);
		
		
	}
}
