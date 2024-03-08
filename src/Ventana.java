import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.print.attribute.AttributeSetUtilities;
import javax.swing.BorderFactory;
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
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1100,750);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Super Mario Bros. 3");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

	//Metodo para los componentes
	public void IniciarComponentes() {

		this.fondo();
		this.repaint();
	}
	
	public void fondo() {
		
		//Primer panel
		JPanel fondo = new JPanel();
		fondo.setSize(this.getWidth(), this.getHeight());
		fondo.setBackground(Color.decode("#0664bf"));
		fondo.setLayout(null);
		this.add(fondo);
	}
	
	public void paint(Graphics g) {
		super.paint(g);

		Graphics2D g2d = (Graphics2D) g;
		
		//Nube
		g2d.setColor(Color.white);
		g2d.fillRoundRect(0, 620, 400, 40, 100, 100);
		
		//Pilar 1
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRoundRect(30, 350, 150, 400, 600,100);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(30, 350, 150, 400, 600,100);
		
		//Circulos pilar 1
		g2d.setColor(Color.white);
		g2d.fillOval(100, 400, 20, 40);
		
		g2d.fillOval(100, 490, 20, 40);
		
		g2d.fillOval(50, 550, 20, 40);
		
		//Pilar 0
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRoundRect(0, 600, 130, 140, 600,100);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(0, 600, 130, 140, 600,100);
		
		//Nube
		g2d.setColor(Color.white);
		g2d.fillRoundRect(320, 570, 300, 40, 100, 100);
		g2d.fillRoundRect(380, 660, 200, 40, 100, 100);

		
		//Pilar2
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRoundRect(500, 350, 150, 400, 600,100);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(500, 350, 150, 400, 600,100);
		

		//Circulos pilar 2
		g2d.setColor(Color.white);
		g2d.fillOval(580, 380, 20, 40);
				
		g2d.fillOval(530, 420, 20, 40);
				
		g2d.fillOval(530, 500, 20, 40);
		
		//Nube
		g2d.fillRoundRect(730, 400, 200, 40, 100, 100);
		
		//Pilar3
		g2d.setColor(Color.decode("#c6e3e7"));
		g2d.fillRoundRect(650, 250, 150, 495, 600,100);
				
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(650, 250, 150, 495, 600,100);

		
		//Circulos pilar 3
		g2d.setColor(Color.white);
		g2d.fillOval(670, 400, 20, 40);
				
		g2d.fillOval(730, 300, 20, 40);
				
		//Pilar azul 2
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRoundRect(500, 590, 190, 150, 500,100);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(500, 590, 190, 150, 500,100);
		
		//Tuberia
		g2d.setColor(Color.decode("#7e7dc6"));
		g2d.fillRect(535, 600, 135, 100);
				
		g2d.fillRect(525, 535, 150, 60);
				
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(535, 600, 135, 100, 10, 10);
				
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(525, 535, 150, 60, 10, 10);
		
		//Nube
		g2d.setColor(Color.white);
		g2d.fillRoundRect(580, 480, 200, 40, 100, 100);
		
		//Pilar azul 3
		g2d.setColor(Color.decode("#76b2d7"));
		g2d.fillRoundRect(690, 460, 200, 290, 500,100);
				
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(1));
		g2d.drawRoundRect(690, 460, 200, 290, 500,100);

		//Circulos azul 3
		g2d.setColor(Color.white);
		g2d.fillOval(740, 500, 20, 40);
						
		g2d.fillOval(800, 620, 20, 40);
		
		//Nubes
		g2d.fillRoundRect(190, 460, 360, 40, 100, 100);
		g2d.fillRoundRect(800, 355, 200, 40, 100, 100);
		
		//Imagen mario
		try {
				BufferedImage Image = ImageIO.read(new File("src/imgMarioBros.png"));
					
				g2d.drawImage(Image, 400, 605, null);
		} catch(IOException e) {
			// TODO Auto-generated catch block
				e.printStackTrace();
		}
		
		//Cuadros derecha
		g2d.setColor(Color.decode("#7a767c"));
		g2d.fillRoundRect(880, 630, 70, 70, 50, 30);
		g2d.fillRoundRect(880, 560, 70, 70, 50, 30);
		g2d.fillRoundRect(880, 490, 70, 70, 50, 30);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawRoundRect(880, 630, 70, 70, 50, 30);
		g2d.drawRoundRect(880, 560, 70, 70, 50, 30);
		g2d.drawRoundRect(880, 490, 70, 70, 50, 30);
		
		g2d.setColor(Color.decode("#fbe026"));
		g2d.fillRoundRect(950, 490, 70, 70, 50, 30);
		g2d.fillRoundRect(1020, 490, 70, 70, 50, 30);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawRoundRect(950, 490, 70, 70, 50, 30);
		g2d.drawRoundRect(1020, 490, 70, 70, 50, 30);
	
		g2d.setStroke(new BasicStroke(4));
		g2d.drawLine(970, 510, 970, 530);
		g2d.drawLine(1000, 510, 1000, 530);
		
		g2d.drawLine(1040, 510, 1040, 530);
		g2d.drawLine(1040, 510, 1040, 530);
		
		g2d.drawLine(1070, 510, 1070, 530);
		g2d.drawLine(1070, 510, 1070, 530);
		
		//Tuberia2
		g2d.setColor(Color.decode("#7e7dc6"));
		g2d.fillRect(980, 630, 135, 100);
						
		g2d.fillRect(970, 570, 150, 60);
						
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(980, 630, 135, 100, 10, 10);
						
		g2d.setStroke(new BasicStroke(8));
		g2d.drawRoundRect(970, 570, 150, 60, 10, 10);
		
		//Primer piso
		g2d.setColor(Color.decode("#0bda04"));
		g2d.fillRect(0, 700, 1108, 20);
		
		g2d.setColor(Color.black);
		g2d.setStroke(new BasicStroke(2));
		g2d.drawRect(0, 700, 1108, 20);

		//Segundo piso
		g2d.setColor(Color.decode("#b16f3b"));
		g2d.fillRect(0, 720, 1108, 60);
	}
}