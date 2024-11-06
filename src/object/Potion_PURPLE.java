package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Potion_PURPLE extends SuperObject{

	public Potion_PURPLE() {
		
		name = "Essence of Titan";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/pPurple.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
