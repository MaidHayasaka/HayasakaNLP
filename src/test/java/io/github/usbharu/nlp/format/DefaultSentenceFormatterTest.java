package io.github.usbharu.nlp.format;

import org.junit.jupiter.api.BeforeEach;

public class DefaultSentenceFormatterTest
    extends SentenceFormatterTest {

  @BeforeEach
  void setUp() {
    sentenceFormatter = new DefaultSentenceFormatter();
  }
}