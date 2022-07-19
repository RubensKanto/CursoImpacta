package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.TabelaAlterarProgramadorPhp;
import br.impacta.view.TelaCadastroProgramadorPhp;
import br.impacta.view.TelaDeletarProgramadorPhp;
import br.impacta.view.TelaListarProgramadorPhp;
import br.impacta.view.service.GerarProgramadorJavaPDF;
import br.impacta.view.service.GerarProgramadorPhpPDF;


public class TelaMenuProgramadorPhpControle implements ActionListener  {
    JFrame frameMenuInicial;
	JFrame frameMenuInicialProgramadorPhp;
	JTextField opcaoMenuProgramadorPhpJTextField;
	TelaCadastroProgramadorPhp telaCadastroProgramadorPhp = new TelaCadastroProgramadorPhp();
	RepositorioProgramadorPhp repositorioProgramadorPhp;
	TelaListarProgramadorPhp telaListarProgramadorPhp = new TelaListarProgramadorPhp();
	TelaDeletarProgramadorPhp telaDeletarProgramadorPhp = new TelaDeletarProgramadorPhp();
	TabelaAlterarProgramadorPhp tabelaAlterarProgramadorPhp = new TabelaAlterarProgramadorPhp();  
	
	
	public TelaMenuProgramadorPhpControle(JFrame frameMenuInicial,JFrame frameMenuInicialProgramadorPhp, JTextField opcaoMenuProgramadorPhpJTextField,RepositorioProgramadorPhp repositorioProgramadorPhp) {
		super();
		this.frameMenuInicial = frameMenuInicial;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.opcaoMenuProgramadorPhpJTextField = opcaoMenuProgramadorPhpJTextField;
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
	}

		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if(opcaoMenuProgramadorPhpJTextField.getText().equals("1") || opcaoMenuProgramadorPhpJTextField.getText().equals("2") || opcaoMenuProgramadorPhpJTextField.getText().equals("3")
				|| opcaoMenuProgramadorPhpJTextField.getText().equals("4")||opcaoMenuProgramadorPhpJTextField.getText().equals("5")
				||opcaoMenuProgramadorPhpJTextField.getText().equals("6")||opcaoMenuProgramadorPhpJTextField.getText().equals("7")){
			
			frameMenuInicialProgramadorPhp.setVisible(false);
			
			switch (opcaoMenuProgramadorPhpJTextField.getText()) {
				case "1":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR PHP OPCAO CADASTRO");
					telaCadastroProgramadorPhp.abrirTelaCadastroProgramadorPhp(repositorioProgramadorPhp,frameMenuInicialProgramadorPhp);
				break;
					
				case "2":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR PHP OPCAO LISTAR");
					telaListarProgramadorPhp.apresentarListaProgramadorPhp(repositorioProgramadorPhp.listarProgramadorPhp(), frameMenuInicialProgramadorPhp);
				break;
				
				case "3":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR PHP OPCAO DELETAR");
					telaDeletarProgramadorPhp.apresentarDeletarProgramadorPhp(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp);
					
				break;
				
				case "4":
					//System.out.println("ESTOU NO MENU INICIAL DO PROGRAMADOR PHP OPCAO ALTERAR");
					tabelaAlterarProgramadorPhp.apresentarAlterarProgramadorPhp(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp);
				break;
				
				case "5":
					GerarProgramadorPhpPDF.gerarPdfProgramadorPhp();
					frameMenuInicialProgramadorPhp.setVisible(true);		
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



