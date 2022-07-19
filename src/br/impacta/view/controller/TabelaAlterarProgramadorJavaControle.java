package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.TelaAlterarProgramadorJava;



public class TabelaAlterarProgramadorJavaControle  implements ActionListener {
	
	RepositorioProgramadorJava repositorioProgramadorJava;
	JFrame frameMenuInicialProgramadorJava;
	JFrame frameAlterarProgramadorJava;
	JTextField matriculaField;
	ProgramadorJava programadorJavaAtual = new ProgramadorJava();
	TelaAlterarProgramadorJava telalterarProgramadorJava =  new TelaAlterarProgramadorJava();
	
	
	
	public TabelaAlterarProgramadorJavaControle(RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava,
			JFrame frameAlterarProgramadorJava, JTextField matriculaField) {
		super();
		this.repositorioProgramadorJava = repositorioProgramadorJava;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.frameAlterarProgramadorJava = frameAlterarProgramadorJava;
		this.matriculaField = matriculaField;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		programadorJavaAtual = repositorioProgramadorJava.buscarProgramadorJava(matriculaField.getText());
		frameAlterarProgramadorJava.setVisible(false);
		if(programadorJavaAtual != null) {
			telalterarProgramadorJava.abrirTelaAlterarProgramadorJava(programadorJavaAtual, repositorioProgramadorJava, frameMenuInicialProgramadorJava);
			
			
			
		}else {
			JOptionPane.showMessageDialog(null, "Programador Java Não encontrado");
			frameMenuInicialProgramadorJava.setVisible(true);
		}
		
	}
	
	
	
}
