/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulaJava;

import java.util.Scanner;

/**
 *
 * @author aleix
 */
public class Produto3Num {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int number1, number2, number3;
        
        System.out.print("Digite o primeiro número: ");
        number1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        number2 = entrada.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        number3 = entrada.nextInt();
        
        int prod = number1 * number2 * number3;
        
        System.out.println("O produto é: "+ prod);
    }
}
