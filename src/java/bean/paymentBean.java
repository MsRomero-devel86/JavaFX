/*
 * 
 */
package bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author M.Romero
 */
@Named(value = "paymentBean")
@SessionScoped
public class paymentBean implements Serializable {

   private double price;
   private String card = "";
   private Date date = new Date();
    public paymentBean() {
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newValue) {
        price = newValue;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String newValue) {
        card = newValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date newValue) {
        date = newValue;
    }
    
}
