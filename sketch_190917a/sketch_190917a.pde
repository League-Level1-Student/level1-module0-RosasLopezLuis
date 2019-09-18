int yDrop;
int randomNumber = (int) random(width);
int score = 0;
void setup(){
  size(800,800);
}
void draw(){
  background(#000000);
  drawDrop();
  rect(mouseX,750,50,70);
  checkCatch(1);
}
void checkCatch(int x){
  if(x > mouseX && x<mouseX+100)
    score++;
  else if (score > 0)
    score--;
  println("Your score is now: " + score);
  fill(0,0,0);
  textSize(16);
  text("Score: " + score, 20,20);
}
void drawDrop(){
if(yDrop == 800){
  yDrop = 0;
  }
  fill(#0046FF);
  stroke(#0046FF);
  ellipse(randomNumber,yDrop,2,10);
  yDrop = yDrop + 10;
}
