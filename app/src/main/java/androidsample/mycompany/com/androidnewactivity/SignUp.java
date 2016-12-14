package androidsample.mycompany.com.androidnewactivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class SignUp extends Activity{

    DataBaseHelper dataBaseHelper = new DataBaseHelper();

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
            System.out.println("nameStr::"+nameStr);
            System.out.println("emailStr::"+emailStr);
            System.out.println("userNameStr::"+userNameStr);
            System.out.println("confirmPasswordStr::"+confirmPasswordStr);
            System.out.println("confirmPasswordStr::"+confirmPasswordStr);


            if(!passwordStr.equals(confirmPasswordStr)){
                //pop up message
                Toast pass = Toast.makeText(SignUp.this,"Password don't match",Toast.LENGTH_SHORT);
                pass.show();
            }else {
                Contact contact =new Contact(nameStr,emailStr,userNameStr,passwordStr);
                contact.setName(nameStr);
                contact.setEmail(emailStr);
                contact.setuName(userNameStr);
                contact.setPassword(passwordStr);
                System.out.println("contact::"+contact.toString());
                try {
                 //   dataBaseHelper.doInBackground();
                   // new DataBaseHelper().execute(new Contact());


                    DataBaseHelper myTask = new DataBaseHelper();
                    myTask.execute(contact);
                } catch (Exception e) {
                    System.out.println("Inside Error::"+contact.toString());
                    e.printStackTrace();
                }
            }

        }
    }


   /* private class DBExcutor extends AsyncTask<String, Void, String>{

        @Override
        protected String doInBackground(String... strings) {
            MongoClient mongo = new MongoClient( "192.168.1.2" , 27017 );
            DB db = mongo.getDB("users");
            DBCollection table = db.getCollection("users");


            Set<String> dbNames=  db.getCollectionNames();
            for(String dbname : dbNames)
            {
                System.out.println("dbname "+dbname);
            }
            BasicDBObject document = new BasicDBObject();
            document.put("USERS_FIRSTNAME", "mkyong");
            document.put("USERS_USER_USERNAME", "adsf");
            document.put("USERS_USER_PASSWPRD", "asd");
            document.put("USERS_UID", "asda");
            table.insert(document);
            *//**
             *    "USERS_EMAIL_ID" : "vaibhav8921@gmail.com",
             "USERS_USER_USERNAME" : "vaibhav8921",
             "USERS_USER_PASSWPRD" : "Edison123",
             "USERS_UID" : "vai_01"
             *//*
            return  null;
        }
    }*/
}
