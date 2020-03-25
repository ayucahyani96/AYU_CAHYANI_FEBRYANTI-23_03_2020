/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.math.BigDecimal;
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
public class vendingMachine extends SelectorComposer<Component> {

    private String money[] = {"2000", "5000", "10000", "20000"};
    private String drinks[] = {"Aqua", "Teh Botol", "Pocari Sweat"};
    private String price[] = {"5000", "7000", "10000"};

    @Override
    public void doAfterCompose(Component comp) throws Exception {
        super.doAfterCompose(comp); //To change body of generated methods, choose Tools | Templates.
    }

    public void transaction() {
        int inputMoneys = 0;
        for (int i = 0; i < drinks.length; i++) {
            if (stock(drinks[i]) > 0) {
                for (String inputMoney : money) {
                    if (!inputMoney.equals(money)) {
                        Messagebox.show("We can't process your payment, please check the money's nominal.");
                    } else {
                        if (inputMoney.equals(money[i])) {

                        } else if (Integer.valueOf(inputMoney) > Integer.valueOf(money[i])) {
                            int Charge = Integer.valueOf(inputMoney) - Integer.valueOf(money[i]);
                        } else if (Integer.valueOf(inputMoney) < Integer.valueOf(money[i])) {
                            Messagebox.show("We can't process your payment, please check the money's nominal.");
                        }
                    }
                }
            } else {
                Messagebox.show("Empty Stock");
            }
        }
    }

    public int stock(String code) {
        int stocks = 0;
        if (code.equals(drinks[0])) {
            stocks = 10;
        }

        if (code.equals(drinks[1])) {
            stocks = 10;
        }

        if (code.equals(drinks[2])) {
            stocks = 10;
        }

        return stocks;
    }

}
