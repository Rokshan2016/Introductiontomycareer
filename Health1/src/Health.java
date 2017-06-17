public class Health {
	
	
	String name;
	int  Age;
	
	Health( String name, int Age){


 this.name = name;
 this.Age = Age;
 
 }

public static void main(String args[]) {
	
Health h1 = new Health("Hadi",3);

System.out.println(h1.name);
System.out.println(h1.Age);


}
	
	

}
