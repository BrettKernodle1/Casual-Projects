import javax.swing.JFrame;

public class Snakegame {
	
	public Snakegame() {
		
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel(); 
	
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		
		
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		
		
	}
	
	public static void main(String[] args) {
		
		
		new Snakegame();
	}
	
}
