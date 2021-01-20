package de.javadevblog.tutorialland;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import de.javadevblog.tutorialland.screens.MainMenuScreen;

public class SpaceGame extends Game {

	public static final String TITLE = "Space Game v1.0";
	public static final int WIDTH = 480;
	public static final int HEIGHT = 720;

	private SpriteBatch batch;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		setScreen(new MainMenuScreen(this));
	}

	@Override
	public void render () {
		super.render();
	}
	
	@Override
	public void dispose () {
		super.dispose();
		batch.dispose();
	}

	public SpriteBatch getBatch() {
		return batch;
	}
}
