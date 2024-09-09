package uniandes.dpoo.aerolinea.modelo;

import java.util.Collection;


public class Vuelo {
    
    private String fecha;
    
    private Ruta ruta;
    private Avion avion;
    private Collection<Tiquete> tiquetes;
    
    // Constructor que inicializa los atributos
    public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
    }
    
    // Método getter para obtener la ruta del vuelo
    public Ruta getRuta() {
        return ruta;
    }
    
    // Método getter para obtener la fecha del vuelo
    public String getFecha() {
        return fecha;
    }
    
    // Método getter para obtener el avión del vuelo
    public Avion getAvion() {
        return avion;
    }
    
    // Método getter para obtener los tiquetes del vuelo
    public Collection<Tiquete> getTiquetes() {
        return tiquetes;
    }
    
    // Método para vender tiquetes
    public int venderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) {
        // TODO: Implementar lógica para vender tiquetes
        return 0; // Retorna la cantidad de tiquetes vendidos
    }
    
    // Sobrescribe el método equals para comparar vuelos por su ruta, fecha y avión
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Vuelo vuelo = (Vuelo) obj;
        
        if (!fecha.equals(vuelo.fecha)) return false;
        if (!ruta.equals(vuelo.ruta)) return false;
        return avion.equals(vuelo.avion);
    }
    
    // Sobrescribe el método hashCode si se sobrescribe equals (opcional)
    @Override
    public int hashCode() {
        int result = fecha.hashCode();
        result = 31 * result + ruta.hashCode();
        result = 31 * result + avion.hashCode();
        return result;
    }
}
