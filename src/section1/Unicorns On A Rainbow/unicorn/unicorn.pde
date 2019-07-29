PImage rainbow;
PImage unicorn;
void setup () {
  rainbow=loadImage("Rainbow.svg");
  size(800,600);
  rainbow.resize(600,600);
  background(rainbow);
  unicorn= loadImage("unicorn.jpg");
}
void draw () {
   background(rainbow);
  image(unicorn, mouseX, mouseY);
}
