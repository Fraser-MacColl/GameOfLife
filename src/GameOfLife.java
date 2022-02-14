import Util.*;

public class GameOfLife {

    public static void main(String[] args) {
        // Set defaults
        width = 20;
        height = 10;
        maxFPS = 2;
        generations = 20;
        autoRun = false;

        // Init field
        currentState = new boolean[width+2][height+2]; // Initially all false
        nextState = new boolean[width+2][height+2];    // +1 for border on each side

        mainMenu();
    }

    private static void printMenuInfo() {
        System.out.println(TextConstants.LOGO);

        System.out.println("\nWidth: " + width + "     AutoRun: " + autoRun + "    Generations: " + generations);
        System.out.println("Height: " + height + "    MaxFPS: " + maxFPS);

        System.out.println();
        printState(currentState);
    }

    public static void mainMenu() {
        // Main menu to set settings
        Util.clearScreen();
        printMenuInfo();

        int input = Input.getFromOptions("", "Run", "Autorun", "Change initial state", "Change width", "Change height", "Change minFPS", "Change num of generations");

        if (input == 1) new GameOfLife();
        else if (input == 2) {autoRun = !autoRun; mainMenu();}
        else if (input == 3) editState();
        else if (input == 4) editWidth();
        else if (input == 5) editHeight();
        else if (input == 6) editminFPS();
        else editNumGenerations();

    }

    private static void editState() {
        Util.clearScreen();
        printMenuInfo();

        System.out.println("CBA making rn lol");
        System.console().readLine();
        mainMenu();
    }
    private static void editWidth() {
        Util.clearScreen();
        printMenuInfo();

        width = Input.getInt("Enter the width of the cell area you would like.");

        currentState = new boolean[width+2][height+2];
        nextState = new boolean[width+2][height+2];

        mainMenu();
    }
    private static void editHeight() {
        Util.clearScreen();
        printMenuInfo();

        height = Input.getInt("Enter the height of the cell area you would like.");

        currentState = new boolean[width+2][height+2];
        nextState = new boolean[width+2][height+2];

        mainMenu();
    }
    private static void editminFPS() {
        Util.clearScreen();
        printMenuInfo();

        maxFPS = Input.getDouble("Enter the max FPS while using autoRun you would like");

        mainMenu();
    }
    private static void editNumGenerations() {
        Util.clearScreen();
        printMenuInfo();

        generations = Input.getInt("Enter the number of generations you would like when on autoRun");

        mainMenu();
    }







    private static int width, height, generations;
    private static double maxFPS;
    private static boolean autoRun;

    private static boolean[][] currentState;
    private static boolean[][] nextState;

    public GameOfLife() {
        // Constructor



    }

    private static void printState(boolean[][] state) {
        // Print current state of the board to the screen
        // Ignores first and last value of each row as always false border

        StringBuilder output = new StringBuilder();

        // Add top border
        output.append("╔").append("═".repeat(width)).append("╗\n");

        // Main state
        for (int y = 1; y < height+1; y++) {
            output.append("║");
            for (int x = 1; x < width+1; x++) {
                if (state[x][y]) output.append("#");
                else output.append("·");
            }
            output.append("║\n");
        }

        // Add bottom border
        output.append("╚").append("═".repeat(width)).append("╝\n");

        System.out.println(output);
    }

}
