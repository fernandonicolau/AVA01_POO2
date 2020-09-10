package Modelos;

import AVA01.Mercadoria;
import Hardware.Fonte;
import Hardware.Hd;
import Hardware.Memoria;
import Hardware.Monitor;
import Hardware.PlacaDeVideo;
import java.util.ArrayList;
import java.util.Scanner;

public class Desktop extends Mercadoria{
   
    private Memoria memoria;
    private Hd hd;
    private Monitor monitor;
    private Fonte fonte;
    private int quantidadePlacasVídeo;
    private ArrayList<PlacaDeVideo> listaPlacasDeVideo = new ArrayList<>();

    public Desktop() {
    }

    public Desktop(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte, ArrayList<PlacaDeVideo> listaPlacasDeVideo, int quantidadePlacasVídeo) {
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
        this.fonte = fonte;
        this.quantidadePlacasVídeo = quantidadePlacasVídeo;
        this.listaPlacasDeVideo = listaPlacasDeVideo;
    }

    public Desktop(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte, ArrayList<PlacaDeVideo> listaPlacasDeVideo, int quantidadePlacasVídeo, String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
        this.fonte = fonte;
        this.quantidadePlacasVídeo = quantidadePlacasVídeo;
        this.listaPlacasDeVideo = listaPlacasDeVideo;
    }
    
    public Desktop(String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
    }
    
    public Desktop(Memoria memoria, Hd hd, Monitor monitor, Fonte fonte, String marca, double preco, int quantidade) {
        super(marca, preco, quantidade);
        this.memoria = memoria;
        this.hd = hd;
        this.monitor = monitor;
        this.fonte = fonte;
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

    public int getQuantidadePlacasVídeo() {
        return quantidadePlacasVídeo;
    }

    public void setQuantidadePlacasVídeo(int quantidadePlacasVídeo) {
        this.quantidadePlacasVídeo = quantidadePlacasVídeo;
    }

    public ArrayList<PlacaDeVideo> getListPlacasDeVideo() {
        return listaPlacasDeVideo;
    }

    public void setListPlacasDeVideo(ArrayList<PlacaDeVideo> listaPlacasDeVideo) {
        this.listaPlacasDeVideo = listaPlacasDeVideo;
    }

    public void imprimir() {
        System.out.println("::::::    Desktop   ::::::");
        imprimirMercadoria();
        this.getMemoria().imprimirMemoria("Desktop");
        this.getHd().imprimirHd();
        this.getMonitor().imprimirMonitor();
        this.getFonte().imprimirFonte();
        System.out.println("\n ----  Dados  Placa de Vídeo  ----");
        System.out.println("Qtd. P. de Vídeo    : " + this.getQuantidadePlacasVídeo());
        this.listaPlacasDeVideo.forEach((placaDeVideo) -> {
            placaDeVideo.imprimirPlacaDeVideo();
        });
        System.out.println("\n\n");
        	
    }
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        entradaMercadoria("Desktop");
        
        this.memoria = new Memoria();
        this.memoria.entradaMemoria("Desktop");
        
        this.hd = new Hd();
        this.hd.entradaHd();
        
        this.monitor = new Monitor();
        this.monitor.entradaMonitor();
        
        this.fonte = new Fonte();
        this.fonte.entradaFonte();
        
        System.out.println("Qtd Placa de video  :");
        setQuantidadePlacasVídeo(Integer.parseInt(ent.nextLine()));
        
        System.out.println("\n ----  Entrada de dados da Placa de Video  ----");
        for (int i = 0; i < this.quantidadePlacasVídeo; i++) {
            PlacaDeVideo placaDeVideo = new PlacaDeVideo();
            placaDeVideo.entradaPlacaDeVideo();
            this.listaPlacasDeVideo.add(placaDeVideo);
        }
        
    }    
  
}
