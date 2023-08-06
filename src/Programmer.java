public class Programmer extends Person {

    private String companyName;



    public Programmer(String companyName) {

        this.companyName = companyName;

    }
    public Programmer(){

    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public void coding(){
        System.out.println("I am coding");
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
        return "My name is:"+ " " +getName()+","+"and i am working in: "+getCompanyName();
    }
}
