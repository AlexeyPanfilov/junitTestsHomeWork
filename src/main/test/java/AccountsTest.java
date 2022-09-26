import org.example.accounts.Account;
import org.example.accounts.CheckingAccount;
import org.example.accounts.CreditAccount;
import org.example.accounts.SavingsAccount;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AccountsTest {

    private Account checkingAccount = new CheckingAccount();
    private Account creditAccount = new CreditAccount();

    @Test
    @DisplayName("�������� ��������� ����������� ������� ���������� �����")
    void setCheckingBalance () {
        checkingAccount.setAccountBalance(1000);
        Assertions.assertEquals(1000, checkingAccount.getAccountBalance());
    }

    @Test
    @DisplayName("�������� ��������� ������������� ������� ���������� �����")
    void setCheckingBalanceMinus () {
        checkingAccount.setAccountBalance(-1000);
        Assertions.assertEquals(0, checkingAccount.getAccountBalance());
    }

    @Test
    @DisplayName("�������� ������� ����������� ������� ���������� �����")
    void setCreditBalance () {
        creditAccount.setAccountBalance(-5000);
        Assertions.assertEquals(-5000, creditAccount.getAccountBalance());
    }

    @Test
    @DisplayName("�������� ������� ������������� ������� ���������� �����")
    void setCreditBalancePositive () {
        creditAccount.setAccountBalance(5000);
        Assertions.assertEquals(0, creditAccount.getAccountBalance());
    }

    @Test
    @DisplayName("�������� ������� ����� ��������� ���������� �����")
    void setCreditName () {
        creditAccount.setOwnerName("I'm almost java guru");
        Assertions.assertEquals("I'm almost java guru", creditAccount.getOwnerName());
    }
}
