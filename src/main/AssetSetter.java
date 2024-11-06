package main;

import object.OBJ_Spike;
import object.OBJ_Spike2;
import object.Potion_BLUE;
import object.Potion_PURPLE;
import object.Potion_YELLOW;

public class AssetSetter {

	GamePanel gp;
	public AssetSetter(GamePanel gp) {
		this.gp = gp;
	}
	
	public void setObject() {
		
		gp.obj[0] = new Potion_BLUE();
		gp.obj[0].worldX = 47 * gp.tileSize;
		gp.obj[0].worldY = 3 * gp.tileSize;
		
		gp.obj[1] = new Potion_PURPLE();
		gp.obj[1].worldX = 38 * gp.tileSize;
		gp.obj[1].worldY = 34 * gp.tileSize;
		
		gp.obj[2] = new Potion_YELLOW();
		gp.obj[2].worldX = 4 * gp.tileSize;
		gp.obj[2].worldY = 34 * gp.tileSize;
		
		gp.obj[3] = new OBJ_Spike();
		gp.obj[3].worldX = 40 * gp.tileSize;
		gp.obj[3].worldY = 7 * gp.tileSize;
		
		gp.obj[4] = new OBJ_Spike2();
		gp.obj[4].worldX = 45 * gp.tileSize;
		gp.obj[4].worldY = 6 * gp.tileSize;
		
		gp.obj[5] = new OBJ_Spike();
		gp.obj[5].worldX = 41 * gp.tileSize;
		gp.obj[5].worldY = 3 * gp.tileSize;
		
		gp.obj[6] = new OBJ_Spike2();
		gp.obj[6].worldX = 46 * gp.tileSize;
		gp.obj[6].worldY = 7 * gp.tileSize;
		
		gp.obj[7] = new OBJ_Spike();
		gp.obj[7].worldX = 38 * gp.tileSize;
		gp.obj[7].worldY = 3 * gp.tileSize;
		
		gp.obj[8] = new OBJ_Spike2();
		gp.obj[8].worldX = 38 * gp.tileSize;
		gp.obj[8].worldY = 6 * gp.tileSize;
		
		gp.obj[9] = new OBJ_Spike();
		gp.obj[9].worldX = 34 * gp.tileSize;
		gp.obj[9].worldY = 5 * gp.tileSize;
		
		gp.obj[10] = new OBJ_Spike2();
		gp.obj[10].worldX = 40 * gp.tileSize;
		gp.obj[10].worldY = 5 * gp.tileSize;
		
		gp.obj[11] = new OBJ_Spike();
		gp.obj[11].worldX = 43 * gp.tileSize;
		gp.obj[11].worldY = 5 * gp.tileSize;
		
		gp.obj[12] = new OBJ_Spike2();
		gp.obj[12].worldX = 46 * gp.tileSize;
		gp.obj[12].worldY = 3 * gp.tileSize;
		
		gp.obj[13] = new OBJ_Spike();
		gp.obj[13].worldX = 43 * gp.tileSize;
		gp.obj[13].worldY = 9 * gp.tileSize;
		
		gp.obj[14] = new OBJ_Spike2();
		gp.obj[14].worldX = 36 * gp.tileSize;
		gp.obj[14].worldY = 9 * gp.tileSize;
		
		gp.obj[15] = new OBJ_Spike2();
		gp.obj[15].worldX = 44 * gp.tileSize;
		gp.obj[15].worldY = 28 * gp.tileSize;
		
		gp.obj[16] = new OBJ_Spike();
		gp.obj[16].worldX = 39 * gp.tileSize;
		gp.obj[16].worldY = 29 * gp.tileSize;
		
		gp.obj[17] = new OBJ_Spike2();
		gp.obj[17].worldX = 46 * gp.tileSize;
		gp.obj[17].worldY = 32 * gp.tileSize;
		
		gp.obj[18] = new OBJ_Spike();
		gp.obj[18].worldX = 38 * gp.tileSize;
		gp.obj[18].worldY = 33 * gp.tileSize;
		
		gp.obj[19] = new OBJ_Spike2();
		gp.obj[19].worldX = 42 * gp.tileSize;
		gp.obj[19].worldY = 34 * gp.tileSize;
		
		gp.obj[20] = new OBJ_Spike2();
		gp.obj[20].worldX = 44 * gp.tileSize;
		gp.obj[20].worldY = 30 * gp.tileSize;
		
		gp.obj[21] = new OBJ_Spike();
		gp.obj[21].worldX = 42 * gp.tileSize;
		gp.obj[21].worldY = 31 * gp.tileSize;
		
		gp.obj[22] = new OBJ_Spike2();
		gp.obj[22].worldX = 37 * gp.tileSize;
		gp.obj[22].worldY = 27 * gp.tileSize;
		
		gp.obj[23] = new OBJ_Spike();
		gp.obj[23].worldX = 36 * gp.tileSize;
		gp.obj[23].worldY = 34 * gp.tileSize;
		
		gp.obj[24] = new OBJ_Spike2();
		gp.obj[24].worldX = 41 * gp.tileSize;
		gp.obj[24].worldY = 34 * gp.tileSize;
		
		gp.obj[25] = new OBJ_Spike();
		gp.obj[25].worldX = 43 * gp.tileSize;
		gp.obj[25].worldY = 27 * gp.tileSize;
		
		gp.obj[26] = new OBJ_Spike2();
		gp.obj[26].worldX = 37 * gp.tileSize;
		gp.obj[26].worldY = 30 * gp.tileSize;
		
		gp.obj[27] = new OBJ_Spike();
		gp.obj[27].worldX = 3 * gp.tileSize;
		gp.obj[27].worldY = 27 * gp.tileSize;
		
		gp.obj[28] = new OBJ_Spike2();
		gp.obj[28].worldX = 4 * gp.tileSize;
		gp.obj[28].worldY = 29 * gp.tileSize;
		
		gp.obj[29] = new OBJ_Spike();
		gp.obj[29].worldX = 8 * gp.tileSize;
		gp.obj[29].worldY = 28 * gp.tileSize;
		
		gp.obj[30] = new OBJ_Spike2();
		gp.obj[30].worldX = 11 * gp.tileSize;
		gp.obj[30].worldY = 31 * gp.tileSize;
		
		gp.obj[31] = new OBJ_Spike();
		gp.obj[31].worldX = 8 * gp.tileSize;
		gp.obj[31].worldY = 33 * gp.tileSize;
		
		gp.obj[32] = new OBJ_Spike2();
		gp.obj[32].worldX = 13 * gp.tileSize;
		gp.obj[32].worldY = 32 * gp.tileSize;
		
		gp.obj[33] = new OBJ_Spike2();
		gp.obj[33].worldX = 8 * gp.tileSize;
		gp.obj[33].worldY = 30 * gp.tileSize;
		
		gp.obj[34] = new OBJ_Spike();
		gp.obj[34].worldX = 6 * gp.tileSize;
		gp.obj[34].worldY = 31 * gp.tileSize;
		
		gp.obj[35] = new OBJ_Spike2();
		gp.obj[35].worldX = 2 * gp.tileSize;
		gp.obj[35].worldY = 34 * gp.tileSize;
		
		gp.obj[36] = new OBJ_Spike();
		gp.obj[36].worldX = 10 * gp.tileSize;
		gp.obj[36].worldY = 34 * gp.tileSize;
		
		gp.obj[37] = new OBJ_Spike2();
		gp.obj[37].worldX = 7 * gp.tileSize;
		gp.obj[37].worldY = 34 * gp.tileSize;
		
		
		gp.obj[38] = new OBJ_Spike2();
		gp.obj[38].worldX = 11 * gp.tileSize;
		gp.obj[38].worldY = 28 * gp.tileSize;
	}
}
