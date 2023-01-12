package org.academiadecodigo.bootcamp;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        DrawPictures gamePicture = new DrawPictures();
        PictureJohn pictureJohn = new PictureJohn();



        gamePicture.drawGamePictures();
        pictureJohn.draw();
        pictureJohn.drawStartMenu();

        int counter = 0;


                while (true) {
                    gamePicture.translateEnemiesUP(gamePicture.pictureEnemy1, 50);
                    gamePicture.translateEnemiesDOWN(gamePicture.pictureEnemy2, 0);
                    gamePicture.translateEnemiesUP(gamePicture.pictureEnemy3, 0);
                    gamePicture.translateEnemiesDOWN(gamePicture.pictureEnemy4, 0);
                    gamePicture.translateEnemiesUP(gamePicture.pictureEnemy5, 50);
                    gamePicture.translateEnemiesDOWN(gamePicture.pictureEnemy6, 50);
                    gamePicture.translateEnemiesUP(gamePicture.pictureEnemy7, 30);
                    gamePicture.translateEnemiesDOWN(gamePicture.pictureEnemy8, 20);

                    boolean colide1 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy1X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy1MaxX()) &&
                            (pictureJohn.getPictureJohnY() == gamePicture.getPictureEnemy1Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy1MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy1MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy1X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy1MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy1Y()));

                    boolean colide2 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy2X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy2MaxX()) &&
                            (pictureJohn.getPictureJohnY() >= gamePicture.getPictureEnemy2Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy2MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy2MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy2X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy2MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy2Y()));

                    boolean colide3 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy3X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy3MaxX()) &&
                            (pictureJohn.getPictureJohnY() >= gamePicture.getPictureEnemy3Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy3MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy3MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy3X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy3MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy3Y()));

                    boolean colide4 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy4X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy4MaxX()) &&
                            (pictureJohn.getPictureJohnY() >= gamePicture.getPictureEnemy4Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy4MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy4MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy4X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy4MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy4Y()));

                    boolean colide5 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy5X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy5MaxX()) &&
                            (pictureJohn.getPictureJohnY() >= gamePicture.getPictureEnemy5Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy5MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy5MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy5X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy5MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy5Y()));

                    boolean colide6 = ((pictureJohn.getPictureJohnX() == gamePicture.getPictureEnemy6X()) &&
                            (pictureJohn.getPictureJohnX() <= gamePicture.getPictureEnemy6MaxX()) &&
                            (pictureJohn.getPictureJohnY() >= gamePicture.getPictureEnemy6Y()) &&
                            (pictureJohn.getPictureJohnY() <= gamePicture.getPictureEnemy6MaxY()))
                            ||
                            ((pictureJohn.getPictureJohnMaxX() <= gamePicture.getPictureEnemy6MaxX()) &&
                                    (pictureJohn.getPictureJohnMaxX() >= gamePicture.getPictureEnemy6X()) &&
                                    (pictureJohn.getPictureJohnMaxY() <= gamePicture.getPictureEnemy6MaxY()) &&
                                    (pictureJohn.getPictureJohnMaxY() >= gamePicture.getPictureEnemy6Y()));


                    if (colide1) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                            counter = counter + 1;
                        } else if (colide2) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                        counter = counter + 1;
                    } else if (colide3) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                        counter = counter + 1;
                    } else if (colide4) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                        counter = counter + 1;
                    } else if (colide5) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                        counter = counter + 1;
                    } else if (colide6) {
                        pictureJohn.pictureJohn.translate(0 - pictureJohn.getPictureJohnX(), 350 - pictureJohn.getPictureJohnY());
                        

                    } else if (pictureJohn.getPictureJohnX() >= 1035 && pictureJohn.getPictureJohnY() >= 330) {
                        pictureJohn.pictureJohn.delete();
                        pictureJohn.pictureJohnCrown.draw();
                        gamePicture.pictureWINNER.draw();

                    }

                    if (counter == 1){
                        gamePicture.heart1.delete();
                    }
                    else if ((counter == 2)){
                        gamePicture.heart2.delete();
                    }
                    else if ((counter == 3)){
                        gamePicture.heart3.delete();
                    }
                    else if ((counter >= 4)){
                            gamePicture.pictureField.delete();
                            pictureJohn.pictureJohn.delete();
                            gamePicture.pictureEnemy1.delete();
                            gamePicture.pictureEnemy2.delete();
                            gamePicture.pictureEnemy3.delete();
                            gamePicture.pictureEnemy4.delete();
                            gamePicture.pictureEnemy5.delete();
                            gamePicture.pictureEnemy6.delete();
                            gamePicture.pictureGameOver.draw();



                }
        }
    }
}

