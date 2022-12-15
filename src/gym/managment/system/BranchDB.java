/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gym.managment.system;

import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

/**
 *
 * @author mostafa gado
 */
public class BranchDB {
     private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();
    
    
    public BranchDB() {
      Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient("localhost", 27017);
        database = client.getDatabase("gymManagmentSystem"); // Database name
//        collection = database.getCollection("Branch");
        collection = database.getCollection("Branch");// Collection name
        
    }
  //Question 1
    public void insertBranch(Branch b) {
        collection.insertOne(Document.parse(gson.toJson(b)));
        System.out.println("Branch inserted.");
    }
}
