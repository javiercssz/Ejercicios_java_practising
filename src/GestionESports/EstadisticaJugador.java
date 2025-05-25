package GestionESports;

public class EstadisticaJugador {
    private int partidasJugadas;
    private int kills;
    private int muertes;
    private int asistencias;

    public EstadisticaJugador(int asistencias, int kills, int muertes, int partidasJugadas) {
        this.asistencias = asistencias;
        this.kills = kills;
        this.muertes = muertes;
        this.partidasJugadas = partidasJugadas;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getMuertes() {
        return muertes;
    }

    public void setMuertes(int muertes) {
        this.muertes = muertes;
    }

    public int getPartidasJugadas() {
        return partidasJugadas;
    }

    public void setPartidasJugadas(int partidasJugadas) {
        this.partidasJugadas = partidasJugadas;
    }


    public double calcularKDA(){
        if (muertes == 0){
            return kills + asistencias;
        }
        return (kills + asistencias) / muertes;
    }
}
