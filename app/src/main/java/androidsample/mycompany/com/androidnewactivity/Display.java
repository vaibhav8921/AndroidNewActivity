package androidsample.mycompany.com.androidnewactivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Vaibhav on 11/27/2016.
 */

public class Display extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);
        String userName= getIntent().getStringExtra("UserName");
        TextView tv = (TextView)findViewById(R.id.TVUserName);
        tv.setText(userName);
    }
}
