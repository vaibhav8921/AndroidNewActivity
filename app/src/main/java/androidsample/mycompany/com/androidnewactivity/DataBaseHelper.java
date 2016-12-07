package androidsample.mycompany.com.androidnewactivity;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/*
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.mongodb.WriteConcern;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

import com.mongodb.ServerAddress;
*/

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class DataBaseHelper extends SQLiteOpenHelper {
    public DataBaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

/*
    private static  final int DATABASE_VERSION = 1;
    private static  final String DATABASE_NAME = "contacts.db";
    private static  final String TABLE_NAME = "contacts.db";
    private static  final String COLUMN_NAME= "name";
    private static  final String COLUMN_ID = "id";
    private static  final String COLUMN_EMAIL= "email";
    private static  final String COLUMN_UNAME = "uname";
    private static  final String COLUMN_PASSWORD = "password";
    SQLiteDatabase db;
    private static  final String TABLE_CREATE = "create  table contacts(id integer primary key not null auto_increment,"+
            "name text not null, email text not null,uname text not null,password text not null)";

    public DataBaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public static String getColumnUname() {
        return COLUMN_UNAME;
    }
*/

    @Override
    public void onCreate(SQLiteDatabase db) {
       /* try{

            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient( "localhost" , 27017 );

            // Now connect to your databases
            DB db = mongoClient.getDB( "test" );
            System.out.println("Connect to database successfully");
            boolean auth = db.authenticate(myUserName, myPassword);
            System.out.println("Authentication: "+auth);

        }catch(Exception e){
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }*/

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }


}
