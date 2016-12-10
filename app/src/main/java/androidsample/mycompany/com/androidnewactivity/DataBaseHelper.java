package androidsample.mycompany.com.androidnewactivity;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class DataBaseHelper {

    private static  final String COLUMN_NAME= "USERS_FIRSTNAME";
    private static  final String COLUMN_ID = "id";
    private static  final String COLUMN_EMAIL= "USERS_EMAIL_ID";
    private static  final String COLUMN_UNAME = "USERS_USER_USERNAME";
    private static  final String COLUMN_PASSWORD = "USERS_USER_PASSWPRD";

    public void insertUserInfomation(Contact contact) throws UnknownHostException {
       try{
           // To connect to mongodb server
           System.out.println("ENTRY:::::::");
          // MongoClient mongoClient = new MongoClient( "localhost" , 5 );
           MongoClient mongoClient = new MongoClient( "127.0.0.1" , 57918 );
           System.out.println("11111");
           DB db = mongoClient.getDB("users");
           System.out.println("2222::");
           DBCollection collection = db.getCollection("users");
           System.out.println("Connection Established::");


           Map<String,String> contentValues = new HashMap<String, String>();
           contentValues.put(COLUMN_NAME,contact.getName());
           contentValues.put(COLUMN_EMAIL,contact.getEmail());
           contentValues.put(COLUMN_UNAME,contact.getuName());
           contentValues.put(COLUMN_PASSWORD,contact.getPassword());
           System.out.println("contentValues::"+contentValues.toString());

           collection.insert(new BasicDBObject(contentValues));
           System.out.println("Inserted Successfully::");

           // parseJSON_Example(collection);

        }catch(Exception e){
           System.out.println("Inside Errorchopraaaaaaaaaaaaaa");
           e.printStackTrace();
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
    }


}
