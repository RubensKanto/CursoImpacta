package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.TelaMenuProgramadorJava;
import br.impacta.view.TelaMenuProgramadorPhp;

public class MenuInicialControle implements ActionListener {

	//Recebe da classe tela MenuInicial
	JTextField	opcaoMenuJTextField;
	JFrame  frameMenuInicial;
	
	//Variaveis criadas aqui - Local
	RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
	TelaMenuProgramadorJava telaMenuProgramadorJava = new TelaMenuProgramadorJava();
	RepositorioProgramadorPhp repositorioProgramadorPhp = new RepositorioProgramadorPhp();
	TelaMenuProgramadorPhp telaMenuProgramadorPhp = new TelaMenuProgramadorPhp();
	
	
	public MenuInicialControle(JTextField opcaoMenuJTextField, JFrame frameMenuInicial) {
		//super();
		this.opcaoMenuJTextField = opcaoMenuJTextField;
		this.frameMenuInicial = frameMenuInicial;
	}
	
	
	//Ação do botão
	@Override
	public void actionPerformed(ActionEvent e) {
		if(opcaoMenuJTextField.getText().equals("1") || opcaoMenuJTextField.getText().equals("2") || opcaoMenuJTextField.getText().equals("3")){
			frameMenuInicial.setVisible(false);
		
			switch (opcaoMenuJTextField.getText()) {
				case "1":
				//	System.out.println("ESTOU NA OPCAO PROGRAMADOR JAVA DO MENUINICIAL");
					telaMenuProgramadorJava.apresentarMenuProgramadorJava(frameMenuInicial, repositorioProgramadorJava);
					
				break;
				
				case "2":
				//	System.out.println("ESTOU NA OPCAO PROGRAMADOR PHP DO MENUINICIAL");
					telaMenuProgramadorPhp.apresentarMenuProgramadorPhp(frameMenuInicial, repositorioProgramadorPhp);
				break;
				
				case "3":
					System.exit(0);
				break;
				
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
				
		
	}
	
}
