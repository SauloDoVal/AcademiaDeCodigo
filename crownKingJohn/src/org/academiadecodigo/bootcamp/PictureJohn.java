package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import static org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent.*;
import static org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType.KEY_PRESSED;

public class PictureJohn implements KeyboardHandler {

    DrawPictures drawPictures = new DrawPictures();
    Picture pictureJohn;
    Picture pictureJohnCrown;
    Picture pictureGameStart;
    private Keyboard keyboard;

    public PictureJohn() {
        keyboard = new Keyboard(this);

        pictureJohn = new Picture(0, 350, "pics/JohnNoCrownCroppedRed.png");
        pictureJohnCrown = new Picture(1050, 350, "pics/JohnWithCrown.png");

        init();
    }
    public void draw() {
        pictureJohn.draw();
    }

    public void drawStartMenu() {
        pictureGameStart = new Picture(0, 0, "pics/ecraninicial.png");
        pictureGameStart.draw();
        pictureGameStart.grow(20,40);
    }

    public void init() {
        KeyboardEvent moveLeft = new KeyboardEvent();
        moveLeft.setKey(KEY_LEFT);
        moveLeft.setKeyboardEventType(KEY_PRESSED);

        KeyboardEvent moveRight = new KeyboardEvent();
        moveRight.setKey(KEY_RIGHT);
        moveRight.setKeyboardEventType(KEY_PRESSED);

        KeyboardEvent moveDOWN = new KeyboardEvent();
        moveDOWN.setKey(KEY_DOWN);
        moveDOWN.setKeyboardEventType(KEY_PRESSED);

        KeyboardEvent moveUP = new KeyboardEvent();
        moveUP.setKey(KEY_UP);
        moveUP.setKeyboardEventType(KEY_PRESSED);

        KeyboardEvent gameSTART = new KeyboardEvent();
        gameSTART.setKey(KEY_SPACE);
        gameSTART.setKeyboardEventType(KEY_PRESSED);


        keyboard.addEventListener(moveLeft);
        keyboard.addEventListener(moveUP);
        keyboard.addEventListener(moveDOWN);
        keyboard.addEventListener(moveRight);
        keyboard.addEventListener(gameSTART);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {
        switch (keyboardEvent.getKey()) {

            case KEY_LEFT:
                if (pictureJohn.getX() > drawPictures.CELL_SIZE) {
                }
                pictureJohn.translate(-drawPictures.CELL_SIZE, 0);

                break;
            case KEY_RIGHT:
                pictureJohn.translate(drawPictures.CELL_SIZE, 0);

                break;
            case KEY_UP:
                pictureJohn.translate(0, -drawPictures.CELL_SIZE);

                break;
            case KEY_DOWN:
                pictureJohn.translate(0, +drawPictures.CELL_SIZE);

                break;
            case KEY_SPACE:
                pictureGameStart.delete();
                break;
        }

    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

    }

    public int getPictureJohnX() {
        return pictureJohn.getX();
    }
    public int getPictureJohnY() {
        return pictureJohn.getY();
    }
    public int getPictureJohnMaxX() {
        return pictureJohn.getMaxX();
    }
    public int getPictureJohnMaxY() {
        return pictureJohn.getMaxY();
    }
}
