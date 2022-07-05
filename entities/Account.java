package entities;

public class Account {
    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public Account(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public Account(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Método que recebe um depósito e acrescenta ao saldo da conta.
     * @param amount
     */
    public void deposit(double amount){
        accountBalance += amount;
    }

    /**
     * Método que efetua um saque na conta e reduz o saldo pelo valor sacado, descontando uma taxa fixa.
     * @param amount
     */
    public void withdraw(double amount){
        accountBalance -= amount + 5.00;
    }

    @Override
    public String toString() {
        return "Account "
                    + accountNumber
                    + ", Holder: "
                    + accountHolder
                    + ", Balance: $ "
                    + String.format("%.2f", accountBalance);
    }
}
