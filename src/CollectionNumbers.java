import java.util.*;

public class CollectionNumbers {
    private final Map<String, Integer> collection = new HashMap<>();

    public Map<String, Integer> getCollection() {
        return collection;
    }

    public void addNumberToCollection(Numbers number) {
        if (collection.containsKey(number.getKey())) {
            for (Map.Entry<String, Integer> entry : collection.entrySet()) {
                if (entry.getKey().equals(number.getKey()) && entry.getValue().equals(number.getValue())) {
                    throw new RuntimeException("Эта пара уже существует в коллекции!");
                }
            }
        }
        collection.put(number.getKey(), number.getValue());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionNumbers that = (CollectionNumbers) o;
        return collection.equals(that.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    @Override
    public String toString() {
        return "CollectionNumbers{" +
                "collection=" + getCollection() +
                '}';
    }
}
