import java.io.IOException;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataBase db = new DataBase("db");
        ArrayList<DataBase.DBSnaptshot> history = new ArrayList<>();
        db.addWordToDataBase("AAA");
        db.addWordToDataBase("BBB");
        history.add(db.createSnapshot());
        db.addWordToDataBase("CCC");
        history.add(db.createSnapshot());
        db.addWordToDataBase("DDD");
        history.add(db.createSnapshot());
        System.out.println(history);
        db.showContent();
        db.restore(history.get(history.size()-2));
        db.showContent();
        db.restore(history.get(history.size()-3));
        db.showContent();
        db.restore(history.get(history.size()-1));
        db.showContent();



    }
}
