package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;



public class TelaAlterarProgramadorPhpControle implements ActionListener {

	JTextField nomeTextField;
	JTextField horaTrabalhadaTextField;
	JTextField certificacaoPhpTextField;
	ProgramadorPhp programadorPhpAtual;
	RepositorioProgramadorPhp repositorioProgramadorPhp;
	JFrame frameMenuInicialProgramadorPhp;
	JFrame frameTelaAlterarProgramadorPhp ;
	
	boolean salvo = false;

	public TelaAlterarProgramadorPhpControle(JTextField nomeTextField, JTextField horaTrabalhadaTextField,
			JTextField certificacaoPhpTextField, ProgramadorPhp programadorPhpAtual,
			RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp,
			JFrame frameTelaAlterarProgramadorPhp) {
		super();
		this.nomeTextField = nomeTextField;
		this.horaTrabalhadaTextField = horaTrabalhadaTextField;
		this.certificacaoPhpTextField = certificacaoPhpTextField;
		this.programadorPhpAtual = programadorPhpAtual;
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.frameTelaAlterarProgramadorPhp = frameTelaAlterarProgramadorPhp;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		acionarAlterar();
		frameMenuInicialProgramadorPhp.setVisible(true);
		frameTelaAlterarProgramadorPhp.setVisible(false);
		
	}
	
	public void acionarAlterar() {
		ProgramadorPhp programadorPhpNovo = new ProgramadorPhp();
		programadorPhpNovo.setMatricula(programadorPhpAtual.getMatricula());
		programadorPhpNovo.setNome(nomeTextField.getText());
		programadorPhpNovo.setSalario(programadorPhpAtual.calcularSalario(Integer.parseInt(horaTrabalhadaTextField.getText())));
		programadorPhpNovo.setCertificacaoPhp(certificacaoPhpTextField.getText());
	
		
		salvo = repositorioProgramadorPhp.alterarProgramadorPhp(programadorPhpAtual, programadorPhpNovo);
		if(salvo) {
			
			JOptionPane.showMessageDialog(null, programadorPhpNovo.getNome()+ " Foi Alterado!!!" );
				
				
		}else {
			JOptionPane.showMessageDialog(null, "#ERRO# Programador Php Não Alterado!!");
		}
			
	}

}
