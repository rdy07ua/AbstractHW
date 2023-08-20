public abstract class Persons {

    protected String name;
    protected int age;

    public Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void showInformation();

}
