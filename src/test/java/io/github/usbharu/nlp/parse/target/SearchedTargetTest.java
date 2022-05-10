package io.github.usbharu.nlp.parse.target;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class SearchedTargetTest {

  SearchedTarget searchedTarget;

  @Test
  void getTarget() {
    assertNotNull(searchedTarget.getTarget());
    assertNotEquals(0, searchedTarget.getTarget().length());
  }
}