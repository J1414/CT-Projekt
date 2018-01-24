package de.thcproductions.nsuluofuo.main;

//author: Julian Pieles
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import de.thcproductions.nsuluofuo.creatures.Player;

public class Game extends ApplicationAdapter {
	SpriteBatch batch;
	Sprite thc;
	Player player;

	@Override
	public void create() {
		batch = new SpriteBatch();
		thc = new Sprite(new Texture("THC Schriftzug.png"));
		player = new Player(0);
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0.2f, 0.5f, 0.8f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(thc, 10, 10);
		player.render(batch);
		player.move(5);
		batch.end();
		

	}

	

	@Override
	public void dispose() {
		batch.dispose();

	}
}
