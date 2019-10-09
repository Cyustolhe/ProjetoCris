/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.Scanner;
import pessoa.Autor;
import publicacoes.Ebook;
import publicacoes.Livro;

/**
 *
 * @author Acer
 */
public class Projeto {

    /**
     * @param args the command line arguments
     */
    static int tipoLivro;
    static int quantidadeLivros;
    static ArrayList<Livro> livros = new ArrayList<>();
    static ArrayList<Ebook> ebooks = new ArrayList<>();

    public static void chamaCadastro(Scanner s) {
        System.out.println("Que tipo de livro quer cadastrar? (1 - Livro Físico 2 - Ebook");
        tipoLivro = s.nextInt();
        System.out.println("Quantos livros?");
        quantidadeLivros = s.nextInt();
        s.nextLine();
        switch (tipoLivro) {
            case 1:
                System.out.println("Fisico");
                cadastrarLivroFisico(quantidadeLivros, s);
                break;
            case 2:
                System.out.println("Ebook");
                cadastrarEbook(quantidadeLivros, s);
                break;
            case 3:
                System.out.println("Ebook");
                listarLivros(quantidadeLivros, s);
                break;
            default:
                System.out.println("Tipo Inválido!");
                break;
        }

    }

    public static void cadastrarLivroFisico(int quantidade, Scanner s) {
        System.out.println("\nQuantidade: " + quantidade);
        //Tem que fazer a mesma coisa para ebook agora!!
        //E incluir o autor - olhe o exercicio que fizemos em sala, sem o arraylist
        //é só modificar!!
        for (int i = 0; i < quantidade; i++) {
            Livro livro = new Livro();
            System.out.println("\nEntre com o nome do livro:");
            livro.setNome(s.nextLine());
            System.out.println("\nEntre com o ISBN do livro:");
            livro.setISBN(s.nextLine());
            System.out.println("\nEntre com o tipo do livro");
            livro.setTipo(s.nextLine());
            livro.setAutor(cadastraAutor(s));
            livros.add(livro);
        }
        for (Livro l : livros) {
            System.out.println("\n");
            l.imprimirDadosLivros();
            l.getAutor().imprimirAutor();
        }
    }

    public static void cadastrarEbook(int quantidade, Scanner s) {
        System.out.println("\nQuantidade: " + quantidade);

        for (int i = 0; i < quantidade; i++) {
            Ebook ebook = new Ebook();
            System.out.println("\nEntre com o nome do livro:");
            ebook.setNome(s.nextLine());
            System.out.println("\nEntre com o ISBN do livro:");
            ebook.setISBN(s.nextLine());
            System.out.println("\nEntre com o formato do livro");
            ebook.setFormato(s.nextLine());
            ebook.setAutor(cadastraAutor(s));
            ebooks.add(ebook);
        }
        for (Ebook i : ebooks) {
            System.out.println("\n");
            i.imprimirDadosLivros();
            i.getAutor().imprimirAutor();
        }
    }

    public static void listarLivros(int quantidade, Scanner s) {

    }

    public static Autor cadastraAutor(Scanner s) {
        Autor autor = new Autor();
        System.out.println("\nEntre com o nome do autor: ");
        autor.setNomeAutor(s.nextLine());
        System.out.println("\nEntre com Email do autor: ");
        autor.setEmailAutor(s.nextLine());
        System.out.println("\nEntre com o CPF do autor: ");
        autor.setCpfAutor(s.nextLine());

        return autor;
    }

    public static void main(String[] args) {
        // TODO code application logic here

        /*
        1 - Scanner
        2 - Perguntar  que tipo de livro? E-book ou livro fisico?
        3 - Perguntar quantos livros quer cadastrar?
         */
        Scanner s = new Scanner(System.in);
        chamaCadastro(s);

        /*
        No projeto: menu com opcao de incluir, listar e reajustar livro - fizemos durante as aulas!!
        Em exercicio anterior.. sem arraylist
        Agora tem que utilizar arraylist
         */
    }

}
