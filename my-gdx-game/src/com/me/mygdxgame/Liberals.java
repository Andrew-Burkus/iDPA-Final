package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class Liberals {
int x;
int y;
public Texture image;



public Liberals()
{
	x = 300;
	y =  500;
	liberalimage();
}


public void liberalimage()
{
	image = new Texture(Gdx.files.internal("data/democratic-donkey.jpg"));
}

public void die()
{
	
}


}
