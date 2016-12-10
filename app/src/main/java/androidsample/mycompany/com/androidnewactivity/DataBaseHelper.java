package androidsample.mycompany.com.androidnewactivity;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoDatabase;

import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Vaibhav on 12/3/2016.
 */

public class DataBaseHelper {


    public void insertUserInfomation(Contact contact) throws UnknownHostException {
        try {
            // To connect to mongodb server
            System.out.println("Inside insertUserInfomation");
            //MongoClient mongoClient = new MongoClient("192.168.29.242", 27017);
            /*MongoCredential credential = MongoCredential.createCredential("admin", "admin", "admin123".toCharArray());
            MongoClient mongoClient = new MongoClient( new ServerAddress("192.168.29.242", 27017), Arrays.asList(credential));
            Iterator i= mongoClient.listDatabaseNames().iterator();
            while (i.hasNext()){
                System.out.println("DATABASE"+(String) i.next());
            }*/
            MongoClient mongo = new MongoClient( "192.168.29.242" , 27017 );
            DB db = mongo.getDB("test");
            DBCollection table = db.getCollection("user");

            BasicDBObject searchQuery = new BasicDBObject();
            searchQuery.put("USERS_FIRSTNAME", "Vaibhav");

            DBCursor cursor = table.find(searchQuery);

            while (cursor.hasNext()) {
                System.out.println(cursor.next());
            }


            // parseJSON_Example(collection);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
