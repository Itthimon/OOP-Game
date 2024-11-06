package entity;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import main.GamePanel;
import main.KeyHandler;

public class Player extends entity{

	GamePanel gp;
	KeyHandler keyH;
	
	public final int screenX;
	public final int screenY;
	public int hasPotion = 0;
	
	public Player(GamePanel gp, KeyHandler keyH) {
		
		this.gp = gp;
		this.keyH = keyH;
		
		screenX = gp.screenWidth/2 - (gp.tileSize /2);
		screenY = gp.screenHeight/2 - (gp.tileSize /2);
		
		solidArea = new Rectangle();
		solidArea.x = 8;
		solidArea.y = 16;
		solidAreaDefaultX = solidArea.x;
		solidAreaDefaultY = solidArea.y;
		solidArea.width = 32;
		solidArea.height = 32;
		
		setDefaultValues();
		getPlayerImage();
	}
	
	public void setDefaultValues() {
		
		worldX = gp.tileSize * 7;
		worldY = gp.tileSize * 5;
		speed = 4;
		direction = "down";
	}
	public void getPlayerImage() {
		try {
			
			up1 = ImageIO.read(getClass().getResourceAsStream("/player/W1.png"));
			up2 = ImageIO.read(getClass().getResourceAsStream("/player/W2.png"));
			up3 = ImageIO.read(getClass().getResourceAsStream("/player/W3.png"));
			down1 = ImageIO.read(getClass().getResourceAsStream("/player/S1.png"));
			down2 = ImageIO.read(getClass().getResourceAsStream("/player/S2.png"));
			down3 = ImageIO.read(getClass().getResourceAsStream("/player/S3.png"));
			left1 = ImageIO.read(getClass().getResourceAsStream("/player/A1.png"));
			left2 = ImageIO.read(getClass().getResourceAsStream("/player/A2.png"));
			left3 = ImageIO.read(getClass().getResourceAsStream("/player/A3.png"));
			right1 = ImageIO.read(getClass().getResourceAsStream("/player/D1.png"));
			right2 = ImageIO.read(getClass().getResourceAsStream("/player/D2.png"));
			right3 = ImageIO.read(getClass().getResourceAsStream("/player/D3.png"));
			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	public void update() {
		
		if(keyH.upPressed == true || keyH.downPressed == true ||
				keyH.leftPressed == true || keyH.rightPressed == true) {
			
			if(keyH.upPressed == true) {
				direction = "up";
			}
			else if(keyH.downPressed == true) {
				direction = "down";
			}
			else if(keyH.leftPressed == true) {
				direction = "left";
			}
			else if(keyH.rightPressed == true) {
				direction = "right";
			}
			
			// Check Tile Collision
			collisionOn = false;
			gp.cChecker.checkTile(this);
			
			// CHECK OBJECT COLLISION
			int objIndex = gp.cChecker.checkObject(this, true);
			pickUpObject(objIndex);
			
			// If Collision is False, Player can move
			if(collisionOn == false) {
				
				switch(direction) {
				case "up":
					worldY -= speed;
					break;
				case "down":
					worldY += speed;
					break;
				case "left":
					worldX -= speed;
					break;
				case "right":
					worldX += speed;
					break;
				}
			}
			
			HeroCounter++;
			if(HeroCounter > 15) {
				if(HeroNum == 1) {
					HeroNum = 3;
				}
				else if(HeroNum == 2) {
					HeroNum = 1;
				}
				else if(HeroNum == 3) {
					HeroNum = 2;
				}
				HeroCounter = 0;
			}
		}
		

	}
	public void pickUpObject(int i) {
		if(i != 999) {
			
			String objectName = gp.obj[i].name;
			
			switch(objectName) {
			case "Elixir":
				hasPotion++;
				gp.obj[i] = null;
				if(hasPotion == 3) {
					gp.ui.gameFinished = true;
				}
				break;
				
			case "Essence of Titan":
				hasPotion++;
				gp.obj[i] = null;
				if(hasPotion == 3) {
					gp.ui.gameFinished = true;
				}
				break;
				
			case "Soul Arcana":
				hasPotion++;
				gp.obj[i] = null;
				if(hasPotion == 3) {
					gp.ui.gameFinished = true;
				}
				break;
				
			case "Spike_1":
				hasPotion++;
				if(hasPotion == 3) {
					gp.ui.gameOver = true;
				}
				break;
				
			case "Spike_2":
				hasPotion++;
				if(hasPotion == 3) {
					gp.ui.gameOver = true;
				}
				break;
			}
		}
	}
	public void draw (Graphics2D g2) {
		
		BufferedImage image = null;
		
		switch(direction) {
		case "up" :
			if(HeroNum == 1) {
				image = up1;
			}
			if(HeroNum == 2) {
				image = up2;
			}
			if(HeroNum == 3) {
				image = up3;
			}
			break;
		case "down" :
			if(HeroNum == 1) {
				image = down1;
			}
			if(HeroNum == 2) {
				image = down2;
			}
			if(HeroNum == 3) {
				image = down3;
			}
			break;
		case "left" :
			if(HeroNum == 1) {
				image = left1;
			}
			if(HeroNum == 2) {
				image = left2;
			}
			if(HeroNum == 3) {
				image = left3;
			}
			break;
		case "right" :
			if(HeroNum == 1) {
				image = right1;
			}
			if(HeroNum == 2) {
				image = right2;
			}
			if(HeroNum == 3) {
				image = right3;
			}
			break;
		}
		g2.drawImage(image,  screenX,  screenY,  gp.tileSize,  gp.tileSize, null);
		
	}
}
	
