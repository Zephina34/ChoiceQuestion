package task.choicequestion;

import java.util.Scanner;

public class ChoiceQuestion {

    public static void main(String[] args) {

        //instance to access the user method
        Question questionObj = new Question();

        //varibale to strore all the correct answetrs answered by the user
        String AllCorrectAnswers = "";

        //you can provide any number of Questions here along with the answer

        questionObj.setText("How many milligrams of coffee are in a cup?");
        questionObj.setAnswer("95");
        //displaying question for the user
        questionObj.display();
        //varible to store the user response
        String UserResponse = "";
        try (//scanner object for capturing user entered text
        Scanner sc = new Scanner(System.in)) {
            //Reading the User input
            UserResponse = sc.nextLine();
        }
        //checking wheather user response is correct or not
        if (questionObj.checkAnswer(UserResponse)) {
            System.out.println("Corect Answer!!!!");
            //storing the user correct answers in a varible with spaces
            AllCorrectAnswers = AllCorrectAnswers + " ";

        } else {
            System.out.println("Wrong Answer!!!!");
        }

    }
    //for displaying the All correct answers
    public void displayAllCorrecetAnswers(String AllCorrectAnswers) {
        System.out.println(AllCorrectAnswers);
    }
}