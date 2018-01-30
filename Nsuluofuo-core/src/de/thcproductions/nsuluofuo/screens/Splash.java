package de.thcproductions.nsuluofuo.screens;

import com.badlogic.gdx.Gdx;

//Splash
//author: Julian Pieles

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Splash implements Screen {

	private Sprite splashScreen;
	private SpriteBatch batch;
	
	public void show() {
		batch = new SpriteBatch();
		splashScreen = new Sprite(new Texture("splashScreen.png"));
		splashScreen.setSize(Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
	}

	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		splashScreen.draw(batch);
		batch.end();
	}

	public void resize(int width, int height) {

	}

	public void pause() {

	}

	public void resume() {

	}

	public void hide() {

	}

	public void dispose() {

	}

}
