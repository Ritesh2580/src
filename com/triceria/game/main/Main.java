package com.triceria.game.main;
import com.triceria.game.*;
public class Main
{
public static void main(String gg[])
{
Game game;
Player result[];
Player p;
int total[];
int current[];
int i,j,r;
int numberOfPlayers=4;
int numberOfIterations=50;
game=new Game(numberOfPlayers);
game.play();
result=game.getResult();
total=new int[result.length];
for(i=0;i<result.length;++i)
{
p=result[i];
if(p.getChoice().getChoice()==0)System.out.print("Player "+(i+1)+": Rock   | ");
if(p.getChoice().getChoice()==1)System.out.print("Player "+(i+1)+": Paper  | ");
if(p.getChoice().getChoice()==2)System.out.print("Player "+(i+1)+": Scissor| ");
}
System.out.print("\n");
for(i=0;i<result.length;++i)
{
p=result[i];
total=p.getResult();
System.out.print("Player : "+(i+1)+" | ");
for(j=0;j<total.length;++j)System.out.print(total[j]+" ");
System.out.print("\n");
}

for(i=0;i<numberOfIterations;++i)
{
System.out.println("-------------------------------------------------------");
game=new Game(numberOfPlayers);
game.play();
result=game.getResult();
for(j=0;j<result.length;++j)
{
p=result[j];
if(p.getChoice().getChoice()==0)System.out.print("Player "+(j+1)+": Rock   | ");
if(p.getChoice().getChoice()==1)System.out.print("Player "+(j+1)+": Paper  | ");
if(p.getChoice().getChoice()==2)System.out.print("Player "+(j+1)+": Scissor| ");
}
System.out.print("\n");
for(r=0;r<result.length;++r)
{
p=result[r];
current=p.getResult();
System.out.print("Player : "+(r+1)+" | ");
for(j=0;j<current.length;++j)
{
total[j]+=current[j];
System.out.print(total[j]+" ");
}
System.out.print("\n");
}


}






}
}