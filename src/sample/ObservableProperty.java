package sample;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;

/**
 * Created by Gurkan on 26.2.2015.
 */
public class ObservableProperty {
    public static void main(String[] args) {
        final DoubleProperty  balance = new SimpleDoubleProperty();
        balance.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("The new value is " + balance.doubleValue());

            }
        });


        balance.setValue(4.5);
        balance.setValue(1.5);
        balance.setValue(1.8);
    }

}
