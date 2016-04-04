/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.fatec.jdbc.modelo;

/**
 *
 * @author Lucas
 */
public class Produto {
    private String nome;
    private String preco;
    private int codigo;
    private String x;

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }


    
}
