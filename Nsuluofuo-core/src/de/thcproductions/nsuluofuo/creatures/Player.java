package de.thcproductions.nsuluofuo.creatures;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

	private Sprite player;
	private int speed;
	private float x,y;

	public Player() {
		this.player = new Sprite(new Texture("ann.png"));
	}

	public void render(SpriteBatch batch) {
		batch.draw(player, 
				player.getX(), 
				player.getY(), 
				player.getOriginX(), 
				player.getOriginY(), 
				player.getWidth(),
				player.getHeight(), 
				player.getScaleX(), 
				player.getScaleY(), 
				player.getRotation());
	}
	
	public void move(int speed) {
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y += speed;
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {
			x -= speed;
		}
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y -= speed;
		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {
			x += speed;
		}
		
		player.setPosition(x, y);
	}

	public Sprite getPlayer() {
		return player;
	}

	public void setPlayer(Sprite player) {
		this.player = player;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

}
