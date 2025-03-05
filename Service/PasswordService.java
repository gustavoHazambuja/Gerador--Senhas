package Service;

import java.security.SecureRandom;

import Entities.Password;

public class PasswordService {
    Password password = new Password();


    public String generatedPassword(int length){

        String caracters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+";

        SecureRandom random = new SecureRandom();

        StringBuilder senha = new StringBuilder();

        for(int i = 0; i<length; i++){
            int index = random.nextInt(caracters.length());
            char caracter = caracters.charAt(index);

            senha.append(caracter);
        }

        return senha.toString();
    }
}
