package ua.university;

public class CardPayment implements PaymentMethods {

    // alt + enter = implements method
    @Override
    public void pay(double amount) {
        if (amount > 25000) {
            throw new RuntimeException("Ліміт для карточки");
        }

        System.out.println("Paid with card" + amount);
    }
}
