/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package publicacoes;

/**
 *
 * @author Acer
 */
public class Livro extends Publicacao {

    private String tipo;

    @Override //Sobrescrita - polimorfismo - mesma assinatura do metodo mas comportamento diferente
    public void imprimirDadosLivros() {
        System.out.println("Nome: " + getNome());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Tipo: " + this.tipo);
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
