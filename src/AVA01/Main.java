package AVA01;

import Hardware.Fonte;
import Hardware.Gabinete;
import Hardware.Hd;
import Hardware.Memoria;
import Hardware.Monitor;
import Hardware.PlacaDeVideo;
import Modelos.Desktop;
import Modelos.Notebook;
import Modelos.Servidor;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
          
//      ==================== INICIO HARDWARE GENERICOS ====================
        Memoria memoria01 = new Memoria(1, "DDR4", "Hyperx", 2, 32);
        Memoria memoria02 = new Memoria("DDR3", "Kingston", 2);
            memoria02.setCapacidadeMemoria(16);
            memoria02.setSlotsMemoria(4);
            memoria02.setNumeroslotsMemoria(1);
        Memoria memoria03 = new Memoria();
            memoria03.setTipoMemoria("DDR4");
            memoria03.setMarcaMemoria("Galax");
            memoria03.setNumeroslotsMemoria(2);
            memoria03.setCapacidadeMemoria(16);
            memoria03.setSlotsMemoria(1);
        
        Hd hd01 = new Hd("SSD", "Samsung", 1024);
        Hd hd02 = new Hd("SATA", "WD", 500);
        Hd hd03 = new Hd("SSD", "Kingston", 2048);
        ArrayList<Hd> listaHd01 = new ArrayList<>();
            listaHd01.add(hd01);
            listaHd01.add(hd02);
        
        Monitor monitor01 = new Monitor("LED", "HQ", 1080);
        Monitor monitor02 = new Monitor("LED", "2K", 1440);
        Monitor monitor03 = new Monitor("AMOLED", "4K", 2160);
        
        Fonte fonte01 = new Fonte("ATX", "SevenTeam", 750);
        Fonte fonte02 = new Fonte("ATX", "CORSAIR", 500);
        Fonte fonte03 = new Fonte("ATX", "Blue Case", 500);
        
        ArrayList<PlacaDeVideo> listaPlacasDeVideo01 = new ArrayList<>();
            PlacaDeVideo placaDeVideo01 = new PlacaDeVideo("NVIDIA");
            listaPlacasDeVideo01.add(placaDeVideo01);
            listaPlacasDeVideo01.add(placaDeVideo01);
        ArrayList<PlacaDeVideo> listaPlacasDeVideo02 = new ArrayList<>();
            PlacaDeVideo placaDeVideo02 = new PlacaDeVideo("GEFORCE");
            listaPlacasDeVideo02.add(placaDeVideo02);
        ArrayList<PlacaDeVideo> listaPlacasDeVideo03 = new ArrayList<>();
            PlacaDeVideo placaDeVideo03 = new PlacaDeVideo("GALAX");
            listaPlacasDeVideo03.add(placaDeVideo03);
            
        Gabinete gabinete01 = new Gabinete("ATX", "DELL");
        Gabinete gabinete02 = new Gabinete("4 BAIS", "XPG");  
//      ==================== FIM HARDWARE GENERICOS ====================



//      ==================== INICIO CADASTRO DESKTOP ====================
        Desktop desktop01 = new Desktop(memoria01, hd01, monitor01, fonte01, listaPlacasDeVideo01, 2, "Samsung", 2480.50, 250);

        Desktop desktop02 = new Desktop(memoria02, hd02, monitor02, fonte02, "DELL", 39990.99, 30);
        desktop02.setQuantidadePlacasVídeo(1);
        desktop02.setListPlacasDeVideo(listaPlacasDeVideo02);

        Memoria memoria04 = new Memoria(2, "DDR3", "Kingston", 2, 0);
        Hd hd04 = new Hd("SATA", "Seagate", 500);
        Monitor monitor04 = new Monitor("LCD", "HP", 0);
        Fonte fonte04 = new Fonte("ATX", "EVGA", 500);
        ArrayList<PlacaDeVideo> listaPlacasDeVideo04 = new ArrayList<>();
            PlacaDeVideo placaDeVideo04 = new PlacaDeVideo("EVGA");
            listaPlacasDeVideo04.add(placaDeVideo04);
        Desktop desktop03 = new Desktop(memoria04, hd04, monitor04, fonte04, listaPlacasDeVideo04, 0, "Intel", 1611, 800);


//        desktop03.entrada();
//      ==================== FIM CADASTRO DESKTOP ====================      
 
//      ==================== INICIO CADASTRO NOTEBOOK ====================
        Notebook notebook01 = new Notebook(memoria02, hd02, monitor02, fonte02, "Asus", 1500.50, 75);
        Notebook notebook02 = new Notebook(memoria03, hd03, monitor03, fonte03);
        notebook02.setPreco(1299.99);
        notebook02.setMarca("Positivo");
        notebook02.setQuantidade(50);
        
        Memoria memoria05 = new Memoria(2, "DDR4", "Samsung", 2, 0);
        Hd hd05 = new Hd("SSD", "WD", 1024);
        Monitor monitor05 = new Monitor("LED", "Acer", 1440);
        Fonte fonte05 = new Fonte("ATX", "Acer", 300);
        Notebook notebook03 = new Notebook(memoria05, hd05, monitor05, fonte05, "Acer", 4218.41, 500);
//        notebook03.entrada();  
//      ==================== FIM CADASTRO NOTEBOOK ====================

//      ==================== INICIO CADASTRO SERVIDOR ====================
        Servidor servidor01 = new Servidor(memoria01, gabinete01, fonte02, listaHd01, listaHd01.size(), "DELL", 5000, 20);
        Servidor servidor02 = new Servidor(memoria03, gabinete02, fonte01);
        servidor02.setListHd(listaHd01);
        servidor02.setPreco(10800.50);
        servidor02.setMarca("LENOVO");
        servidor02.setQuantidade(10);
        Servidor servidor03 = new Servidor();
        servidor03.entrada(); 
//      ==================== FIM CADASTRO SERVIDOR ====================
        
//      ==================== INICIO IMPRIMIR MERCADORIAS ====================
        desktop01.imprimir();
        desktop02.imprimir();
        desktop03.imprimir();
        
        notebook01.imprimir();
        notebook02.imprimir();
        notebook03.imprimir();
        
        servidor01.imprimir();
        servidor02.imprimir();
        servidor03.imprimir();
//      ==================== FIM IMPRIMIR MERCADORIAS ====================

        
        
    }
}
