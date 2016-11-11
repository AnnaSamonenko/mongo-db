import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Work with collections
 */
import java.util.Set;

public class MongoCollection {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("learn");

        // get Collections name from DB
        Set<String> tables = db.getCollectionNames();
        // print collections name
        for (String coll : tables) {
            System.out.println(coll);
        }

        // choose collection
        DBCollection col = db.getCollection("col");
    }
}
