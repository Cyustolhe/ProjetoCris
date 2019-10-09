/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author Acer
 */
public class Autor {

    // atributos
    //metodo para imprimir todos os atributos
    //getters e setters = gets e sets
    private String nomeAutor;
    private String emailAutor;
    private String cpfAutor;

    /**
     *
     */
    public void imprimirAutor() {
        System.out.println("Nome do Autor: " + this.nomeAutor);
        System.out.println("E-mail Autor: " + this.emailAutor);
        System.out.println("CPF Autor: " + this.cpfAutor + "\n");

    }

    ; 


    /**
     * @return the nomeAutor
     */
    public String getNomeAutor() {
        return nomeAutor;
    }

    /**
     * @param nomeAutor the nomeAutor to set
     */
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    /**
     * @return the emailAutor
     */
    public String getEmailAutor() {
        return emailAutor;
    }

    /**
     * @param emailAutor the emailAutor to set
     */
    public void setEmailAutor(String emailAutor) {
        this.emailAutor = emailAutor;
    }

    /**
     * @return the cpfAutor
     */
    public String getCpfAutor() {
        return cpfAutor;
    }

    /**
     * @param cpfAutor the cpfAutor to set
     */
    public void setCpfAutor(String cpfAutor) {
        this.cpfAutor = cpfAutor;
    }

}
