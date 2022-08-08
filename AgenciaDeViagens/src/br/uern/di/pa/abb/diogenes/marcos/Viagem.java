package br.uern.di.pa.abb.diogenes.marcos;

public class Viagem {

    private int idViagem, numVagasLivres, numVagasOcupadas;
    private String localPartida, localChegada, dataPartida, dataChegada, veiculo;

    // Construtor Padrão
    public Viagem(int idViagem, int numVagasLivres, int numVagasOcupadas, String localPartida, String localChegada,
                  String dataPartida, String dataChegada, String veiculo) {
        this.idViagem = idViagem;
        this.numVagasLivres = numVagasLivres;
        this.numVagasOcupadas = numVagasOcupadas;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.dataPartida = dataPartida;
        this.dataChegada = dataChegada;
        this.veiculo = veiculo;
    }

    // Getters e Setters
    public int getIdViagem() {
        return idViagem;
    }

    public void setIdViagem(int idViagem) {
        this.idViagem = idViagem;
    }

    public int getNumVagasLivres() {
        return numVagasLivres;
    }

    public void setNumVagasLivres(int numVagasLivres) {
        this.numVagasLivres = numVagasLivres;
    }

    public int getNumVagasOcupadas() {
        return numVagasOcupadas;
    }

    public void setNumVagasOcupadas(int numVagasOcupadas) {
        this.numVagasOcupadas = numVagasOcupadas;
    }

    public String getLocalPartida() {
        return localPartida;
    }

    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }

    public String getLocalChegada() {
        return localChegada;
    }

    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }

    public String getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(String dataPartida) {
        this.dataPartida = dataPartida;
    }

    public String getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(String dataChegada) {
        this.dataChegada = dataChegada;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }
}