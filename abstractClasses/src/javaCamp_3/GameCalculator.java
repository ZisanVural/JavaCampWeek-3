package javaCamp_3;

public abstract class GameCalculator {
	public abstract void hesapla() { //abstract konulduğunda diğerleri kendine ait hesapla metodunu yazmak zorunda
		
	}

	public final void gameOver() {
		System.out.println("Oyun bitti");
	}
	
}
