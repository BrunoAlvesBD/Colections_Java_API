package main.java.set.operacoesBasicas;

import java.util.Objects;

public class Convidado {
    private String nome;
    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.getCodigoConvite();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigoConvite);
    }

    @Override
    public String toString() {
        return "Convidado{" +
                "nome='" + nome + '\'' +
                ", codigoConvite=" + codigoConvite +
                '}';
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("convidado 1", 1234);
        conjuntoConvidados.adicionarConvidado("convidado 2", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 3", 1235);
        conjuntoConvidados.adicionarConvidado("convidado 4", 1236);

        conjuntoConvidados.exibirConvidados();

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+ "convidados dentro do Set de convidados");

        conjuntoConvidados.removerConvidado(1234);

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados()+ "convidados dentro do Set de convidados");

        conjuntoConvidados.exibirConvidados();

    }
}
