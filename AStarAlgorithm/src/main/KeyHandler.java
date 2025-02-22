package main;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener{

	DemoPanel dp;
	
	public KeyHandler(DemoPanel dp){
		this.dp = dp;
	}
	
	
	@Override
	public void keyPressed(KeyEvent e) {
		
		int code = e.getKeyCode();
		
		if(code == KeyEvent.VK_ENTER) {
			if(!dp.goalReached) {
				dp.setCostOnNodes();
				dp.autoSearch();
			}else {
				Node.count = 0;
				dp.reset();
				for(int i = 0; i < 50; i++) {
					System.out.println();
				}
				System.out.println("[A* Algorithm] - find the closest path.\n");
				System.out.println("[+] Please select the starting point");
			}
		}
		
	}

	
	
	
	@Override
	public void keyReleased(KeyEvent e) {}
	@Override
	public void keyTyped(KeyEvent e) {}
}
