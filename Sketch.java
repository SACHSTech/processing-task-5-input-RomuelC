import processing.core.PApplet;

public class Sketch extends PApplet {
  String message = "";

  public void settings() {
    size(400, 400);
  }

  public void setup() {
    background(24, 101, 184);
    textSize(50);
  }

 
  public void draw() {
    if (mousePressed) {
      fill(156, 27, 191);
      noStroke();
      rect(mouseX - 40, mouseY - 40, 40, 40);
    }
  }
}