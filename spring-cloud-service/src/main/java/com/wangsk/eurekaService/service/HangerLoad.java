package com.wangsk.eurekaService.service;

public class HangerLoad {
    private final static HangerLoad hangerLoad = new HangerLoad();

    private HangerLoad(){

    }

    public HangerLoad getHangerLoad(){
        return hangerLoad;
    }
}
