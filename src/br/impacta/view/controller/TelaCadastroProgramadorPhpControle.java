package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.service.GerarMatriculaProgramadorPhp;
import br.impacta.view.service.ValidaProgramadorPhp;



public class TelaCadastroProgramadorPhpControle   implements ActionListener {

	JTextField nomeTextField;
	JTextField certificacaoPhpTextField;
	RepositorioProgramadorPhp repositorioProgramadorPhp;
	JFrame frameMenuInicialProgramadorPhp;
	JFrame frameTelaCadastroProgramadorPhp;
	String mensagemErro = null;
	JTextField horaTrabalhadaTextField;


	//fora do construtor
	boolean salvo;
	GerarMatriculaProgramadorPhp gerarMatriculaProgramadorPhp = new GerarMatriculaProgramadorPhp();

	
	public TelaCadastroProgramadorPhpControle(JTextField horaTrabalhadaTextField, JTextField nomeTextField, JTextField certificacaoPhpTextField,
			RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp,
			JFrame frameTelaCadastroProgramadorPhp) {
		super();
		this.nomeTextField = nomeTextField;
		this.certificacaoPhpTextField = certificacaoPhpTextField;
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.frameTelaCadastroProgramadorPhp = frameTelaCadastroProgramadorPhp;
		this.horaTrabalhadaTextField = horaTrabalhadaTextField;
	}

	@Override
public void actionPerformed(ActionEvent e) {
		
		if(acionarSalvar() == null) {
			frameMenuInicialProgramadorPhp.setVisible(true);
			frameTelaCadastroProgramadorPhp.setVisible(false);
		}
		
	}

	public String acionarSalvar() {
		ProgramadorPhp programadorPhp = new ProgramadorPhp();
		ValidaProgramadorPhp validaProgramadorPhp = new ValidaProgramadorPhp();
		programadorPhp.setMatricula(gerarMatriculaProgramadorPhp.gerarMatriculaProgramadorPhp());
		programadorPhp.setNome(nomeTextField.getText());
		programadorPhp.setCertificacaoPhp(certificacaoPhpTextField.getText());
		
		mensagemErro = validaProgramadorPhp.validarProgramadorPhp(programadorPhp, repositorioProgramadorPhp,horaTrabalhadaTextField);
		
		if(mensagemErro == null) {
			programadorPhp.setSalario(programadorPhp.calcularSalario(Integer.parseInt(horaTrabalhadaTextField.getText())));
			
			salvo = repositorioProgramadorPhp.salvarProgramadorPhp(programadorPhp);
			if(salvo) {
				
					JOptionPane.showMessageDialog(null, programadorPhp.getNome()+ " Foi Registrado" );
					return mensagemErro;
					
				}else {
					JOptionPane.showMessageDialog(null, programadorPhp.getNome()+ "Erro!!" );
				}
		}else {
			JOptionPane.showMessageDialog(null,mensagemErro);
		}
		return mensagemErro;
	}
	
	
	

	
	

}
