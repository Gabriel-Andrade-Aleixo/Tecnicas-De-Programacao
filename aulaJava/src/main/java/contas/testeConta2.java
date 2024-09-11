/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contas;

/**
 *
 * @author aleix
 */
//Usando o construtor de conta2 para inicializar a instancia name no momento em que cada objeto conta2 é criado
public class testeConta2 {
    public static void main(String[] args){
        //cria dois objetos conta2
        Conta2 minhaConta1 = new Conta2("Gabriel");
        Conta2 minhaConta2 = new Conta2("Andrade");
        
        System.out.printf("Os nomes dos objetos são: %s %s", minhaConta1.getName(), minhaConta2.getName());
   }
}
