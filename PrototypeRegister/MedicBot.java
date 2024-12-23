package PrototypeRegister;

public class MedicBot implements Bot<MedicBot> {
    private String name;

   public MedicBot(String name) {
        this.name = name;
    }

    @Override
    public MedicBot cloneBot() {
        System.out.println("MedicBot is being cloned");
        return new MedicBot(this.name);
    }

    @Override
    public void performTask() {
        System.out.println("MedicBot is performing task");
    }
}
