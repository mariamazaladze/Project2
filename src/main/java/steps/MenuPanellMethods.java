package steps;

import pageObject.LeptopsAndNotebooks;
import pageObject.MenuPanell;

public class MenuPanellMethods {

    MenuPanell menuPanell = new MenuPanell();


    public MenuPanellMethods LaptopsAndNotebooksClick() {
        menuPanell.LaptopsAndNotebooks.click();
        return this;
    }

    public MenuPanellMethods showAllLaptops() {
        menuPanell.showAllLaptops.click();
        return this;
    }

    public MenuPanellMethods DesktopsClick() {
        menuPanell.Desktops.click();
        return this;
    }

    public MenuPanellMethods showAllDesktops() {
        menuPanell.showAllDesktops.click();
        return this;
    }

}
