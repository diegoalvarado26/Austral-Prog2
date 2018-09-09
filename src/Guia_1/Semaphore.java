package Guia_1;

public class Semaphore {
    //TODO preguntarle a Bauti sobre esto.

    private long redDuration, greenDuration, yellowDuration;

    private float lightTime;
    private Light currentLight;

    enum Light{
        RED, YELLOW, GREEN;
    }

    public Semaphore(float lightTime, Light currentLight){
        this.lightTime = lightTime;
        this.currentLight = Light.RED;
    }

}
