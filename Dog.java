public class Dog implements Comparable<Dog> {
    private String name;
    private Integer age;
    private String breed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBreed() {
        return name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog(String name, Integer age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    @Override
    public String toString() {
        return String.format("Dog: %s, age: %d, breed: %s", name, age, breed);
    }

    public int compareTo(Dog o) {
        if (this.age > o.age)
            return 1;
        else if (this.age < o.age)
            return -1;
        else
            return 0;
    }

}
