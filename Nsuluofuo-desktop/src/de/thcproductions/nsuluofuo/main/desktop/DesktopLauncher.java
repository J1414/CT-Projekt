package de.thcproductions.nsuluofuo.main.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.thcproductions.nsuluofuo.main.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 640;
		config.height = 480;
		config.title = "Nsuluofuo";
		config.vSyncEnabled = false;
		
		new LwjglApplication(new Game(), config);
	}
}
