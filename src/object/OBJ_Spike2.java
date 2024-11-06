package object;

import java.io.IOException;

import javax.imageio.ImageIO;

public class OBJ_Spike2 extends SuperObject{
	
	public OBJ_Spike2() {
		
		name = "Spike_2";
		try {
			image = ImageIO.read(getClass().getResourceAsStream("/objects/spike2.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
