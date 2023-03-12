import java.util.*;

public class AgeComparator implements Comparator<Dog> {

    public int compare(Dog o1, Dog o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
