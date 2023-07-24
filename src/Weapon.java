public class Weapon {
    private int damageOutput;
    private int price;
    private boolean isOneHanded;
    private boolean singleOperator;
    private int durability;
    private String damageType;

    public Weapon(int damageOutput, int price, boolean isOneHanded, boolean singleOperator, int durability, String damageType) {
        this.damageOutput = damageOutput;
        this.price = price;
        this.isOneHanded = isOneHanded;
        this.singleOperator = singleOperator;
        this.durability = durability;
        this.damageType = damageType;
    }

    public Weapon(int damageOutput, int price) {
        this.damageOutput = damageOutput;
        this.price = price;
    }

    public int getDamageOutput() {
        return damageOutput;
    }

    public void setDamageOutput(int damageOutput) {
        this.damageOutput = damageOutput;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isOneHanded() {
        return isOneHanded;
    }

    public void setOneHanded(boolean oneHanded) {
        isOneHanded = oneHanded;
    }

    public boolean isSingleOperator() {
        return singleOperator;
    }

    public void setSingleOperator(boolean singleOperator) {
        this.singleOperator = singleOperator;
    }

    public int getDurability() {
        return durability;
    }

    public void setDurability(int durability) {
        this.durability = durability;
    }

    public String getDamageType() {
        return damageType;
    }

    public void setDamageType(String damageType) {
        this.damageType = damageType;
    }
}
