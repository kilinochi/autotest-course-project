package com.kilinochi.page.music;

public enum MusicDomain {
    MyMUSIC,
    RADIO,
    COMPILATION,
    UPDATE;

    public String domainName() {
        switch (name()) {
            case "MyMUSIC": return " __library";
            case "RADIO": return " __radio";
            case "COMPILATION": return " __collections";
            case "UPDATE": return " __activity";
            default: throw new IllegalArgumentException("DOMAIN NAME NOT EXIST");
        }
    }
}
