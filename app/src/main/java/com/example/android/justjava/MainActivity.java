package com.example.android.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = quantity * 5;
       String priceMessage = " Total price $" + price + " \n Thank you!";
        displayMessage(priceMessage);
       // int quantity = 5;
       // display(quantity);
      //  displayPrice(qauntity * 5);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);


    }

    public void quantityDown(View view){

        quantity = quantity - 1;
        display(quantity);
       // displayPrice(quantity*5);


    }

    public void quantityUp(View view){

        quantity = quantity + 1;
        display(quantity);
       // displayPrice(quantity*5);
    }

   /* public void sayHello(View view) {
        TextView helloTextView = (TextView) findViewById(R.id.new_text_view);
        helloTextView.setText("" + "helloWorld");
    }*/
}







