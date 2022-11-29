package com.company;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int Casos;

        System.out.println("1 - Dobrar numero \n" +
                           "2 - Calcular comissão \n" +
                           "3 - Calcular área \n" +
                           "4 - Calcular desconto \n" +
                           "5 - Calcular real para Dollar \n" +
                           "6 - Calcular preço carpete \n" +
                           "7 - Calcular IMC \n" +
                           "8 - Calcular Juros\n" );
        Casos = ler.nextInt();


       switch (Casos) {
           case 1:

               System.out.println("Qual é seu numero :");
               int numb1;

               numb1 = ler.nextInt();

               System.out.println("O Dobro do seu numero é : " + (numb1 + numb1));
                break;

           case 2:

               double vendas;
               double comissao;

               System.out.println("Qual foi o valor das vendas : ");
               vendas = ler.nextFloat();

               comissao = vendas * 0.1;

               System.out.println("Sua comissão é de : " + comissao);
                break;
           case 3:

               double comprimento;
               double largura;
               double metrosQuadrados;

               System.out.println("Qual comprimento :");
               comprimento = ler.nextFloat();

               System.out.println("Qual largura :");
               largura = ler.nextDouble();

               metrosQuadrados = largura * comprimento;

               System.out.println("Metros Quadrados :" + metrosQuadrados);
                break;


           case 4:

               float desconto;
               double valorCompra;

               System.out.println("Qual valor da compra: ");
               valorCompra = ler.nextDouble();

               System.out.println("Qual valor do desconto: ");
               desconto = ler.nextFloat();

               System.out.println("Valor da compra com desconto é: " + valorCompra * desconto);
               break;

           case 5:

               double real;
               double dollar = 0.2;
               double calculo;

               System.out.println("Quantos reais deseja transformar :");
               real = ler.nextFloat();

               calculo = dollar * real;

               System.out.println("Você tem :" + calculo + " Dollar's");
               break;

           case 6:

               double precoCarpete;
               double comprimeto;
               double Largura;

               System.out.println("Qual valor do metro quadrado do carpete :");
               precoCarpete = ler.nextDouble();

               System.out.println("Qual comprimeto: ");
               comprimeto = ler.nextDouble();

               System.out.println("Qual a largura :");
               Largura = ler.nextDouble();

               System.out.println("O preço total é de : " + comprimeto * Largura * precoCarpete);
               break;

           case 7:

               double altura;
               double peso;
               double IMC;

               System.out.println("Qual sua altura: ");
               altura = ler.nextDouble();

               System.out.println("Qual seu peso: ");
               peso = ler.nextDouble();

               IMC = (peso / Math.pow(altura, 2));

               System.out.println("Seu IMC é de: " + IMC);

               if(IMC <= 18.5) {
                   System.out.println("Abaixo do peso");
               } else if (IMC <= 24.9) {
                   System.out.println("Peso normal");
               } else if(IMC <= 29.9){
                   System.out.println("Excesso de peso");
               } else if (IMC >= 30){
                   System.out.println("Obesidade");
               } else if (IMC >=35) {
                   System.out.println("Obesidade extrema");
               }

               break;

           case 8:

               double C;
               double J;
               double M;

               double calculoX;

               System.out.println("Qual seu capital: ");
               C = ler.nextDouble();

               System.out.println("Qual taxa em juros :");
               J = ler.nextDouble();

               System.out.println("Qual periodo de aplicação: ");
               M = ler.nextDouble();

               calculoX = 1 + J/100;

               System.out.println("Seu montante é de: " + C*( Math.pow(calculoX , M )));

       }
    }
}