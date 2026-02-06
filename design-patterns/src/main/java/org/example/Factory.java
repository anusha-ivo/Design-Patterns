package org.example;

public class Factory {
    public static Notification show(String msg){
        if(msg.equalsIgnoreCase("email")){
            return new Emailnotify();
        }
        if(msg.equalsIgnoreCase("spam")){
            return new Spamnotify();
        }
        return null;
    }
}
