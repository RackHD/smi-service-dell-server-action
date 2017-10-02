/**
 * Copyright © 2017 DELL Inc. or its subsidiaries.  All Rights Reserved.
 */
package com.dell.isg.smi.service.server.action.controller;

public enum ServerActionsEnum {

    POWER_ON("POWER_ON"), POWER_OFF("POWER_OFF"), REBOOT("REBOOT"), EJECT("EJECT"), RESET("RESET"), SET_TSM("SET_TSM"), CLEAR_TSM("CLEAR_TSM");

    private String _label;


    private ServerActionsEnum(String label) {
        _label = label;
    }


    public String getLabel() {
        return _label;
    }


    public String getValue() {
        return name();
    }


    @Override
    public String toString() {
        return _label;
    }
}
