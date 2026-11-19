public class QuizGrader {
    public static void main(String[] args) {

        //Ito yung tamang sagot sa bawat tanong
        char[] answerKey = { 'A', 'C', 'B', 'D', 'A', 'C', 'C', 'B', 'A', 'D'
        };
        //Ito naman yung mga sagot ng isang estudyante
        char[] studentAnswers = { 'A', 'B', 'B', 'D', 'C', 'C', 'C', 'B', 'A', 'A'
        };

        //Dito bibilangin kung ilan yung tamang sagot
        int correctCount = 0;
        //Iche-check dito bawat sagot kung parehas sa answer key
        for (int i = 0; i < answerKey.length; i++) {

            if (studentAnswers[i] == answerKey[i]) {
                //Kapag tama dagdagan ng isa yung score
                correctCount++;
            } else {
                //Kapag mali ipapakita kung ano yung sagot ng student at tamang sagot
                System.out.println("Question " + (i + 1)
                        + ": Incorrect. You answered '"
                        + studentAnswers[i] + "', correct answer is '"
                        + answerKey[i] + "'");
            }
        }
        //Kinukuha dito yung percentage ng score
        double scorePercentage =
                (double) correctCount / answerKey.length * 100;

        //Ipapakita dito yung final quiz results
        System.out.println("\n--- Quiz Results ---");
        System.out.println("Correct Answers: "
                + correctCount + "/" + answerKey.length);
        System.out.println("Score: " + scorePercentage + "%");

        //Kapag 70% pataas pasado at kapag mas mababa naman ay bagsak
        if (scorePercentage >= 70.0) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
