package io.github.usbharu.nlp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HayasakaNLPTest {

  @Test
  void parse() {
    HayasakaNLP hayasakaNLP = new HayasakaNLP();
    assertNotNull(hayasakaNLP.parse("テレビつけて"));
  }
}