int yDrop;
int randomNumber = (int) random(width);
int score = 0;

void setup(){
  size(800,800);
}

void draw(){
  background(#000000);
  
  if(yDrop == 800){
  yDrop = 0;
  randomNumber = (int) random(width);
  }
  fill(#0046FF);
  stroke(#0046FF);
  ellipse(randomNumber, yDrop, 2, 10);
  yDrop = yDrop + 5;
  if(randomNumber == mouseX){
  score++;  
  }
  rect(mouseX,750,50,70);
  checkCatch(randomNumber);
}

void checkCatch(int x){
  if(x > mouseX && x<mouseX+70 && yDrop > 795)
    score++;
  else if (score > 0 && yDrop == 0 )
    score--;
  println("Your score is now: " + score);
}
