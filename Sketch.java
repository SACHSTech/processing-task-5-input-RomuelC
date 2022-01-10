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
    if (keyPressed) {

      if (key == 'w') {
        background(114, 199, 30);
      }

      else if (key == 'a') {
        background(230, 185, 53);
      }

      else if (key == 's') {
        background(224, 74, 74);
      }

      else if (key == 'd') {
        background(242, 184, 209);
  }
}
  }
}