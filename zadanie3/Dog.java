package zadanie3;

public class Dog  extends Animal {
    public Dog(String name) {
        super (name);
    }

    public String votesCast(){
        return "Подать голос";
    }

    public String jump() {
        return "Прыгать";
    }

    public String run() {
        return "Бегать";
    }

    public String bite() {
        return "Кусать";
    }
}