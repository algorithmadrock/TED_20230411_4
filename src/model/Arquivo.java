/*
RESUMO      : Modelo dos documentos que serão "impressos" dentro dessa simulação
PROGRAMADORA: Luiza Felix
DATA        : 05/05/2023
 */

package model;

public class Arquivo {
	
	public String pc, arquivo;
	
	public Arquivo() {
		
		pc = "#PC"+ (int)(Math.random()*101 + 800);
		
		String[] formato = {".pdf", ".docx", ".jpeg", ".png"};
		int tipo = (int) (Math.random()*4);
		
		String[] arqkive = {"imagem", "arquivo", "documento"};
		int nome = (int) (Math.random()*3);
		
		arquivo = arqkive[nome] + formato[tipo];
		
	}


}
