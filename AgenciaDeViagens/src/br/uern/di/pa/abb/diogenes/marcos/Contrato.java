package br.uern.di.pa.abb.diogenes.marcos;

import br.uern.di.pa.abb.diogenes.marcos.Viajante;
import br.uern.di.pa.abb.diogenes.marcos.Viagem;

public class Contrato {

    private int idContrato;
    private Viagem viagem;
    private Viajante viajante;
    private boolean estaVigente = true;

    // Construtor Padrão
    public Contrato(int idContrato, Viagem viagem, Viajante viajante, boolean estaVigente) {
        this.idContrato = idContrato;
        this.viagem = viagem;
        this.viajante = viajante;
        this.estaVigente = estaVigente;

        this.viagem.setNumVagasLivres(this.viagem.getNumVagasLivres()-1);
        this.viagem.setNumVagasOcupadas(this.viagem.getNumVagasOcupadas()+1);
    }

    // Getters e Setters
    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public Viajante getViajante() {
        return viajante;
    }

    public void setViajante(Viajante viajante) {
        this.viajante = viajante;
    }

    public boolean isEstaVigente() {
        return estaVigente;
    }

    public void setEstaVigente(boolean estaVigente) {
        this.estaVigente = estaVigente;
    }
}
