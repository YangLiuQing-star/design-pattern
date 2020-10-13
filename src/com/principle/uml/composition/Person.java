package com.principle.uml.composition;

public class Person {
    private IDCard card;//聚合关系

    private Head head = new Head();//组合关系

    public void setCard(IDCard card) {
        this.card = card;
    }
}
