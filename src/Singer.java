public class Singer extends Person{

    private String bandName;

    public Singer( String bandName) {

        this.bandName = bandName;
    }
    public Singer(){

    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    public void singing(){
        System.out.println("I am singing");
    }
    public void playGuitar(){
        System.out.println("I am playing guitar");
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
        return "My name is: "+" "+getName()+","+"and i am singer at:"+" "+bandName;
    }
}
