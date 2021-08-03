package com.adauricampos.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("Seu nome completo: "+ nomeCompleto);

        System.out.println("Digite seu  primeiro nome: ");
        String primeiroNome = scan.nextLine();
        System.out.println("Seu primeiro nome é: " + primeiroNome);

        System.out.println("Digite a sua idade:");
        int idade = scan.nextInt();
        System.out.println("Sua idade é: " + idade);

        System.out.println("Digite a sua altura:");
        double altura = scan.nextDouble();
        System.out.println("A sua altura é: " + altura);

        System.out.println("Digite o seu primeiro nome, idade, quantidade de filhos, altura e set tem bichinho de estimação");
        primeiroNome = scan.next();
        idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        altura = scan.nextFloat();
        boolean temPet = scan.hasNextBoolean();

        System.out.println("Você digitou so seguintes valores:");
        System.out.println("Primeiro nome: " + primeiroNome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bichinho de estimação? " + temPet);


    }


}
