package Hardware;

import java.util.Scanner;

public class Memoria {
    private int slotsMemoria;
    private String tipoMemoria; 
    private String marcaMemoria; 
    private int numeroslotsMemoria; 
    private int capacidadeMemoria;

    public Memoria(int slotsMemoria, String tipoMemoria, String marcaMemoria, int numeroslotsMemoria, int capacidadeMemoria) {
        this.slotsMemoria = slotsMemoria;
        this.tipoMemoria = tipoMemoria;
        this.marcaMemoria = marcaMemoria;
        this.numeroslotsMemoria = numeroslotsMemoria;
        this.capacidadeMemoria = capacidadeMemoria;
    }

    public Memoria(int slotsMemoria, String tipoMemoria, String marcaMemoria) {
        this.slotsMemoria = slotsMemoria;
        this.tipoMemoria = tipoMemoria;
        this.marcaMemoria = marcaMemoria;
    }

    public Memoria(String tipoMemoria, String marcaMemoria, int numeroslotsMemoria) {
        this.tipoMemoria = tipoMemoria;
        this.marcaMemoria = marcaMemoria;
        this.numeroslotsMemoria = numeroslotsMemoria;
    }

    public Memoria() {
    }

    public int getSlotsMemoria() {
        return slotsMemoria;
    }

    public void setSlotsMemoria(int slotsMemoria) {
        this.slotsMemoria = slotsMemoria;
    }

    public String getTipoMemoria() {
        return tipoMemoria;
    }

    public void setTipoMemoria(String tipoMemoria) {
        this.tipoMemoria = tipoMemoria;
    }

    public String getMarcaMemoria() {
        return marcaMemoria;
    }

    public void setMarcaMemoria(String marcaMemoria) {
        this.marcaMemoria = marcaMemoria;
    }

    public int getNumeroslotsMemoria() {
        return numeroslotsMemoria;
    }

    public void setNumeroslotsMemoria(int numeroslotsMemoria) {
        this.numeroslotsMemoria = numeroslotsMemoria;
    }

    public int getCapacidadeMemoria() {
        return capacidadeMemoria;
    }

    public void setCapacidadeMemoria(int capacidadeMemoria) {
        this.capacidadeMemoria = capacidadeMemoria;
    }

    

    public void imprimirMemoria(String Modelo) {
        System.out.println("\n ----  Dados  da Memória  ----");
        
        if (Modelo.equals("Servidor") || Modelo.equals("Notebook")) {
            System.out.println("Slots Memória       : " + this.getSlotsMemoria());
        }
        System.out.println("Tipo Memória        : " + this.getTipoMemoria());
        System.out.println("Marca Memória       : " + this.getMarcaMemoria());  
        
        if (Modelo.equals("Notebook") || Modelo.equals("Desktop")) {
            System.out.println("Num. Slots Memória  : " + this.getNumeroslotsMemoria());
        }     
        if (Modelo.equals("Servidor")) {
            System.out.println("Capacidade Memória  : " + this.getNumeroslotsMemoria());
        }  
    }

    
    public void entradaMemoria(String Modelo) {
        Scanner ent = new Scanner(System.in);
        System.out.println("\n ----  Entrada de dados da Mamória  ----");
        if (Modelo.equals("Servidor") || Modelo.equals("Notebook")) {
            System.out.println("Slots Memória           :");
            setSlotsMemoria(Integer.parseInt(ent.nextLine()));
        }
        System.out.println("Tipo Memória            :");
        setTipoMemoria(ent.nextLine());
        System.out.println("Marca Memória           :"); 
        setMarcaMemoria(ent.nextLine());
        
        if (Modelo.equals("Notebook") || Modelo.equals("Desktop")) {
            System.out.println("Número Slots Memória    :");
            setNumeroslotsMemoria(Integer.parseInt(ent.nextLine()));
        }     
        if (Modelo.equals("Servidor")) {
            System.out.println("Capacidade Memória      :");
            setCapacidadeMemoria(Integer.parseInt(ent.nextLine()));
        }     
    }   
    
   
}
