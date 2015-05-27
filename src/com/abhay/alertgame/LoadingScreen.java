package com.abhay.alertgame;

import com.abhay.framework.Game;
import com.abhay.framework.Graphics;
import com.abhay.framework.Screen;
import com.abhay.framework.Graphics.ImageFormat;


public class LoadingScreen extends Screen {
    public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menu.jpg", ImageFormat.RGB565);
        Assets.monkey = g.newImage("monkey.jpg", ImageFormat.RGB565);
        Assets.click = game.getAudio().createSound("explode.ogg");


        
        game.setScreen(new MainMenuScreen(game));


    }


    @Override
    public void paint(float deltaTime) {


    }


    @Override
    public void pause() {


    }


    @Override
    public void resume() {


    }


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }
}