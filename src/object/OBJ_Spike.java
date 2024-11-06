package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Spike extends SuperObject{
	
	public OBJ_Spike() {
		
		name = "Spike_1";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/spike1.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
