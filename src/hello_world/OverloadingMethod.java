package hello_world;

public class OverloadingMethod {
	
	public int myMethod(int x,int y) {
		return x+y;
	}
	public static float myMethod(float x,float y) {
		return x+y;
	}
	public static String myMethod(String x,String y) {
		return x+y;
	}
	public static void main(String[] args) {
		OverloadingMethod myobj=new OverloadingMethod();

	int firstresult=myobj.myMethod(5,10)  ;
	float Secondresult=myMethod(5.3f,10.1f)  ;
	String thirdresult=myMethod("tushar","Bhowal"); 
		
	System.out.println(firstresult);
	System.out.println(Secondresult);
	System.out.println(thirdresult);
	}

}
