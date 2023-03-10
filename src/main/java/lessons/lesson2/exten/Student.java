package lessons.lesson2.exten;

class Student extends Human{
    private String group;

    public Student(String group, String name, int age) {
        super(name, age);
        this.group = group;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "group='" + group + '\'' +
                "} " + super.toString();
    }
}
