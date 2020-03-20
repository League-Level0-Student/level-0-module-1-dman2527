void setup() {
    size(500, 500);
}
void draw() {
    background(200, 200, 200);
    noStroke();
    fill(#F50202);
    ellipse(150, 200, 150, 150);
    ellipse(212, 200, 150, 150);
    fill(#02F54D);
    rect(176, 103, 12, 32);
    if (mousePressed){
      fill(#C9C5C5);
      ellipse(90,200,50,50);
    }
}
