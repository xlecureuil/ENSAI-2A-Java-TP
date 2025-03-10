package fr.ensai.library;

public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Student extends Person {
    private int academicYear;
    private boolean isClassDelegate;

    public Student(String name, int age, int academicYear, boolean isClassDelegate) {
        super(name, age);
        this.academicYear = academicYear;
        this.isClassDelegate = isClassDelegate;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", academicYear=" + academicYear + ", isClassDelegate="
                + isClassDelegate + "}";
    }
}
