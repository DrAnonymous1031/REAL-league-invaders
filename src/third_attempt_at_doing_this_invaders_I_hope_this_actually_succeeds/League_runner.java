package third_attempt_at_doing_this_invaders_I_hope_this_actually_succeeds;

import java.awt.Graphics;

import javax.swing.*;

public class League_runner {
	public League_runner() {
		
	}
	public void setup() {
		JFrame beth = new JFrame();
		JPanel martha = new JPanel();
		beth.setSize(800,800);
		beth.setVisible(true);
		beth.add(martha);
		GamePanel game = new GamePanel();
		Graphics g = new Graphics();
		game.paintComponent(null);
		beth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		League_runner runner= new League_runner();
		runner.setup();
	}

}
