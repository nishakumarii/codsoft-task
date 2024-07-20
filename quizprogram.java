import java.util.Scanner;

public class quizprogram {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int score = 0;

        //quiz question
        String[] questions = {
                "1.  Who is the father of Computers ? ",
                "2.  What is the full form of CPU ? ",
                "3. what is the brain of Computer system called ? ",
                "4. what does RAM stand for ?",
                "5. Which of the following is the smallest unit of memory ?"
        };
    String[][] options = {
            {"A. Dennis Ritchie", "B. Bill Gates", "C. Charles Babbage", "D. James Gosling"},
            {"A.Central processing unit ", "B. control processing unit", "C. computer processing unit ", "D.computer programming unit"},
            {"A. RAM ", "B. CPU", "C. GPU ", "D. none of the above"},
            {"A. Random Acess Memeory ", "B. Reallocate automatic memory", "C. Remote access memory ", "D. none of the above"},
            {"A. Byte", "B. Bit ", "C. Nibble", "D.Kb"}
    };
    char[] answer = {'C','A','B','A','B'};
    //timer for question
        int timeLimit = 5;
        //quiz logic
        for (int i=0; i < questions.length; i++){
            System.out.println(questions[i]);
            for (String option : options[i]){
                System.out.println(option);
            }
            System.out.print("Your Answer : ");
            char useranswer = input.next().toUpperCase().charAt(0);
            if (useranswer == answer[i]){
                System.out.println("correct \n");
                score++;
            }
            else {
                System.out.println("Incorect. The correct answer is " + answer[i] + "\n");
            }
        }
        //display result
        System.out.println("quiz completed");
        System.out.println("your score:" + score + "/" +questions.length);

        input.close();
    }
}
