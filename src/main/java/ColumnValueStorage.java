import java.util.List;

public interface ColumnValueStorage {
    void add(ColumnValue columnValue);
    List<ColumnValue> find(String searchTemplate);
}
