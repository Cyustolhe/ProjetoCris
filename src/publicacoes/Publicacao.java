/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicacoes;

import pessoa.Autor;

/**
 *
 * @author Acer
 */
public class Publicacao {

    //TODO Depois tem que incluir os demais atributos, vamos fazer somente com alguns
    private String Nome;
    private String ISBN;
    private Autor autor;
    private double valor;

    public void imprimirDadosLivros() {
        System.out.println("Impressao da classe pai!");
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param ISBN the ISBN to set
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * @return the autor
     */
    public Autor getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        if(this.valor <= 0.3){
        this.valor = valor;
        }
    }

}
