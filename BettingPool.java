/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betting.pool;

import java.util.Random;

/**
 *
 * @author ltmat
 */
public class BettingPool {

    public static void main(String args[]) {
        Team[] teams = new Team[6];
        teams[0] = new Team();
        teams[0].setName("Team 1");
        teams[1] = new Team();
        teams[1].setName("Team 2");
        teams[2] = new Team();
        teams[2].setName("Team 3");
        teams[3] = new Team();
        teams[3].setName("Team 4");
        teams[4] = new Team();
        teams[4].setName("Team 5");
        teams[5] = new Team();
        teams[5].setName("Team 6");

        Random rand = new Random();
        int r1 = rand.nextInt(10);
        int r2 = rand.nextInt(10);
        int r3 = rand.nextInt(10);
        int r4 = rand.nextInt(10);
        int r5 = rand.nextInt(10);
        int r6 = rand.nextInt(10);

        teams[0].setStat(r1);
        teams[1].setStat(r2);
        teams[2].setStat(r3);
        teams[3].setStat(r4);
        teams[4].setStat(r5);
        teams[5].setStat(r6);

        System.out.println("Choose your betting team.");
        for (int i = 0; i < teams.length; i++) {
            System.out.println(teams[i].getName());
        }
        System.out.print(">>> ");

        int largest = teams[0].getStat();
        int winningTeam = -1;
        for (int i = 1; i < teams.length; i++) {
            if (largest < teams[i].getStat()) {
                largest = teams[i].getStat();
                winningTeam = i;
            }
        }

    }

}
