package Modelos;

import AVA01.Mercadoria;
import Hardware.Fonte;
import Hardware.Hd;
import Hardware.Memoria;
import Hardware.Monitor;

public class Notebook extends Mercadoria{
     
    private Memoria memoria;
    private Hd hd;
    private Monitor monitor;
    private Fonte fonte;

    public Notebook() {
    }

    public Notebook(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte) {
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
        this.fonte = fonte;
    }

    public Notebook(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte, String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
        this.fonte = fonte;
    }

    public Notebook(Memoria memoria, Hd hd, Fonte fonte) {
        this.memoria = memoria;
        this.hd = hd;
        this.fonte = fonte;
    }
    
    public Notebook(String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
    }
    
    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Hd getHd() {
        return hd;
    }

    public void setHd(Hd hd) {
        this.hd = hd;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public void imprimir() {
        System.out.println("::::::    Notebook   ::::::");
        imprimirMercadoria();
        this.getMemoria().imprimirMemoria("Notebook");
        this.getHd().imprimirHd();
        this.getMonitor().imprimirMonitor();
        this.getFonte().imprimirFonte();
        System.out.println("\n\n");     	
    }
    
    public void entrada() {
        entradaMercadoria("Notebook");
        
        this.memoria = new Memoria();
        this.memoria.entradaMemoria("Notebook");
        
        this.hd = new Hd();
        this.hd.entradaHd();
        
        this.monitor = new Monitor();
        this.monitor.entradaMonitor();
        
        this.fonte = new Fonte();
        this.fonte.entradaFonte();
    }   
}
