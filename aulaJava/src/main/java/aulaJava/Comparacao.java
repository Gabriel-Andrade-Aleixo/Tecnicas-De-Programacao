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
public class Comparacao {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int number1, number2;
        System.out.print("Digite o´primeiro número: ");
        number1 = entrada.nextInt();
        
        System.out.print("Digite o´primeiro número: ");
        number2 = entrada.nextInt();
        
        if (number1 == number2){
            System.out.printf("%d == %d %n", number1, number2);
        }
        if (number1 != number2){
            System.out.printf("%d != %d %n", number1, number2);
        }
        if (number1 < number2){
            System.out.printf("%d < %d %n", number1, number2);
        }
        if (number1 > number2){
            System.out.printf("%d > %d %n", number1, number2);
        }
        if (number1 <= number2){
            System.out.printf("%d <= %d %n", number1, number2);
        }
        if (number1 >= number2){
            System.out.printf("%d >= %d %n", number1, number2);
        }
        
    }
}
