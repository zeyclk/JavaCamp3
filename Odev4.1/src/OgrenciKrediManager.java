
public class OgrenciKrediManager extends BaseKrediManager{

	//BaseKRedi içindeki hesapla metodunu aynı imza ile buraya taşıyarak
	//farklı bir faiz oranı verirsek yeni nesnede buradaki metod çalışır
	//bunu sağlayan metodunu Overrideable olmasıdır
	public double hesapla(double tutar)
	{
		return tutar*1.10;
	}
}
