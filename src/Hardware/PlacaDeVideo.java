package Hardware;

import java.util.Scanner;

public class PlacaDeVideo {
    
    private String marcaPlacaVideo;

    public PlacaDeVideo() {
    }

    public PlacaDeVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public String getMarcaPlacaVideo() {
        return marcaPlacaVideo;
    }

    public void setMarcaPlacaVideo(String marcaPlacaVideo) {
        this.marcaPlacaVideo = marcaPlacaVideo;
    }

    public void imprimirPlacaDeVideo() {
        System.out.println("Marca               : " + this.getMarcaPlacaVideo());
    }
    
    public void entradaPlacaDeVideo() {
        Scanner ent = new Scanner(System.in);
        System.out.println("Marca               : ");
        setMarcaPlacaVideo(ent.nextLine());
    }
}
