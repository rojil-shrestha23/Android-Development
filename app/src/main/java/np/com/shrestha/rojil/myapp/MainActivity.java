package np.com.shrestha.rojil.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import np.com.shrestha.rojil.myapp.utils.ShowToast;
//import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //    private TextView tvFirstView, tvSecondText;
    private static final String TAG = MainActivity.class.getSimpleName();

    private Button btnCancel, btnOk;

    private EditText edFirstName, edPhoneNumber, edAddress, edEmail;

    private String firstName, phoneNumber, address, email;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: ");

        initView();


//        tvFirstView = findViewById(R.id.tv_first_text);
//        tvSecondText = findViewById(R.id.tv_second_text);
//        tvFirstView.setText("hello");
    }

    private void initView() {
        btnCancel = findViewById(R.id.btnCancel);
        btnOk = findViewById(R.id.btnOk);
        btnOk.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

        edFirstName = findViewById(R.id.edFirstName);

        edPhoneNumber = findViewById(R.id.edPhoneNumber);

        edAddress = findViewById(R.id.edAddress);

        edEmail = findViewById(R.id.edEmail);

//
//        btnOk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                firstName = edFirstName.getText().toString().trim();
//                phoneNumber = edPhoneNumber.getText().toString().trim();
//                address = edAddress.getText().toString().trim();
//                email = edEmail.getText().toString().trim();
//                if (TextUtils.isEmpty(firstName)) {
//                    ShowToast.showToast(MainActivity.this, "First name cannot be empty", true);
//                } else if (TextUtils.isEmpty(phoneNumber)) {
//                    ShowToast.showToast(MainActivity.this, "Phone number cannot be empty", true);
//                } else if (TextUtils.isEmpty(address)) {
//                    ShowToast.showToast(MainActivity.this, "Address cannot be empty", true);
//                } else if (TextUtils.isEmpty(email)) {
//                    ShowToast.showToast(MainActivity.this, "Email cannot be empty", true);
//                } else {
//                    ShowToast.showToast(MainActivity.this, "Form received", true);
//                    emptyForm();
//                }
//                Log.i(TAG, "onClick: " + firstName);
//                Log.i(TAG, "onClick: " + phoneNumber);
//            }
//        });
//        btnCancel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                emptyForm();
//
//            }
//        });
    }

    private void emptyForm() {
        edFirstName.setText("");
        edPhoneNumber.setText("");
        edAddress.setText("");
        edEmail.setText("");
    }

    private void getFormValue() {
        firstName = edFirstName.getText().toString().trim();
        phoneNumber = edPhoneNumber.getText().toString().trim();
        address = edAddress.getText().toString().trim();
        email = edEmail.getText().toString().trim();
        if (TextUtils.isEmpty(firstName)) {
            ShowToast.showToast(MainActivity.this, "First name cannot be empty", true);
        } else if (TextUtils.isEmpty(phoneNumber)) {
            ShowToast.showToast(MainActivity.this, "Phone number cannot be empty", true);
        } else if (TextUtils.isEmpty(address)) {
            ShowToast.showToast(MainActivity.this, "Address cannot be empty", true);
        } else if (TextUtils.isEmpty(email)) {
            ShowToast.showToast(MainActivity.this, "Email cannot be empty", true);
        } else {
            ShowToast.showToast(MainActivity.this, "Form received", true);

        }
    }

    @Override
    public void onClick(View view) {

        int id = view.getId();
//        switch (id) {
//
//            case R.id.btnOk:
//                getFormValue();
//                break;
//
//            case R.id.btnCancel:
//                emptyForm();
//                break;
//
//
//        }
        Intent intent = new Intent(this, DisplayData.class);
        intent.putExtra("Name", "firstName");
        startActivity(intent);

    }
}
