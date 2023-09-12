/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. I decided to draw Luke Skywalker as a child on Tatooine, his home planet.
 * Star Wars is one of my favorite fiction works and I thought this would be a cool
 * thing to do for my picture.
 * 
 * @author  Henry Petrillo
 * @version 2023.09.11
 */

 public class Picture
{
    private Circle sun1;
    private Circle sun2;
    private Square sky;
    private Square sand;
    private Circle dune1;
    private Circle dune2;
    private Circle dune3;
    private Circle dune4;
    private Circle dune5;
    private Circle dune6;
    private Square walls;
    private Triangle door;
    private Circle roof;
    private Person luke;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    { 
        sun1 = new Circle();
        sun2 = new Circle();
        sky = new Square();
        sand = new Square();
        dune1 = new Circle();
        dune2 = new Circle();
        dune3 = new Circle();
        dune4 = new Circle();
        dune5 = new Circle();
        dune6 = new Circle();
        walls = new Square();
        door = new Triangle();
        roof = new Circle();
        luke = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("blue");
            sky.changeSize(650);
            sky.moveVertical(-150);
            sky.moveHorizontal(-325);
            sky.makeVisible();

            sun1.changeColor("yellow");
            sun1.moveHorizontal(150);
            sun1.moveVertical(-40);
            sun1.changeSize(80);
            sun1.makeVisible();

            sun2.changeColor("yellow");
            sun2.moveHorizontal(50);
            sun2.moveVertical(-60);
            sun2.makeVisible();

            sand.changeColor("yellow");
            sand.changeSize(650);
            sand.moveVertical(100);
            sand.moveHorizontal(-340);
            sand.makeVisible();

            dune1.changeColor("yellow");
            dune1.changeSize(350);
            dune1.moveVertical(150);
            dune1.makeVisible();

            dune2.changeColor("yellow");
            dune2.changeSize(350);
            dune2.moveVertical(150);
            dune2.moveHorizontal(100);
            dune2.makeVisible();
            
            dune3.changeColor("yellow");
            dune3.changeSize(350);
            dune3.moveVertical(150);
            dune3.moveHorizontal(-100);
            dune3.makeVisible();

            dune4.changeColor("yellow");
            dune4.changeSize(350);
            dune4.moveVertical(150);
            dune4.moveHorizontal(-200);
            dune4.makeVisible();

            dune5.changeColor("yellow");
            dune5.changeSize(350);
            dune5.moveVertical(150);
            dune5.moveHorizontal(-300);
            dune5.makeVisible();

            dune6.changeColor("yellow");
            dune6.changeSize(350);
            dune6.moveVertical(150);
            dune6.moveHorizontal(-400);
            dune6.makeVisible();

            walls.changeColor("red");
            walls.changeSize(119);
            walls.moveVertical(30);
            walls.moveHorizontal(-210);
            walls.makeVisible();

            door.changeColor("magenta");
            door.changeSize(45, 60);
            door.moveHorizontal(-210);
            door.moveVertical(84);
            door.makeVisible();

            roof.changeColor("red");
            roof.changeSize(119);
            roof.moveHorizontal(-130);
            roof.moveVertical(9);
            roof.makeVisible();

            luke.moveVertical(40);
            luke.makeVisible();

            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sun1.changeColor("white");
        sun2.changeColor("white");
        sky.changeColor("black");
        sand.changeColor("white");
        dune1.changeColor("white");
        dune2.changeColor("white");
        dune3.changeColor("white");
        dune4.changeColor("white");
        dune5.changeColor("white");
        dune6.changeColor("white");
        walls.changeColor("black");
        door.changeColor("white");
        roof.changeColor("black");
        luke.changeColor("white");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sun1.changeColor("yellow");
        sun2.changeColor("yellow");
        sky.changeColor("blue");
        sand.changeColor("yellow");
        dune1.changeColor("yellow");
        dune2.changeColor("yellow");
        dune3.changeColor("yellow");
        dune4.changeColor("yellow");
        dune5.changeColor("yellow");
        dune6.changeColor("yellow");
        walls.changeColor("magenta");
        door.changeColor("red");
        roof.changeColor("magenta");
        luke.changeColor("black");
    }
}