package com.rishi.nomnom.util;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by rishi on 10/6/17.
 */

public enum TabType {
    MAP_TAB(0),
    LIST_TAB(1);

    private int value;
    private static Map<Integer, TabType> map = new HashMap<>();

    TabType(int value) {
        this.value = value;
    }

    static {
        for (TabType pageType : TabType.values()) {
            map.put(pageType.value, pageType);
        }
    }

    public static TabType valueOf(int pageType) {
        return map.get(pageType);
    }

    public int getValue() {
        return value;
    }
}
