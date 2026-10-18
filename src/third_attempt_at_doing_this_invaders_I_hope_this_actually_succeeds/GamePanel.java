package third_attempt_at_doing_this_invaders_I_hope_this_actually_succeeds;

import java.awt.Graphics;

import javax.swing.*;

public class GamePanel extends JPanel{ 
	@Override
	public void paintComponent(Graphics g){
		g.fillRect(10, 10, 100, 100);
	}

}