public class Students extends Persons{

    private String id;

    public Students(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public void showInformation() {
        System.out.println("Student: " + name + age + id );

    }

    @Override
    public String toString() {
        return "Students{" +

                " name='" + name + '\'' +
                ", age=" + age +
                " id='" + id + '\'' +
                '}';
    }
}
