package Entities;

import java.util.UUID;

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

    public String generatePassword(){

        String result = UUID.randomUUID().toString().replace("-", "").substring(0, 30);

        return result;
    }
}
