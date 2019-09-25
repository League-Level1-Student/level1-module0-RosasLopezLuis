int xBall;
int xSpeed = 5;
void setup(){
size(320,480);
}
void draw(){
background(0);
fill(#0046FF);
stroke(#0046FF);
ellipse(xBall,100,10,10);
if(xBall < width){
  xBall = xBall + xSpeed;
}
if(xBall >= width){
xSpeed = -xSpeed;
xBall = xBall + xSpeed;
}
}
