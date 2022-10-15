package topics;

public class NestedIf {
    public static String loanOperator(int salary, int serviceTimeInMonth){

        int minSalary = 30000;
        int minServiceTime = 24;

        if(salary > minSalary){
            if(serviceTimeInMonth >= minServiceTime){
                return "You have been granted a loan with us.";
            } else {return "you need more than " + minServiceTime + " months of service to qualify to a loan.";}
        } return "You need minimum annual income of " + minSalary + " to qualify to a loan.";
    }
}
