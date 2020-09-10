package AVA01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Mercadoria {
    String marca; 
    double preco; 
    int quantidade; 

    public Mercadoria() {
    }

    public Mercadoria(String marca, double preco, int quantidade) {
        this.marca = marca;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void imprimirMercadoria() {
        DecimalFormat deci = new DecimalFormat("0.00");
        System.out.println("Marca               : " + this.getMarca());
        System.out.println("Preço               : R$ " + 
                deci.format(this.getPreco()));
        System.out.println("Quantidade          : " + 
                this.getQuantidade() +" un");
    }
    
    public void entradaMercadoria(String tipoMercadoria) {
        Scanner ent = new Scanner(System.in);
        System.out.println("\n\n::::::   Dados Mercadoria ("+ tipoMercadoria +")  ::::::");
        System.out.println("Marca               :");
        setMarca(ent.nextLine());
        System.out.println("Preço               :");
        setPreco(Double.parseDouble(ent.nextLine()));
        System.out.println("Quantidade          :");
        setQuantidade(Integer.parseInt(ent.nextLine()));     
    }   
}
