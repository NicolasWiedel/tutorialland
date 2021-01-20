package de.javadevblog.tutorialland.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import de.javadevblog.tutorialland.SpaceGame;

public class MainMenuScreen implements Screen {

    public static final int EXIT_BUTTON_WIDTH = 250;
    public static final int EXIT_BUTTON_HEIGHT = 120;
    public static final int PLAY_BUTTON_WIDTH = 300;
    public static final int PLAY_BUTTON_HEIGHT = 120;
    public static final int EXIT_BUTTON_Y = 100;
    public static final int PLAY_BUTTON_Y = 230;

    private SpaceGame game;

    private Texture playButtonActive;
    private Texture playButtonInactive;
    private Texture exitButtonActive;
    private Texture exitButtonInactive;

    public MainMenuScreen(SpaceGame game){
        this.game = game;
        playButtonActive = new Texture("play_button_active.png");
        playButtonInactive = new Texture("play_button_inactive.png");
        exitButtonActive = new Texture("exit_button_active.png");
        exitButtonInactive = new Texture("exit_button_inactive.png");
    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        Gdx.gl.glClearColor(0.392f, 0.583f, 0.929f, 1f);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        game.getBatch().begin();

        int x = SpaceGame.WIDTH / 2 - EXIT_BUTTON_WIDTH / 2;
        if (Gdx.input.getX() < x + EXIT_BUTTON_WIDTH && Gdx.input.getX() > x
                && SpaceGame.HEIGHT - Gdx.input.getY() < EXIT_BUTTON_Y + EXIT_BUTTON_HEIGHT
                && SpaceGame.HEIGHT - Gdx.input.getY() > EXIT_BUTTON_Y){
            game.getBatch().draw(exitButtonActive,
                    x,
                    EXIT_BUTTON_Y,
                    EXIT_BUTTON_WIDTH,
                    EXIT_BUTTON_HEIGHT);
            if (Gdx.input.isTouched()){
                Gdx.app.exit();
            }
        }
        else {
            game.getBatch().draw(exitButtonInactive,
                    x,
                    EXIT_BUTTON_Y,
                    EXIT_BUTTON_WIDTH,
                    EXIT_BUTTON_HEIGHT);
        }
        x = SpaceGame.WIDTH / 2 - PLAY_BUTTON_WIDTH / 2;
        if (Gdx.input.getX() < x + PLAY_BUTTON_WIDTH && Gdx.input.getX() > x
                && SpaceGame.HEIGHT - Gdx.input.getY() < PLAY_BUTTON_Y + PLAY_BUTTON_HEIGHT
                && SpaceGame.HEIGHT - Gdx.input.getY() > PLAY_BUTTON_Y){
            game.getBatch().draw(playButtonActive,
                    x,
                    PLAY_BUTTON_Y,
                    PLAY_BUTTON_WIDTH,
                    PLAY_BUTTON_HEIGHT);
            if(Gdx.input.isTouched()){
                this.dispose();
                game.setScreen(new MainGameScreen(game));
            }
        }
        else {
            game.getBatch().draw(playButtonInactive,
                    x,
                    PLAY_BUTTON_Y,
                    PLAY_BUTTON_WIDTH,
                    PLAY_BUTTON_HEIGHT);
        }



        game.getBatch().end();
    }

    @Override
    public void resize(int width, int height) {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {

    }
}
