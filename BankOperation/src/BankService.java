import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankService {


    public static void main(String[] args) {
        List<IReceiveInterest> interestAccount= new ArrayList<>();
        List<BankAccount> accounts= new ArrayList<>();


        BankAccount s1 = new SavingAccount("123", 1000000d);
        accounts.add(s1);

        BankAccount s2 = new NormalAccount("345", 1234325d);
        accounts.add(s2);

        BankAccount s3 = new VipAccount("5433", 424502332d);
        accounts.add(s3);

        for (BankAccount acc : accounts){
            if (acc instanceof IReceiveInterest){
                interestAccount.add((IReceiveInterest) acc);
            }
        }

        s1.deposit(103242);
        s2.withdraw(234282);

        for (IReceiveInterest tk : interestAccount){
            tk.applyInterest();
        }
    }


}
