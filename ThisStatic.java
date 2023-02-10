package Assignment;

 class ThisStaticeg {
	int age;
	String name;
	static String Class="MCA";
	
	//constructor
	ThisStaticeg(int a,String n){
		this.age=a;
		this.name=n;
	}
	
	void display() {
		System.out.println(age+" "+name+" "+Class);
	}
	public class ThisStatic{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisStaticeg sc=new ThisStaticeg(23,"Ram");
		sc.display();
		

		
	}}

}
