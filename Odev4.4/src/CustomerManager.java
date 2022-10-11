
public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal=customerDal;
	}
	
	//aslında parametre gönderilir
	public void add() {
		// iş kodlar yazılır
		customerDal.Add();
	}

}
