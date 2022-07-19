package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import br.impacta.model.ProgramadorJava;

import br.impacta.repository.RepositorioProgramadorJava;

public class TelaAlterarProgramadorJavaControle  implements ActionListener {

	JTextField nomeTextField;
	JTextField horaTrabalhadaTextField;
	JTextField certificacaoOracleTextField;
	ProgramadorJava programadorJavaAtual;
	RepositorioProgramadorJava repositorioProgramadorJava;
	JFrame frameMenuInicialProgramadorJava;
	JFrame frameTelaAlterarProgramadorJava ;
	
	boolean salvo = false;

	public TelaAlterarProgramadorJavaControle(JTextField nomeTextField, JTextField horaTrabalhadaTextField,
			JTextField certificacaoOracleTextField, ProgramadorJava programadorJavaAtual,
			RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava,
			JFrame frameTelaAlterarProgramadorJava) {
		super();
		this.nomeTextField = nomeTextField;
		this.horaTrabalhadaTextField = horaTrabalhadaTextField;
		this.certificacaoOracleTextField = certificacaoOracleTextField;
		this.programadorJavaAtual = programadorJavaAtual;
		this.repositorioProgramadorJava = repositorioProgramadorJava;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.frameTelaAlterarProgramadorJava = frameTelaAlterarProgramadorJava;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicialProgramadorJava.setVisible(true);
		frameTelaAlterarProgramadorJava.setVisible(false);
		
	}
	
	public void acionarAlterar() {
		ProgramadorJava programadorJavaNovo = new ProgramadorJava();
		programadorJavaNovo.setMatricula(programadorJavaAtual.getMatricula());
		programadorJavaNovo.setNome(nomeTextField.getText());
		programadorJavaNovo.setSalario(programadorJavaAtual.calcularSalario(Integer.parseInt(horaTrabalhadaTextField.getText())));
		programadorJavaNovo.setCertificacaoOracle(certificacaoOracleTextField.getText());
	
		
		salvo = repositorioProgramadorJava.alterarProgramadorJava(programadorJavaAtual, programadorJavaNovo);
		if(salvo) {
			
			JOptionPane.showMessageDialog(null, programadorJavaNovo.getNome()+ " Foi Alterado!!!" );
				
				
		}else {
			JOptionPane.showMessageDialog(null, "#ERRO# Programador Java Não Alterado!!");
		}
			
	}

}
