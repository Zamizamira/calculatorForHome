package com.calculator.calculatorforhome.domain.enums;

public enum Size {
    WIDTH ("Ширина"),
    HEIGHT ("Высота"),
    LENGTH ("Длина"),
    THICKNESS ("Толщина");


    private String name;
    Size(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
