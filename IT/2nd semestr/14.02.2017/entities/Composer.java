package febrary14.entities;

import java.util.Calendar;

public class Composer {
    private String name;
    private Calendar birth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Calendar getBirth() {
        return birth;
    }

    public void setBirth(Calendar birth) {
        this.birth = birth;
    }
}
