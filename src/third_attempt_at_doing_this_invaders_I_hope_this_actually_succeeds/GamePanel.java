package third_attempt_at_doing_this_invaders_I_hope_this_actually_succeeds;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GamePanel extends JPanel implements ActionListener{ 
	Timer frameDraw = new Timer(1000/60, this);
	@Override
	public void paintComponent(Graphics g){
		g.setColor(new Color(15, 182, 146));
		g.fillRect(0, 0, 100, 100);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("What do you call a bear with no teeth? A GUMMY BEAR HAHAHAAHAHHAHAHAAHAHA");
		
	}
	void start() {
		frameDraw.start();
	}
	
}