package febrary14.ui;

import java.util.Scanner;

public class ConsoleUserInteractor implements UserInteractor {
    private Scanner sc;

    public ConsoleUserInteractor() {
        sc = new Scanner(System.in);
    }

    @Override
    public String readCommand() throws UserInteractorReadException {
        String command = sc.nextLine();
        if (command.isEmpty()) throw new UserInteractorReadException("Command is empty");
        return command;
    }

    @Override
    public int readTrackNumber() {
        print("Enter number of track: ");
        return Integer.parseInt(sc.nextLine());
    }

    @Override
    public void print(String output) {
        System.out.println(">> " + output);
    }
}
