class Darts {
    int score(double xOfDart, double yOfDart) {
        double formula = Math.sqrt(xOfDart * xOfDart + yOfDart * yOfDart);
       if( formula <= 1){
           return 10;
       }else if(formula > 1 && formula <= 5){
           return 5;
       }else if(formula > 5 && formula <= 10){
           return 1;
       }else{
           return 0;
       }
    }
}
