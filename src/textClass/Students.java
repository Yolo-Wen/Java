package textClass;

import textClass.Interface.Person;

public class Students extends Person {
    private int score;
    public Students(){}
    public Students(String name, int age, int score) {
        super(name,age);
        this.score = score;
    }
    public  void setScore(int score){
        this.score = score;
    }
    public  int getScore(){
        return this.score;
    }
    private void study(){
        System.out.println("学生正在学习");
    }
    @Override
    public void run() {
        System.out.println("学生在跑步");
    }
}
