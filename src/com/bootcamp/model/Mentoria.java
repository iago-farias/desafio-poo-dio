package com.bootcamp.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate dataMentoria;
	
	public Mentoria(String titulo, String descricao, LocalDate dataMentoria) {
		super(titulo, descricao);
		this.dataMentoria = dataMentoria;
	}

	@Override
	public double calcularXp() {
		return XP_PADRAO * 20d;
	}

	public LocalDate getDataMentoria() {
		return dataMentoria;
	}

	public void setDataMentoria(LocalDate dataMentoria) {
		this.dataMentoria = dataMentoria;
	}
	
	@Override
	public String toString() {
		return getTitulo();
	}
}
