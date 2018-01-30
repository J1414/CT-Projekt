package de.thcproductions.nsuluofuo.main;

//GAME
//author: Julian Pieles
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.thcproductions.nsuluofuo.entity.Player;
import de.thcproductions.nsuluofuo.map.Map;

public class Game extends ApplicationAdapter {
	private SpriteBatch batch;
	private Sprite img;
	private Sprite splashScreen;
	private Player player;
	private Map map;
	public boolean fullScreen;
	
	public Game() {
		
	}

	public void create() {
		batch = new SpriteBatch();
		player = new Player("Spieler");
		splashScreen = new Sprite(new Texture("splashScreen.png"));
	}

	public void render() {
		Gdx.gl.glClearColor(0.5f, 0.0f, 0.0f, 1.0f);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		map.render(batch);
		batch.begin();
		splashScreen.draw(batch);;
		player.render(batch);
		batch.end();

	}

	public void dispose() {
		batch.dispose();

	}

	public boolean isFullScreen() {
		return fullScreen;
	}

	public void setFullScreen(boolean fullScreen) {
		this.fullScreen = fullScreen;
	}
	
	
}
