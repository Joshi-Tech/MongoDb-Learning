import com.mongodb.client.*;
import org.bson.Document;

import java.util.Iterator;

public class MongoLocal {

    public static void main(String[] args) {
        String connectionString = "mongodb://localhost:27017";
        MongoClient mongoClient = MongoClients.create(connectionString);
        String databaseName = "person";
        MongoDatabase database = mongoClient.getDatabase(databaseName);
        MongoCollection collection = database.getCollection("employee");
        FindIterable<Document> iterable = collection.find();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }



    }
}
