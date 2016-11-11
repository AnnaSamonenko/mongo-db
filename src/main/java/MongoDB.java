import com.mongodb.DB;
import com.mongodb.MongoClient;

import java.util.List;

/**
 * Connect to mongoDB server: MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
 * Connect to database: DB db = mongoClient.getDB( "name of db" );
 */
public class MongoDB {

    public static void main(String args[]) {

        try {
            // To connect to mongodb server
            MongoClient mongoClient = new MongoClient("localhost", 27017);

            // Print names of all dbs
            List<String> dbs = mongoClient.getDatabaseNames();
            for (String db : dbs) {
                System.out.println(db);
            }

            // Now connect to your databases
            DB learnDB = mongoClient.getDB("learn");

            System.out.println("Connect to database successfully");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
    }
}