package com.principle.ocp.improve;

/**
 * @author YangLiuQing
 * @date 2020/6/5 15:41
 * 开闭原则
 * 核心思想：对扩展开发（提供方），对修改关闭（使用方）
 */
public class OpenAndClose {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new Star());
    }
}

//这是一个用于绘图的类 [使用方]
class GraphicEditor {
    //接收Shape对象，然后根据type，来绘制不同的图形
    public void drawShape(Shape s) {
        s.drawShape();
    }
}


//Shape类，基类
abstract class Shape {
    int m_type;

    public abstract void drawShape();//抽象方法
}

//以下类继承Shape类
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void drawShape() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }

    @Override
    public void drawShape() {
        System.out.println("绘制圆形");
    }
}

//新增画三角形
class Triangle extends Shape {
    Triangle() {
        super.m_type = 3;
    }

    @Override
    public void drawShape() {
        System.out.println("绘制三角形");
    }
}

//新增图形---星形
class Star extends Shape{

    Star(){
        super.m_type = 4;
    }

    @Override
    public void drawShape() {
        System.out.println("绘制星形");
    }
}
