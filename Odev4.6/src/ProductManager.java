
public class ProductManager {
	//Manager içine static yapılmamalı hepsi için geçerli olmamalı
	public void add(Product product)
	{
		if(ProductValidator.isValid(product))
			System.out.println("Eklendi");
		else
			System.out.println("Ürün bilgileri geçersizdir.");
	}
}

