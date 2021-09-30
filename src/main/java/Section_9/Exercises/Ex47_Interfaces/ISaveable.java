package Section_9.Exercises.Ex47_Interfaces;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> savedValues);
}
