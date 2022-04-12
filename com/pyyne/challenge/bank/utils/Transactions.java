package com.pyyne.challenge.bank.utils;

public enum Transactions {

    DEBIT(2, "DEBIT"),
    CREDIT(1, "CREDIT");

    private int type;
    private String description;

    Transactions(int type, String description) {
        this.type = type;
        this.description = description;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
