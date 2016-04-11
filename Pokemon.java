import java.util.*;
import java.io.*;

public class Pokemon
{
    public static List<String> pokemonNames = new ArrayList<String>();
    public static List<String> pokemonMoves = new ArrayList<String>();
    
    public Pokemon()
    {
        // fills the list of pokemon from a txt file
        fillPokemon();
        fillMoves();
    }
    // assigns move to the pokemon
    public String assignMove1()
    {
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(pokemonMoves.size());
        return pokemonMoves.get(randomNum);
        
    }
    public String assignMove2()
    {
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(pokemonMoves.size());
        return pokemonMoves.get(randomNum);
        
    }
    public String assignMove3()
    {
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(pokemonMoves.size());
        return pokemonMoves.get(randomNum);
        
    }
    public String assignMove4()
    {
        Random randomGenerator = new Random();
        int randomNum = randomGenerator.nextInt(pokemonMoves.size());
        return pokemonMoves.get(randomNum);
        
    }
    public int atkPower1()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(150) + 75;
        return randomNumber;
    }
    public int atkPower2()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100) + 50;
        return randomNumber;
    }
    public int atkPower3()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(200) + 25;
        return randomNumber;
    }
    public int atkPower4()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(100) + 10;
        return randomNumber;
    }
    public int pokemonHealth()
    {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(300) + 100;
        return randomNumber;
    }
    public void addPokemon(String name)
    {
        pokemonNames.add(name);
    }
    public void addPokemonMoves(String name)
    {
        pokemonMoves.add(name);
    }
    // should print arraylist, but prints 3 copies of arraylist in one, function works fine when called on its own at top of main, but not otherwise
    public void print1()
    {
        System.out.println();
        for (String a : pokemonNames)
        {
            System.out.println(a);
        }
        System.out.println();
    }
    public String compTeamInput()
    {
        // initializes random number generator
            Random randomGenerator = new Random();
            int randomNum = randomGenerator.nextInt(pokemonNames.size());
            return pokemonNames.get(randomNum);
    }
    // fills arraylist from .txt file
    private void fillPokemon()
    {
      try{
         Scanner sn = new Scanner(new File("pokemon.txt"));
         while(sn.hasNextLine())
            addPokemon(sn.nextLine());
              
      }catch(FileNotFoundException e){
         String s = "File not found! Make sure that pokemon.txt ";
         s = s + "is in the same folder as the class.";
         System.out.println(s);
      }
    }
    private void fillMoves()
    {
      try{
         Scanner sn = new Scanner(new File("pokemonMoves.txt"));
         while(sn.hasNextLine())
            addPokemonMoves(sn.nextLine());
              
      }catch(FileNotFoundException e){
         String s = "File not found! Make sure that pokemon.txt ";
         s = s + "is in the same folder as the class.";
         System.out.println(s);
      }
    }
}