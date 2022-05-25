import java.util.Scanner;
import java.text.NumberFormat;

public class Runner {

    public void run(Player player) {
        boolean stop = false;
        while (stop != true) {
            System.out.print("\nPlay? ");
            Scanner in = new Scanner(System.in);
            String ans = in.nextLine();
            System.out.println();
            if (ans.equals("yes")) {
                try {

                    System.out.print("Which pack? ");
                    Scanner input = new Scanner(System.in);
                    int pack = input.nextInt();
                    player.play(pack);
                }
                catch (Exception e) {
                    System.out.println("Sorry that command does not exist!");
                }
            }
            if (ans.equals("1")) {
                player.play(1);
            }
            if (ans.equals("all")) {
                try {
                    System.out.print("Which pack? ");
                    Scanner input = new Scanner(System.in);
                    int pack = input.nextInt();
                    player.spendAll(pack);
                }
                catch (Exception e) {
                    System.out.println("Sorry that command does not exist!");
                }
            }
            if (ans.equals("yes10")) {
                try {
                    System.out.print("Which pack? ");
                    Scanner input = new Scanner(System.in);
                    int pack = input.nextInt();
                    player.playTen(pack);
                }
                catch (Exception e) {
                    System.out.println("Sorry that command does not exist!");
                }
            }
            if (ans.equals("restart")) {
                try {
                    System.out.print("Are you sure? ");
                    Scanner input = new Scanner(System.in);
                    String resp = input.nextLine();
                    resp = resp.toLowerCase();
                    if (resp.equals("yes")) {
                        player.restart();
                        player.save();
                    }
                    else System.out.println("Failed");
                }
                catch (Exception e) {
                    System.out.println("Failed");
                }
            }
            if (ans.equals("10")) {
                player.playTen(1);
            }
            if (ans.equals("add")) {
                player.addMoney(999999);
            }
            if (ans.equals("inv")) {
                player.showInventory();
            }
            if (ans.equals("sell")) {
                player.sellItem();
            }
            if (ans.equals("sellall")) {
                player.sellAll();
            }
            System.out.print(" ~~~~~~~~\n");
            if (ans.equals("prestige")) {
                player.prestige();
            }

            if (ans.equals("rig")) {
                System.out.print("\nPack? ");
                Scanner input = new Scanner(System.in);
                int pack = input.nextInt();
                player.rig(pack);
            }
            if (ans.equals("yessecret")) {
                System.out.print("\nPack? ");
                Scanner input = new Scanner(System.in);
                int pack = input.nextInt();
                player.playSecret(pack);
            }

            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String myCurrency = currency.format(player.getMoney());
            System.out.println("Money: " + myCurrency + "\nOpen Count: " + player.getOpenCount() + "\n ~~~~~~~~~");
            player.save();
            if (ans.equals("stop")) {
                stop = true;
            }
        }
    }
}
