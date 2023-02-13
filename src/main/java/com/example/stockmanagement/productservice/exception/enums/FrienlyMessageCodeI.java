package com.example.stockmanagement.productservice.exception.enums;

public enum FrienlyMessageCodeI implements IFriendlyMessageCode {
    OK(1000);
    private final int value;

    FrienlyMessageCodeI(int value) {
        this.value = value;
    }

    @Override
    public int getFriendlyMessageCode() {
        return value;
    }
}
