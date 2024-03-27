package ObjectsAndClasses.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Advertisement {
    public Advertisement(int input) {

        List<String> Phrases = new ArrayList<>();
        Phrases.add("Excellent product.");
        Phrases.add("Such a great product.");
        Phrases.add("I always use that product.");
        Phrases.add("Best product of its category.");
        Phrases.add("Exceptional product.");
        Phrases.add("I can’t live without this product.");


        List<String> Events = new ArrayList<>();
        Events.add("Now I feel good.");
        Events.add("I have succeeded with this product.");
        Events.add("Makes miracles. I am happy of the results!");
        Events.add("I cannot believe but now I feel awesome.");
        Events.add("Try it yourself, I am very satisfied.");
        Events.add("I feel great!");


        List<String> Authors = new ArrayList<>();
        Authors.add("Diana");
        Authors.add("Petya");
        Authors.add("Stella");
        Authors.add("Elena");
        Authors.add("Katya");
        Authors.add("Iva");
        Authors.add("Annie");
        Authors.add("Eva");


        List<String> Cities = new ArrayList<>();
        Cities.add("Burgas");
        Cities.add("Sofia");
        Cities.add("Plovdiv");
        Cities.add("Varna");
        Cities.add("Ruse");


        Random rand = new Random();
        for (int i =1; i<=input; ++i){
            int randPhrase = rand.nextInt(5);
            int randEvent = rand.nextInt(5);
            int randAuthor = rand.nextInt(7);
            int randCity = rand.nextInt(4);
            System.out.printf("%s %s %s – %s %n", Phrases.get(randPhrase), Events.get(randEvent), Authors.get(randAuthor), Cities.get(randCity));
        }
    }
}
