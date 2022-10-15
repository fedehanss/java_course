package topics;

public class ElseIf {
    public String checkScore(int a){

        int aGrade = 8;
        int bGrade = 4;
        int cGrade = 2;

        if (a >= aGrade) {
            return "Your score is 'A'.";
        } else if (a >= bGrade) {
            return "your score is 'B'.";
        } else if (a >= cGrade) {
            return "your score is 'C'.";
        } else return "You are suspended from classes.";

    }
}
