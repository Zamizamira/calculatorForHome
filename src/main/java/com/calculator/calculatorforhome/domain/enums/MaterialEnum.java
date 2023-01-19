package com.calculator.calculatorforhome.domain.enums;

public enum MaterialEnum {

    SAND_BLOCK ("Пескоблок"),
    FOAM_BLOCK ("Пеноблок"),
    BRICK("Кирпич"),
    LAMINATE("Ламинат"),
    LINOLEUM("Линолеум"),
    PARQUET("Паркет"),
    CERAMIC_TILE("Керамическая плитка"),
    OSB("ОСБ"),
    SLATE("Шифер"),
    TILE("Черепица"),
    PROFILED("Профнастил"),
    CEMENT("Цемент"),
    SAND("Песок"),
    CRUSHED("Щебень"),
    STONE_REINFORCEMENT("Арматура");

    private final String name;
    MaterialEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
