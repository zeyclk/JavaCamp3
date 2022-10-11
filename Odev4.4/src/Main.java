
public class Main {

	public static void main(String[] args) {
		//Ders 42:Interface
		ICustomerDal customerDal=new OracleCustomerDal();
		
		//Ders 43: Interface ile Polymorphism
		CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
		customerManager.add();
	}

}
