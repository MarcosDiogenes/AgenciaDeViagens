package br.uern.di.pa.abb.diogenes.marcos;

public class Main {
    public static void main(String[] args) {
        Viajante marcos = new Viajante("Marcos", "123.456.789-10", "05/01/1995");

        Viagem natal = new Viagem(1, 30, 0, "Mossoró",
                "Natal", "08/08/2022", "15/08/2022", "ônibus Master");

        System.out.println(natal.getNumVagasLivres());
        System.out.println(natal.getNumVagasOcupadas());

        Contrato contrato = new Contrato(1, natal, marcos, true);

        System.out.println(natal.getNumVagasLivres());
        System.out.println(natal.getNumVagasOcupadas());

        System.out.println(contrato.getViagem().getLocalChegada());
        System.out.println(contrato.getViajante().getNome());

    }
}
