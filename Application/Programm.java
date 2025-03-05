package Application;

import java.util.Scanner;

import Service.PasswordService;

public class Programm {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        PasswordService passwordService = new PasswordService();

        System.out.println("Defina o tamanho da senha:");
        int length = dados.nextInt();

        System.out.println("Senha geradada: " + passwordService.generatedPassword(length));  

        dados.close();

      
    }
}
