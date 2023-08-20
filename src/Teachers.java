public class Teachers extends Persons{

    protected String teacherId;

    public Teachers(String name, int age, String teacherId) {
        super(name, age);
        this.teacherId = teacherId;
    }

    @Override
    public void showInformation() {
        System.out.println("Teacher: " + name + age + teacherId);

    }

    @Override
    public String toString() {
        return "Teachers{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}
