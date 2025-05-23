package quiz_core_java_project1;

public class Question {
    private int id;
    private String question;
    private String opt1;
    private String opt2;
    private String opt3;
    private String answer;
    public Question(int id, String question, String opt1, String opt2, String opt3, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.answer = answer;
    }
    public String getOpt1() {
        return opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public int getId() {
        return id;
    }
    public String getQuestion() {
        return question;
    }
    public String getAnswer() {
        return answer;
    }
    @Override
    public String toString() {
        return "Question [id=" + id + ", question=" + question + ", opt1=" + opt1 + ", opt2=" + opt2 + ", opt3=" + opt3
                + ", answer=" + answer + "]";
    }
}
