import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;

public class Licencia extends JFrame implements ActionListener, ChangeListener{
	private JTextArea textarea1;
	private JLabel label1, label2;
	private JButton boton1, boton2;
	private JCheckBox check1;
	private JScrollPane scrollpane1;
	String nombre = "";

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida bienvenida = new Bienvenida();
		nombre = bienvenida.texto;		

		ImageIcon imagen = new ImageIcon("images/coca-cola.png");
		label1 = new JLabel(imagen);
		label1.setBounds(315,135,300,300);
		add(label1);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setFont(new Font("Andale Mono", 0, 9));		
		textarea1.setText("\n\n          TÉRMINOS Y CONDICIONES" +
                    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);

		label2 = new JLabel("TÉRMINOS Y CONDICIONES");
		label2.setBounds(215,5,200,30);
		label2.setFont(new Font("Andale Mono", 1, 14));
		label2.setForeground(new Color(0,0,0));
		add(label2);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);

		boton2 = new JButton("No Acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(true);
		add(boton2);

		check1 = new JCheckBox("Yo " + nombre + " Acepto");
		check1.setBounds(10,250,300,30);
		check1.addChangeListener(this);	
		add(check1);
	}

	public void stateChanged(ChangeEvent e){
		if(check1.isSelected() == true) {
			boton2.setEnabled(false);
			boton1.setEnabled(true);
		}
		else{
			boton2.setEnabled(true);
			boton1.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton1){
			Principal principal= new Principal();
			principal.setBounds(0,0,640,535);
			principal.setVisible(true);
			principal.setResizable(false);
			principal.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		else if(e.getSource() == boton2){
			Bienvenida bienvenida = new Bienvenida();
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	public static void main(String args[]){
		Licencia licencia = new Licencia();
		licencia.setBounds(0,0,600,360);
		licencia.setVisible(true);
		licencia.setResizable(false);
		licencia.setLocationRelativeTo(null);
	}
}