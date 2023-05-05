/*
RESUMO      : Classe de UI da impressora
PROGRAMADORA: Luiza Felix
DATA        : 05/05/2023
 */

package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.filas.Fila;
import controller.Controller;
import model.Arquivo;

public class Impressora {
	
	public static void main(String[] args) {
		int opcao, qntd;
		Fila impressao = new Fila();
		do {
			opcao = Integer.parseInt(JOptionPane.showInputDialog("\t1. Adicionar documentos* na fila de impressão\n\t2.Imprimir documentos*\nPara SAIR digite 0.\n*Os arquivos são gerados com nomes e formatos aleatórios, o usuário apenas digita a quantidade desejada"));
			switch(opcao) {
			
			case 1:
				qntd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de documentos desejada:"));
				while (qntd != 0) {
					Arquivo rkive = new Arquivo();
					Controller.add_doc(impressao, rkive);
					qntd-=1;
				}
				break;
				
			case 2:
				qntd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de documentos desejada:"));
				while (qntd != 0) {
					Controller.imprimir(impressao);
					qntd-=1;
				}
				break;
				
			case 0:
				System.out.println("Programa encerrado com sucesso!");
			}
		}
		while(opcao != 0);
		
	}

	private static void add() {
		
		
		
	}
	

}
