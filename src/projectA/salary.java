package projectA;

public class salary {
	public double calSalary(double salary ,double sale)
	{
		double commission;
		if(sale > 100000)
			commission = 3;
		else if(sale > 50000)
			commission = 2;
		else
			commission = 1;
		commission =  sale * commission / 100 ;
		
		if(salary<15000 && sale > 100001)
			return salary + commission + 3000;
		else
			return salary + commission ;
	}
}
