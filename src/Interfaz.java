import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.MatteBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextArea;
import java.awt.ComponentOrientation;
import java.awt.Cursor;
import javax.swing.DropMode;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollBar;
import java.awt.Component;

public class Interfaz {

	private JFrame frame;
	private JTextField txtKevin;
	private JTextField txtRizo;
	private JTextField txtPonce;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Interfaz() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setEnabled(false);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 0));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE)
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE)
		);
		
		JLabel lblNewLabel = new JLabel("Registro de Usuarios");
		lblNewLabel.setFont(new Font("Stencil", Font.ITALIC, 14));
		lblNewLabel.setForeground(Color.RED);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(122, 235, 230));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(240, 128, 128));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(255, 91, 91));
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(166, 231, 236));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_panel.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
								.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 406, Short.MAX_VALUE))
							.addGap(18)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
							.addGap(12)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
						.addComponent(panel_2, GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
					.addGap(18)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_4, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
						.addComponent(panel_3, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
					.addGap(24))
		);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Nuevo");
		lblNewLabel_11.setOpaque(true);
		lblNewLabel_11.setBackground(new Color(0, 0, 0));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11.setBounds(63, 40, 101, 27);
		panel_4.add(lblNewLabel_11);
		
		JLabel lblNewLabel_11_1 = new JLabel("Guardar");
		lblNewLabel_11_1.setForeground(Color.WHITE);
		lblNewLabel_11_1.setOpaque(true);
		lblNewLabel_11_1.setBackground(Color.BLACK);
		lblNewLabel_11_1.setIgnoreRepaint(true);
		lblNewLabel_11_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_1.setBounds(63, 85, 101, 28);
		panel_4.add(lblNewLabel_11_1);
		
		JLabel lblNewLabel_11_2 = new JLabel("Salir");
		lblNewLabel_11_2.setBackground(Color.BLACK);
		lblNewLabel_11_2.setForeground(Color.WHITE);
		lblNewLabel_11_2.setOpaque(true);
		lblNewLabel_11_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_11_2.setBounds(63, 124, 101, 27);
		panel_4.add(lblNewLabel_11_2);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Datos Opcionales");
		lblNewLabel_2_1.setBounds(10, 11, 105, 14);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		lblNewLabel_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		lblNewLabel_1_1_1.setBounds(10, 36, 386, 145);
		panel_3.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Descripción:");
		lblNewLabel_3_1.setBounds(39, 48, 59, 14);
		panel_3.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Preferencia:");
		lblNewLabel_3_1_1.setBounds(203, 48, 64, 14);
		panel_3.add(lblNewLabel_3_1_1);
		
		JTextArea txtrBuenosDiasChavales = new JTextArea();
		txtrBuenosDiasChavales.setText("Buenos dias \r\nchavales");
		txtrBuenosDiasChavales.setToolTipText("");
		txtrBuenosDiasChavales.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		txtrBuenosDiasChavales.setBounds(27, 73, 105, 81);
		panel_3.add(txtrBuenosDiasChavales);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(130, 73, 17, 81);
		panel_3.add(scrollBar);
		
		JScrollBar scrollBar_1 = new JScrollBar();
		scrollBar_1.setOrientation(JScrollBar.HORIZONTAL);
		scrollBar_1.setBounds(27, 153, 105, 17);
		panel_3.add(scrollBar_1);
		
		JTextArea txtrBailarjugarleer = new JTextArea();
		txtrBailarjugarleer.setText("Bailar\r\nJugar\r\nLeer\r\nPatinar");
		txtrBailarjugarleer.setBounds(213, 73, 105, 81);
		panel_3.add(txtrBailarjugarleer);
		
		JScrollBar scrollBar_2 = new JScrollBar();
		scrollBar_2.setBounds(316, 73, 17, 81);
		panel_3.add(scrollBar_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Perfil del Usuario");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(10, 11, 115, 14);
		panel_2.add(lblNewLabel_9);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		lblNewLabel_1_1.setBounds(20, 29, 176, 278);
		panel_2.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar foto de perfil");
		chckbxNewCheckBox.setContentAreaFilled(false);
		chckbxNewCheckBox.setBounds(30, 187, 137, 23);
		panel_2.add(chckbxNewCheckBox);
		
		JCheckBox chckbxMostrarFechaDe = new JCheckBox("Mostrar fecha de nacimiento");
		chckbxMostrarFechaDe.setContentAreaFilled(false);
		chckbxMostrarFechaDe.setBounds(30, 213, 166, 23);
		panel_2.add(chckbxMostrarFechaDe);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setIcon(new ImageIcon("src/ImgUser.jpg"));
		lblNewLabel_10.setBounds(38, 44, 146, 136);
		panel_2.add(lblNewLabel_10);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 29, 376, 278);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128), new Color(128, 128, 128)));
		
		JLabel lblNewLabel_2 = new JLabel("Datos Generales");
		lblNewLabel_2.setBounds(10, 9, 93, 14);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres:");
		lblNewLabel_3.setBounds(67, 54, 46, 14);
		panel_1.add(lblNewLabel_3);
		panel_1.add(lblNewLabel_1);
		panel_1.add(lblNewLabel_2);
		
		txtKevin = new JTextField();
		txtKevin.setText("Kevin");
		txtKevin.setBounds(151, 51, 122, 20);
		panel_1.add(txtKevin);
		txtKevin.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Apellido Paterno:");
		lblNewLabel_4.setBounds(32, 97, 87, 14);
		panel_1.add(lblNewLabel_4);
		
		txtRizo = new JTextField();
		txtRizo.setText("Rizo");
		txtRizo.setBounds(151, 94, 122, 20);
		panel_1.add(txtRizo);
		txtRizo.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Apellido Materno:");
		lblNewLabel_5.setBounds(32, 138, 87, 14);
		panel_1.add(lblNewLabel_5);
		
		txtPonce = new JTextField();
		txtPonce.setText("Ponce");
		txtPonce.setBounds(151, 135, 122, 20);
		panel_1.add(txtPonce);
		txtPonce.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Fecha Nacimiento:");
		lblNewLabel_6.setBounds(26, 176, 93, 14);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Sexo:");
		lblNewLabel_7.setBounds(32, 213, 34, 14);
		panel_1.add(lblNewLabel_7);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Femenino");
		rdbtnNewRadioButton.setContentAreaFilled(false);
		rdbtnNewRadioButton.setBounds(148, 209, 109, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Masculino");
		rdbtnNewRadioButton_1.setContentAreaFilled(false);
		rdbtnNewRadioButton_1.setBounds(148, 235, 109, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JLabel lblNewLabel_8 = new JLabel("Nacionalidad:");
		lblNewLabel_8.setBounds(43, 270, 70, 14);
		panel_1.add(lblNewLabel_8);

		ButtonGroup generoGroup = new ButtonGroup();
		generoGroup.add(rdbtnNewRadioButton);
		generoGroup.add(rdbtnNewRadioButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Perú"}));
		comboBox.setSelectedIndex(0);
		comboBox.setBounds(148, 265, 122, 22);
		panel_1.add(comboBox);
		
		JLabel lblNewLabel_12 = new JLabel("07/01/1990");
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBackground(Color.WHITE);
		lblNewLabel_12.setOpaque(true);
		lblNewLabel_12.setBounds(150, 170, 123, 20);
		panel_1.add(lblNewLabel_12);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 689, 628);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
