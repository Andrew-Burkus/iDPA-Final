package com.me.mygdxgame;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector2;

public class America {
	
	public Texture image;
	public Vector2 position;
	
	public America()
	{
		random();
		characterimage();
	}

/////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
public void characterimage()
{
	 image = new Texture(Gdx.files.internal("data/AMERICA.jpg"));
}

public void random()
{
	Random num = new Random();
	position.x = num.nextInt(800);
	position.y = num.nextInt(800);
	
}


}