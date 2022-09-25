package Models;

import java.util.Date;

public class Alquiler {
    private String documentoCliento;
    private String placaAutomovil;
    private Date fecha;
    private int dias;

    public Alquiler() {}

    public Alquiler(String documentoCliento, String placaAutomovil, Date fecha, int dias) {
        this.documentoCliento = documentoCliento;
        this.placaAutomovil = placaAutomovil;
        this.fecha = fecha;
        this.dias = dias;
    }

    public String getDocumentoCliento() {
        return documentoCliento;
    }

    public void setDocumentoCliento(String documentoCliento) {
        this.documentoCliento = documentoCliento;
    }

    public String getPlacaAutomovil() {
        return placaAutomovil;
    }

    public void setPlacaAutomovil(String placaAutomovil) {
        this.placaAutomovil = placaAutomovil;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }
}
