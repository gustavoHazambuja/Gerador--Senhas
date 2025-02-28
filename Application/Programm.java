package Application;

import Entities.Password;

public class Programm {
    public static void main(String[] args) {
        
        Password pass = new Password();

        String passGenerate = pass.generatePassword();

        System.out.println("Senha gerada: " + passGenerate);
    }
}
