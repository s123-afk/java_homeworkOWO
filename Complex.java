package hw123;
public class Complex {
	private float realPart ;
	private float imaginaryPart;
	Complex(){
		realPart=1;
		imaginaryPart=0;
	}
	Complex(float real,float imagine){
		this.realPart=real;
		this.imaginaryPart=imagine;
	}
	
	
	public void add(Complex complex1 , Complex complex2) {
		float c1r=complex1.realPart;float c1i=complex1.imaginaryPart;float c2r=complex2.realPart;float c2i=complex2.imaginaryPart;
		System.out.printf("(%f , %f) + (%f , %f) = (%f , %f)\n",c1r,c1i,c2r,c2i,c1r+c2r,c1i+c2i);
	}
	public void subtract(Complex complex1 , Complex complex2) {
		float c1r=complex1.realPart;float c1i=complex1.imaginaryPart;float c2r=complex2.realPart;float c2i=complex2.imaginaryPart;
		System.out.printf("(%f , %f) - (%f , %f) = (%f , %f)\n",c1r,c1i,c2r,c2i,c1r-c2r,c1i-c2i);
	}
	public void printComplex(Complex complex) {
		System.out.printf("(%f , %f)", complex.realPart,complex.imaginaryPart);
	}
}
