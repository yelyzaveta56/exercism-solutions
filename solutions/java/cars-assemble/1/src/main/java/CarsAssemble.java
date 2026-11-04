public class CarsAssemble {

    
    public double productionRatePerHour(int speed) {
        int lowestSpeed = speed * 221;
        
        if(speed >= 1 && speed < 5){
            return lowestSpeed * 1;
        }else if( speed >= 5 && speed < 9){
            return lowestSpeed * 0.9;
        }else if(speed == 9){
            return lowestSpeed * 0.8;
        }else{
            return lowestSpeed * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int)productionRatePerHour(speed) / 60;
    }
}
