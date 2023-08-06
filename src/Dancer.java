public class Dancer extends Person{



    private String groupName;

    public Dancer( String groupName) {

        this.groupName = groupName;
    }
    public Dancer(){

    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public void dancing(){
        System.out.println("I am dancing");
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public String toString() {
        return "My name is: "+getName()+","+"and i am dancer in group called:"+" "+groupName;
    }
}

