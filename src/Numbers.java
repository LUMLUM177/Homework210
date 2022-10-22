import java.util.Objects;

public class Numbers {

    private String key;
    private Integer value;

    public Numbers(String key, Integer value) {
        if (key == null || value == null) {
            throw new RuntimeException("Необходимо указать значение!");
        }
        setKey(key);
        setValue(value);
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Numbers numbers = (Numbers) o;
        return key.equals(numbers.key) && value.equals(numbers.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}

