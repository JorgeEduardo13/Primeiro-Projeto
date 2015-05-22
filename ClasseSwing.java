package br.edu.iftm.interfaces_graficas;

import java.awt.FlowLayout;
import javax.swing.*;

public class ClasseSwing implements Runnable{

	public void run(){
	
		JFrame f = new JFrame("Interface Gráfica do Usuário!");
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		f.add(new JLabel("Hello, World!"));
		f.add(new JButton("Clique me!"));
		
		f.pack();
		
		f.setSize(300, 80);
		
		f.setVisible(true);
		
	}

}
