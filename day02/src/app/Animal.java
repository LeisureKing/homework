package app;

public abstract class Animal {
    public String name;
    public int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Animal() {
    }

    public abstract void eat();
    public abstract void bite(Animal animal);

    @Override
    public String toString() {
        return "Animal [name=" + name + ", weight=" + weight + "]";
    }

    
}