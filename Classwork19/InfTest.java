package Classwork19;
import java.util.ArrayList;

public class InfTest implements CalcInf,ManipulateInf{
	public InfTest() {}
	
	public boolean checkSign(double x) {
		return ((x/Math.abs(x))==1)?true:false;
	}
	
	public double addDigits(double x,double y) {
		int x_dig_sum=0;
		int y_dig_sum=0;
		
		for(int i=0;i<Double.toString(x).length();i++) {
		}
		
		return 0.0;
	}
	
	public double add(double x,double y) {
		return (x+y);
	}
	
	public double sub(double x,double y) {
		return (x-y);
	}
	
	public double mul(double x,double y) {
		return (x*y);
	}
	
	public double div(double x,double y) {
		return (x/y);
	}
}
