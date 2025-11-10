package ActiVentaOrdenadores;

public class Venta {
    private String nombreCliente, localidad, procesador, memoria, monitor, discoDuro;
    private boolean grabadoraDvd, wifi, sincronizador, backup;

    public Venta(String nombreCliente, String localidad, String procesador, String memoria, String monitor,
                 String discoDuro, boolean grabadoraDvd, boolean wifi, boolean sincronizador, boolean backup) {
        this.nombreCliente = nombreCliente;
        this.localidad = localidad;
        this.procesador = procesador;
        this.memoria = memoria;
        this.monitor = monitor;
        this.discoDuro = discoDuro;
        this.grabadoraDvd = grabadoraDvd;
        this.wifi = wifi;
        this.sincronizador = sincronizador;
        this.backup = backup;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProcesador() {
        return procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public String getMonitor() {
        return monitor;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public boolean isGrabadoraDvd() {
        return grabadoraDvd;
    }

    public boolean isWifi() {
        return wifi;
    }

    public boolean isSincronizador() {
        return sincronizador;
    }

    public boolean isBackup() {
        return backup;
    }

    public String detallesVenta() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre: " + this.nombreCliente + "\n");
        sb.append("Localidad: " + this.localidad + "\n");
        sb.append("Procesador: " + this.procesador + "\n");
        sb.append("Memoria: " + this.memoria + "\n");
        sb.append("Monitor: " + this.monitor + "\n");
        sb.append("Disco duro: " + this.discoDuro + "\n");
        sb.append("Opciones:\n");
        sb.append("  - Grabadora DVD: ").append(grabadoraDvd ? "Sí" : "No").append("\n");
        sb.append("  - Wifi: ").append(wifi ? "Sí" : "No").append("\n");
        sb.append("  - Sincronizador TV: ").append(sincronizador ? "Sí" : "No").append("\n");
        sb.append("  - Backup Restore: ").append(backup ? "Sí" : "No").append("\n");
        return sb.toString();
    }
}
