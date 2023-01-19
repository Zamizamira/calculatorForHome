package com.calculator.calculatorforhome.domain.enums;

public enum FoundationEnum {

    RIBBON_CONCRETE_FOUNDATION("Ленточный бетонный фундамент"),
    MONOLITHIC_SLAB("Монолитная плита");
    private final String name;
    FoundationEnum(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
