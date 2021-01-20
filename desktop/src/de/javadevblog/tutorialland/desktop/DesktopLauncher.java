package de.javadevblog.tutorialland.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import de.javadevblog.tutorialland.SpaceGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.width = SpaceGame.WIDTH;
		config.height = SpaceGame.HEIGHT;
		config.title = SpaceGame.TITLE;
		config.resizable = false;
		new LwjglApplication(new SpaceGame(), config);
	}
}
