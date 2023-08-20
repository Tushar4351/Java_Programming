package hello_world;

public class Constructor {
           int x;
           int y;
        Constructor(int x, int y){
        	  this.x=x;
        	  this.y=y;
           }
           
	public static void main(String[] args) {
		Constructor myObj= new Constructor(10,20);
		
	     int result= myObj.x+myObj.y;
	     System.out.println(result);

	}

}
