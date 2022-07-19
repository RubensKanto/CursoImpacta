package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.TelaAlterarProgramadorPhp;



public class TabelaAlterarProgramadorPhpControle   implements ActionListener {
	
	RepositorioProgramadorPhp repositorioProgramadorPhp;
	JFrame frameMenuInicialProgramadorPhp;
	JFrame frameAlterarProgramadorPhp;
	JTextField matriculaField;
	ProgramadorPhp programadorPhpAtual = new ProgramadorPhp();
	TelaAlterarProgramadorPhp telalterarProgramadorPhp =  new TelaAlterarProgramadorPhp();
	
	
	
	public TabelaAlterarProgramadorPhpControle(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp,
			JFrame frameAlterarProgramadorPhp, JTextField matriculaField) {
		super();
		this.repositorioProgramadorPhp = repositorioProgramadorPhp;
		this.frameMenuInicialProgramadorPhp = frameMenuInicialProgramadorPhp;
		this.frameAlterarProgramadorPhp = frameAlterarProgramadorPhp;
		this.matriculaField = matriculaField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		programadorPhpAtual = repositorioProgramadorPhp.buscarProgramadorPhp(matriculaField.getText());
		frameAlterarProgramadorPhp.setVisible(false);
		if(programadorPhpAtual != null) {
			telalterarProgramadorPhp.abrirTelaAlterarProgramadorPhp(programadorPhpAtual, repositorioProgramadorPhp, frameMenuInicialProgramadorPhp);
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Programador Java Não encontrado");
			frameMenuInicialProgramadorPhp.setVisible(true);
		}
		
	}
	
	
	

	
	
}
