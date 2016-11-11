import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDocumentDelete {
    public static void main(String[] args){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("learn");
        DBCollection tableLearn = db.getCollection("learn");

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Panda", "Princess");

        tableLearn.remove(searchQuery);
    }
}
