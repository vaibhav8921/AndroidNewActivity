package androidsample.mycompany.com.androidnewactivity;

import android.os.AsyncTask;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class DataBaseHelper  extends AsyncTask<Contact, Void, Void> {

    private static  final String COLUMN_NAME= "USERS_FIRSTNAME";
    private static  final String COLUMN_ID = "id";
    private static  final String COLUMN_EMAIL= "USERS_EMAIL_ID";
    private static  final String COLUMN_UNAME = "USERS_USER_USERNAME";
    private static  final String COLUMN_PASSWORD = "USERS_USER_PASSWPRD";
    private static  final String COLUMN_UID = "USERS_UID";

    @Override
    protected Void doInBackground(Contact... params) {
        try{
            // To connect to mongodb server
            System.out.println("ENTRY:::::::");
            // MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
            MongoClient mongoClient = new MongoClient( "192.168.1.8" , 27017 );
            //MongoClient mongoClient = new MongoClient( "127.0.0.1" , 27017 );
            System.out.println("11111");
            DB db = mongoClient.getDB("users");
            System.out.println("2222::");
            DBCollection collection = db.getCollection("users");
            String uniqueID = UUID.randomUUID().toString();

            Map<String,String> contentValues = new HashMap<>();
            contentValues.put(COLUMN_NAME,params[0].getName());
            contentValues.put(COLUMN_EMAIL,params[0].getEmail());
            contentValues.put(COLUMN_UNAME,params[0].getuName());
            contentValues.put(COLUMN_PASSWORD,params[0].getPassword());
            contentValues.put(COLUMN_UID,uniqueID);
            System.out.println("contentValues::"+contentValues.toString());

            if(!isNullOrEmpty( contentValues)){
                collection.insert(new BasicDBObject(contentValues));

            }
            System.out.println("Inserted Successfully::");

            // parseJSON_Example(collection);

        }catch(Exception e){
            System.out.println("Inside Errorchopraaaaaaaaaaaaaa");
            e.printStackTrace();
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
            /*if(e.getMessage().contains("E11000 duplicate key error collection")){
                throw new Exception("Duplicate Record");
            }*/

          /*  Query for making fields  unique
            db.users.createIndex({USERS_EMAIL_ID:1},{unique:true});*/


        }
        return null;
    }
    public static boolean isNullOrEmpty( final Map< ?, ? > m ) {
        return m == null || m.isEmpty();
    }


}
