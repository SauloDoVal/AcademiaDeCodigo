package org.academiadecodigo.bootcamp;

import org.academiadecodigo.simplegraphics.pictures.Picture;

public class DrawPictures {
    public final int CELL_SIZE = 20;

    Picture pictureField = new Picture(CELL_SIZE, CELL_SIZE  , "pics/Field.png");
    Picture pictureWINNER = new Picture(CELL_SIZE, CELL_SIZE, "pics/winningPannel.png");
    Picture pictureGameOver = new Picture(CELL_SIZE, CELL_SIZE  , "pics/GAME OVER.png");
    Picture pictureEnemy1 = new Picture(120, 730, "pics/EnemyCropped.png");
    Picture pictureEnemy2 = new Picture(270, 20, "pics/EnemyCropped.png");
    Picture pictureEnemy3 = new Picture(420, 730, "pics/EnemyCropped.png");
    Picture pictureEnemy4 = new Picture(570, 20, "pics/EnemyCropped.png");
    Picture pictureEnemy5 = new Picture(720, 730, "pics/EnemyCropped.png");
    Picture pictureEnemy6 = new Picture(870, 20, "pics/EnemyCropped.png");
    Picture pictureEnemy7 = new Picture(870, 20, "pics/EnemyCropped.png");
    Picture pictureEnemy8 = new Picture(870, 20, "pics/EnemyCropped.png");
    Picture heart1 = new Picture(1120, 15, "pics/Heart_50.png");
    Picture heart2 = new Picture(1020, 15, "pics/Heart_50.png");
    Picture heart3 = new Picture(920, 15, "pics/Heart_50.png");

    private int indexUP = 0;
    private int indexDOWN = 0;

    public void drawGamePictures() {
        pictureField.draw();
        pictureEnemy1.draw();
        pictureEnemy2.draw();
        pictureEnemy3.draw();
        pictureEnemy4.draw();
        pictureEnemy5.draw();
        pictureEnemy6.draw();
        heart1.draw();
        heart2.draw();
        heart3.draw();

    }

    public void translateEnemiesUP(Picture picture, int sleep) throws InterruptedException {

            if (indexUP < 36) {
                Thread.sleep(sleep);
                picture.translate(0,-80);

                indexUP++;
            } else if (indexUP < 72) {
                Thread.sleep(sleep);
                picture.translate(0, 80);

                indexUP++;
            } else {
                indexUP = 0;
            }
        }

    public void translateEnemiesDOWN(Picture picture, int sleep) throws InterruptedException {

        if (indexDOWN < 36) {
            Thread.sleep(sleep);
            picture.translate(0,80);

            indexDOWN++;
        } else if (indexDOWN < 72) {
            Thread.sleep(sleep);
            picture.translate(0, -80);
            indexDOWN++;
        } else {
            indexDOWN = 0;
        }
    }

    public int getPictureEnemy1X() {
        return pictureEnemy1.getX();
    }
    public int getPictureEnemy1Y() {
        return pictureEnemy1.getY();
    }

    public int getPictureEnemy2X() {
        return pictureEnemy2.getX();
    }
    public int getPictureEnemy2Y() {
        return pictureEnemy2.getY();
    }

    public int getPictureEnemy3X() {
        return pictureEnemy3.getX();
    }
    public int getPictureEnemy3Y() {
        return pictureEnemy3.getY();
    }

    public int getPictureEnemy4X() {
        return pictureEnemy4.getX();
    }
    public int getPictureEnemy4Y() {
        return pictureEnemy4.getY();
    }

    public int getPictureEnemy5X() {return pictureEnemy5.getX();
    }
    public int getPictureEnemy5Y() {
        return pictureEnemy5.getY();
    }

    public int getPictureEnemy6X() {
        return pictureEnemy6.getX();
    }
    public int getPictureEnemy6Y() {
        return pictureEnemy6.getY();
    }





    public int getPictureEnemy1MaxX() {
        return pictureEnemy1.getMaxX();
    }
    public int getPictureEnemy1MaxY() {
        return pictureEnemy1.getMaxY();
    }
    public int getPictureEnemy2MaxX() {
        return pictureEnemy2.getMaxX();
    }
    public int getPictureEnemy2MaxY() {return pictureEnemy2.getMaxY();}


    public int getPictureEnemy3MaxX() {
        return pictureEnemy3.getMaxX();
    }
    public int getPictureEnemy3MaxY() {return pictureEnemy3.getMaxY();}

    public int getPictureEnemy4MaxX() {
        return pictureEnemy4.getMaxX();
    }
    public int getPictureEnemy4MaxY() {return pictureEnemy4.getMaxY();}

    public int getPictureEnemy5MaxX() {
        return pictureEnemy5.getMaxX();
    }
    public int getPictureEnemy5MaxY() {return pictureEnemy5.getMaxY();}

    public int getPictureEnemy6MaxX() {
        return pictureEnemy6.getMaxX();
    }
    public int getPictureEnemy6MaxY() {return pictureEnemy6.getMaxY();}



}


