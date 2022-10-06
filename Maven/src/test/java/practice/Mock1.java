package practice;


class Car {
	public void car()
	{
		System.out.println(" Class car");
	}
}

class Maruti extends Car{
	public void car()
	{
		System.out.println(" Class Maruti");
	}
}

public class Mock1 extends Maruti{

	
	public void car()
	{
		System.out.println(" Class Mock1");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car obj=new Maruti();
		obj.car();
		
		
		
	}

}
