package fasade;

import java.util.HashMap;
import java.util.Map;

public class DBMS {
    private Map<String, Row> db = new HashMap<>();

    public DBMS() {
        db.put("jane", new Row("Jane", "1999", "jane1999@fake.co"));
        db.put("robert", new Row("Robert", "1655", "robert1655@fake.co"));
        db.put("park", new Row("Park", "1993", "park1993@fake.co"));
    }

    public Row query(String name) {
        sleep(1000);
        return db.get(name.toLowerCase());
    }

    private void sleep(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
