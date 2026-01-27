import javax.swing.*;

public class Formulario7 extends JFrame{
	private JTextField textfield1;
	private JTextArea textarea1;

	public Formulario7(){
		setLayout(null);

		textfield1 = new JTextField();
		textfield1.setBounds(10,10,200,30);
		add(textfield1);

		textarea1 = new JTextArea();
		textarea1.setBounds(10,50,400,300);
		add(textarea1);
		
	}

	public static void main(String args[]){
		Formulario7 formulario7 = new Formulario7();
		formulario7.setBounds(0,0,540,400);
		formulario7.setVisible(true);
		formulario7.setLocationRelativeTo(null);
		formulario7.setResizable(false);
	}
}