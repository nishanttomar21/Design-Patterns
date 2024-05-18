package Builder;

public class Student {
    String name;
    Integer age;
    Double psp;

    private Student(Builder builder) {
        // Validation
        if (builder.age < 30)
            System.out.println("You are under 30!");

        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    public Integer getAge() {
        return this.age;
    }

    public Double getPsp() {
        return this.psp;
    }

    public String getName() {
        return this.name;
    }

    public static class Builder {
        String name;
        Integer age;
        Double psp;

        public Builder setName(String value) {
            this.name = value;
            return this;
        }

        public Builder setAge(Integer value) {
            this.age = value;
            return this;
        }

        public Builder setPsp(Double value) {
            this.psp = value;
            return this;
        }

        public Student build() {
            // Do validation here, before creating the new Student object
            // ...

            return new Student(this);
        }
    }
}
