package atividade01;

public class Computador {
    private int ram;
    private int ssd;
    private int nucleos;
    private int operacoesPorSegundo;
    
    public Computador(int ram, int ssd, int nucleos, int ops) {
        this.ram = ram;
        this.ssd = ssd;
        this.nucleos = nucleos;
        this.operacoesPorSegundo = ops;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getSsd() {
        return ssd;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getOperacoesPorSegundo() {
        return operacoesPorSegundo;
    }

    public void setOperacoesPorSegundo(int operacoesPorSegundo) {
        this.operacoesPorSegundo = operacoesPorSegundo;
    }

    

}