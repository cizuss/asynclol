package com.cizuss.asynclol.enums;

public enum APIHost {
    EUW("euw1.api.riotgames.com"),
    EUNE("eun1.api.riotgames.com"),
    NA("na1.api.riotgames.com"),
    RU("ru.api.riotgames.com"),
    KR("kr.api.riotgames.com"),
    BR("br1.api.riotgames.com"),
    OC("oc1.api.riotgames.com"),
    JP("jp1.api.riotgames.com"),
    TR("tr1.api.riotgames.com"),
    LA1("la1.api.riotgames.com"),
    LA2("la2.api.riotgames.com");


    private String value;

    private APIHost(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
