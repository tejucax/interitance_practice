public class Animal {
    protected int weight;
    protected int age;
    public void running() {
        System.out.println("tugudugudug!");
    }
    public void eating() {
        System.out.println("chompchomp!");
    }

    public Animal(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Felidae extends Animal {
    public Felidae(int weight, int age) {
        super(weight, age);
    }

    public void sound() {
        System.out.println("Meow Meow Meow");
    }
}

class Tiger extends Felidae {
    public Tiger(int weight, int age) {
        super(weight, age);
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger(56, 5);
        tiger.sound();
        System.out.println("Weight is"+" "+tiger.weight);
        System.out.println("Age is"+" "+tiger.age);
    }
}