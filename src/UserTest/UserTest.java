package UserTest;

import Users.User;

import java.util.Locale;
import java.util.Scanner;

public class UserTest {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        System.out.print("Enter account number: ");
        Integer accountCode = input.nextInt();
        User user = new User(accountCode);

        System.out.print("Enter account holder: ");
        String accountName = input.next();

        System.out.print("Is there an initial deposit? (Y/N)");
        Character yesOrNo = input.next().charAt(0);

        user.checkYesOrNo(yesOrNo.toLowerCase(yesOrNo));

        System.out.print("Do you want to make a deposit? (Y/N) ");
        Character yesOrNoDeposit = input.next().charAt(0);

        user.checkYesOrNoDeposit(yesOrNoDeposit.toLowerCase(yesOrNoDeposit));

        System.out.print("Do you want to make any withdrawals? (Y/N) ");
        Character yesOrNoWithdraw = input.next().charAt(0);

        user.checkYesOrNoWithdraw(yesOrNoWithdraw.toLowerCase(yesOrNoWithdraw));

        User user1 = new User(accountCode, accountName, user.getValueOfNewBalance());

        System.out.println(user1);

        input.close();
    }
}
