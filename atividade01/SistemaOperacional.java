package atividade01;

public class SistemaOperacional {
    private Computador computador;
    private Programa programa;

    SistemaOperacional(Computador computador, Programa programa) {
        this.computador = computador;
        this.programa = programa;
    }

    public boolean rodarPrograma() {
        if (computador.ram < programa.usoRam ){
            System.out.println("Ram insuficiente");
            return false;
        } else if (programa.nucleosNecessarios > computador.nucleos) {
            System.out.println("Nucleos insuficientes");
            return false;
        } else if (programa.ssdAlocado > computador.ssd) {
            System.out.println("Espaço em disco insuficiente");
            return false;
        } else if (programa.quantidadeDeoperacoes > computador.operacoesPorSegundo) {
            System.out.println("Processador insuficiente");
            return false;
        } else {
            System.out.println("Programa rodando");
            return true;
                }
        }
}