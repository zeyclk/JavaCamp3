
public class Main {

	public static void main(String[] args) {
		ProductManager manager=new ProductManager();
		Product product=new Product();
		product.name="Mouse";
		product.price=10;
		
		manager.add(product);
		
		//Önerilmez(DatabaseHelper içinde açıkladım)
		DatabaseHelper.Crud.Delete();
		DatabaseHelper.Connection.createConnection();

	}

}
