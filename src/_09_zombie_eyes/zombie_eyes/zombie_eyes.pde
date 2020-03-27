
void setup() {

  PImage face = loadImage("grumpy-cat.jpg");
face.resize(499, 499);
image(face, 0, 0);
size(500, 500);
}
void draw() {
fill(mouseX, mouseY, 100);
ellipse(190, 300, 50, 50);
ellipse(320, 300, 50, 50);
fill(0,0,0);
ellipse(190, 300, 15, 15);
ellipse(320, 300, 15, 15);
}
