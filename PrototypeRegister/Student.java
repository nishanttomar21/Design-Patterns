package PrototypeRegister;

public class Student implements Prototype {
    private Integer id;
    private String name;
    private String batch;
    private Double psp;

    public Student() {}

    public Student(Student other) {
        this.id = other.id;
        this.name = other.name;
        this.batch = other.batch;
        this.psp = other.psp;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatch() {
        return this.batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public Double getPsp() {
        return this.psp;
    }

    public void setPsp(Double psp) {
        this.psp = psp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
