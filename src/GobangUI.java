import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GobangUI {
	
	JFrame cb;
	private JPanel imagePanel;
	private ImageIcon background;
	public void Checkerboard() {
		cb=new JFrame();
		background = new ImageIcon("F:\\作业\\大一下学期\\JQuerry实战\\综合实验\\1740129169-林梓丰-五子棋\\chessboard.png");
		JLabel label = new JLabel(background);
		//label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
		label.setBounds(0, 0, background.getIconWidth(),background.getIconHeight());
				
		imagePanel = (JPanel) cb.getContentPane();
		imagePanel.setOpaque(false);
		imagePanel.setLayout(new GridLayout(15,15));
		
		
		  for(int i=0;i<225;i++) {
			     JButton temp=new JButton(""+i+"");
			     temp.setContentAreaFilled(false); 
				imagePanel.add(temp);
				
			}
		  
		  cb.getLayeredPane().setLayout(null);
		  cb.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		  cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  cb.setSize(background.getIconWidth(), background.getIconHeight());
		  cb.setResizable(false);
		  cb.setVisible(true);
		
	}
	public static void main(String[] args) {
		GobangUI c=new GobangUI();
		c.Checkerboard();
		

	}

}
