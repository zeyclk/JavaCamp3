
public class MySqlCustomerDal implements ICustomerDal{
	
	//Classlar birden fazla Interface impemente edebilir
	//ama sadece bir class ı extends eder

	@Override
	public void Add() {
		System.out.println("My sql eklendi.");
		
	}

}
