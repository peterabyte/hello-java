package com.peterabyte.hello.lang.java21;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.SequencedCollection;
import java.util.SequencedMap;
import java.util.SequencedSet;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SequencedCollectionsTest {
    @Test
    public void givenSequencedCollection() {
        SequencedCollection<Integer> sequencedCollection = List.of(5, 1, 3);

        assertThat(sequencedCollection.getFirst()).isEqualTo(5);
        assertThat(sequencedCollection.getLast()).isEqualTo(3);
    }

    @Test
    public void givenSequencedSet() {
        SequencedSet<Integer> sequencedSet = new LinkedHashSet<>();
        sequencedSet.add(5);
        sequencedSet.add(1);
        sequencedSet.add(3);

        assertThat(sequencedSet.getFirst()).isEqualTo(5);
        assertThat(sequencedSet.getLast()).isEqualTo(3);
    }

    @Test
    public void givenSequencedMap() {
        SequencedMap<Integer, String> sequencedMap = new LinkedHashMap<>();
        sequencedMap.put(5, "D");
        sequencedMap.put(1, "G");
        sequencedMap.put(3, "F");

        assertThat(sequencedMap.sequencedEntrySet().getFirst().getKey()).isEqualTo(5);
        assertThat(sequencedMap.sequencedEntrySet().getLast().getKey()).isEqualTo(3);
    }
}
