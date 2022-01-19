package com.bootcamp;

import java.time.LocalDate;
import java.util.Set;

import com.bootcamp.model.Bootcamp;
import com.bootcamp.model.Curso;
import com.bootcamp.model.Dev;
import com.bootcamp.model.Mentoria;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso("Curso de Java", "Descrição curso Java", 8);
	
        Curso curso2 = new Curso("Curso de React", "Descrição curso React", 4);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "Descrição mentoria Java", LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp(
        		"Bootcamp Java Developer", 
        		"Descrição Bootcamp Java Developer", 
        		Set.of(curso1, curso2, mentoria));

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        
        
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverNoBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularTotalXp());

	}

}
