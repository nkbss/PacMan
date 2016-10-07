package com.pacman.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class PacmanGame extends Game{
	public SpriteBatch batch;
	
	@Override
	   public void create () {
        batch = new SpriteBatch();
        setScreen(new GameScreen(this));
    }
 
	 public void render(float delta) {
	    System.out.println("Hello " + delta);
	    }
 
    @Override
    public void dispose () {
        batch.dispose();
    }
}
