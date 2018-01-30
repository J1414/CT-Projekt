package de.thcproductions.nsuluofuo.map;

//Map
//author: Julian Pieles
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TiledMapRenderer;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;

public class Map {
	
	private TiledMap map;
	private TiledMapRenderer tmr;
	private OrthographicCamera camera;
	
	public Map() {
		
	}
	
	public void create() {
		map = new TmxMapLoader().load("map.tmx");
		tmr = new OrthogonalTiledMapRenderer(map);
		float w = Gdx.graphics.getWidth();
		float h = Gdx.graphics.getHeight();
		camera = new OrthographicCamera(1, h/w);
	}
	
	public void render(SpriteBatch batch) {
		batch.setProjectionMatrix(camera.combined);
		tmr.setView(camera);
	}

}
