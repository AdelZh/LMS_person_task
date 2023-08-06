public class Person {

    private String name;


    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void learn(){
        System.out.println("I am learning");
    }
    public void walk(){
        System.out.println("I am walking");

    }
    public void eat(){
        System.out.println("I am eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

