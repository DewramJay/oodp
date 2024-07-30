

abstract class shape{
    public abstract void draw();
}


class rectangle extends shape{
    @Override
    public void draw(){
        System.out.println("rectangle");
    }
}

class circle extends shape{
    @Override
    public void draw(){
        System.out.println("circle");
    }
}

class square extends shape{
    @Override
    public void draw(){
        System.out.println("squre");
    }
}


abstract class creator {
    public abstract shape factorymethod();
}

class createA extends creator {
    @Override
    public shape factorymethod(){
        return new rectangle();
    }
}

class createB extends creator {
    @Override
    public shape factorymethod(){
        return new circle();
    }
}

class createC extends creator {
    @Override
    public shape factorymethod(){
        return new square();
    }
}

public class demo {
    public static void main(String[] args) {
        creator creatorA = new createA();
        shape productA = creatorA.factorymethod();
        productA.draw();
 
        creator creatorB = new createB();
        shape productB = creatorB.factorymethod();
        productB.draw();

        creator creatorC = new createC();
        shape productC = creatorC.factorymethod();
        productC.draw();
    }
}
