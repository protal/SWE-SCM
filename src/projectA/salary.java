package projectA;

public class salary {
	public double calSalary(double salary ,double sale)
	{
		double commission; 
		if(sale > 50000)
			commission = 3;
		else if(sale > 25000)
			commission = 2;
		else
			commission = 1;
		commission =  sale * commission / 100 ;
		return salary + commission ;
	}
}
