package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class VentanaOperaciones extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNota1;
	private JTextField txtNota2;
	private JLabel lblNota2;
	private JTextField txtNota3;
	private JLabel lblNota3;
	private JLabel lblResPromedio;
	private JLabel lblPromedio;
	private JLabel lblResultado;
	private JButton btnCalcular;


	public VentanaOperaciones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setResizable(false);
		iniciarComponentes();
		
		
		
	}


	private void iniciarComponentes() {
		// TODO Auto-generated method stub
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblTitulo = new JLabel("CALCULAR PROMEDIO");
		lblTitulo.setBackground(Color.BLACK);
		lblTitulo.setForeground(Color.WHITE);
		lblTitulo.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblTitulo.setOpaque(true);
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(0, 0, 448, 62);
		contentPane.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("NOMBRE:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setBounds(10, 73, 97, 30);
		contentPane.add(lblNombre);
		
		JLabel lblNota1 = new JLabel("Nota 1:");
		lblNota1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota1.setBounds(22, 116, 66, 30);
		contentPane.add(lblNota1);
		
		txtNombre = new JTextField();
		txtNombre.setForeground(new Color(0, 0, 0));
		txtNombre.setBounds(86, 64, 308, 39);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtNota1 = new JTextField();
		txtNota1.setColumns(10);
		txtNota1.setBounds(86, 114, 55, 39);
		contentPane.add(txtNota1);
		
		txtNota2 = new JTextField();
		txtNota2.setColumns(10);
		txtNota2.setBounds(209, 114, 55, 39);
		contentPane.add(txtNota2);
		
		lblNota2 = new JLabel("Nota 2:");
		lblNota2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota2.setBounds(151, 118, 66, 30);
		contentPane.add(lblNota2);
		
		txtNota3 = new JTextField();
		txtNota3.setColumns(10);
		txtNota3.setBounds(342, 114, 55, 39);
		contentPane.add(txtNota3);
		
		lblNota3 = new JLabel("Nota 3:");
		lblNota3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNota3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNota3.setBounds(274, 116, 66, 30);
		contentPane.add(lblNota3);
		
		lblResPromedio = new JLabel("");
		lblResPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblResPromedio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblResPromedio.setBounds(126, 190, 283, 30);
		contentPane.add(lblResPromedio);
		
		lblPromedio = new JLabel("PROMEDIO:");
		lblPromedio.setHorizontalAlignment(SwingConstants.CENTER);
		lblPromedio.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPromedio.setBounds(10, 190, 97, 30);
		contentPane.add(lblPromedio);
		
		lblResultado = new JLabel("RESULTADO:");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblResultado.setBounds(22, 233, 375, 30);
		contentPane.add(lblResultado);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.setBounds(284, 157, 125, 23);
		btnCalcular.addActionListener(this);
		contentPane.add(btnCalcular);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==btnCalcular) {
			
			calcularPromedio();
			
			
		}
	}


	private void calcularPromedio() {
		// TODO Auto-generated method stub
		//System.out.println("Presiono el boton");
		String Nombre=txtNombre.getText();
		try {
			double n1=Double.parseDouble(txtNota1.getText());
			double n2=Double.parseDouble(txtNota2.getText());
			double n3=Double.parseDouble(txtNota3.getText());
			double promedio=(n1+n2+n3)/3;
			
			System.out.println("El promedio de las notas es: "+promedio);
			
			lblResPromedio.setText(promedio+"");
			
			
			if (promedio>=3.5) {
				lblResultado.setText("RESULTADO: Gana la materia");
				lblResultado.setForeground(Color.GREEN);
			}else {
				lblResultado.setText("RESULTADO: Pierde la materia");
				lblResultado.setForeground(Color.RED);
			}
		} catch (Exception e) {
	JOptionPane.showMessageDialog(null, "Ocurre un error, verifique los datos ingresados ", "ERROR",JOptionPane.ERROR_MESSAGE  );
		}
		
	
		
		
		
	}
}
