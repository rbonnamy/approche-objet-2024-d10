package generiques;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ListUtils {

    public static <T> Optional<T> getPlusGrand(List<T> liste, Comparator<T> comparator) {
        return liste.stream().max(comparator);
    }
}
