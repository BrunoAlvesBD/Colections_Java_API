package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        //o treeset já organiza o set
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }
    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorpreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto produto = new CadastroProduto();


        produto.adicionarProduto(1L, "produto 5", 15d, 5);
        produto.adicionarProduto(2L, "produto 0", 20d, 10);
        produto.adicionarProduto(1L, "produto 3", 10d, 2);
        produto.adicionarProduto(5L, "produto 9", 2d, 2);


//        System.out.println(produto.produtoSet);
        System.out.println(produto.exibirProdutosPorNome());
        System.out.println(produto.exibirProdutosPorPreco());
    }
}
