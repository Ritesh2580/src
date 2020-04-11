package com.triceria.game;
import com.triceria.game.*;
import java.util.*;
public class Game
{
private int numberOfPlayers; 
private Random randomNumberGenerator;
private Player players[];
public Game()
{
this.numberOfPlayers=4;
this.randomNumberGenerator=new Random();
this.players=new Player[numberOfPlayers];
initialize();
}
public Game(int numberOfPlayers)
{
this.numberOfPlayers=numberOfPlayers;
this.randomNumberGenerator=new Random();
this.players=new Player[numberOfPlayers];
initialize();
}
public void initialize()
{
if(this.numberOfPlayers!=0)
{
Player player;
Choice choice;
for(int i=0;i<numberOfPlayers;++i)
{
player=new Player();
choice=new Choice(this.randomNumberGenerator.nextInt(3));
player.setChoice(choice);
this.players[i]=player;
}
}

}



public void play()
{

for(int r=0;r<numberOfPlayers;++r)
{

for(int c=0;c<numberOfPlayers;++c)
{
if(r==c)continue;
else
{
if(this.players[r].getChoice().getChoice()==0&&this.players[c].getChoice().getChoice()==2)
{
this.players[r].setScore(1,c);
continue;
}
if(this.players[r].getChoice().getChoice()==1&&this.players[c].getChoice().getChoice()==0)
{
this.players[r].setScore(1,c);
continue;
}
if(this.players[r].getChoice().getChoice()==2&&this.players[c].getChoice().getChoice()==1)
{
this.players[r].setScore(1,c);
continue;
}
this.players[r].setScore(0,c);
}
}
}
}

public Player[] getResult()
{
return this.players;
}
}



