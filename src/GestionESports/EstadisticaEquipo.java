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

    public void calcularPorcentajeVictoria(){
        System.out.println((partidasGanadas / (partidasGanadas + partidasPerdidas)) * 100  + " % de partidas ganadas.");
    }

    public void calcularPorcentajeDerrota(){
        System.out.println((partidasPerdidas / (partidasGanadas + partidasPerdidas) * 100 + " % de partidas perdidas."));
    }
}
