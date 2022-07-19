package br.impacta.view.service;

import java.awt.Desktop;
//import java.awt.Font;
import java.io.File;
import java.io.FileOutputStream;


import com.itextpdf.text.Document;

import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import br.impacta.model.ProgramadorJava;
import br.impacta.repository.RepositorioProgramadorJava;




public class GerarProgramadorJavaPDF {

RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
	
	public static void gerarPdfProgramadorJava() {
		RepositorioProgramadorJava repositorioProgramadorJava = new RepositorioProgramadorJava();
		Document doc = new Document();
		float fntSize, lineSpacing;
		fntSize = 6.7f;
		lineSpacing = 10f;
		String arquivoPdf = "ListaProgramadorJava.pdf";
		try {
			PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
			doc.open();
			Paragraph paragrafo = new Paragraph();
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			Image image = Image.getInstance("imagens/logo.png");
			image.setAlignment(1);
			image.scaleToFit(200, 200);
			doc.add(image);
			
			
			
			paragrafo = new Paragraph("Lista de Programadores Java",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			paragrafo = new Paragraph("  ",FontFactory.getFont(FontFactory.TIMES, 20f));
			paragrafo.setAlignment(1);
			doc.add(paragrafo);
			
			//PdfPTable tabelaPDF = new PdfPTable(new float[] { 900f, 2500f,3500f,1000f,800f,1000f,900f });;
			PdfPTable tabelaPDF = new PdfPTable(new float[] { 900f, 2500f,3500f,1000f });;
			
			PdfPCell celulaMaticula = new PdfPCell(new Paragraph("Matricula",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaNome = new PdfPCell(new Paragraph("Nome",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaSalario = new PdfPCell(new Paragraph("Salario",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			PdfPCell celulaCertificacaoOracle= new PdfPCell(new Paragraph("Certificação",FontFactory.getFont(FontFactory.TIMES, fntSize)));
			
			tabelaPDF.addCell(celulaMaticula);
			tabelaPDF.addCell(celulaNome);
			tabelaPDF.addCell(celulaSalario);
			tabelaPDF.addCell(celulaCertificacaoOracle);
			
			for (ProgramadorJava programadorJava: repositorioProgramadorJava.listarProgramadorJava()) {
				celulaMaticula = new PdfPCell(new Paragraph(programadorJava.getMatricula(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaNome = new PdfPCell(new Paragraph(programadorJava.getNome(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaSalario = new PdfPCell(new Paragraph(String.valueOf(programadorJava.getSalario()),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				celulaCertificacaoOracle = new PdfPCell(new Paragraph(programadorJava.getCertificacaoOracle(),FontFactory.getFont(FontFactory.TIMES, fntSize)));
				
				tabelaPDF.addCell(celulaMaticula);
				tabelaPDF.addCell(celulaNome);
				tabelaPDF.addCell(celulaSalario);
				tabelaPDF.addCell(celulaCertificacaoOracle);
			}
			
			doc.add(tabelaPDF);
			doc.close();
			Desktop.getDesktop().open(new File (arquivoPdf));
			
		} catch (Exception e) {
			
		}
		
	}
	
}
