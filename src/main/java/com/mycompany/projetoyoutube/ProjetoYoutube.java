package com.mycompany.projetoyoutube;

public class ProjetoYoutube {

    public static void main(String[] args) {
        Video v[] = new Video[5];
        
        v[0] = new Video("Aula 01");
        v[1] = new Video("Aula 02");
        v[2] = new Video("Aula 03");
        v[3] = new Video("Aula 04");
        v[4] = new Video("Aula 05");

        Aluno g = new Aluno("joaozinho", "Joao", 18, "Masculino");
        System.out.println(g);
    }
}
