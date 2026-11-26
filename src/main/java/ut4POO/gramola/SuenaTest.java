package ut4POO.gramola;

import javax.sound.sampled.LineUnavailableException;

public class SuenaTest {

	public static void main(String[] args) {
		// vamos a hacer una canción
		System.out.println("Empieza la canción");
		try {
			Suena.suena(587, 100);
			Thread.sleep(500);
			
			Suena.suena(659, 100);
			Thread.sleep(500);
			
			Suena.suena(523, 100);
			Thread.sleep(500);
			
			Suena.suena(262, 100);
			Thread.sleep(500);
			
			Suena.suena(392, 100);
			Thread.sleep(500);
			
		} catch (LineUnavailableException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
