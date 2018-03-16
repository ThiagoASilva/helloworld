package br.edu.etec.lojainformatica;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class App extends JFrame{

	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem menuItem;
	
	public App(){	
		this.setVisible(true);
		this.setSize(800, 600);
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html#border
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		configuraMenu();
		this.pack();		
	}
	
	private void configuraMenu(){
		this.menuBar = new JMenuBar();
		JMenu menuCli = new JMenu("Clientes");
		JMenu menuHardware = new JMenu("Hardwares");
		JMenu menuVendas = new JMenu("Vendas");
		this.menuBar.add(menuCli);
		this.menuBar.add(menuHardware);
		this.menuBar.add(menuVendas);
		this.getContentPane().add(menuBar, BorderLayout.NORTH);
	}
	
	
	public static void main( String[] args){
	
		App app = new App();
	}
}
