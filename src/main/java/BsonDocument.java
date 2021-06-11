public class BsonDocument {
    String key;
    String value;


    public BsonDocument( String key, String value ) {
        this.key = key;
        this.value = value;
    }


    @Override
    public String toString() {
        return "BsonDocument{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }

}
