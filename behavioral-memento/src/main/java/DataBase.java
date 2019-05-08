import java.io.*;
import java.util.*;

public class DataBase implements Serializable {
    private HashMap<Integer, String> words = new HashMap<>();

    private String dbName;

    public DataBase(String dbName) {
        this.dbName = dbName;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public void addWordToDataBase(String word) {
        words.put(words.size(), word);
    }

    public void showContent() {
        System.out.println(words);
    }

    public void deleteWordById(int id) {
        words.remove(id);
    }

    public DBSnaptshot createSnapshot() throws IOException {
        return new DBSnaptshot();
    }

    public void restore(DBSnaptshot snaptshot) throws IOException, ClassNotFoundException {
        byte[] data = Base64.getDecoder().decode(snaptshot.state);
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
             ObjectInputStream ois = new ObjectInputStream(bais)) {
            DataBase dataBase = (DataBase) ois.readObject();
            this.dbName = dataBase.dbName;
            this.words = dataBase.words;
        }
    }

    private String backup() throws IOException {
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream(); ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(this);
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        }
    }

    public class DBSnaptshot {

        private String state;
        private Calendar date;

        private DBSnaptshot() throws IOException {
            this.state = DataBase.this.backup();
            this.date = Calendar.getInstance();
        }

        @Override
        public String toString() {
            return date.getTime().toString();
        }
    }
}
