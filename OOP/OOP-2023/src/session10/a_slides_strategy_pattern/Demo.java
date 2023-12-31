package session10.a_slides_strategy_pattern;

public class Demo {

    public static void main(String[] args) {
        InterestStrategy interestStrategy = new SavingsAccountInterest();
        InterestStrategy superAccountInterest = new SuperAccountInterest();

        BankAccount bankAccount = new BankAccount(100, interestStrategy);

        System.out.println("Total Balance: "+bankAccount.getBalance());

        bankAccount.accrueInterest();

        System.out.println("Total Balance: "+bankAccount.getBalance());



        BankAccount superBankAccount = new BankAccount(100, superAccountInterest);

        System.out.println("Total Balance: "+ superBankAccount.getBalance());

        superBankAccount.accrueInterest();

        System.out.println("Total Balance: "+ superBankAccount.getBalance());
    }
}
