package atividade01;

public class SistemaOperacional {
    private Computador computador;
    private Programa programa;

    SistemaOperacional(Computador computador, Programa programa) {
        this.computador = computador;
        this.programa = programa;
    }


    public double tempoDeExecucao(Computador computador, Programa programa){ 
        double segundos = (double) programa.getQuantidadeDeoperacoes() / (double) computador.getOperacoesPorSegundo() * (double) computador.getNucleos();
        return segundos; 
    }



    

    private boolean rodarPrograma() {
        if (computador.getRam() < programa.getUsoRam() ){
            System.out.println("Ram insuficiente!\n");
            return false;
        } else if (programa.getNucleosNecessarios() > computador.getNucleos()) {
            System.out.println("Nucleos insuficientes!\n");
            return false;
        } else if (programa.getSsdAlocado() > computador.getSsd()) {
            System.out.println("Espaço em disco insuficiente!\n");
            return false;
        } else if (programa.getQuantidadeDeoperacoes() > computador.getOperacoesPorSegundo()) {
            System.out.println("Capacidade de processamento insuficiente!\n");
            return false;
        } else {
            System.out.println("Programa rodando!\nTempo de execução: " + tempoDeExecucao(computador, programa) + " segundos\n");
            return true;
                }
        }

        public boolean getRodarPrograma() {
            return rodarPrograma();
        }
}