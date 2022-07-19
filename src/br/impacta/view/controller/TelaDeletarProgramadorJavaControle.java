package br.impacta.view.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.impacta.repository.RepositorioProgramadorJava;
import br.impacta.view.TelaListarProgramadorJava;



public class TelaDeletarProgramadorJavaControle  implements ActionListener {
	
	RepositorioProgramadorJava repositorioProgramadorJava;
	JFrame frameMenuInicialProgramadorJava;
	JFrame frameDeletarProgramadorJava;
	JTextField matriculaField;
	
	TelaListarProgramadorJava telaListarProgramadorJava = new TelaListarProgramadorJava();
	
	boolean deletado;
	
	
	public TelaDeletarProgramadorJavaControle(RepositorioProgramadorJava repositorioProgramadorJava, JFrame frameMenuInicialProgramadorJava,
			JFrame frameDeletarProgramadorJava, JTextField matriculaField) {
		super();
		this.repositorioProgramadorJava = repositorioProgramadorJava;
		this.frameMenuInicialProgramadorJava = frameMenuInicialProgramadorJava;
		this.frameDeletarProgramadorJava = frameDeletarProgramadorJava;
		this.matriculaField = matriculaField;
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		deletado = repositorioProgramadorJava.deletarProgramadorJava(matriculaField.getText());
		frameDeletarProgramadorJava.setVisible(false);
		telaListarProgramadorJava.apresentarListaProgramadorJava(repositorioProgramadorJava.listarProgramadorJava(), frameMenuInicialProgramadorJava);
		
		if(deletado) {
			JOptionPane.showMessageDialog(null, "Programador Java Deletado");
		
		}else {
			JOptionPane.showMessageDialog(null, "Programador Java Não Encontrado");
			
		}
		
	}

}

	
	


