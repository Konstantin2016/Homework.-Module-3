package goit.homework.module4_1;


public class Area {
   private int triangleHeight; //высота треуголтника
   private int triangleBase; //основание треугольника
   private int circleRadius; //радиус круга
   private int rectanglWidt; //ширина прямоугольника
   private int rectanglLength; //длина прямоуголника

    public int getTriangleArea (){ //площадь треугольника
        return triangleHeight * triangleBase / 2;
    }
    public double getCircleArea (){ // площадь круга
        return 2 * Math.PI * circleRadius;
    }

    public int getRectangleArea(){ // площадь прямоугольника
        return rectanglWidt * rectanglLength;
    }
    //Area(int triangleHeight, int triangleBase, int circleRadius, int rectanglWidt, int rectanglLength){
    //    this.triangleHeight = triangleHeight;
    //    this.triangleBase = triangleBase;
    //    this.circleRadius = circleRadius;
     //   this.rectanglWidt = rectanglWidt;
     //   this.rectanglLength = rectanglLength;
   //}

    public int getTriangleHeight() {
        return triangleHeight;
    }

    public void setTriangleHeight(int triangleHeight) {
        this.triangleHeight = triangleHeight;
    }

    public int getTriangleBase() {
        return triangleBase;
    }

    public void setTriangleBase(int triangleBase) {
        this.triangleBase = triangleBase;
    }

    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }

    public int getRectanglWidt() {
        return rectanglWidt;
    }

    public void setRectanglWidt(int rectanglWidt) {
        this.rectanglWidt = rectanglWidt;
    }

    public int getRectanglLength() {
        return rectanglLength;
    }

    public void setRectanglLength(int rectanglLength) {
        this.rectanglLength = rectanglLength;
    }
}
