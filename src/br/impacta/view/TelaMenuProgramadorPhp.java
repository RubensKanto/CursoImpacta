package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaMenuProgramadorPhpControle;

public class TelaMenuProgramadorPhp {

public void apresentarMenuProgramadorPhp(JFrame frameMenuInicial, RepositorioProgramadorPhp repositorioProgramadorPhp) {
		
		String menuInicialTexto = "Menu Inicial Programador Php";
		String opcao1MenuTexto = "[1] Cadastrar Programador Php";
		String opcao2MenuTexto = "[2] Listar Programador Php   ";
		String opcao3MenuTexto = "[3] Deletar               ";
		String opcao4MenuTexto = "[4] Alterar Programador Php ";
		String opcao5MenuTexto = "[5] Gerar PDF Programador Php ";
		String opcao6MenuTexto = "[6] Voltar Menu Inicial    ";
		String opcao7MenuTexto = "[7] Encerrar               ";
	
		JFrame frameMenuInicialProgramadorPhp = new JFrame();
		frameMenuInicialProgramadorPhp.setSize(240, 250);
		frameMenuInicialProgramadorPhp.setTitle("Cadastro de Programadores Php");
		frameMenuInicialProgramadorPhp.setLocation(300,300);
		
		JPanel panelMenuInicial = new JPanel();
		
		JLabel menuInicialLabel = new JLabel(menuInicialTexto);
		panelMenuInicial.add(menuInicialLabel);
		
		JLabel opcao1MenuLabel = new JLabel(opcao1MenuTexto);
		panelMenuInicial.add(opcao1MenuLabel);
		
		JLabel opcao2MenuLabel = new JLabel(opcao2MenuTexto);
		panelMenuInicial.add(opcao2MenuLabel);
		
		JLabel opcao3MenuLabel = new JLabel(opcao3MenuTexto);
		panelMenuInicial.add(opcao3MenuLabel);
		
		JLabel opcao4MenuLabel = new JLabel(opcao4MenuTexto);
		panelMenuInicial.add(opcao4MenuLabel);
		
		JLabel opcao5MenuLabel = new JLabel(opcao5MenuTexto);
		panelMenuInicial.add(opcao5MenuLabel);
		
		JLabel opcao6MenuLabel = new JLabel(opcao6MenuTexto);
		panelMenuInicial.add(opcao6MenuLabel);
		
		JLabel opcao7MenuLabel = new JLabel(opcao7MenuTexto);
		panelMenuInicial.add(opcao7MenuLabel);
		
		
		JTextField opcaoMenuProgramadorPhpJTextField  = new JTextField(10);
		
		panelMenuInicial.add(opcaoMenuProgramadorPhpJTextField);
		
		JButton buttonMenu = new JButton("Enviar");
		
		panelMenuInicial.add(buttonMenu);
		
		frameMenuInicialProgramadorPhp.add(panelMenuInicial);
		
		frameMenuInicialProgramadorPhp.setVisible(true);

		//System.out.println("ESTOU NA ##Menu Inicial Programador Php##");
		TelaMenuProgramadorPhpControle telaMenuProgramadorJavaControle = new TelaMenuProgramadorPhpControle(frameMenuInicial,frameMenuInicialProgramadorPhp,opcaoMenuProgramadorPhpJTextField, repositorioProgramadorPhp);
	    buttonMenu.addActionListener(telaMenuProgramadorJavaControle);
		
		
		
	
	}
	

	
}
