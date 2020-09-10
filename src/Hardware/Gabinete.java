package Hardware;

import java.util.Scanner;

public class Gabinete {
    private String tipoGabinete;
    private String marcaGabinete;

    public Gabinete() {
    }
    
    public Gabinete(String tipoGabinete, String marcaGabinete) {
        this.tipoGabinete = tipoGabinete;
        this.marcaGabinete = marcaGabinete;
    }

    public String getTipoGabinete() {
        return tipoGabinete;
    }

    public void setTipoGabinete(String tipoGabinete) {
        this.tipoGabinete = tipoGabinete;
    }

    public String getMarcaGabinete() {
        return marcaGabinete;
    }

    public void setMarcaGabinete(String marcaGabinete) {
        this.marcaGabinete = marcaGabinete;
    }
    
    public void imprimirGabinete() {
        System.out.println("\n ----  Dados do Gabinete  ----");
        System.out.println("Tipo                : " + this.getTipoGabinete());
        System.out.println("Marca               : " + this.getMarcaGabinete());
    }
    
    public void entradaGabinete() {
        Scanner ent = new Scanner(System.in);
        System.out.println("\n ----  Entrada de dados do Gabinete  ----");
        System.out.println("Tipo                : ");
        setTipoGabinete(ent.nextLine());
        System.out.println("Marca               : ");
        setMarcaGabinete(ent.nextLine());
    }

}
