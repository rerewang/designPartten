package com.company.strategy;

public class Duckcall {
    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
