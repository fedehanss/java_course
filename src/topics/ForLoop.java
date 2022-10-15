package topics;

public class ForLoop {

    public static int[] myNum = {10, 20, 30, 40};
    public static String[][] myNestedArray = {{"potato", "banana"}, {"cherry", "apple", "grapes"}, {"kiwi"} };

    public static void myForLoop(){                 //LOOPING myNum WITH A SIMPLE LOOP
        for (int i = 0; i < myNum.length; i++) System.out.println(myNum[i]);
    }

    public static void myEnhancedForLoop(){         //LOOPING myNum WITH AN ENHANCED LOOP
        for (int j : myNum) System.out.println(j);
    }
    public static void loopNestedArray(){                   //LOOPING myNestedArray WITH A SIMPLE NESTED LOOP
        for (int i = 0; i < myNestedArray.length; i++){
            for (int j = 0; j < myNestedArray[i].length; j++){
                System.out.println(myNestedArray[i][j]);
            }
        }
    }
    public static void loopNestedWithEnhanced(){        //LOOPING myNestedArray WITH AN ENHANCED NESTED LOOP
        for (String[] i : myNestedArray) {
            for (String j : i) {
                System.out.println(j);
            }
        }
    }



}
