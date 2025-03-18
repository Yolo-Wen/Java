package textClass.Interface;

public class Person {
    protected String Name;
    protected int Age;
    public Person(){}
    public Person(String name, int age){
        this.Name = name;
        this.Age = age;
    }

    public void setName(String name) {
        this.Name = name;
    }
    public void setAge(int age){
        this.Age = age;
    }

    public String getName(){
        return this.Name;
    }
    public int getAge() {
        return Age;
    }

    public void run(){
        System.out.println("I am running");
    }
    public void eat(String food){
        System.out.println("I am eating "+food);
    }
}
