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
public class Ebook extends Publicacao {

    private String formato;

    @Override
    public void imprimirDadosLivros() {
        System.out.println("Nome: " + getNome());
        System.out.println("ISBN: " + getISBN());
        System.out.println("Tipo: " + this.formato);
    }

    /**
     * @return the formato
     */
    public String getFormato() {
        return formato;
    }

    /**
     * @param formato the formato to set
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

}
