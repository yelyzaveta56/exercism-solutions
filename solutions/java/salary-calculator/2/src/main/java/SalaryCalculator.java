public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double result = daysSkipped >= 5 ? 0.85 : 1.0;    
        return result;
    }

    public int bonusMultiplier(int productsSold) {
        int result = productsSold >= 20 ? 13 : 10;
        return result;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {

        double finSalary = 1000.00 * salaryMultiplier(daysSkipped) + bonusForProductsSold(productsSold);

    
        return Math.min(finSalary, 2000.00);
        
    } 
}
