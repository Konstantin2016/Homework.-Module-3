package goit.homework.module4_1;

public class Main {
    public static void main(String[] args){
        Area area = new Area();
            area.setCircleRadius(11);
            area.setRectanglLength(22);
            area.setRectanglWidt(33);
            area.setTriangleBase(44);
            area.setTriangleHeight(55);
        System.out.println("Area of the Circle:" + area.getCircleArea());
        System.out.println("Area of the Rectangle: " + area.getRectangleArea());
        System.out.println("Area of the Triangle: " + area.getTriangleArea());

    }
}
