package com.me.mygdxgame;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Character extends MyGdxGame 
{
	float x;
	float y;
	public Texture image;
	
	public Character()
	{
		x=100;
		y=100;
		characterimage();
	}
	public void move_left ()
	{
		 getX(); 
		 setX(x);
		 x=x-5;
	}
	public void move_up()
	{
		 getY();
		 setY(y);
		 y=y+5;
	}
	public void move_down()
	{
		getY();
		setY(y);
		y=y-5;
	}
	public void move_right()
	{
		getX();
		setX(x);
		x=x+5;
	}
	
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public void characterimage()
	{
		image = new Texture(Gdx.files.internal("data/alg_host_bill-oreilly1.jpg"));
	}
		
}