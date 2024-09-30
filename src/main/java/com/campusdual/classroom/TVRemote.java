package com.campusdual.classroom;


public class TVRemote {
int channel;
int volume;
boolean on;
String color;
public TVRemote(String color){
    this.channel = 1;
    this.volume = 21;
    this.color = color;
    this.on = false;
}

    public static void main(String[]args){
        TVRemote redRemote = new TVRemote("Vermello");
        TVRemote blackRemote = new TVRemote("Negro");
        redRemote.turnOn();
        redRemote.channelUp();
        System.out.println("Canal actual: " + redRemote.channel);
        redRemote.channelDown();
        System.out.println("Canal actual: " + redRemote.channel);
        redRemote.channelDown();
        System.out.println("Canal actual: " + redRemote.channel);
        redRemote.volumeUp();
        System.out.println("Volumen actual. " + redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Volumen actual: " + redRemote.volume);
        for (int i = 1; i < 22; i++){
            redRemote.volumeDown();
        }
        System.out.println("Volumen actual: " + redRemote.volume);
        redRemote.volumeDown();
        System.out.println("Volumen actual: " + redRemote.volume);
        System.out.println("Color del control remoto: " + redRemote.getColor());
        redRemote.turnOff();
    }

    public void volumeUp() {
    if (!this.on){
        this.turnOn();
    }
    if (this.volume < 100) {
        this.volume++;
    }
    }

    public boolean turnOn(){
    this.on = true;
    return this.on;
}
public boolean turnOff(){
    this.on = false;
    return this.on;
}
public void channelUp() {
    if (!this.on) {
        this.turnOn();
    }
        this.channel++;
    }

    public void channelDown() {
        if (!this.on) {
            this.turnOn();
        }
        if (this.channel > 1) {
            this.channel--;
        }
    }

    public void volumeDown(){
        if (!this.on) {
            this.turnOn();
        }
        if (this.volume > 0) {
            this.volume--;
        }
    }

    public String getColor(){
    return this.color;
}
}




