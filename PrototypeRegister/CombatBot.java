package PrototypeRegister;

public class CombatBot implements Bot<CombatBot> {
    private String name;

    public CombatBot(String name) {
        this.name = name;
    }

    @Override
    public CombatBot cloneBot() {
        System.out.println("CombatBot is being cloned");
        return new CombatBot(this.name);
    }

    @Override
    public void performTask() {
        System.out.println("CombatBot is performing task");
    }
}
