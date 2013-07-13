
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Test {

	public static void main(String[] args) {
		JFrame frame = new JFrame("frame test");
		makeJFrame(frame);
		makeMenu(frame);
		
	}
	
	public static void makeJFrame(JFrame frame){
		JLabel emptyLabel = new JLabel("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        emptyLabel.setPreferredSize(new Dimension(400, 400));
		frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void makeMenu(JFrame frame){
		JMenuBar menuBar = new JMenuBar();
		JMenu file = new JMenu("File");
		file.setMnemonic(KeyEvent.VK_F);
		addMenuItem(file,"New Game");
		addMenuItem(file,"Exit");
		menuBar.add(file);
		frame.setJMenuBar(menuBar);
		
	}
	public static void addMenuItem(JMenu menu, String text){
		JMenuItem menuItem = new JMenuItem(text, (int)text.charAt(0));
		menu.add(menuItem);
	}

}
