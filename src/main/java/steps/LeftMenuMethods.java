package steps;

import pageObject.LeftMenu;

public class LeftMenuMethods {
    LeftMenu leftMenu = new LeftMenu();

    public LeftMenuMethods selectMP3Players() {
        leftMenu.mp3Players.click();
        return this;
    }

}
