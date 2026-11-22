package third_attempt_at_doing_this_invaders_I_hope_this_actually_succeeds;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener{ 
	Timer frameDraw = new Timer(1000/60, this);
	final int MENU = 0;
	final int GAME = 1;
	final int END = 2;
	int currentState = MENU;
	@Override
	public void paintComponent(Graphics g){
		if(currentState == MENU){
		    drawMenuState(g);
		}else if(currentState == GAME){
		    drawGameState(g);
		}else if(currentState == END){
		    drawEndState(g);
		}
	}
	void updateMenuState() {
		
	}
	void updateGameState() {
		
	}
	void updateEndState() {
		
	}
	void drawMenuState(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(10, 40, -10, -40);
		System.out.println("I'm a Jay");
	}
	void drawGameState(Graphics g) {
		
	}
	void drawEndState(Graphics g) {
		
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		repaint();
	}
	void start() {
		frameDraw.start();
	}
	
}