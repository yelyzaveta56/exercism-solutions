
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
       return new int[] { 0, 2, 5, 3, 7, 8, 4 };
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length-1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[birdsPerDay.length-1]++;
    }

    public boolean hasDayWithoutBirds() {
        for(int i = 0; i < birdsPerDay.length; i++ ){
            if(birdsPerDay[i] == 0){
                return true;
            }
        }
        return false;
        
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsCounter = 0;

        if(numberOfDays > birdsPerDay.length){
            numberOfDays = birdsPerDay.length;
        }

        for(int i = 0; i < numberOfDays; i++){
            birdsCounter += birdsPerDay[i];
        }

        return birdsCounter;
    }

    public int getBusyDays() {
        int busyDaysCounter = 0;
        for(int bird : birdsPerDay){
            if(bird >= 5){
                busyDaysCounter++;
            }
        }
        return busyDaysCounter;
    }
}
