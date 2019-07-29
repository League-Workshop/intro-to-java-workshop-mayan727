PImage mustache; 
PImage friend;
void setup() {
  mustache = loadImage("mustache.png");
  friend = loadImage("mews.png");
  size(800,600);
  friend.resize(800,600);
  mustache.resize(200,200);
   
} 
void draw(){
   background(friend);
  if(mousePressed) {
     image(mustache,mouseX,mouseY);

 }
}
