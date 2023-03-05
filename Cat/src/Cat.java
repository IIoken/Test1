public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    public Cat() {
        this(3000, "Barsik", age, color = "Grey");
    }
    public Cat(double weight, String name, int age, String color) {
        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        this.weight -= 20;
    }

    void eat() {
        this.weight += 50;
    }


}