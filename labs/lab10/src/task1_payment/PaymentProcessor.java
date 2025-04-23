package task1_payment;

public abstract class PaymentProcessor {
    protected void logTransaction(double amount) {
        System.out.println("[LOG] Processing payment of $" + amount);
    }

    protected boolean validateAmount(double amount) {
        return amount > 0;
    }

    public abstract void process(double amount);
}