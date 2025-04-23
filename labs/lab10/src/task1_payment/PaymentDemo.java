package task1_payment;

public class PaymentDemo {
    public static void main(String[] args) {
        PaymentMethod credit = PaymentMethod.CREDIT_CARD;
        credit.pay(150.0);

        PaymentMethod paypal = PaymentMethod.PAYPAL;
        paypal.pay(0);

        PaymentMethod cash = PaymentMethod.CASH;
        cash.pay(40.5);
    }
}