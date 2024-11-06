package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Potion_BLUE extends SuperObject{
	
	public Potion_BLUE() {
		
		name = "Elixir";
		
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/pblue.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
