
public class Complex {
private double real;
private double imag;

public Complex() {}

public Complex(double real, double imag) {
	this.real = real;
	this.imag = imag;
}
/**
 * returns the real number component
 * @return real
 */
public double getReal() {
	return real;
}
/**
 * returns the imaginary number component
 * @return imag
 */
public double getImag() {
	return imag;
}
/**
 * sets the real number component
 * @param real
 */
public void setReal(double real) {
	this.real = real;
}
/**
 * sets the imaginary number component
 * @param imag
 */
public void setImag(double imag) {
	this.imag = imag;
}
/**
 * – has one parameter, another Complex object to add to this one. This method does not return a value (it updates the calling object’s variables).
 * @param obj
 */
public void addComplex(Complex obj) {
	this.real += obj.getReal();
	this.imag += obj.getImag();
}
/**
 * - has one parameter, another Complex object to subtract to this one. This method does not return a value (it updates the calling object’s variables).
 * @param obj
 */
public void subtractComplex(Complex obj) {
	this.real -= obj.getReal();
	this.imag -= obj.getImag();
}
/**
 * - has one parameter, another Complex object to multiply to this one. This method does not return a value (it updates the calling object’s variables).
 * @param obj
 */
public void multiplyComplex(Complex obj) {
	Double tempReal = this.real;
	Double tempImag = this.imag;
	
	this.real = (tempReal * obj.getReal()) - (tempImag * obj.getImag());
	//real = (this.real * other.real) - (this.imag * other.img)
	this.imag = (tempReal * obj.getImag()) + (tempImag * obj.getReal());
	//imag = (this.imag * other.real) + (other.imag * this.real)
}
/**
 * prints the data in the form a + bi
 */
public void print() {
	if(this.imag > 0) {
	System.out.println(real + " + "  + imag + "i");
	}else
	System.out.println(real + " - "  + java.lang.Math.abs(imag) + "i");
}

}