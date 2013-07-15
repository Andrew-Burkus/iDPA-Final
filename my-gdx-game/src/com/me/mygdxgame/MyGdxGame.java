package com.me.mygdxgame;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MyGdxGame implements ApplicationListener 
{

	private SpriteBatch batch;
	private Character ted;
	private double deltaTime;
	FoxNews Fox;
	@Override
	public void create() 
	{		
		batch = new SpriteBatch();
		ted = new Character();
		Fox = new FoxNews();
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
