package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.me.mygdxgame.*;
public class Liberals 
{
int x;
int y;
public Texture image;



public Liberals()
{
	x = 0;
	y =  500;
	liberalimage();
}


public int getX() {
	return x;
}


public void setX(int x) {
	this.x = x;
}


public int getY() {
	return y;
}


public void setY(int y) {
	this.y = y;
}


public void liberalimage()
{
	image = new Texture(Gdx.files.internal("data/democratic-donkey.jpg"));
}

}





