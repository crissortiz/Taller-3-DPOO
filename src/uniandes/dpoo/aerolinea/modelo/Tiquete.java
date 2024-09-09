package uniandes.dpoo.aerolinea.modelo;

public class Tiquete {
    private String codigo;
    private int tarifa;
    private boolean usado;
    
    private Vuelo vuelo;
    private Cliente cliente;

    public Tiquete(String codigo, Vuelo vuelo, Cliente cliente, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.cliente = cliente;
        this.tarifa = tarifa;
        this.usado = false; // Suponiendo un valor predeterminado como falso
    }

    public Cliente getCliente() {
    	return cliente;
    }
    
    public Vuelo getVuelo() {
    	return vuelo;
    }
    
    public int getTarifa() {
        return tarifa;
    }

    public void marcarcomoUsado() {
    	usado = true;
    }

    public boolean esUsado() {
    	return usado;
    }

}
