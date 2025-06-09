package seriestv.controller;

import seriestv.model.Serie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author andres
 */
public class Controller {

    public boolean guardarSerie(Serie serie) {
        String sql = "INSERT INTO serie (codigo, titulo, fecha, temporadas, genero, actores, sinopsis) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, serie.getCodigo());
            stmt.setString(2, serie.getTitulo());
            stmt.setDate(3, java.sql.Date.valueOf(serie.getFechaLanzamiento()));
            stmt.setInt(4, serie.getTemporadas());
            stmt.setString(5, serie.getGenero());
            stmt.setString(6, serie.getActoresPrincipales());
            stmt.setString(7, serie.getSinopsis());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.err.println("Error al guardar la serie: " + e.getMessage());
            return false;
        }
    }
    public Serie buscarSeriePorCodigo(String codigo) {
    String sql = "SELECT * FROM serie WHERE codigo = ?";
    Serie serie = null;

    try (Connection conn = Conexion.getConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, codigo);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            serie = new Serie();
            serie.setCodigo(rs.getString("codigo"));
            serie.setTitulo(rs.getString("titulo"));
            serie.setFechaLanzamiento(rs.getDate("fecha").toLocalDate());
            serie.setTemporadas(rs.getInt("temporadas"));
            serie.setGenero(rs.getString("genero"));
            serie.setActoresPrincipales(rs.getString("actores"));
            serie.setSinopsis(rs.getString("sinopsis"));
        }

    } catch (SQLException e) {
        System.err.println("Error al buscar la serie: " + e.getMessage());
    }

    return serie;
}
public boolean editarSerie(Serie serie) {
    String sql = "UPDATE serie SET titulo = ?, fecha = ?, temporadas = ?, genero = ?, actores = ?, sinopsis = ? WHERE codigo = ?";

    try (Connection conn = Conexion.getConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, serie.getTitulo());
        stmt.setDate(2, java.sql.Date.valueOf(serie.getFechaLanzamiento()));
        stmt.setInt(3, serie.getTemporadas());
        stmt.setString(4, serie.getGenero());
        stmt.setString(5, serie.getActoresPrincipales());
        stmt.setString(6, serie.getSinopsis());
        stmt.setString(7, serie.getCodigo());  // WHERE

        int filas = stmt.executeUpdate();
        return filas > 0;

    } catch (SQLException e) {
        System.err.println("Error al editar la serie: " + e.getMessage());
        return false;
    }
}
public boolean eliminarSeriePorCodigo(String codigo) {
    String sql = "DELETE FROM serie WHERE codigo = ?";

    try (Connection conn = Conexion.getConexion();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, codigo);
        int filas = stmt.executeUpdate();
        return filas > 0;

    } catch (SQLException e) {
        System.err.println("Error al eliminar la serie: " + e.getMessage());
        return false;
    }
}

}
