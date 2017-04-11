package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.scenes.scene2d.Stage;



public class PrimeraPantalla implements Screen {

    private Main game;
    public static BitmapFont font;
    private GlyphLayout textLayout;
    private FileHandle fontFile;


    public PrimeraPantalla(Main game) {

        this.game = game;

        fontFile = Gdx.files.internal("fonts/space.fnt");


    }

    @Override
    public void show() {

    }

    @Override
    public void render(float delta) {

        font = new BitmapFont(fontFile, false);
        font.getData().setScale(0.1f);
        textLayout = new GlyphLayout();
        textLayout.setText(font,"SUPERKOALIO");
        // Si es fa clic en la pantalla, canviem la pantalla

        if (Gdx.input.isTouched())
        {
            game.setScreen(new SuperKoalio());
            dispose();
        }

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