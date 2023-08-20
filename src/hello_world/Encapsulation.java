package hello_world;

public class Encapsulation {
private String name;
private int age;
public void setName(String name) {
	this.name=name;
}
public void setAge(int age) {
	this.age=age;
}
public int getAge() {
	return age;
}

public String getName() {
	return name;
}
	public static void main(String[] args) {
		Encapsulation myObj= new Encapsulation();
		
		myObj.setName("Tushar");
		myObj.setAge(20);
		
		System.out.println(myObj.getName()+ " "+myObj.getAge());

	}

}
