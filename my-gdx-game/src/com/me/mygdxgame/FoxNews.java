package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class FoxNews {
	
	float x;
	float y;
	int health;
	public Texture image;
	
	public FoxNews()
	{
		x=300;
		y=20;
		health = 1000;
		Foximage();
	}



public void Foximage()
{
	image = new Texture(Gdx.files.internal("data/fox_news_logo_a_l.jpg"));
}

}