package np.com.shrestha.rojil.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayData extends AppCompatActivity {

    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_data);

        Intent getValues = getIntent();
        name = getValues.getStringExtra("firstName");
        TextView textView = findViewById(R.id.txtView);
        textView.setText(name);
        System.out.println("The inputed text are" +name);


    }
}
