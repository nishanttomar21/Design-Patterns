package PrototypeRegister;

public class IntelligentStudent extends Student {
    private Integer iq;

    public IntelligentStudent() {
    }

    public IntelligentStudent(IntelligentStudent other) {
        super(other);
        this.iq = other.iq;
    }

    public Integer getIq() {
        return iq;
    }

    public void setIq(Integer iq) {
        this.iq = iq;
    }

    @Override
    public IntelligentStudent clone() {
        return new IntelligentStudent(this);
    }
}
