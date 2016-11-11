import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * Save document into collection
 */
public class MongoDocumentCreate {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("learn");
        DBCollection learnDB = db.getCollection("learn");
        BasicDBObject document = new BasicDBObject();
        document.put("Panda", "Princess");
        document.put("age", 3);
        learnDB.insert(document);
    }
}
