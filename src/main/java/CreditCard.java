public abstract class CreditCard {
    private int debt;
    public int amount;

    public CreditCard(int debt) {
        this.debt = debt; //don't forget the constructor !!! Otherwise, you cannot pass the parameter through in Customer.java! //
    }

    public int getDebt() {
        return debt;
    }

    public void setDebt(int newDebt) {
        this.debt = newDebt;
    }

    public void pay(int amount) {
        this.debt += amount;
    }
}
