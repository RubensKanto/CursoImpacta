package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.TabelaAlterarProgramadorJava;
import br.impacta.view.TelaCadastroProgramadorJava;
import br.impacta.view.TelaDeletarProgramadorJava;
import br.impacta.view.TelaListarProgramadorJava;
import br.impacta.view.service.GerarProgramadorJavaPDF;




public class TelaMenuProgramadorJavaControle implements ActionListener  {

	JFrame frameMenuInicial;
	JFrame frameMenuInicialProgramadorJava;
	JTextField opcaoMenuProgramadorJavaJTextField;
	TelaCadastroProgramadorJava telaCadastroProgramadorJava = new TelaCadastroProgramadorJava();
	RepositorioProgramadorJava repositorioProgramadorJava;
	TelaListarProgramadorJava telaListarProgramadorJava = new TelaListarProgramadorJava();
	TelaDeletarProgramadorJava telaDeletarProgramadorJava = new TelaDeletarProgramadorJava();
	TabelaAlterarProgramadorJava tabelaAlterarProgramadorJava = new TabelaAlterarProgramadorJava();  
	
	
	public TelaMenuProgramadorJavaControle(JFrame frameMenuInicial,JFrame frameMenuInicialProgramadorJava, JTextField opcaoMenuProgramadorJavaJTextField,RepositorioProgramadorJava repositorioProgramadorJava) {
		super();
		this.frameMenuInicial = frameMenuInicial;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.opcaoMenuProgramadorJavaJTextField = opcaoMenuProgramadorJavaJTextField;
		this.repositorioProgramadorJava = repositorioProgramadorJava;
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcaoMenuProgramadorJavaJTextField.getText().equals("1") || opcaoMenuProgramadorJavaJTextField.getText().equals("2") || opcaoMenuProgramadorJavaJTextField.getText().equals("3")
				|| opcaoMenuProgramadorJavaJTextField.getText().equals("4")||opcaoMenuProgramadorJavaJTextField.getText().equals("5")
				||opcaoMenuProgramadorJavaJTextField.getText().equals("6")||opcaoMenuProgramadorJavaJTextField.getText().equals("7")){
			
			frameMenuInicialProgramadorJava.setVisible(false);
			
			
			switch (opcaoMenuProgramadorJavaJTextField.getText()) {
				case "1":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR JAVA OPCAO CADASTRO");
					telaCadastroProgramadorJava.abrirTelaCadastroProgramadorJava(repositorioProgramadorJava,frameMenuInicialProgramadorJava);
				break;
					
				case "2":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR JAVA OPCAO LISTAR");
					telaListarProgramadorJava.apresentarListaProgramadorJava(repositorioProgramadorJava.listarProgramadorJava(), frameMenuInicialProgramadorJava);
				break;
				
				case "3":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR JAVA OPCAO DELETAR");
					telaDeletarProgramadorJava.apresentarDeletarProgramadorJava(repositorioProgramadorJava, frameMenuInicialProgramadorJava);
					
				break;
				
				case "4":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR JAVA OPCAO ALTERAR");
					tabelaAlterarProgramadorJava.apresentarAlterarProgramadorJava( repositorioProgramadorJava, frameMenuInicialProgramadorJava);				
				break;
				
				case "5":
					GerarProgramadorJavaPDF.gerarPdfProgramadorJava();
					frameMenuInicialProgramadorJava.setVisible(true);	
				break;
				
				case "6":
					frameMenuInicial.setVisible(true);			
				break;
								
				case "7":
					System.exit(0);
				break;
				
			}
				
		}else {
			
			JOptionPane.showMessageDialog(null, "Digite uma Opcão Valida!!!");
		}
		
	}

}
