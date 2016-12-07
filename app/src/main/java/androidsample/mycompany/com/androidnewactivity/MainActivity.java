package androidsample.mycompany.com.androidnewactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        if(v.getId() == R.id.bDisplay){
            EditText a =(EditText)findViewById(R.id.TfUserName);
            String str = a.getText().toString();

            Intent i = new Intent(MainActivity.this,Display.class);
            i.putExtra("UserName",str);
            startActivity(i);

        }
        if(v.getId() == R.id.BSignUp){
            Intent i = new Intent(MainActivity.this,SignUp.class);
            startActivity(i);

        }

    }
}
