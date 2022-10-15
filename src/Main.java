import topics.ElseIf;
import topics.IfStatements;

import static topics.GrossPayCalc.*;
import static topics.IfStatements.*;
import static topics.NestedIf.*;
import static topics.Switch.*;
import static topics.While.*;
import static topics.ForLoop.*;
public class Main {
    static int calculateTwoNumbers(int a, int b) {
        return a * b;
    }
    public static void main(String[] args) {
                                                                                                      //SALARYCALC COMES FROM GROSSPAYCALC
        int salaryResult = bonusCalculator(salaryCalculator(120, 70), 800, 11);     //BONUS CALC COMES FROM IFSTATEMENTS
        System.out.println(salaryResult);

        String loan1 = loanOperator(31000, 23);
        System.out.println(loan1);

        ElseIf myGradeEval = new ElseIf();      //OBJECT WAS INSTANTIATED BECAUSE THE METHOD IS NOT STATIC.

        String grade1 = myGradeEval.checkScore(1);    //FROM ELSEIF CLASS
        System.out.println(grade1);


        String gradeMessage = gradeChecker("A");             //USES A SWITCH
        System.out.println(gradeMessage);

        myLoop(0,5);        //SIMPLE WHILE LOOP

        myForLoop();
        loopNestedArray();
        loopNestedWithEnhanced();

        System.out.println(calculateTwoNumbers(2, 4));          //CREATED WITHIN THIS CLASS

    }
}