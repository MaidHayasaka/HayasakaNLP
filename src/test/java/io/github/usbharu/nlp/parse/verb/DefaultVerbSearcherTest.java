package io.github.usbharu.nlp.parse.verb;

import org.junit.jupiter.api.BeforeEach;

public class DefaultVerbSearcherTest extends VerbSearcherTest {

  @BeforeEach
  void setUp() {

    verbSearcher = new DefaultVerbSearcher();
  }


}