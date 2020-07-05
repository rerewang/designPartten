package com.company.c1;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();

        mallard.setFlyBehavior(new FlyRocketPowered());
        mallard.performFly();

        Duckcall duckcall = new Duckcall();
        duckcall.setQuackBehavior(new Quack());
        duckcall.performQuack();
    }
}
