import java.util.*;
import java.io.*;
        
public class Player
{
    // counter to see who wins - Instance variables
    int faintCounter1 = 0;
    int faintCounter2 = 0;
    
    public static List<String> player1PokemonTeam = new ArrayList<String>();
    public static List<String> player2PokemonTeam = new ArrayList<String>();
    public Player()
    {
    }
    public void addToTeam1(String name)
    {
        player1PokemonTeam.add(name);
    }
    public void addToTeam2(String name)
    {
        player2PokemonTeam.add(name);
    }
    public void print()
    {
        System.out.println();
        System.out.println("Player 1's team is: ");
        for (String a : this.player1PokemonTeam)
        {
            System.out.println(a);
        }
        System.out.println();
        System.out.println("Player 2's team is: ");
        for (String a : this.player2PokemonTeam)
        {
            System.out.println(a);
        }
        System.out.println();
    }
    // starts the battle and sends out a pokemon from either side
    public String sendOut(String player1, String player2, int i)
    {
        String onField = "";
        onField += getPokemon1(i);
        System.out.println("Player 1 has sent out " + onField);
        onField += getPokemon2(i);
        System.out.println("Player2 has sent out " + getPokemon2(i));
        return onField;
    }
    // getter methods
    public String getPokemon1(int i)
    {
        return player1PokemonTeam.get(i);
    }
    public String getPokemon2(int i)
    {
        return player2PokemonTeam.get(i);
    }
    // main combat method
    public void fight(int pokemonInPlay)
    {
        Pokemon pn = new Pokemon();
        Scanner sn = new Scanner(System.in);
        // used when doing a move
        String answer1;
        String answer2;
        // randomized hit points
        int hp1 = pn.pokemonHealth();
        int hp2 = pn.pokemonHealth();
        // attack damage
        int damage1;
        int damage2;
        // gets moves for a specific pokemon
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
            // makes sure that player picks 1-4
            do
            {
                System.out.println("Player 1, please select the move you would like to use");
                System.out.println("[1]" + p1move1);
                System.out.println("[2]" + p1move2);
                System.out.println("[3]" + p1move3);
                System.out.println("[4]" + p1move4);
                answer1 = sn.nextLine();
            }
            while (!answer1.equals("1") && !answer1.equals("2") && !answer1.equals("3") &&!answer1.equals("4"));
            // computes the damage for each move
            if (answer1.equals("1"))
            {
                damage1 = pn.atkPower1();
                hp2 -= damage1;
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move1);
                // if the hit points are reduced to zero or less, pokemon faints, and next one is sent out
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
                System.out.println(getPokemon1(pokemonInPlay) + " used " + p1move2);
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
            do
            {
                System.out.println("Player 2, please select the move you would like to use");
                System.out.println("[1]" + p2move1);
                System.out.println("[2]" + p2move2);
                System.out.println("[3]" + p2move3);
                System.out.println("[4]" + p2move4);
                answer2 = sn.nextLine();
            }
            while (!answer2.equals("1") && !answer2.equals("2") && !answer2.equals("3") && !answer2.equals("4"));
            if (answer2.equals("1"))
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
            if (answer2.equals("2"))
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
            if (answer2.equals("3"))
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
            if (answer2.equals("4"))
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
            System.out.println("Player 1 is out of usable Pokemon!");
            System.out.println("Player 1 blacked out!");
            System.out.println("Player 2 wins!");
            System.exit(0);
            
        }
        else if (faintCounter2 == 6)
        {
            System.out.println("Player 2 is out of usable Pokemon!");
            System.out.println("Player 2 blacked out!");
            System.out.println("Player 1 wins!");
            System.exit(0);
        }
    }
}