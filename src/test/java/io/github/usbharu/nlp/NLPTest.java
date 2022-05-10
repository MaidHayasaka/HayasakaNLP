package io.github.usbharu.nlp;

import static org.junit.jupiter.api.Assertions.*;

import io.github.usbharu.nlp.instructions.ParsedInstructions;
import org.junit.jupiter.api.Test;

class NLPTest {

  NLP nlp;

  @Test
  void parse() {
    ParsedInstructions parsedInstructions = nlp.parse("テレビの電源を付けて");
    assertNotNull(parsedInstructions);
    assertEquals("つける", parsedInstructions.getVerb());
    assertEquals("テレビ", parsedInstructions.getTarget());
  }
}