package session6.D_List.exercise;

import java.util.Comparator;

public class ReverseAlphabetical implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o2.name.compareTo(o1.name);
    }
}
