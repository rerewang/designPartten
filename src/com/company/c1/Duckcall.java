package com.company.c1;

public class Duckcall {
    QuackBehavior quackBehavior;

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}
