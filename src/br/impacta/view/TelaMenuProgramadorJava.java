package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaMenuProgramadorJavaControle;



public class TelaMenuProgramadorJava {
	
public void apresentarMenuProgramadorJava(JFrame frameMenuInicial, RepositorioProgramadorJava repositorioProgramadorJava) {
		
		String menuInicialTexto = "Menu Inicial Programador Java";
		String opcao1MenuTexto = "[1] Cadastrar Programador Java";
		String opcao2MenuTexto = "[2] Listar Programador Java   ";
		String opcao3MenuTexto = "[3] Deletar                 ";
		String opcao4MenuTexto = "[4] Alterar Programador Java  ";
		String opcao5MenuTexto = "[5] Gerar PDF Programador Java";
		String opcao6MenuTexto = "[6] Voltar Menu Inicial      ";
		String opcao7MenuTexto = "[7] Encerrar                ";
		
		JFrame frameMenuInicialProgramadorJava = new JFrame();
		frameMenuInicialProgramadorJava.setSize(240, 250);
		frameMenuInicialProgramadorJava.setTitle("Cadastro de Programadores Java");
		frameMenuInicialProgramadorJava.setLocation(300,300);
		
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
		
		JTextField opcaoMenuProgramadorJavaJTextField  = new JTextField(10);
		
		panelMenuInicial.add(opcaoMenuProgramadorJavaJTextField);
		
		JButton buttonMenu = new JButton("Enviar");
		
		panelMenuInicial.add(buttonMenu);
		
		frameMenuInicialProgramadorJava.add(panelMenuInicial);
		
		frameMenuInicialProgramadorJava.setVisible(true);

		//System.out.println("ESTOU NA Menu Inicial Programador Java");
		TelaMenuProgramadorJavaControle telaMenuProgramadorJavaControle = new TelaMenuProgramadorJavaControle(frameMenuInicial,frameMenuInicialProgramadorJava,opcaoMenuProgramadorJavaJTextField, repositorioProgramadorJava);
	    buttonMenu.addActionListener(telaMenuProgramadorJavaControle);
		
		
		
	
	}
	

}
