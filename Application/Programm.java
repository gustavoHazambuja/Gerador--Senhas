package Application;

import java.util.Scanner;

import Entities.Password;

public class Programm {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        Password pass = new Password();

        System.out.println("Defina o tamanho da senha:");
        int length = dados.nextInt();

        System.out.println("Senha geradada: " + pass.generatedPassword(length));

        dados.close();

      
    }
}
