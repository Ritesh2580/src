package com.triceria.game;
public class Player
{
private Choice choice;
private int result[];
public Player()
{
this.choice=null;
this.result=new int[4];
}
public Player(Choice choice)
{
this.choice=choice;
this.result=new int[4];
}
public void setChoice(Choice choice)
{
this.choice=choice;
}
public Choice getChoice()
{
return this.choice;
}
public void setScore(int score,int index)
{
this.result[index]=score;
}
public int[] getResult()
{
return this.result;
}
}
