package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Intersector;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.TimeUtils;

public class MyGdxGame implements ApplicationListener 
{

	private SpriteBatch batch;
	private Character ted;
	private double deltaTime;
	private Liberals liberal;
	private FoxNews Fox;
	long lastspawntime;
	private Rectangle Bill;
	private RectangleEx Liberal;
	@Override
	
	public void create() 
	{		
		batch = new SpriteBatch();
		ted = new Character();
		Fox = new FoxNews();
		liberal = new Liberals();
		Bill = new Rectangle(ted.x,ted.y, 275, 183);
		Liberal=  new RectangleEx(liberal.getX(), liberal.getY(), 86, 64);
		
		Liberal.get
	}

	@Override
	public void dispose() 
	{
		batch.dispose();
	}
	
	public void update()
	{
		deltaTime = Gdx.graphics.getDeltaTime();//time between frames
		//do game logic here
		boolean isAPressed = Gdx.input.isKeyPressed(Keys.A);
		if(isAPressed==true)
		{
			ted.move_left();
		}
		boolean isWPressed = Gdx.input.isKeyPressed(Keys.W);
		if(isWPressed==true)
		{
			ted.move_up();
		}
		boolean isSPressed = Gdx.input.isKeyPressed(Keys.S);
		if(isSPressed==true)
		{
			ted.move_down();
		}
		boolean isDPressed = Gdx.input.isKeyPressed(Keys.D);
		if(isDPressed==true)
		{
			ted.move_right();
		}
	
	}
	 /*private void spawnLiberals() 
	  {
	      Rectangle liberals = new Rectangle();
	      liberals.x = MathUtils.random(0, 800-64);
	      liberals.y = 480;
	      lastspawntime = TimeUtils.nanoTime();
	   }*/
	
	@Override
	public void render() 
	{		
		update();
		
		//do draw stuff here
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
			batch.draw(ted.image, ted.x, ted.y);
			batch.draw(Fox.image, Fox.x, Fox.y);
			batch.draw(liberal.image, liberal.x, liberal.y);
		batch.end();
	}
	
	
	
	
	@Override
	public void resize(int width, int height) 
	{
	}

	@Override
	public void pause() 
	{
	}

	@Override
	public void resume() 
	{
	}
}
