package atividade01;

public class Main {
    public static void main(String[] args) {
        Computador c1 = new Computador(16, 512, 8, 1000000);

        Programa p1 = new Programa(4, 200, 8, 500000);
        Programa p2 = new Programa(32, 200, 8, 500000);
        Programa p3 = new Programa(4, 1024, 8, 500000);
        Programa p4 = new Programa(4, 200, 32, 500000);
        Programa p5 = new Programa(4, 200, 8, 2000000);

        SistemaOperacional so1 = new SistemaOperacional(c1, p1);
        SistemaOperacional so2 = new SistemaOperacional(c1, p2);
        SistemaOperacional so3 = new SistemaOperacional(c1, p3);
        SistemaOperacional so4 = new SistemaOperacional(c1, p4);
        SistemaOperacional so5 = new SistemaOperacional(c1, p5);

        so1.rodarPrograma();
        so2.rodarPrograma();
        so3.rodarPrograma();
        so4.rodarPrograma();
        so5.rodarPrograma();
        
    }
}