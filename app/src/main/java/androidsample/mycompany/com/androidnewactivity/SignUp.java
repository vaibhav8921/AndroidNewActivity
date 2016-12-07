package androidsample.mycompany.com.androidnewactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class SignUp extends Activity{

    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
    }
    public void onSignUpClick (View v){
        if(v.getId() == R.id.BsignupButton){
            EditText name = (EditText) findViewById(R.id.tfName);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText userName = (EditText) findViewById(R.id.TFUserName);
            EditText password = (EditText) findViewById(R.id.TFPassword);
            EditText confirmPassword = (EditText) findViewById(R.id.tfConfirmPassword);

            String nameStr = name.getText().toString();
            String emailStr = email.getText().toString();
            String userNameStr = userName.getText().toString();
            String passwordStr = password.getText().toString();
            String confirmPasswordStr = confirmPassword.getText().toString();
            if(!passwordStr.equals(confirmPasswordStr)){
                //pop up message
                Toast pass = Toast.makeText(SignUp.this,"Password don't match",Toast.LENGTH_SHORT);
                pass.show();
            }
        }
    }
}
