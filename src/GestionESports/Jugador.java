package GestionESports;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class Jugador {

    private String nickname;
    private String nombreReal;
    private int edad;
    private String rol;
    private HashMap<Torneo, EstadisticaJugador> estadisticasJugador = new HashMap<>();

    public Jugador(String nickname, String nombreReal, int edad, String rol) {
        this.nickname = nickname;
        this.nombreReal = nombreReal;
        this.edad = edad;
        this.rol = rol;
    }

    public String getNombreReal() {
        return nombreReal;
    }

    public void setNombreReal(String nombreReal) {
        this.nombreReal = nombreReal;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public HashMap<Torneo, EstadisticaJugador> getEstadisticasJugador() {
        return estadisticasJugador;
    }

    public void setEstadisticasJugador(HashMap<Torneo, EstadisticaJugador> estadisticasJugador) {
        this.estadisticasJugador = estadisticasJugador;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(nickname, jugador.nickname);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nickname);
    }

    public void cambiarRol(String rol) { // NO SE COMO HACERLO
        setRol(rol);
    }

    public void agregarEstadistica(Torneo torneo, EstadisticaJugador estadisticas) {
        estadisticasJugador.put(torneo,estadisticas);
    }

    public <Torneo, EstadisticaJugador> EstadisticaJugador estadisticaJugadorGetEstadisticaTorneo(Torneo torneo) {
        return (EstadisticaJugador) getEstadisticasJugador().get(torneo); //Tengo que crear este getter cuando pueda hacer lo del hashmap
    }
}
