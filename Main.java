//Pokemon Battle Simulator by Nicholas Tortora

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        String answer1;
        String answer;
        // counter used for checking if successfully added
        int counter = 0;
        Pokemon pk = new Pokemon();
        Scanner sn = new Scanner(System.in);
        do
        {
            System.out.println("Please choose a gamemode");
            System.out.println("[1] Player vs. Player");
            System.out.println("[2] Player vs. Computer");
            System.out.println("[3] Random Team Player vs. Random Team Player");
            System.out.println("[4] Computer vs. Computer");
            answer1 = sn.nextLine();
        }
        while (!answer1.equals("1") && !answer1.equals("2") && !answer1.equals("3") && !answer1.equals("4"));
        // creates objects based on the answer
        if (answer1.equals("1"))
        {
            pk.print1();
            // initializes two new player objects
            Player pl = new Player();
            // works fine until here
            // prompts user for input for Pokemon team
            System.out.println("Player 1, please choose your Pokemon");
            System.out.println("Please type your pokemon in exactly as it appears on this list");
            answer = sn.nextLine();
            // checks if pokemon is typted correctly
            for (String a : pk.pokemonNames)
            {
                if(answer.equals(a))
                {
                    pl.addToTeam1(answer);
                    counter++;
                    break;
                }
            }
            // if is not typed correctly, goes through a loop until it is
            while (counter == 0)
            {
                System.out.println("Please try again");
                System.out.println("Player 1, please choose your Pokemon");
                System.out.println("Please type your pokemon in exactly as it appears on this list");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pl.addToTeam1(answer);
                        counter = 1;
                        break;
                    }
                }
            }
            counter = 0;
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Player 1, please choose your next Pokemon");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pl.addToTeam1(answer);
                        counter++;
                        break;
                    }
                }
                while (counter == 0)
                {
                    System.out.println("Please try again");
                    System.out.println("Player 1, please choose your Pokemon");
                    System.out.println("Please type your pokemon in exactly as it appears on this list");
                    answer = sn.nextLine();
                    for (String a : pk.pokemonNames)
                    {
                        if(answer.equals(a))
                        {
                            pl.addToTeam1(answer);
                            counter = 1;
                            break;
                        }
                    }
                }
                counter = 0;
            }
            // prompts other user to input Pokemon Team
            pk.print1();
            System.out.println("Player 2, please choose your Pokemon");
            System.out.println("Please type your pokemon in exactly as it appears on this list");
            answer = sn.nextLine();
            for (String a : pk.pokemonNames)
            {
                if(answer.equals(a))
                {
                    pl.addToTeam2(answer);
                    counter++;
                    break;
                }
            }
            while (counter == 0)
            {
                System.out.println("Please try again");
                System.out.println("Player 2, please choose your Pokemon");
                System.out.println("Please type your pokemon in exactly as it appears on this list");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pl.addToTeam1(answer);
                        counter = 1;
                        break;
                    }
                }
                while (counter == 0)
                {
                    System.out.println("Please try again");
                    System.out.println("Player 2, please choose your Pokemon");
                    System.out.println("Please type your pokemon in exactly as it appears on this list");
                    answer = sn.nextLine();
                    for (String a : pk.pokemonNames)
                    {
                        if(answer.equals(a))
                        {
                            pl.addToTeam1(answer);
                            counter = 1;
                            break;
                        }
                    }
                }
                counter = 0;
            }
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Player 2, please choose your next Pokemon");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pl.addToTeam2(answer);
                        counter++;
                        break;
                    }
                }
                while (counter == 0)
                {
                    System.out.println("Please try again");
                    System.out.println("Player 2, please choose your Pokemon");
                    System.out.println("Please type your pokemon in exactly as it appears on this list");
                    answer = sn.nextLine();
                    for (String a : pk.pokemonNames)
                    {
                        if(answer.equals(a))
                        {
                            pl.addToTeam2(answer);
                            counter = 1;
                            break;
                        }
                    }
                }
            }
            pl.print();
            pl.sendOut("p1", "p2", 1);
            for (int i = 0; i < 12; i++)
            {
                pl.fight(i % 2);
            }
        }
        if (answer1.equals("2"))
        {
            pk.print1();
            PvC pvc = new PvC();
            System.out.println("Player, please choose your Pokemon");
            System.out.println("Please type your pokemon in exactly as it appears on this list");
            answer = sn.nextLine();
            for (String a : pk.pokemonNames)
            {
                if(answer.equals(a))
                {
                    pvc.addToTeam1(answer);
                    counter++;
                    break;
                }
            }
            while (counter == 0)
            {
                System.out.println("Please try again");
                System.out.println("Player, please choose your Pokemon");
                System.out.println("Please type your pokemon in exactly as it appears on this list");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pvc.addToTeam1(answer);
                        counter = 1;
                        break;
                    }
                }
            }
            for (int i = 0; i < 5; i++)
            {
                System.out.println("Player, please choose your next Pokemon");
                answer = sn.nextLine();
                for (String a : pk.pokemonNames)
                {
                    if(answer.equals(a))
                    {
                        pvc.addToTeam1(answer);
                        counter++;
                        break;
                    }
                }
                while (counter == 1)
                {
                    System.out.println("Please try again");
                    System.out.println("Player, please choose your Pokemon");
                    System.out.println("Please type your pokemon in exactly as it appears on this list");
                    answer = sn.nextLine();
                    for (String a : pk.pokemonNames)
                    {
                        if(answer.equals(a))
                        {
                            pvc.addToTeam1(answer);
                            counter = 0;
                            break;
                        }
                    }
                }
            }
            pvc.print();
            pvc.sendOut("p1", "comp1", 1);
            for (int i = 0; i < 12; i++)
            {
                pvc.fight(i % 2);
            }
        }
        if (answer1.equals("3"))
        {
            Computer comp = new Computer();
            comp.print();
            comp.sendOut("comp1", "comp2", 1);
            for (int i = 0; i < 12; i++)
            {
                comp.fight(i % 2);
            }
        }
        if (answer1.equals("4"))
        {
            CvC cvc = new CvC();
            cvc.print();
            cvc.sendOut("comp1", "comp2", 1);
            for (int i = 0; i < 12; i++)
            {
                cvc.fight(i % 2);
            }
        }
    }
}
