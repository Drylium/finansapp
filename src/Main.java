import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Finance finance = new FinanceImpl();
    static Account account = new Account();
    static boolean keepRunning = true;

    public static void main(String[] args) {
        while (keepRunning) {
            choices();
        }
    }

    private static void choices() {
        String output = """
                1. Lägg till transaktion
                2. Ta bort transaktion
                3. Se konto balans
                4. Se utgifter
                5. Se inkomster
                6. Avsluta
                """;
        System.out.println(output);
        int choice = scanner.nextInt();
        handleChoice(choice);
    }

    private static int newChoice() {
        String output = """
                1. Se transaktion årligt
                2. Se transaktion månadsvis
                3. Se transaktion veckovis
                4. Se transaktion dagsvis
                """;
        System.out.println(output);
        int newChoice = scanner.nextInt();
        return newChoice;
    }

    private static int newChoiceInk() {
        String output = """
                1. Se inkomst årligt
                2. Se inkomst månadsvis
                3. Se inkomst veckovis
                4. Se inkomst dagsvis
                """;
        System.out.println(output);
        int newChoiceInk = scanner.nextInt();
        return newChoiceInk;
    }


    private static void handleNewChoice(int newChoice) {
        switch (newChoice) {
            case 1:
                finance.viewSpendingsByYear(account);
                break;
            case 2:
                finance.viewSpendingsByMonth(account);
                break;
            case 3:
                finance.viewSpendingsByWeek(account);
                break;
            case 4:
                finance.viewSpendingsByDay(account);
                break;
            default:
                break;
        }
    }

    private static void handleNewChoiceInk(int newChoiceInk) {
        switch (newChoiceInk) {
            case 1:
                finance.viewIncomeByYear(account);
                break;
            case 2:
                finance.viewIncomeByMonth(account);
                break;
            case 3:
                finance.viewIncomeByWeek(account);
                break;
            case 4:
                finance.viewIncomeByDay(account);
                break;
            default:
                break;
        }
    }

    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                finance.add(account);
                break;
            case 2:
                finance.delete(account);
                break;
            case 3:
                finance.viewBalance(account);
                break;
            case 4:
                int subChoice = newChoice();
                handleNewChoice(subChoice);
                break;
            case 5:
                int subTwoChoice = newChoiceInk();
                handleNewChoiceInk(subTwoChoice);
                break;
            case 6:
                keepRunning = false;
                break;
            default:
                break;
        }

    }
}