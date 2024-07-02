public class Main {
    public static void main(String[] args) {
//        question 1
        TaxUtil taxUtil = new TaxUtil();

        double amount = 1000.0;
        double rate = 0.07;
        double tax = taxUtil.calculateTax(amount, rate);
        System.out.println("Question 1, output");
        System.out.println("The tax on an amount of " + amount + " at a rate of " + (rate * 100) + "% is: " + tax);
//        question 1 end

//        question 5
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println("Question 5, output");
        System.out.println("Output for -> singleton1 == singleton2 is: ");
        System.out.println(singleton1 == singleton2);
//        question 5 end

//        question 6
        BankAccount account = new BankAccount("12345", 1000.0);
        System.out.println("Question 6, output");
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());


        account.deposit(500.0);
        System.out.println("Balance after deposit: " + account.getBalance());


        account.withdraw(1500.0); // Prints "Insufficient funds."
        account.withdraw(500.0);
        System.out.println("Balance after withdrawal: " + account.getBalance());
//        question 6 end
    }
}