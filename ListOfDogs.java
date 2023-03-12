
import java.util.*;

/**
 * ListOfDogs
 */
public class ListOfDogs implements Iterable<Dog> {

    private List<Dog> doglist;

    public List<Dog> getDogList() {
        return doglist;
    }

    public void setDogList(List<Dog> doglist) {
        this.doglist = doglist;
    }

    @Override
    public Iterator<Dog> iterator() {
        return new ListOfDogsIterator(doglist);
    }

}