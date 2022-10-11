
public class ProductValidator {
	//Kurallarımız
	
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	static {
		System.out.println("Static yapıcı blok çalıştı");
	}

	
	//Class ismi ile uygulamada tekrar new tanımı yapmadan (burada tek seferlik oluşuyor zaten ama yapıcı bloğu çalıştırmaz)
	//bu metodu çağrmak için static ekliyoruz sıfırlanmadığı sürece bellekten silinmez, new ile oluşturunca silinir
	//pek yaygın değildir
	public static boolean isValid(Product product) {
		if(product.price>0&& !product.name.isEmpty())
			return true;
		else
			return false;
		
	}
	
	public void bisey() {
		//static olmadığı için nesne oluşturulmalı
	}
}
//Ana class static yapılamaz ama inner class iile yani class içine açılan class static olarak tanımlanabilir
//Gruplandırma yapmak için kullanılır