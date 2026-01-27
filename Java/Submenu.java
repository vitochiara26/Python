import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Submenu extends JFrame implements ActionListener{
	private JMenuBar menubar;
	private JMenu menu1, menu2, menu3;
	private JMenuItem menuitem1, menuitem2, menuitem3, menuitem4 ;

	public Submenu(){
		setLayout(null);

		menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		menu1 = new JMenu("Opciones");
		menubar.add(menu1);

		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);

		menuitem1 = new JMenuItem("300*200");
		menu2.add(menuitem1);
		menuitem1.addActionListener(this);

		menuitem2 = new JMenuItem("640*480");
		menu2.add(menuitem2);
		menuitem2.addActionListener(this);

		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3);

		menuitem3 = new JMenuItem("Rojo");
		menu3.add(menuitem3);
		menuitem3.addActionListener(this);

		menuitem4 = new JMenuItem("Verde");
		menu3.add(menuitem4);
		menuitem4.addActionListener(this);

	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == menuitem1){
			setSize(300,200);
		}
		if(e.getSource() == menuitem2){
			setSize(640,480);
		}
		if(e.getSource() == menuitem3){
			getContentPane().setBackground(new Color(208,23,22));
		}
		if(e.getSource() == menuitem4){
			getContentPane().setBackground(new Color(43,175,43));
		}
	}

	public static void main(String args[]){
		Submenu menu = new Submenu();
		menu.setBounds(0,0,300,200);
		menu.setVisible(true);
		menu.setLocationRelativeTo(null);
	}
}
