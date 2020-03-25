/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.event.Events;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Image;
import org.zkoss.zul.Messagebox;
import org.zkoss.zul.Window;

/**
 *
 * @author Ayu Cahyani
 */
public class controller extends SelectorComposer<Component> {

    @Wire
    Window winHome;

    @Wire
    Image image1, image2, image3, image4;

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp); //To change body of generated methods, choose Tools | Templates.
    }

    @Listen(Events.ON_CLICK + "=#image1")
    public void imageClicked() {
        ShowMessageDetail(imageDetail("1").replace("px", ""));
    }

    @Listen(Events.ON_CLICK + "=#image2")
    public void imageClicked2() {
        ShowMessageDetail(imageDetail("2").replace("px", ""));
    }

    @Listen(Events.ON_CLICK + "=#image3")
    public void imageClicked3() {
        ShowMessageDetail(imageDetail("3").replace("px", ""));
    }

    @Listen(Events.ON_CLICK + "=#image4")
    public void imageClicked4() {
        ShowMessageDetail(imageDetail("4").replace("px", ""));
    }

    public static void ShowMessageDetail(String msg) {
        String title = "Detail";
        String type = "z-messagebox-icon z-messagebox-information";
        org.zkoss.zul.Messagebox.show(msg, title, 1, type);
    }

    private String imageDetail(String code) {
        String detail1 = "This image is lyric for ";
        String detail = "";

        if (code.equals("1")) {
            detail = detail1 + " Pinochio. \nThis image size is : "
                    + image1.getWidth() + "x" + image1.getHeight();
        }
        if (code.equals("2")) {
            detail = detail1 + " LA Trains. \nThis image size is : "
                    + image1.getWidth() + "x" + image1.getHeight();
        }
        if (code.equals("3")) {
            detail = detail1 + " Otherside. \nThis image size is : "
                    + image1.getWidth() + "x" + image1.getHeight();
        }
        if (code.equals("4")) {
            detail = detail1 + " Guess Not. \nThis image size is : "
                    + image1.getWidth() + "x" + image1.getHeight();
        }
        return detail;
    }
}
