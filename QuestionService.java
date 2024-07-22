package quiz_core_java_project1;
import java.util.Scanner;
public class QuestionService 
{
Question questions[]=new Question[3];
public QuestionService()
{
    questions[0]=new Question(1,"national bird of india","hen","eagle","peacock","peacock");
    questions[1]=new Question(2,"national flower of india","lily","Lotus","jasmine","Lotus");
    questions[2]=new Question(3,"national animal of india","Tiger","cow","hippo","Tiger");

}
public void playQuiz()
{  int correct=0;
     for ( Question q : questions)
    {
        System.out.println(q.getId());
        System.out.println(q.getQuestion());
        System.out.println(q.getOpt1());
        System.out.println(q.getOpt2());
        System.out.println(q.getOpt3());
        Scanner sc=new Scanner(System.in);
        String ans=sc.nextLine();
        if(ans.equals(q.getAnswer()))
        {
            System.out.println("you got a point!");
            correct+=1;
        }
        else
        {
            System.out.println("Incorrect Answer. Please try again ;)");
        }
    }
    System.out.println("you got"+ " "+ correct +" " + "out of 3");
}
}
