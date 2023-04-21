package iterators.iterator_1.iterators;

import iterators.iterator_1.profile.Profile;

/**
 * @author Semenov Alexey
 */
public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
