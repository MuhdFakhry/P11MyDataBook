package com.example.p11_mydatabook;

import java.io.Serializable;

public class Drawer implements Serializable {

    private String icon;
    private String tab;

    public Drawer(String icon, String tab) {
        this.icon = icon;
        this.tab = tab;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTab() {
        return tab;
    }

    public void setTab(String tab) {
        this.tab = tab;
    }
}
