package Entities;

import java.security.SecureRandom;

public class Password {
    
    private String passWord;

    public Password(){

    }

    public Password(String passWord){
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

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
