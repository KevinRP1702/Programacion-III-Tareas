import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{
public Ventana() {

			//Atributos de la ventana
			this.setVisible(true);
			this.setSize(1000,800);
			this.setLocation(200,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setResizable(true);
			this.setTitle("Casita");
			this.setMinimumSize(new Dimension(250,250));
			this.setMaximumSize(new Dimension(1000,750));
			this.setLocationRelativeTo(null);

			this.setLayout(null);

			this.IniciarComponentes();
		}

		//Metodo para los componentes
			public void IniciarComponentes() {
		
				this.casita();
			}
			
			
			public void casita() {
				//Primer panel
				JPanel fondo = new JPanel();
				fondo.setSize(this.getWidth(), this.getHeight());
				fondo.setBackground(Color.decode("#2ea6cb"));
				fondo.setLayout(null);
				this.add(fondo);
			}
			
			@Override
			public void paint(Graphics g) {
				super.paint(g);

				Graphics2D g2d = (Graphics2D) g;
				
				//Cuadrado principal de la casa
				g2d.setColor(Color.decode("#fddfb2"));
				g2d.fillRect(300, 300, 400, 400);
				
				//Puerta de la casa
				g2d.setColor(Color.decode("#ab7c4d"));
				g2d.fillRect(430, 500, 125, 200);
				
				//Perilla de la casa
				g2d.setColor(Color.black);
				g2d.fillOval(540, 600, 10, 10);
				
				//Vallas verticales izquierda
				g2d.setColor(Color.decode("#ab7c4d"));
				for(int x = 10; x < 300; x+= 60 ) {
					g2d.fillRect(x, 500, 30, 200);
				}
				
				//Vallas verticales derecha
				for(int x = 710; x < 1000; x+= 60 ) {
					g2d.fillRect(x, 500, 30, 200);
				}
				
				//Vallas horizontales izquierda
				for(int y = 510; y < 700; y+= 60 ) {
					g2d.fillRect(0, y, 300, 30);
				}
				
				//Vallas horizontales derecha
				for(int y = 510; y < 700; y+= 60 ) {
					g2d.fillRect(700, y, 300, 30);
				}
				
				//Puntas de las vallas
				int xPointValla[] = {25, 10, 40};
				int yPointValla[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla, yPointValla, 3);
				int xPointValla2[] = {85, 70, 100};
				int yPointValla2[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla2, yPointValla2, 3);
				int xPointValla3[] = {145, 130, 160};
				int yPointValla3[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla3, yPointValla3, 3);
				int xPointValla4[] = {205, 190, 220};
				int yPointValla4[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla4, yPointValla4, 3);
				int xPointValla5[] = {265, 250, 280};
				int yPointValla5[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla5, yPointValla5, 3);
				int xPointValla6[] = {725, 710, 740};
				int yPointValla6[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla6, yPointValla6, 3);
				int xPointValla7[] = {785, 770, 800};
				int yPointValla7[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla7, yPointValla7, 3);
				int xPointValla8[] = {845, 830, 860};
				int yPointValla8[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla8, yPointValla8, 3);
				int xPointValla9[] = {905, 890, 920};
				int yPointValla9[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla9, yPointValla9, 3);
				int xPointValla10[] = {965, 950, 980};
				int yPointValla10[] = {490, 500, 500};
				g2d.fillPolygon(xPointValla10, yPointValla10, 3);
				
				//Pasto
				g2d.setColor(Color.decode("#8fc83b"));
				g2d.fillRect(0 ,700 , 1008, 70);
				
				//Tierra
				g2d.setColor(Color.decode("#64351b"));
				g2d.fillRect(0 ,770, 1008, 60);
				
				//Ventana 1
				g2d.setColor(Color.CYAN);
				g2d.fillRect(350, 350, 125, 125);
				
				
				//Ventana 2
				g2d.fillRect(530, 350, 125, 125);
				
				//Marco ventana izquierda
				g2d.setColor(Color.decode("#ab7c4d"));
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(354, 410, 470, 410);
				
				g2d.setColor(Color.decode("#ab7c4d"));
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(415, 355, 415, 472);
				
				//Marco ventana derecha
				g2d.setColor(Color.decode("#ab7c4d"));
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(534, 410, 650, 410);
				
				g2d.setColor(Color.decode("#ab7c4d"));
				g2d.setStroke(new BasicStroke(10));
				g2d.drawLine(595, 355, 595, 472);
				
				//Techo de la casa
				int xPoints[] = {500, 300, 700};
				int yPoints[] = {100, 300, 300};
				g2d.setColor(Color.decode("#a11818"));
				g2d.fillPolygon(xPoints, yPoints, 3);
			}
}