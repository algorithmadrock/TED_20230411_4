/*
RESUMO      : Classe de controle da fila de impressão, suas configurações
PROGRAMADORA: Luiza Felix
DATA        : 05/05/2023
 */

package controller;

import br.edu.fateczl.filas.Fila;
import model.Arquivo;

public class Controller {

	public static void add_doc(Fila impressao, Arquivo documento) {
		impressao.insert(documento);
		System.out.println(documento.pc + "; " + documento.arquivo + " esta na fila de impressao");
	}

	public static void imprimir(Fila impressao) {
		
		try {
			Arquivo documento = (Arquivo) impressao.remove();
			System.out.println("\nImprimindo: \n\t" + documento.pc + ": " + documento.arquivo);

			int tempo = (int) Math.random() * 2001 + 1000;
			Thread.sleep(tempo);

		} catch (Exception e) {
			System.err.println("Nao ha documentos na fila de impressao");
		}
	}

}
