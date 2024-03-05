import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.attribute.AttributeSetUtilities;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutFocusTraversalPolicy;
import javax.swing.border.Border;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1000,750);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Mi Ventana");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2d = (Graphics2D) g;
		
		//Lineas
		g2d.setColor(Color.blue);	
		g2d.fillRect(50, 50, 200, 100);
		g2d.clearRect(100, 100, 100, 100);
		
		g2d.fillArc(300, 300, 100, 100, 45, 100);
		g2d.drawArc(320, 260, 100, 100, 45, 100);
		
		g2d.drawLine(0, 0, 500, 500);
		
		g2d.drawOval(400, 400, 50, 80);
		g2d.fillOval(350, 400, 50, 80);
		
		int xPoints[] = {100,250,300};
		int yPoints[] = {100, 200, 300};
		
		g2d.setColor(Color.black);
		g2d.fillPolygon(xPoints, yPoints, 3);
		
		g2d.setColor(Color.red);
		g2d.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 40));
		g2d.drawString("Holaaaa", 250, 90);
		
		g2d.setStroke(new BasicStroke(10));
		g2d.drawRoundRect(420, 150, 200, 150, 10, 0);
		
		try {
			BufferedImage Image = ImageIO.read(new File("src/PasswordIcon (1).png"));
			
			g2d.drawImage(Image, 20, 200, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//Metodo para los componentes
	public void IniciarComponentes() {

	
		//this.calculadora();
		//this.registro();
		//this.admin();
		this.repaint();	
	}
	
	public void calculadora() {
		this.setSize(480,650);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#35E4F1"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00", 4);
		text.setOpaque(true);
		text.setFont(new Font ("Agency FB", Font.CENTER_BASELINE, 40));
		panel.add(text, BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.decode("#CF7F54"));
		centro.setLayout(new GridLayout(4,3));
		panel.add(centro, BorderLayout.CENTER);
		
		
		String btns[] = {"7", "8", "9", "6", "5", "4", "3", "2", "1", "0", ".", "/"};
		for(int i = 0; i<12; i++) {
			JButton boton = new JButton(btns[i]);
			centro.add(boton);
		}
		
		JPanel east = new JPanel();
		east.setBackground(Color.decode("#98E055"));
		east.setLayout(new GridLayout(3,1));
		panel.add(east, BorderLayout.EAST);
		
		String btns2[] = {"+", "-", "="};
		for(int i = 0; i<3; i++) {
			JButton boton = new JButton(btns2[i]);
			east.add(boton);
		}
		
		JPanel west = new JPanel();
		west.setBackground(Color.DARK_GRAY);
		west.setLayout(new BoxLayout(west, BoxLayout.Y_AXIS));
		panel.add(west, BorderLayout.WEST);
		
		String btns3[] = {"MC", "M+", "*"};
		for(int i = 0; i<3; i++) {
			JButton boton = new JButton(btns3[i]);
			west.add(boton);
		}
		
		this.add(panel);
	}
}