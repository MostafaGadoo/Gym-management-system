
package gym.managment.system;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.google.gson.Gson;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bson.Document;

public class customerDB {
    private MongoClient client;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private Gson gson = new Gson();
    
    
    public customerDB() {
      Logger mongoLogger = Logger.getLogger("org.mongodb.driver");
        mongoLogger.setLevel(Level.SEVERE);

        // Initialize
        client = new MongoClient("localhost", 27017);
        database = client.getDatabase("gymManagmentSystem"); // Database name
//        collection = database.getCollection("Branch");
        collection = database.getCollection("customer");// Collection name
        
    }
  //Question 1
    public void insertBranch(Customer c) {
        collection.insertOne(Document.parse(gson.toJson(c)));
        System.out.println("Customer inserted.");
    }
    
//    public void insertPerson(Person p) {
//        collection.insertOne(Document.parse(gson.toJson(p)));
//        System.out.println("Person inserted.");
//    }
//    
//    //Question 2
//        public Staff getStaffByMail(String email) {
//        Document doc = collection.find(Filters.eq("email", email)).first();
//        Staff result = gson.fromJson(doc.toJson(), Staff.class);
//        return result;
//    }
//        
//        
//        public void updateStaff(Staff s) {
//        Document doc = Document.parse(gson.toJson(s));
//        collection.replaceOne(Filters.eq("email", s.getEmail()), doc);
//    }
//        
//        //Question 3
//        public void updateStaffEmail( String name,String newEmail) {
//       
//        collection.updateOne(Filters.eq("name",name), Updates.set("email",newEmail));
//    }
//       
//        //Question 5
//    public void deleteStaff(String name) {
//        collection.deleteOne(Filters.eq("name", name));
//    }
//
//    
//    //Question 4
//        public ArrayList<Staff> getStaffbyAge(int age) {
//        ArrayList<Staff> result = new ArrayList();
//        ArrayList<Document> docs = collection.find(Filters.eq("age", age)).into(new ArrayList<Document>());
//        for (int i = 0; i < docs.size(); i++) {
//            String jsonResult = docs.get(i).toJson();
//            result.add(gson.fromJson(jsonResult, Staff.class));
//        }
//        return result;
//    }


        public void close() {
        client.close();
    }
    
}
