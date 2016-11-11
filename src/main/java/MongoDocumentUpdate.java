import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

public class MongoDocumentUpdate {
    public static void main(String[] args){
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("learn");
        DBCollection tableLearn = db.getCollection("learn");

        BasicDBObject query = new BasicDBObject();
        query.put("Panda", "Princess");

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("Panda", "Star");

        BasicDBObject updateObj = new BasicDBObject();
        updateObj.put("$set", newDocument);

        tableLearn.update(query, updateObj);
    }
}
