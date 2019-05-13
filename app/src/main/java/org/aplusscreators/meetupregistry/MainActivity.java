package org.aplusscreators.meetupregistry;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    EditText firstNameEditText;
    EditText lastNameEditText;
    EditText registrationNumberEditText;
    EditText dateOfRegEditText;
    Button submitDetailsButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.registration_toolbar);
        firstNameEditText = findViewById(R.id.first_name_edit_text);
        lastNameEditText = findViewById(R.id.last_name_edit_text);
        registrationNumberEditText = findViewById(R.id.reg_edit_text);
        dateOfRegEditText = findViewById(R.id.date_edit_text);
        submitDetailsButton = findViewById(R.id.submit_button);

        /**
         * Customize toolbar
         */
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null){
            getSupportActionBar().setTitle(getResources().getString(R.string.app_name));
        }


        submitDetailsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEditText.getText().toString();
                String lastName = lastNameEditText.getText().toString();
                String reg = registrationNumberEditText.getText().toString();
                String dateOfReg = dateOfRegEditText.getText().toString();

                Toast.makeText(getApplicationContext(),"FN: " + firstName + " LN: " + lastName + " REG: " +reg + " DATE: " + dateOfReg,Toast.LENGTH_LONG).show();
            }
        });
    }
}
