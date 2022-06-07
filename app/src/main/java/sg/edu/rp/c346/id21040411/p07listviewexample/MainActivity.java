package sg.edu.rp.c346.id21040411.p07listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv;
    String[] fruits;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fruits = new String[3];
        fruits[0] = "apple";
        fruits[1] = "banana";
        fruits[2] = "cherry";

        tv = findViewById(R.id.tv);

        String msg = "Fruits\n";
        msg += "=====\n";

        for (int i = 0; i < fruits.length; i++) {
            msg += fruits[i] + "\n";
        }

        tv.setText(msg);

    }

}