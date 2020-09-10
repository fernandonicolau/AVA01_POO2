package Hardware;

import java.util.Scanner;

public class Monitor {
    private String tipoMonitor;
    private String marcaMonitor; 
    private int resolucaoMonitor;

    public Monitor(String tipoMonitor, String marcaMonitor, int resolucaoMonitor) {
        this.tipoMonitor = tipoMonitor;
        this.marcaMonitor = marcaMonitor;
        this.resolucaoMonitor = resolucaoMonitor;
    }

    public Monitor() {
    }

    public String getTipoMonitor() {
        return tipoMonitor;
    }

    public void setTipoMonitor(String tipoMonitor) {
        this.tipoMonitor = tipoMonitor;
    }

    public String getMarcaMonitor() {
        return marcaMonitor;
    }

    public void setMarcaMonitor(String marcaMonitor) {
        this.marcaMonitor = marcaMonitor;
    }

    public int getResolucaoMonitor() {
        return resolucaoMonitor;
    }

    public void setResolucaoMonitor(int resolucaoMonitor) {
        this.resolucaoMonitor = resolucaoMonitor;
    }

    public void imprimirMonitor() {
        System.out.println("\n ----  Dados  Monitor  ----");
        System.out.println("Tipo                : " + this.getTipoMonitor());
        System.out.println("Marca               : " + this.getMarcaMonitor());
        System.out.println("Resolução           : " + this.getResolucaoMonitor());
    }
    
    public void entradaMonitor() {
        Scanner ent = new Scanner(System.in);
        System.out.println("\n ----  Entrada de dados do Monitor  ----");
        System.out.println("Tipo                : ");
        setTipoMonitor(ent.nextLine());
        System.out.println("Marca               : ");
        setMarcaMonitor(ent.nextLine());
        System.out.println("Resolução           : ");
        setResolucaoMonitor(Integer.parseInt(ent.nextLine())); 
    }

    
}
