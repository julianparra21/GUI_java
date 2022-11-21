package gui;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sun.java.swing.plaf.windows.resources.windows;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField campo_nombre;
	private JTextField campo_edad;
	private JButton btn_aceptar;
	private JButton bt_cancelar;

	
	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocale(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		 btn_aceptar = new JButton("aceptar");
		
		btn_aceptar.setBounds(10, 153, 89, 23);
		contentPane.add(btn_aceptar);
		
		 bt_cancelar = new JButton("cancelar");
		bt_cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		bt_cancelar.setBounds(385, 153, 89, 23);
		contentPane.add(bt_cancelar);
		
		JLabel eti_titulo = new JLabel("Ejemplo Java Swing");
		eti_titulo.setHorizontalAlignment(SwingConstants.CENTER);
		eti_titulo.setBounds(195, 11, 134, 28);
		contentPane.add(eti_titulo);
		
		campo_nombre = new JTextField();
		campo_nombre.setBounds(13, 77, 461, 20);
		contentPane.add(campo_nombre);
		campo_nombre.setColumns(10);
		
		campo_edad = new JTextField();
		campo_edad.setBounds(10, 109, 47, 20);
		contentPane.add(campo_edad);
		campo_edad.setColumns(10);
		
		JLabel eti_mensaje = new JLabel("");
		eti_mensaje.setBounds(30, 187, 432, 14);
		contentPane.add(eti_mensaje);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btn_aceptar) {
		
			
		}
	}
}
