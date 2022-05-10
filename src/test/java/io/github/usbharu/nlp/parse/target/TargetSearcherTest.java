package io.github.usbharu.nlp.parse.target;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class TargetSearcherTest {

  TargetSearcher targetSearcher;

  @Test
  void search() {
    SearchedTarget search = targetSearcher.search();
    assertNotNull(search);
    assertNotNull(search.getTarget());
    assertNotEquals(0, search.getTarget().length());
  }
}