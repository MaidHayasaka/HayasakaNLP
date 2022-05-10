package io.github.usbharu.nlp.parse.verb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class VerbSearcherTest {

  VerbSearcher verbSearcher;

  @Test
  void search() {
    SearchedVerb search = verbSearcher.search();
    assertNotNull(search);
    assertNotNull(search.getVerb());
    assertNotEquals(0, search.getVerb().length());
  }
}