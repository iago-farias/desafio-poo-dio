package com.bootcamp;

import java.time.LocalDate;
import java.util.Set;

import com.bootcamp.model.Bootcamp;
import com.bootcamp.model.Curso;
import com.bootcamp.model.Dev;
import com.bootcamp.model.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso de Java", "Descri��o curso Java", 8);
	
        Curso curso2 = new Curso("Curso de React", "Descri��o curso React", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descri��o mentoria Java", LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp(
        		"Bootcamp Java Developer", 
        		"Descri��o Bootcamp Java Developer", 
        		Set.of(curso1, curso2, mentoria));

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverNoBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        
        
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conte�dos Conclu�dos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverNoBootcamp(bootcamp);
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conte�dos Inscritos Jo�o:" + devJoao.getConteudosInscritos());
        System.out.println("Conte�dos Concluidos Jo�o:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

	}

}
