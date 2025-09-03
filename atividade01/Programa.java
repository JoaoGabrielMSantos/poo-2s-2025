package atividade01;

public class Programa {

    private int usoRam;
    private int nucleosNecessarios;
    private int quantidadeDeoperacoes;
    private int ssdAlocado;

    public Programa(int nucleosNecessarios, int ssdAlocado, int usoRam, int quantidadeDeoperacoes) {
        this.nucleosNecessarios = nucleosNecessarios;
        this.ssdAlocado = ssdAlocado;
        this.usoRam = usoRam;
        this.quantidadeDeoperacoes = quantidadeDeoperacoes;
    }

    public int getUsoRam() {
        return usoRam;
    }

    public void setUsoRam(int usoRam) {
        this.usoRam = usoRam;
    }

    public int getNucleosNecessarios() {
        return nucleosNecessarios;
    }

    public void setNucleosNecessarios(int nucleosNecessarios) {
        this.nucleosNecessarios = nucleosNecessarios;
    }

    public int getQuantidadeDeoperacoes() {
        return quantidadeDeoperacoes;
    }

    public void setQuantidadeDeoperacoes(int quantidadeDeoperacoes) {
        this.quantidadeDeoperacoes = quantidadeDeoperacoes;
    }

    public int getSsdAlocado() {
        return ssdAlocado;
    }

    public void setSsdAlocado(int ssdAlocado) {
        this.ssdAlocado = ssdAlocado;
    }

}
