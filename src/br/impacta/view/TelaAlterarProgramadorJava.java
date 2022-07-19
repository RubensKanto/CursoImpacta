package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.controller.TelaAlterarProgramadorJavaControle;


public class TelaAlterarProgramadorJava {
	
public void abrirTelaAlterarProgramadorJava(ProgramadorJava programadorJavaAtual, RepositorioProgramadorJava repositorioProgramadorJava,JFrame frameMenuInicialProgramadorJava) {
		
				
		//String matriculaTexto = "Digite a matricula do Programador Java:";
		String nomeTexto = "Digite o Nome do Programador Java:";
		String horaTrabalhadaTexto = "Horas Trabalhadas:";
		String certificacaoOracleTexto = "Certificação:";
		
		JFrame frameTelaAlterarProgramadorJava = new JFrame();
		frameTelaAlterarProgramadorJava.setSize(200, 400);
		frameTelaAlterarProgramadorJava.setTitle("Altera de Programador Java");
		frameTelaAlterarProgramadorJava.setLocation(300,300);
		
		JPanel panelTelaAlterarProgramadorJava = new JPanel();
		
		/*
		// opcao1
		JLabel matriculaTextoLabel = new JLabel(matriculaTexto);
		panelTelaAlterarProgramadorJava.add(matriculaTextoLabel);
		
		JTextField matriculaTextField = new JTextField(10);
		matriculaTextField.setText(programadorJavaAtual.getMatricula());
		panelTelaAlterarProgramadorJava.add(matriculaTextField);
		*/				
		// opcao1
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarProgramadorJava.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		nomeTextField.setText(programadorJavaAtual.getNome());
		panelTelaAlterarProgramadorJava.add(nomeTextField);
				
		//opcao2
		JLabel horaTrabalhadaLabel = new JLabel(horaTrabalhadaTexto);
		panelTelaAlterarProgramadorJava.add(horaTrabalhadaLabel);
		
		double horaTrabalhada = programadorJavaAtual.retornaHoraTrabalhada(programadorJavaAtual.getSalario());
		int horaTrabalhadaint = (int)horaTrabalhada;
		JTextField horaTrabalhadaTextField = new JTextField(10);
		horaTrabalhadaTextField.setText((Integer.toString(horaTrabalhadaint)));
		panelTelaAlterarProgramadorJava.add(horaTrabalhadaTextField);
				
		//opcao3
		JLabel certificacaoOracleTextoLabel = new JLabel(certificacaoOracleTexto);
		panelTelaAlterarProgramadorJava.add(certificacaoOracleTextoLabel);
				
		JTextField certificacaoOracleTextField = new JTextField(10);
		certificacaoOracleTextField.setText(programadorJavaAtual.getCertificacaoOracle());
		panelTelaAlterarProgramadorJava.add(certificacaoOracleTextField);
		
		
		JButton buttonAlterarProgramadorJava = new JButton("Alterar Programador Java");
		panelTelaAlterarProgramadorJava.add(buttonAlterarProgramadorJava);
		
		frameTelaAlterarProgramadorJava.add(panelTelaAlterarProgramadorJava);
		
		frameTelaAlterarProgramadorJava.setVisible(true);
		
		
		TelaAlterarProgramadorJavaControle telaAlterarProgramadorJavaControle = new TelaAlterarProgramadorJavaControle(
				nomeTextField,  horaTrabalhadaTextField,  certificacaoOracleTextField, programadorJavaAtual,  repositorioProgramadorJava,
				frameMenuInicialProgramadorJava, frameTelaAlterarProgramadorJava );
		
		buttonAlterarProgramadorJava.addActionListener(telaAlterarProgramadorJavaControle);
		
			
	
	}
	
	

}
