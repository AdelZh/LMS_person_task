// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Programmer programmer=new Programmer();
        programmer.setName("Adel");
        programmer.setCompanyName("Google");

        Dancer dancer=new Dancer();
        dancer.setName("Aziz");
        dancer.setGroupName("Non Stop");

        Singer singer=new Singer();
        singer.setName("Elina");
        singer.setBandName("Ak Kuu");

        System.out.println(programmer.toString());
        System.out.println(dancer);
        System.out.println(singer);

        System.out.println(programmer.getName());
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();


        System.out.println("----------------");
        System.out.println(dancer.getName());
        dancer.dancing();
        dancer.eat();
        dancer.learn();
        dancer.walk();

        System.out.println("-----------------");
        System.out.println(singer.getName());
        singer.playGuitar();
        singer.eat();
        singer.learn();
        singer.singing();
        singer.walk();
    }
}