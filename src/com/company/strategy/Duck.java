package com.company.strategy;

public abstract class Duck {

    //为行为接口类型声明两个引用变量，所有Duck子类都继承它们
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    //动态设置flyBehavior
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    //动态设置quackBehavior
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    //将quack行为委托给quackBehavior
    public void performQuack() {
        quackBehavior.quack();
    }

    //将quack行为委托给quackBehavior
    public void performFly() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }
}
