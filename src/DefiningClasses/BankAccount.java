package DefiningClasses;

public class BankAccount {
    // Променливи с думата "static", принадлежат само на класа в който са написани и се достъпват само ако са "public"
    private static double interestRate = 0.02;
    // Тези променливи или методи със "static" се достъпват директно чрез класа, а НЕ чрез обекта от класа
    private static int bankAccountCounter = 1; // Понеже с "static" променлива всеки път ще се увеличава с 1 когато създаваме
    // обект от класа "BankAccount" защото това е променлива, която принадлежи само към класа "BankAccount"

    private double balance;
    private int id; // Ще става равно на стойността на "bankAccountCounter" със всяко създаване на обект от класа "BankAccount"

    public BankAccount() {
        this.id = bankAccountCounter++;
    }

    public static void setInterestRate(double interest) {
        interestRate = interest;
    }

    public double getInterestRate(int years) {
        return balance * years * interestRate;
    }

    public void deposit (double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
