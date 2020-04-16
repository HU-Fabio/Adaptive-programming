package Gameshop;

import java.util.ArrayList;

public class Person {
    private String name;
    private double budget;
    private ArrayList<Game> games = new ArrayList<>();

    public Person(String name, double budget) {
        this.name = name;
        this.budget = budget;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public String getName() {
        return name;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public String buy(Game item) {
        double budget = this.budget;
        //Check if game is already been bought
        for (Game game : this.games) {
            if(game.getName().equals(item.getName())) {
                return this.name + " koopt " + item.getName() + " : niet gelukt";
            }
        }
        //Check if there is budget to buy the game
        if (budget >= item.getBuyPrice()) {
            this.games.add(item);
            double newBudget = budget - item.getBuyPrice();
            this.setBudget(newBudget);
            return this.name + " koopt " + item.getName() + " : gelukt";
        } else {
            return this.name + " koopt " + item.getName() + " : niet gelukt";
        }
    }

    public String sell(Game item, Person person) {
        //Check if person actually has the game
        int i = 0;
        for (Game game : this.games) {
            if(game.getName().equals(item.getName())) {
                continue;
            } else if(i == this.games.size()) {
                return this.name + " koopt " + item.getName() + " : niet gelukt";
            }
            i++;
        }

        //Check if game is already been bought
        for (Game game : person.getGames()) {
            if(game.getName().equals(item.getName())) {
                return this.name + " koopt " + item.getName() + " : niet gelukt";
            }
        }

        if (this.budget >= item.getSellPrice()) {
            person.games.add(item);
            this.games.remove(item);
            this.budget = this.budget + item.getSellPrice();
            person.budget = person.budget - item.getSellPrice();
            return this.name + " verkoopt " + item.getName() + " aan " + person.name + ": gelukt";
        } else {
            return this.name + " verkoopt " + item.getName() + " aan " + person.name + ": niet gelukt";
        }

    }

    @Override
    public String toString() {
        String message = this.name + " Heeft een budget van $" + this.budget + " en bezit de volgende games:\n";


        for(Game game : this.games) {
            String newMessage = game.getName() + ", uitgegeven in " + game.getReleaseYear() + "; niewprijs: " + game.getBuyPrice() + " nu voor: " + game.getSellPrice() + "\n";
            message = message + "" + newMessage;
        }

        return message;
    }
}
