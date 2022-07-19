package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaCadastroProgramadorJavaControle;



public class TelaCadastroProgramadorJava {

	public void abrirTelaCadastroProgramadorJava(RepositorioProgramadorJava repositorioProgramadorJava,JFrame frameMenuInicialProgramadorJava) {
		
		//String matriculaTexto = "Digite a matricula do Programador Java:";
		String nomeTexto = "Digite o Nome do Programador Java:";
		String horaTrabalhadaTexto = "Horas Trabalhadas:";
		String certificacaoOracleTexto = "Certificação:";
		
		
		
		JFrame frameTelaCadastroProgramadorJava = new JFrame();
		frameTelaCadastroProgramadorJava.setSize(200, 400);
		frameTelaCadastroProgramadorJava.setTitle("Cadastro de Programador Java");
		frameTelaCadastroProgramadorJava.setLocation(300,300);
		
		JPanel panelTelaCadastroProgramadorJava = new JPanel();
		
	
		// opcao1
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroProgramadorJava.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(nomeTextField);
		
		//opcao2
		JLabel horaTrabalhadaLabel = new JLabel(horaTrabalhadaTexto);
		panelTelaCadastroProgramadorJava.add(horaTrabalhadaLabel);
				
		JTextField horaTrabalhadaTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(horaTrabalhadaTextField);
		
		//opcao3
		JLabel certificacaoOracleTextoLabel = new JLabel(certificacaoOracleTexto);
		panelTelaCadastroProgramadorJava.add(certificacaoOracleTextoLabel);
		
		JTextField certificacaoOracleTextField = new JTextField(10);
		panelTelaCadastroProgramadorJava.add(certificacaoOracleTextField);
		
	
		
		JButton buttonCadastroProgramadorJava = new JButton("Registrar");
		panelTelaCadastroProgramadorJava.add(buttonCadastroProgramadorJava);
		
		frameTelaCadastroProgramadorJava.add(panelTelaCadastroProgramadorJava);
		
		frameTelaCadastroProgramadorJava.setVisible(true);
		
		//System.out.println("ESTOU NA TELA CADASTRO ProgramadorJava");
		
		TelaCadastroProgramadorJavaControle telaCadastroProgramadorJavaControle = new TelaCadastroProgramadorJavaControle(
				horaTrabalhadaTextField, nomeTextField,
				certificacaoOracleTextField, repositorioProgramadorJava,
				frameMenuInicialProgramadorJava, frameTelaCadastroProgramadorJava);
		
		buttonCadastroProgramadorJava.addActionListener(telaCadastroProgramadorJavaControle);
		
		
		
		
	}
	
}
