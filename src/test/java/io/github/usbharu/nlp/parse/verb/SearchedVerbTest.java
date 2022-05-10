package io.github.usbharu.nlp.parse.verb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class SearchedVerbTest {

  SearchedVerb searchedVerb;

  @Test
  void getVerb() {
    assertNotNull(searchedVerb.getVerb());
    assertNotEquals(0, searchedVerb.getVerb().length());
  }
}