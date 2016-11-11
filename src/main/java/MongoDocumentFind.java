import com.mongodb.*;

public class MongoDocumentFind {
    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost", 27017);
        DB db = mongoClient.getDB("learn");
        DBCollection table = db.getCollection("learn");

        BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("Panda", "Princess");

        DBCursor cursor = table.find(searchQuery);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }
    }
}
