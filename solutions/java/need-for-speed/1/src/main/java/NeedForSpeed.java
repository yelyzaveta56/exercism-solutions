class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int distanceDriven = 0;
    private int batteryLevel = 100;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public int getSpeed() {
        return speed;
    }

    public int getBatteryDrain(){
        return batteryDrain;
    }

    public int getBatteryLevel(){
        return batteryLevel;
    }
    

    public boolean batteryDrained() {
        return batteryLevel < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if(batteryLevel >= batteryDrain){
            distanceDriven += speed;
            batteryLevel -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        return (car.getBatteryLevel() / car.getBatteryDrain()) * car.getSpeed() >= distance;
            
        
    }
}
