package GestionESports;

public class EstadisticaEquipo {
    private int partidasGanadas;
    private int partidasPerdidas;
    private int puntos;

    public EstadisticaEquipo(int partidasGanadas, int partidasPerdidas, int puntos) {
        this.partidasGanadas = partidasGanadas;
        this.partidasPerdidas = partidasPerdidas;
        this.puntos = puntos;
    }

    public int getPartidasGanadas() {
        return partidasGanadas;
    }

    public void setPartidasGanadas(int partidasGanadas) {
        this.partidasGanadas = partidasGanadas;
    }

    public int getPartidasPerdidas() {
        return partidasPerdidas;
    }

    public void setPartidasPerdidas(int partidasPerdidas) {
        this.partidasPerdidas = partidasPerdidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public String calcularPorcentajeVictoria() {
        int total = partidasGanadas + partidasPerdidas;

        double porcentaje = ((double) partidasGanadas / total) * 100;
        return porcentaje + " % de partidas ganadas";
    }

    public String calcularPorcentajeDerrota() {
        int total = partidasGanadas + partidasPerdidas;

        double porcentaje = ((double) partidasPerdidas / total) * 100;
        return porcentaje + " % de partidas perdidas";
    }

    public void sumarEstadisticas(EstadisticaEquipo otra) {
        this.partidasGanadas += otra.partidasGanadas;
        this.partidasPerdidas += otra.partidasPerdidas;
        this.puntos += otra.puntos;
    }

}
