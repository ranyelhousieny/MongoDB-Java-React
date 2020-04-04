package mflix.lessons;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

public class MongoClientTry extends AbstractLesson {

    public void MongoClientInstance(){
        String uri = "mongodb+srv://m220student:m220password@mflix-vwsmv.mongodb.net/test?retryWrites=true&w=majority";
        MongoClient mongoClient = MongoClients.create(uri);
    }


}
