package Assignment;
class mca{
	
	int roll_no=21140;
	
}

class msc extends mca{
	
	int roll_no=1145;
	void display() {
		
		System.out.println(super.roll_no);
	}

}

public class Superkey extends mca {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		msc s=new msc();
		s.display();
		
	}

}
