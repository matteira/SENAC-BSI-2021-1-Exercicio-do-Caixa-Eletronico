
/*Crie um algoritmo de caixa eletrônico que dispense o menor número de notas para um dado valor solicitado.

Notas disponíveis:

R$ 100,00 R$ 50,00 R$ 20,00 R$ 10,00 R$ 5,00 R$ 2,00 R$ 1,00

Enviar a resposta via Pull Request! 

Aluno: Gabriel Mattos costa

*/

package heredia;

import java.util.Scanner;

public class exercicioHeredia1 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor que você deseja sacar. ");
        double valor = leitor.nextDouble();
        
        double nota100 = 100;
        double nota50 = 50;
        double nota10 = 10;
        double nota5 = 5;
        double nota2 = 2;	
    
        if(valor >= 2) {
                  if(nota100 > 0) {
                nota100 = valor / 100; 
                valor = valor % 100;   
                System.out.println(nota100 + " notas de 100");
                } if(nota50 > 0) {
                nota50 = valor / 50;
                valor = valor % 50;
                System.out.println(nota50 + " notas de 50");
                } if(nota10 > 0) {
                nota10 = valor / 10;
                valor = valor % 10;
                System.out.println(nota10 + " notas de 10");
                } if(nota5 > 0) {
                nota5 = valor / 5;
                valor = valor % 5;
                System.out.println(nota5 + " notas de 5");
                } if(nota2 > 0) {
                nota2 = valor / 2;
                valor = valor % 2;
                System.out.println(nota2 + " notas de 1");
                 }
                } else {
             System.out.println("Não é possível realizar o saque");
        }	

    }
}
