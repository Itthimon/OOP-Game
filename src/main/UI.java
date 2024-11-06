package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import object.Potion_YELLOW;

public class UI {

	
	GamePanel gp;
	Graphics2D g2;
	Font arial_24, arial_80B;
	BufferedImage PotionImage;
	public boolean gameFinished = false;
	public boolean gameOver = false;
	
	public UI(GamePanel gp) {
		this.gp = gp;
		
		arial_24 = new Font("Arial", Font.PLAIN, 24);
		arial_80B = new Font("Arial", Font.BOLD, 80);
		Potion_YELLOW P_Yellow = new Potion_YELLOW();
		PotionImage = P_Yellow.image;
	}
	
	public void draw(Graphics2D g2) {
		
		if(gameFinished == true) {
			
			g2.setFont(arial_24);
			g2.setColor(Color.white);
			
			String text;
			int textLength;
			int x;
			int y;
			
			text = "You found all Potions!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 - (gp.tileSize*3);
			g2.drawString(text, x, y);
			
			g2.setFont(arial_80B);
			g2.setColor(Color.green);
			text = "Congratulations!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 + (gp.tileSize*2);
			g2.drawString(text, x, y);
			
			gp.gameThread = null;
		}
		
		if(gameOver == true) {
			
			g2.setFont(arial_24);
			g2.setColor(Color.white);
			
			String text;
			int textLength;
			int x;
			int y;
			
			text = "You failed Collecting Potion!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 - (gp.tileSize*3);
			g2.drawString(text, x, y);
			
			g2.setFont(arial_80B);
			g2.setColor(Color.red);
			text = "YOU ARE DEAD!!!";
			textLength = (int)g2.getFontMetrics().getStringBounds(text, g2).getWidth();
			x = gp.screenWidth/2 - textLength/2;
			y = gp.screenHeight/2 + (gp.tileSize*2);
			g2.drawString(text, x, y);
			
			gp.gameThread = null;
		}
		
		else {
			
			g2.setFont(arial_24);
			g2.setColor(Color.white);
			g2.drawImage(PotionImage, gp.tileSize/2, gp.tileSize/2, gp.tileSize, gp.tileSize, null);
			g2.drawString("x "+gp.player.hasPotion, 75, 65);
			
		}
		

		
	}

}
