package seriestv.model;

import java.time.LocalDate;

/**
 *
 * @author andres
 */
public class Serie {
    private String codigo;
    private String titulo;
    private LocalDate fechaLanzamiento;
    private int temporadas;
    private String genero; 
    private String actoresPrincipales;
    private String sinopsis;

    // Constructor vacío
    public Serie() {
    }

    // Constructor completo
    public Serie(String codigo, String titulo, LocalDate fechaLanzamiento, int temporadas, String genero, String actoresPrincipales, String sinopsis) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.temporadas = temporadas;
        this.genero = genero;
        this.actoresPrincipales = actoresPrincipales;
        this.sinopsis = sinopsis;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDate getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(LocalDate fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getActoresPrincipales() {
        return actoresPrincipales;
    }

    public void setActoresPrincipales(String actoresPrincipales) {
        this.actoresPrincipales = actoresPrincipales;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}

