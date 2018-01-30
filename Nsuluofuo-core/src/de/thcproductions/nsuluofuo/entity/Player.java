package de.thcproductions.nsuluofuo.entity;

//author: Julian Pieles
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player {

	private String name;
	private Sprite pSprite;
	private float x, y;
	float speed = 1.5f;

	public Player(String name) {
		this.name = name;
		this.pSprite = new Sprite(new Texture("ann.png"));

	}

	public void create() {

	}

	public void render(SpriteBatch batch) {
		batch.draw(pSprite, pSprite.getX(), pSprite.getY(), pSprite.getOriginX(), pSprite.getOriginY(),
				pSprite.getWidth(), pSprite.getHeight(), pSprite.getScaleX(), pSprite.getScaleY(),
				pSprite.getRotation());
		move();
	}

	private void move() {
		if (Gdx.input.isKeyPressed(Keys.SHIFT_LEFT) || Gdx.input.isKeyPressed(Keys.SHIFT_RIGHT)) {
			speed = 3.5f;
		} else {
			speed = 1.5f;
		}
		if (Gdx.input.isKeyPressed(Keys.LEFT)) {

			x -= speed;

		}
		if (Gdx.input.isKeyPressed(Keys.RIGHT)) {

			x += speed;

		}
		if (Gdx.input.isKeyPressed(Keys.UP)) {
			y += speed;
		}
		if (Gdx.input.isKeyPressed(Keys.DOWN)) {
			y -= speed;
		}

		pSprite.setPosition(x, y);
	}

}
