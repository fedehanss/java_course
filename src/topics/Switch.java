package topics;

public class Switch {

    public static String gradeChecker(String a){

         String message;

         switch (a) {
            case "A" -> message = "Great job!";
            case "B" -> message = "You did a good exam";
            case "C" -> message = "You'll do better next time";
            case "D" -> message = "You scored to low";
            default ->  message = "Enter a grade ('A', 'B', 'C' or 'D')";
        } return message;
    }
}
