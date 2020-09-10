package Modelos;

import AVA01.Mercadoria;
import Hardware.Fonte;
import Hardware.Gabinete;
import Hardware.Hd;
import Hardware.Memoria;
import java.util.ArrayList;
import java.util.Scanner;

public class Servidor extends Mercadoria{
     	
    Memoria memoria;
    Gabinete gabinete;
    Fonte fonte;
    int quantidadeHds;
    private ArrayList<Hd> listaHds = new ArrayList<>();


    public Servidor() {
    }

    public Servidor(Memoria memoria, Gabinete gabinete, Fonte fonte, int quantidadeHds) {
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.fonte = fonte;
        this.quantidadeHds = quantidadeHds;
    }

    public Servidor(Memoria memoria, Gabinete gabinete, Fonte fonte, int quantidadeHds, String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.fonte = fonte;
        this.quantidadeHds = quantidadeHds;
    }
    
    public Servidor(Memoria memoria, Gabinete gabinete, Fonte fonte, ArrayList<Hd> listaHds, int quantidadeHds, String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.fonte = fonte;
        this.quantidadeHds = quantidadeHds;
        this.listaHds = listaHds;
    }
    
    public Servidor(String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);

    }
    
    public Servidor(Memoria memoria, Gabinete gabinete, Fonte fonte) {
        this.memoria = memoria;
        this.gabinete = gabinete;
        this.fonte = fonte;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Gabinete getGabinete() {
        return gabinete;
    }

    public void setGabinete(Gabinete gabinete) {
        this.gabinete = gabinete;
    }

    public Fonte getFonte() {
        return fonte;
    }

    public void setFonte(Fonte fonte) {
        this.fonte = fonte;
    }

    public int getQuantidadeHds() {
        return quantidadeHds;
    }

    public void setQuantidadeHds(int quantidadeHds) {
        this.quantidadeHds = quantidadeHds;
    }

    public ArrayList<Hd> getListHds() {
        return listaHds;
    }

    public void setListHd(ArrayList<Hd> listaHds) {
        this.listaHds = listaHds;
    }

    public void imprimir() {
        System.out.println("::::::    Servidor   ::::::");
        imprimirMercadoria();
        this.getMemoria().imprimirMemoria("Servidor");
        System.out.println("Qtd Hds             : " + this.getQuantidadeHds());
        this.listaHds.forEach((hd) -> {
            hd.imprimirHd();
        });
        this.getFonte().imprimirFonte();
        this.getGabinete().imprimirGabinete();
        System.out.println("\n\n");     	
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        entradaMercadoria("Servidor");
        
        this.memoria = new Memoria();
        this.memoria.entradaMemoria("Servidor");
        
        System.out.println("Qtd Hds             : ");
        this.setQuantidadeHds(Integer.parseInt(ent.nextLine()));
        System.out.println("\n ----  Entrada de dados dos Hds  ----");
        for (int i = 0; i < this.quantidadeHds; i++) {
            Hd hd = new Hd();
            hd.entradaHd();
            this.listaHds.add(hd);
        }
        
        this.gabinete = new Gabinete();
        this.gabinete.entradaGabinete();
        
        this.fonte = new Fonte();
        this.fonte.entradaFonte();
    }   
   
    
}
