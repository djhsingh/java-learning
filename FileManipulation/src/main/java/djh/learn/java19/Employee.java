package djh.learn.java19;

import java.io.Serializable;

public record Employee(int id, String name, String password) implements Serializable {

}
