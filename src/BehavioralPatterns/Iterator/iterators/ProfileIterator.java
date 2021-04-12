package BehavioralPatterns.Iterator.iterators;

import BehavioralPatterns.Iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
