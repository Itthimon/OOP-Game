package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Potion_YELLOW extends SuperObject{

	public Potion_YELLOW() {
		
		name = "Soul Arcana";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/pYellow.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
