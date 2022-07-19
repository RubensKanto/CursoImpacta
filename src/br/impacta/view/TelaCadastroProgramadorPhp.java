package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaCadastroProgramadorPhpControle;



public class TelaCadastroProgramadorPhp {

public void abrirTelaCadastroProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp,JFrame frameMenuInicialProgramadorPhp) {
		
		//String matriculaTexto = "Digite a matricula do Programador Php:";
		String nomeTexto = "Digite o Nome do Programador Php:";
		String horaTrabalhadaTexto = "Horas Trabalhadas:";
		String certificacaoOracleTexto = "Certificação:";
		
		
		
		JFrame frameTelaCadastroProgramadorPhp = new JFrame();
		frameTelaCadastroProgramadorPhp.setSize(200, 400);
		frameTelaCadastroProgramadorPhp.setTitle("Cadastro de Programador Php");
		frameTelaCadastroProgramadorPhp.setLocation(300,300);
		
		JPanel panelTelaCadastroProgramadorPhp = new JPanel();
		
	
		// opcao1
	
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaCadastroProgramadorPhp.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(nomeTextField);
		
		//opcao2
		JLabel horaTrabalhadaLabel = new JLabel(horaTrabalhadaTexto);
		panelTelaCadastroProgramadorPhp.add(horaTrabalhadaLabel);
				
		JTextField horaTrabalhadaTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(horaTrabalhadaTextField);
		
		//opcao3
		JLabel certificacaoOracleTextoLabel = new JLabel(certificacaoOracleTexto);
		panelTelaCadastroProgramadorPhp.add(certificacaoOracleTextoLabel);
		
		JTextField certificacaoOracleTextField = new JTextField(10);
		panelTelaCadastroProgramadorPhp.add(certificacaoOracleTextField);
		
	
		
		JButton buttonCadastroProgramadorPhp = new JButton("Registrar");
		panelTelaCadastroProgramadorPhp.add(buttonCadastroProgramadorPhp);
		
		frameTelaCadastroProgramadorPhp.add(panelTelaCadastroProgramadorPhp);
		
		frameTelaCadastroProgramadorPhp.setVisible(true);
		
		//System.out.println("ESTOU NA TELA CADASTRO ProgramadorPhp");
		
		TelaCadastroProgramadorPhpControle telaCadastroProgramadorPhpControle = new TelaCadastroProgramadorPhpControle(
				horaTrabalhadaTextField, nomeTextField,
				certificacaoOracleTextField, repositorioProgramadorPhp,
				frameMenuInicialProgramadorPhp, frameTelaCadastroProgramadorPhp);
		
		buttonCadastroProgramadorPhp.addActionListener(telaCadastroProgramadorPhpControle);
		
		
		
		
	}
	
	
}
