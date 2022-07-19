package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TelaAlterarProgramadorPhpControle;



public class TelaAlterarProgramadorPhp {

	public void abrirTelaAlterarProgramadorPhp(ProgramadorPhp programadorPhpAtual, RepositorioProgramadorPhp repositorioProgramadorPhp,JFrame frameMenuInicialProgramadorPhp) {
		
		
		//String matriculaTexto = "Digite a matricula do Programador Php:";
		String nomeTexto = "Digite o Nome do Programador Php:";
		String horaTrabalhadaTexto = "Horas Trabalhadas:";
		String certificacaoOracleTexto = "Certificação:";
		
		JFrame frameTelaAlterarProgramadorPhp = new JFrame();
		frameTelaAlterarProgramadorPhp.setSize(200, 400);
		frameTelaAlterarProgramadorPhp.setTitle("Altera de Programador Php");
		frameTelaAlterarProgramadorPhp.setLocation(300,300);
		
		JPanel panelTelaAlterarProgramadorPhp = new JPanel();
		
		
		// opcao1
		JLabel nomeTextoLabel = new JLabel(nomeTexto);
		panelTelaAlterarProgramadorPhp.add(nomeTextoLabel);
		
		JTextField nomeTextField = new JTextField(10);
		nomeTextField.setText(programadorPhpAtual.getNome());
		panelTelaAlterarProgramadorPhp.add(nomeTextField);
				
		//opcao2
		JLabel horaTrabalhadaLabel = new JLabel(horaTrabalhadaTexto);
		panelTelaAlterarProgramadorPhp.add(horaTrabalhadaLabel);
		
		double horaTrabalhada = programadorPhpAtual.retornaHoraTrabalhada(programadorPhpAtual.getSalario());
		int horaTrabalhadaint = (int)horaTrabalhada;
		JTextField horaTrabalhadaTextField = new JTextField(10);
		horaTrabalhadaTextField.setText((Integer.toString(horaTrabalhadaint)));
		panelTelaAlterarProgramadorPhp.add(horaTrabalhadaTextField);
		
		
		//opcao3
		JLabel certificacaoOracleTextoLabel = new JLabel(certificacaoOracleTexto);
		panelTelaAlterarProgramadorPhp.add(certificacaoOracleTextoLabel);
				
		JTextField certificacaoOracleTextField = new JTextField(10);
		certificacaoOracleTextField.setText(programadorPhpAtual.getCertificacaoPhp());
		panelTelaAlterarProgramadorPhp.add(certificacaoOracleTextField);
		
		
		JButton buttonAlterarProgramadorPhp = new JButton("Alterar Programador Php");
		panelTelaAlterarProgramadorPhp.add(buttonAlterarProgramadorPhp);
		
		frameTelaAlterarProgramadorPhp.add(panelTelaAlterarProgramadorPhp);
		
		frameTelaAlterarProgramadorPhp.setVisible(true);
		
		
		TelaAlterarProgramadorPhpControle telaAlterarProgramadorPhpControle = new TelaAlterarProgramadorPhpControle(
				nomeTextField,  horaTrabalhadaTextField,  certificacaoOracleTextField, programadorPhpAtual,  repositorioProgramadorPhp,
				frameMenuInicialProgramadorPhp, frameTelaAlterarProgramadorPhp );
		
		buttonAlterarProgramadorPhp.addActionListener(telaAlterarProgramadorPhpControle);
		
			
	
	}
	
	

	
}
