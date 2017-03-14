package com.example.elfath.login_php;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
  EditText usernameET,passET;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usernameET=(EditText)findViewById(R.id.name);
        passET=(EditText)findViewById(R.id.pass);
        btn=(Button)findViewById(R.id.btn);

    }
    void onlogin(View view){
        String username=usernameET.getText().toString();
        String userpassword=usernameET.getText().toString();
        String type="login";
        backgroundWorker backgroundWorker=new backgroundWorker(this);
        backgroundWorker.execute(type,username,userpassword);

    }
}
