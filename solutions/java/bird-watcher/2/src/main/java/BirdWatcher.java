
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
        for(int birds : birdsPerDay){
            if(birds == 0){
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int birdsCounter = 0;

        int limit = Math.min(numberOfDays, birdsPerDay.length);
        for(int i = 0; i < limit; i++){
            birdsCounter += birdsPerDay[i];
        }
        return birdsCounter;
    }

    public int getBusyDays() {
        int busyDaysCounter = 0;
        for(int birds : birdsPerDay){
            if(birds >= 5){
                busyDaysCounter++;
            }
        }
        return busyDaysCounter;
    }
}
