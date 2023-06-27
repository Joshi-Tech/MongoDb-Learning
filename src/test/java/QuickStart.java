import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.*;
import com.mongodb.client.model.Filters;
import org.bson.Document;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Filter;

public class QuickStart {
    public static void main( String[] args ) {

        // Replace the placeholder with your MongoDB deployment's connection string
        String uri = "mongodb+srv://lkjoshi:Pragya2002@practicemongodb.xhanacx.mongodb.net/?retryWrites=true&w=majority";
        MongoClient client = MongoClients.create(uri);
        MongoDatabase database = client.getDatabase("sampleDatabase");
        MongoCollection collection = database.getCollection("sampleCollection");

        /**
         * To add a single room document in a collection and then retrieve first document from the collection
         */

         /*Document doc = new Document("_id",3).append("name","Govind").append("age",31).append("designation","Quality Engineer");
         collection.insertOne(doc);*/

        //System.out.println(collection.find().first());

        /**
         * To add multiple documents in one go in a collection
         */
        List<Document> documents = Arrays.asList(
                new Document().append("_id",8).append("name","Garima").append("age",36).append("designation","HR Manager"),
                new Document().append("_id",9).append("name","Girdhar").append("age",33).append("designation","Senior Accountant"),
                new Document().append("_id",10).append("name","Pratima").append("age",37).append("designation","Finance Head"),
                new Document().append("_id",11).append("name","Mahesh").append("age",28).append("designation","Dev Ops")
        );
       // collection.insertMany(documents);

        /**
         * To retrieve all the documents in the collections
         */
      /*  FindIterable<Document> iterable = collection.find();
        Iterator it = iterable.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        /**
         * To retrieve a specific document from a collection
         */
       // System.out.println(collection.find(Filters.eq("age",37)).first());

        /**
         * To retrieve all documents where age is less than 30
         */

       /* FindIterable it = collection.find(Filters.lt("age",30));
       Iterator iterator = it.iterator();
       while (iterator.hasNext()){
           System.out.println(iterator.next());
       }*/

        /**
         * To print all documents where age between 25 and 30
         */
        

      FindIterable f =  collection.find(Filters.all("age",0, 130));
      Iterator i = f.iterator();
      while (i.hasNext()){
          System.out.println("Document Details:   "+i.next());
    }

    }
}