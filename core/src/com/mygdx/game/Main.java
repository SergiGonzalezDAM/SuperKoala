package com.mygdx.game;


import com.badlogic.gdx.Game;


public class Main extends Game {
    /**
     * Por algún motivo no funciona el cambio de pantalla ni se plasma
     */
    @Override
    public void create() {
        setScreen(new PrimeraPantalla(this));
    }

    // Cridem per descartar els recursos carregats.
    @Override
    public void dispose() {
        super.dispose();
    }
}
