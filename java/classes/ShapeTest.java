abstract class Shape{
    
    protected int length;
    protected int width;

    public Shape(int l, int w){
        length = l;
        width = w;
    }

    public void draw(){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < length; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //abstract void foo();
}

class Rectangle extends Shape{
    public Rectangle( int l, int w){
        super(l, w);
    }
}

class Square extends Shape{
    public Square(int s){
        super(s, s);
    }
}

class Triangle extends Shape{
    public Triangle(int s){
        super(s, s);
    }

    public void draw(){
        for (int i = 0; i < width; i++){
            for (int j = 0; j < width - i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

public class ShapeTest{
    public static void main(String[] args){
        Rectangle r = new Rectangle(12, 4);
        Square s = new Square(6);
        Triangle t = new Triangle(7);

        r.draw();
        System.out.println();
        s.draw();
        System.out.println();
        t.draw();
    }
}