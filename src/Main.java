import java.util.Scanner;
void main() {
    Scanner in = new Scanner(System.in);
    String playerA;
    String playerB;
    String playAgain = "";

    do {
        System.out.print("\nLet's play rock, paper, scissors. Enter R, P, or S when it's your turn to play!");
        while (true) {
            System.out.print("\nPlayer A, enter your character now.");
            playerA = in.nextLine();
            if (playerA.equalsIgnoreCase("R") || playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S")) {
                break;
            }
            System.out.print("Invalid input. Choose R, P, or S.");
        }
        System.out.print("Player A has chosen: " + playerA);
        while (true) {
            System.out.print("\nPlayer B, enter your character now.");
            playerB = in.nextLine();
            if (playerB.equalsIgnoreCase("R") || playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S")) {
                break;
            }
            System.out.print("Invalid input. Choose R, P, or S.");
        }
        System.out.print("PlayerB has chosen: " + playerB);
        if (playerA.equalsIgnoreCase("R")) {
            if (playerB.equalsIgnoreCase("R")) {
                System.out.println("\nRock vs Rock, it's a tie!");
            } else if (playerB.equalsIgnoreCase("p")) {
                System.out.print("\nPaper covers rock, playerB wins!");
            } else {
                System.out.print("\nRock breaks scissors, playerA wins!");
            }
        } else if (playerA.equalsIgnoreCase("S")) {
            if (playerB.equalsIgnoreCase("S")) {
                System.out.print("\nScissors vs Scissors, it's a tie!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.print("\nScissors cut paper, playerA wins!");
            } else {
                System.out.print("\nRock breaks scissors, player B wins!");
            }
        } else { // Player A chose paper
            if (playerB.equalsIgnoreCase("S")) {
                System.out.print("\nScissors cuts paper, Player B wins!");
            } else if (playerB.equalsIgnoreCase("P")) {
                System.out.print("\nPaper vs Paper, it's a tie!");
            } else {
                System.out.print("\nPaper covers rock, player A wins!");
            }
    }
    while (true) {
        System.out.print("\nWould you like to play another round? Y/N: ");
        playAgain = in.nextLine();
        if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")) {
            break;
        }
        System.out.println("Invalid. Please enter Y or N.");
    }
} while (playAgain.equalsIgnoreCase("Y"));
System.out.println("\nThanks for playing! Run the program again later if you'd like to play again :)");
        in.close();
    }
