
public class Main {

	public static void main(String[] args) {
		KidsGameCalculator kidsGameCalculator=new KidsGameCalculator();
		kidsGameCalculator.hesapla();
		kidsGameCalculator.gameOver();
		
		//Abstract sınıflardan nesne üretilemez ama ana sınıftan başka sınıfa ait nesne oluşturabilir
		//GameCalculator gameCalculator=new GameCalculator();
		
		GameCalculator gameCalculator=new WomanGameCalculator();
		gameCalculator.gameOver();
	}

}
