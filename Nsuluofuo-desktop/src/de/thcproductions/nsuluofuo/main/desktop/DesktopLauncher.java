package de.thcproductions.nsuluofuo.main.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

import de.thcproductions.nsuluofuo.main.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		
		config.width = 640;
		config.height = 360;
		config.title = "Nsuluofuo";
		config.vSyncEnabled = false;
		config.addIcon("icon.png", Files.FileType.Internal);
		
		new LwjglApplication(new Game(), config);
	}
}
