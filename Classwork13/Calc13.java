package Classwork13;

public class Calc13{
	
	public static double add(double x,double y){
		return x+y;
	}
	
	public static double add(double[] vars){
		double returnValue=0;
				
		for(int i=0;i<vars.length;i++) {
			returnValue+=vars[i];
		}
		
		return returnValue;
	}
	
	public static double sub(double x,double y){
		return x-y;
	}
	
	public static double sub(double[] vars){
		double returnValue=vars[1];
				
		for(int i=1;i<vars.length;i++) {
			returnValue-=vars[i];
		}
		
		return returnValue;
	}
	
	public static double div(double x,double y){
		return x/y;
	}
	
	public static double div(double[] vars){
		double returnValue=vars[0];
				
		for(int i=1;i<vars.length;i++) {
			returnValue=returnValue/vars[i];
		}
		
		return returnValue;
	}
	
	public static double mult(double x,double y){
		return x*y;
	}
	
	public static double mult(double[] vars){
		double returnValue=vars[0];
				
		for(int i=1;i<vars.length;i++) {
			returnValue=returnValue*vars[i];
		}
		
		return returnValue;
	}
}
