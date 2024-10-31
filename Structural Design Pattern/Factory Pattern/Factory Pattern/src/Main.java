public class Main {
    public static void main(String[] args) {
        ShapeFactory obj = new ShapeFactory();
        Shape shapeObj = obj.getShape("CIRCLE");
        shapeObj.draw();
    }
}