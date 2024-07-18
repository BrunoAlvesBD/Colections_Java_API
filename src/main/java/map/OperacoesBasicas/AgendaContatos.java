package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionaContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }
    public void imprimeContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
             numPorNome = agendaContatoMap.get(nome);
        }
        return numPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionaContato("Camila", 12345);
        agendaContatos.adicionaContato("Camila", 5566);
        agendaContatos.adicionaContato("Camila caval", 111111);
        agendaContatos.adicionaContato("Camila DIO", 659864);
        agendaContatos.adicionaContato("Maria", 1111111111);
        agendaContatos.adicionaContato("Camila", 44444);

        agendaContatos.imprimeContatos();

        agendaContatos.removerContato("Maria");

        agendaContatos.imprimeContatos();

        agendaContatos.pesquisarPorNome("Camila");
    }
}

