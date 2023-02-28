package Assignment;

/* Create an interface called "Person" with a method called "speak". 
 * Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method.
 *  Create objects of both the Student and Teacher classes and call their respective "speak" methods.*/

interface Person{
	void speak();//by default abstract method
}
class Student implements Person{
	public void speak() {//implementation
		System.out.println("method implement for student");
	}
}
class Teacher implements Person{
	public void speak() {//implementation
		System.out.println("method implement for teacher");
	}
}
public class Assignment4 {//main class
public static void main(String[] args) {//main method
	Student s1 = new Student();
	Teacher t1 = new Teacher();
	s1.speak();
	t1.speak();
}
}