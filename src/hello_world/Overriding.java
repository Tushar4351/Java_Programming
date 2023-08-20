package hello_world;

 class Overriding {
	public void car() {
		System.out.println("The car is run in gasoline");
		
	}
 }
	 class OverridingChild extends Overriding {
		 public	void car() {
				System.out.println("The car is run in Electric");
				
			}

	public static void main(String[] args) {
		OverridingChild myObj=new OverridingChild();
		myObj.car();

	}

}
