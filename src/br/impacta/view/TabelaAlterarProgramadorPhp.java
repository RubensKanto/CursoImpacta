package br.impacta.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import br.impacta.model.ProgramadorPhp;
import br.impacta.repository.RepositorioProgramadorPhp;
import br.impacta.view.controller.TabelaAlterarProgramadorPhpControle;

public class TabelaAlterarProgramadorPhp {

	public void apresentarAlterarProgramadorPhp(RepositorioProgramadorPhp repositorioProgramadorPhp, JFrame frameMenuInicialProgramadorPhp) {
		
		
		int quantidadeDeLinhas = repositorioProgramadorPhp.listarProgramadorPhp().size();
		
		String [][] tabelaString = new String[quantidadeDeLinhas][4];
		
		int posicaoLinha = 0;
		int posicaoColuna = 0;
		
		for(ProgramadorPhp programadorPhp:repositorioProgramadorPhp.listarProgramadorPhp()) {
			
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getMatricula();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = String.valueOf(programadorPhp.getSalario());
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = programadorPhp.getCertificacaoPhp();
		
			posicaoColuna = 0;
			posicaoLinha++;
		}
		
		String colunasTitulos[] = {"Matricula","Nome","Salario","Certificação"}; 
		
		JFrame frameAlterarProgramadorPhp = new JFrame();
		frameAlterarProgramadorPhp.setSize(500,600);
		
		
		JTable tabelaProgramadorPhp = new JTable(tabelaString, colunasTitulos);
		tabelaProgramadorPhp.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPaneAlterarProgramadorPhp = new JScrollPane(tabelaProgramadorPhp);
		JPanel panelAlterarProgramadorPhp = new JPanel();
		
		JLabel matriculaLabel = new JLabel("Digite a Matricula para Alterar:");
		panelAlterarProgramadorPhp.add(matriculaLabel);
		
		JTextField matriculaField = new JTextField(10);
		panelAlterarProgramadorPhp.add(matriculaField);
		
		
		panelAlterarProgramadorPhp.add(scrollPaneAlterarProgramadorPhp);
		
		JButton buttonAlterarProgramadorPhp = new JButton("Buscar Programador Php");
		panelAlterarProgramadorPhp.add(buttonAlterarProgramadorPhp);

		frameAlterarProgramadorPhp.add(panelAlterarProgramadorPhp);
		frameAlterarProgramadorPhp.setVisible(true);
		
		TabelaAlterarProgramadorPhpControle telaAlterarProgramadorPhpControle = new TabelaAlterarProgramadorPhpControle(repositorioProgramadorPhp, frameMenuInicialProgramadorPhp, frameAlterarProgramadorPhp, matriculaField);
		buttonAlterarProgramadorPhp.addActionListener(telaAlterarProgramadorPhpControle);
	}



	
}
