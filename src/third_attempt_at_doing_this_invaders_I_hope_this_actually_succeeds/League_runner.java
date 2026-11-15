package third_attempt_at_doing_this_invaders_I_hope_this_actually_succeeds;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class League_runner {
	public League_runner() {
		final int MENU = 0;
		final int GAME = 1;
		final int END = 2;
		int Currentstate = MENU;
	}
	public void setup() {
		JFrame beth = new JFrame();
		JPanel martha = new JPanel();
		Font titleFont = new Font("Arial", 10, 10);
		beth.setSize(800,800);
		beth.setVisible(true);
		beth.add(martha);
		GamePanel game = new GamePanel();
		game.start();
		beth.add(game);
		beth.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		League_runner runner= new League_runner();
		runner.setup();
	}

}
