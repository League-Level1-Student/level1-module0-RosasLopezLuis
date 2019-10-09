int xBall ;
int yBall ;
int xSpeed = 5;
int ySpeed = 6;
int xPaddle;
int yPaddle = 450;
int paddleLength = 100;
PImage backgroundImage;
import ddf.minim.*;
//Minim minim;
//AudioSample sound;
void setup(){
size(320,480);
//minim = new Minim (this);
//sound = minim.loadSample("pong.wav", 128);
backgroundImage = loadImage("pong.png");
}
void draw(){
  xPaddle = mouseX;
background(0);
image(backgroundImage, 0, 0);
image(backgroundImage, 0 , 0, width, height);
fill(0);
rect(xPaddle,yPaddle, paddleLength, 10);
fill(#0046FF);
stroke(#0046FF);
ellipse(xBall,yBall,10,10);
if(xBall < width){
  xBall = xBall + xSpeed;
}
if(xBall == 0){
xSpeed = -xSpeed;
xBall = xBall + xSpeed;
}
if(xBall >= width){
xSpeed = -xSpeed;
xBall = xBall + xSpeed;
}
  if(yBall < height){
  yBall = yBall + ySpeed;
  }

  if(yBall > yPaddle + 22){
  ySpeed = 0;
  xSpeed = 0;
  //sound.tigger();
  }
  if(yBall == 0){
  ySpeed = -ySpeed;
  yBall = yBall + ySpeed; 
  }
  if(yBall > yPaddle && xBall > xPaddle  ){
  ySpeed = -ySpeed;
  yBall = yBall+ySpeed;
  }
  
  //boolean intersects(int xBall, yBall, int xPaddle, int yPaddle, int paddleLength) {
   //if(yBall > yPaddle && xBall > xPaddle && xBall < xPaddle + paddleLength)
   //   return true;
    //else
    //  return false;
  
 //}
}
