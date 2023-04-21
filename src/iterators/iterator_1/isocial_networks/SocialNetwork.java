package iterators.iterator_1.isocial_networks;

import iterators.iterator_1.iterators.ProfileIterator;

/**
 * @author Semenov Alexey
 */
public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
}
