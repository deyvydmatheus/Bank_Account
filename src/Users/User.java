package Users;


import java.util.Scanner;

public class User {
    Scanner input = new Scanner(System.in);

    private final Integer ACCOUNT_NUMBER;
    private final Double TAX_DEPOSIT = 5.0;
    private String userName;
    private Double amountDeposited;
    private Character yesOrNo;
    private Double valueOfNewBalance;

    public User(final Integer accountNumber) {
        this.ACCOUNT_NUMBER = accountNumber;
    }

    public User(final Integer accountNumber, String userName, Double amountDeposited) {
        this.ACCOUNT_NUMBER = accountNumber;
        this.userName = userName;
        this.amountDeposited = amountDeposited;
    }

    public Integer getAccountNumber() {
        return ACCOUNT_NUMBER;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getAmountDeposited() {
        return amountDeposited;
    }

    public void setYesOrNo(Character yesOrNo) {
        this.yesOrNo = yesOrNo;
    }

    public Double getValueOfNewBalance() {
        return valueOfNewBalance;
    }
    public void setValueOfNewBalance(Double valueOfNewBalance) {
        this.valueOfNewBalance = valueOfNewBalance;
    }
    public Character checkYesOrNo(Character yesOrNo) {
        if (yesOrNo.equals('y')) {
            System.out.print("Enter a initial deposit value: ");
            valueOfNewBalance = input.nextDouble();
        } else {
            System.out.println("You balance will be zero.");
            valueOfNewBalance = amountDeposited = 0.0;
        }
        return null;
    }
    public Character checkYesOrNoDeposit(Character yesOrNo) {
        if(yesOrNo.equals('y')) {
            System.out.print("What is the deposit amount? ");
            Double valueOfDeposit = input.nextDouble();
            valueOfNewBalance += valueOfDeposit;

        } else {
            System.out.println("OK!");
        }
        return null;
    }
    public Character checkYesOrNoWithdraw(Character yesOrNo){
        if(yesOrNo.equals('y')) {
            System.out.print("What amount do you want to withdraw? ");
            Double valueOfWithdraw = input.nextDouble();
            valueOfNewBalance = (valueOfNewBalance - valueOfWithdraw) - TAX_DEPOSIT;

        } else {
            System.out.println("OK!");
        }
        return null;
    }

    public String toString() {
        return String.format("Account data: Account: %s. ", ACCOUNT_NUMBER) +
                String.format("Holder: %s. ", userName) +
                String.format("Balance: %.2f", amountDeposited);
    }

}
