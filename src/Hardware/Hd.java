package Hardware;

import java.util.Scanner;

public class Hd {
    
    private String tipoHD;
    private String marcaHD; 
    private int capacidadeHD;

    public Hd(String tipoHD, String marcaHD, int capacidadeHD) {
        this.tipoHD = tipoHD;
        this.marcaHD = marcaHD;
        this.capacidadeHD = capacidadeHD;
    }

    public Hd() {
    }

    public String getTipoHD() {
        return tipoHD;
    }

    public void setTipoHD(String tipoHD) {
        this.tipoHD = tipoHD;
    }

    public String getMarcaHD() {
        return marcaHD;
    }

    public void setMarcaHD(String marcaHD) {
        this.marcaHD = marcaHD;
    }

    public int getCapacidadeHD() {
        return capacidadeHD;
    }

    public void setCapacidadeHD(int capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }

    
    public void imprimirHd() {
        System.out.println("\n ----  Dados do HD  ----");
        System.out.println("Tipo                : " + this.getTipoHD());
        System.out.println("Marca               : " + this.getMarcaHD());
        if (this.getCapacidadeHD() > 1024) {
            System.out.println("Capacidade          : " + (this.getCapacidadeHD()/1024) +" TB");
        } else {
            System.out.println("Capacidade          : " + this.getCapacidadeHD() +" GB");
        }
    }
    
    
    
    public void entrada() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Tipo                : ");
        setTipoHD(ent.nextLine());
        System.out.println("Marca               : ");
        setMarcaHD(ent.nextLine());
        System.out.println("Capacidade (GB)         : ");
        setCapacidadeHD(Integer.parseInt(ent.nextLine())); 
    }
    
    public void entradaHd() {
        System.out.println("\n ----  Entrada de dados do HD  ----");
        entrada();
    }
    
    public void entradaHdServidor() {
        entrada();
    }

}
