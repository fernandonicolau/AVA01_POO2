package Hardware;

import java.util.Scanner;

public class Fonte {
    private String tipoFonte;
    private String marcaFonte;
    private int potenciaFonte;

    public Fonte() {
    }

    public Fonte(String tipoFonte, String marcaFonte, int potenciaFonte) {
        this.tipoFonte = tipoFonte;
        this.marcaFonte = marcaFonte;
        this.potenciaFonte = potenciaFonte;
    }

    public String getTipoFonte() {
        return tipoFonte;
    }

    public void setTipoFonte(String tipoFonte) {
        this.tipoFonte = tipoFonte;
    }

    public String getMarcaFonte() {
        return marcaFonte;
    }

    public void setMarcaFonte(String marcaFonte) {
        this.marcaFonte = marcaFonte;
    }

    public int getPotenciaFonte() {
        return potenciaFonte;
    }

    public void setPotenciaFonte(int potenciaFonte) {
        this.potenciaFonte = potenciaFonte;
    }
  
    

    public void imprimirFonte() {
        System.out.println("\n ----  Dados  da Fonte  ----");
        System.out.println("Tipo                : " + this.getTipoFonte());
        System.out.println("Marca               : " + this.getMarcaFonte());
        System.out.println("Potência            : " + this.getPotenciaFonte() + " watts");
    }

    public void entradaFonte() {
        Scanner ent = new Scanner(System.in);
        System.out.println("\n ----  Entrada de dados da Fonte  ----");
        System.out.println("Tipo                : ");
        setTipoFonte(ent.nextLine());
        System.out.println("Marca               : ");
        setMarcaFonte(ent.nextLine());
        System.out.println("Potência (watts)    : ");
        setPotenciaFonte(Integer.parseInt(ent.nextLine())); 
    }
    
}
