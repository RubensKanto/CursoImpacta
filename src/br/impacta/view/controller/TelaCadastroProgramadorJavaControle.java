package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import br.impacta.model.ProgramadorJava;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.service.GerarMatriculaProgramadorJava;
import br.impacta.view.service.ValidaProgramadorJava;



public class TelaCadastroProgramadorJavaControle  implements ActionListener {

	JTextField nomeTextField;
	JTextField certificacaoOracleTextField;
	RepositorioProgramadorJava repositorioProgramadorJava;
	JFrame frameMenuInicialProgramadorJava;
	JFrame frameTelaCadastroProgramadorJava;
	String mensagemErro = null;
	JTextField horaTrabalhadaTextField;


	//fora do construtor
	boolean salvo;
	GerarMatriculaProgramadorJava gerarMatriculaProgramadorJava = new GerarMatriculaProgramadorJava();

	
	public TelaCadastroProgramadorJavaControle(JTextField horaTrabalhadaTextField, JTextField nomeTextField, JTextField certificacaoOracleTextField,
			RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava,
			JFrame frameTelaCadastroProgramadorJava) {
		super();
		this.nomeTextField = nomeTextField;
		this.certificacaoOracleTextField = certificacaoOracleTextField;
		this.repositorioProgramadorJava = repositorioProgramadorJava;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.frameTelaCadastroProgramadorJava = frameTelaCadastroProgramadorJava;
		this.horaTrabalhadaTextField = horaTrabalhadaTextField;
	}

	@Override
public void actionPerformed(ActionEvent e) {
		
		if(acionarSalvar() == null) {
			frameMenuInicialProgramadorJava.setVisible(true);
			frameTelaCadastroProgramadorJava.setVisible(false);
		}
		
	}

	public String acionarSalvar() {
		ProgramadorJava programadorJava = new ProgramadorJava();
		ValidaProgramadorJava validaProgramadorJava = new ValidaProgramadorJava();
		programadorJava.setMatricula(gerarMatriculaProgramadorJava.gerarMatriculaProgramadorJava());
		programadorJava.setNome(nomeTextField.getText());
		programadorJava.setCertificacaoOracle(certificacaoOracleTextField.getText());
		
		mensagemErro = validaProgramadorJava.validarProgramadorJava(programadorJava, repositorioProgramadorJava,horaTrabalhadaTextField);
		
		if(mensagemErro == null) {
			programadorJava.setSalario(programadorJava.calcularSalario(Integer.parseInt(horaTrabalhadaTextField.getText())));
			
			salvo = repositorioProgramadorJava.salvarProgramadorJava(programadorJava);
			if(salvo) {
				
					JOptionPane.showMessageDialog(null, programadorJava.getNome()+ " Foi Registrado" );
					return mensagemErro;
					
				}else {
					JOptionPane.showMessageDialog(null, programadorJava.getNome()+ "Erro!!" );
				}
		}else {
			JOptionPane.showMessageDialog(null,mensagemErro);
		}
		return mensagemErro;
	}
	
	
	
}
