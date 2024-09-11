/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

import java.util.Scanner;

/**
 *
 * @author aleix
 */
public class testeConta1 {
    public static void main(String[] args) {
        //Criar um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);
        String name;

        //Cria um objeto Conta1 e o atribui a minhaConta
        conta1 minhaConta = new conta1();

        //Exibe o valor inicial do nome
        System.out.printf("O nome inicial é: %s%n%n", minhaConta.getName());

        System.out.print("Entre com o nome: ");
        name = input.nextLine();
        minhaConta.setName(name);
        
        System.out.printf("O nome do objeto em minhaConta é: %n%s", minhaConta.getName());
    }
}
