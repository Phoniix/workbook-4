package com.pluralsight.objects;

public enum MenuOptions {
    MAIN_MENU('0'),
    RESERVATION_SCREEN('R'),
    EMPLOYEE_HOME('E'),
    CUSTOMER_HOME('C'),
    MODIFY_ROOM_SCREEN('M'),
    EXIT_APP('X');

    private final char MENU_CODE;

    MenuOptions (char menuCode) {
        this.MENU_CODE = menuCode;
    }

    public char getMENU_CODE () {
        return MENU_CODE;
    }
}
