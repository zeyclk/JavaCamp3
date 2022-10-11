public abstract class GameCalculator {
	
	public abstract void hesapla(); 
	/*yukarıdaki soyut metod tanımı ile taslak bir metod oluşturabilir
	böylece extends edilen her sınıfta aynı imza ve isim ile yazılmak zorunda olan 
	metod içerisindeki kodlar o sınıfa özel çalışır */
	
	public final void gameOver() {
		//final ile yazılan metod ovveride edilemez
		System.out.println("Oyun bitti");
	}
}
