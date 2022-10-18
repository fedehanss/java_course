package topics;

public class IfStatements{

    public static int bonusCalculator(int salary, int bonus, int sales) {

        int quotaForBonus = 10;

        if (sales > quotaForBonus) {
        return salary + bonus;
        } else {
            return salary;
        }
    }
}