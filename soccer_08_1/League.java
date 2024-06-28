package soccer_08_1;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import soccer_07_1.*;
import soccer_06_2.*;
import soccer_06_1.*;

/**
 *
 * @author sheld
 */
public class League {

    public static void main(String[] args) {
        //calling createTeams method
        Team[] theTeams = createTeams();
        //calling createGames method
        Game[] theGames = createGames(theTeams);

        //**********************************GAMES***************************
        Game currGame = theGames[0];

        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.awayTeam.playerArray[2];
        goal1.theTeam = currGame.awayTeam;
        goal1.theTime = 55;

        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;

        System.out.println("Goal scored after "
                + currGame.goals[0].theTime + " mins by "
                + currGame.goals[0].thePlayer.playerName + " of "
                + currGame.goals[0].theTeam.teamName);
    }

    public static Team[] createTeams() {
        //***************TEAM1 (THE GREENS)**********
        Team team1 = new Team();
        team1.teamName = "The Greens";
        
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        //adding player info
        player1.playerName = "George Eliot";
        player2.playerName = "Graham Greene";
        player3.playerName = "Geoffrey Chaucer";

        //creating array of players(links to team object)
        Player[] thePlayers = {player1, player2, player3};

        //player1.playerName = "Robert Service";
        team1.playerArray = thePlayers;
        
        //***************TEAM2 (THE REDS)**********
        Team team2 = new Team();
        team2.teamName = "The Reds";
        
        team2.playerArray = new Player[3];
        team2.playerArray[0] = new Player();
        team2.playerArray[0].playerName = "Robert Service";
        team2.playerArray[1] = new Player();
        team2.playerArray[1].playerName = "Robbie Burns";
        team2.playerArray[2] = new Player();
        team2.playerArray[2].playerName = "Rafael Sabatini";
        
        Team[] theTeams = {team1, team2};
        return theTeams;
        
    }
    
    public static Game[] createGames(Team[] theTeams) {
    Game theGame = new Game();
    theGame.homeTeam = theTeams[0];
    theGame.awayTeam = theTeams[1];
    Game[] theGames = {theGame};
    return theGames;
    }
}