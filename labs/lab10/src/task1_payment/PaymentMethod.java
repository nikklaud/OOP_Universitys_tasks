package task1_payment;

import task1_payment.Payable;

public enum PaymentMethod implements Payable {
    CREDIT_CARD {
        private final PaymentProcessor processor = new PaymentProcessor() {
            public void process(double amount) {
                logTransaction(amount);
                System.out.println("Paid $" + amount + " with Credit Card.");
            }
        };

        public void pay(double amount) {
            if (processor.validateAmount(amount)) {
                processor.process(amount);
            } else {
                System.out.println("Invalid amount for Credit Card.");
            }
        }
    },
    PAYPAL {
        private final PaymentProcessor processor = new PaymentProcessor() {
            public void process(double amount) {
                logTransaction(amount);
                System.out.println("Paid $" + amount + " using PayPal.");
            }
        };

        public void pay(double amount) {
            if (processor.validateAmount(amount)) {
                processor.process(amount);
            } else {
                System.out.println("Invalid amount for PayPal.");
            }
        }
    },
    CASH {
        private final PaymentProcessor processor = new PaymentProcessor() {
            public void process(double amount) {
                logTransaction(amount);
                System.out.println("Paid $" + amount + " in Cash.");
            }
        };

        public void pay(double amount) {
            if (processor.validateAmount(amount)) {
                processor.process(amount);
            } else {
                System.out.println("Invalid amount for Cash.");
            }
        }
    };
}