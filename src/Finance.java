import java.util.Date;

public interface Finance {
    public void add(Account account);

    public void delete(Account account);

    public void viewBalance(Account account);

    public void viewSpendingsByYear(Account account);

    public void viewSpendingsByMonth(Account account);

    public void viewSpendingsByWeek(Account account);

    public void viewSpendingsByDay(Account account);

    public void viewIncomeByYear(Account account);

    public void viewIncomeByMonth(Account account);

    public void viewIncomeByWeek(Account account);

    public void viewIncomeByDay(Account account);
}
