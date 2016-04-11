import java.util.*;
import java.io.*;

public class PvC
{
    // counter to see who wins - Instance variables
    int faintCounter1 = 0;
    int faintCounter2 = 0;
    
    public static List<String> p1PokemonTeam = new ArrayList<String>();
    public static List<String> comp2PokemonTeam = new ArrayList<String>();
     
    public PvC()
    {
        // creates new Pokemon Object
        Pokemon pm = new Pokemon();
        String name2;
        for (int i = 0; i < 6; i++)
        {
            // makes random team for computer
            name2 = pm.compTeamInput();
            // makes random number to make team out of
            comp2PokemonTeam.add(name2);
        }
    }
    public void addToTeam1(String name)
    {
        p1PokemonTeam.add(name);
    }
    public void print()
    {
        System.out.println();
        System.out.println("Player's team is: ");
        for (String a : p1PokemonTeam)
        {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Computer's team is: ");
        for (String a : comp2PokemonTeam)
        {
            System.out.println(a);
        }
        System.out.println();
    }
    public String sendOut(String player1, String player2, int i)
    {
        String onField = "";
        onField += getPokemon1(i);
        System.out.println("Player 1 has sent out " + onField);
        onField += getPokemon2(i);
        System.out.println("Player 2 has sent out " + getPokemon2(i));
        return onField;
    }
    // getter method to get the name of the Pokemon on the field
    public String getPokemon1(int i)
    {
        return p1PokemonTeam.get(i);
    }
    // getter method to get the name of the Pokemon on the field
    public String getPokemon2(int i)
    {
        return comp2PokemonTeam.get(i);
    }
    // main battling method. Called in the main and allows user to pick moves that do randomized damage
    public void fight(int pokemonInPlay)
    {
        Pokemon pn = new Pokemon();
        Scanner sn = new Scanner(System.in);
        String answer1;
        int hp1 = pn.pokemonHealth();
        int hp2 = pn.pokemonHealth();
        int damage1;
        int damage2;
        String p1move1 = pn.assignMove1();
        String p1move2 = pn.assignMove2();
        String p1move3 = pn.assignMove3();
        String p1move4 = pn.assignMove4();
        String p2move1 = pn.assignMove1();
        String p2move2 = pn.assignMove2();
        String p2move3 = pn.assignMove3();
        String p2move4 = pn.assignMove4();
        while (hp1 > 0 && hp2 > 0)
        {
            do
            {
                System.out.println("Player 1, please select the move you would like to use");
                System.out.println("[1]" + p1move1);
                System.out.println("[2]" + p1move2);
                System.out.println("[3]" + p1move3);
                System.out.println("[4]" + p1move4);
                answer1 = sn.nextLine();
            }
            while (!answer1.equals("1") && !answer1.equals("2") && !answer1.equals("3") && !answer1.equals("4"));
            if (answer1.equals("1"))
            {
                damage1 = pn.atkPower1();
                hp2 -= damage1;
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move1);
                if (hp2 <= 0)
                {
                    System.out.println(getPokemon2(pokemonInPlay) + " has fainted");
                    faintCounter2++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon2(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon2(pokemonInPlay) + " has " + hp2 + " health left");
            }
            if (answer1.equals("2"))
            {
                damage1 = pn.atkPower2();
                hp2 -= damage1;
                if (hp2 <= 0)
                {
                    System.out.println(getPokemon2(pokemonInPlay) + " has fainted");
                    faintCounter2++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon2(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move2);
                System.out.println(getPokemon2(pokemonInPlay) + " has " + hp2 + " health left");
            }
            if (answer1.equals("3"))
            {
                damage1 = pn.atkPower3();
                hp2 -= damage1;
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move3);
                if (hp2 <= 0)
                {
                    System.out.println(getPokemon2(pokemonInPlay) + " has fainted");
                    faintCounter2++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon2(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon2(pokemonInPlay) + " has " + hp2 + " health left");
            }
            if (answer1.equals("4"))
            {
                damage1 = pn.atkPower4();
                hp2 -= damage1;
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move4);
                if (hp2 <= 0)
                {
                    System.out.println(getPokemon2(pokemonInPlay) + " has fainted");
                    faintCounter2++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon2(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon2(pokemonInPlay) + " has " + hp2 + " health left");
            }
            Random randomGenerator = new Random();
            int randomNum = randomGenerator.nextInt(4) + 1;
            if (randomNum == 1)
            {
                damage2 = pn.atkPower1();
                hp1 -= damage2;
                System.out.println(getPokemon2(pokemonInPlay) + " used " + p2move1);
                if (hp1 <= 0)
                {
                    System.out.println(getPokemon1(pokemonInPlay) + " has fainted");
                    faintCounter1++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon1(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon1(pokemonInPlay) + " has " + hp1 + " health left");
            }
            if (randomNum == 2)
            {
                damage2 = pn.atkPower2();
                hp1 -= damage2;
                System.out.println(getPokemon2(pokemonInPlay) + " used " + p2move2);
                if (hp1 <= 0)
                {
                    System.out.println(getPokemon1(pokemonInPlay) + " has fainted");
                    faintCounter1++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon1(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon1(pokemonInPlay) + " has " + hp1 + " health left");
            }
            if (randomNum == 3)
            {
                damage2 = pn.atkPower3();
                hp1 -= damage2;
                System.out.println(getPokemon2(pokemonInPlay) + " used " + p2move3);
                if (hp1 <= 0)
                {
                    System.out.println(getPokemon1(pokemonInPlay) + " has fainted");
                    faintCounter1++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon1(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon1(pokemonInPlay) + " has " + hp1 + " health left");
            }
            if (randomNum == 4)
            {
                damage2 = pn.atkPower4();
                hp1 -= damage2;
                System.out.println(getPokemon2(pokemonInPlay) + " used " + p2move4);
                if (hp1 <= 0)
                {
                    System.out.println(getPokemon1(pokemonInPlay) + " has fainted");
                    faintCounter1++;
                    if (pokemonInPlay == 5)
                    {
                        break;
                    }
                    System.out.println(getPokemon1(pokemonInPlay + 1) +" has been sent out");
                    break;
                }
                System.out.println(getPokemon1(pokemonInPlay) + " has " + hp1 + " health left");
            }
        }
        if (faintCounter1 == 6)
        {
            System.out.println("Player is out of usable Pokemon!");
            System.out.println("Player blacked out!");
            System.out.println("Computer wins!");
            System.exit(0);
        }
        else if (faintCounter2 == 6)
        {
            System.out.println("Computer is out of usable Pokemon!");
            System.out.println("Good game Player, you are well on your way to becoming the Pokemon League Champion");
            System.out.println("Player wins!");
            System.exit(0);
        }
    }
}