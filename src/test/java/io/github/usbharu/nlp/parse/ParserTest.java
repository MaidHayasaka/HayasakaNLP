package io.github.usbharu.nlp.parse;

import static org.junit.jupiter.api.Assertions.*;

import io.github.usbharu.nlp.instructions.ParsedInstructions;
import org.junit.jupiter.api.Test;

abstract class ParserTest {

  Parser parser;

  @Test
  void parse() {
    ParsedInstructions parsedInstructions = parser.parse("テレビの電源つけて");
    assertNotNull(parsedInstructions);
    assertNotNull(parsedInstructions.getInstructions());
    assertNotNull(parsedInstructions.getFormattedSentence());
    assertFalse(parsedInstructions.getFormattedSentence().isBlank());
    assertNotNull(parsedInstructions.getUnifiedSentence());
    assertFalse(parsedInstructions.getUnifiedSentence().isBlank());
    assertNotNull(parsedInstructions.getVerb());
    assertFalse(parsedInstructions.getVerb().isBlank());
    assertNotNull(parsedInstructions.getTarget());
    assertFalse(parsedInstructions.getTarget().isBlank());
    assertNotNull(parsedInstructions.getModifiers());
    assertNotEquals(0, parsedInstructions.getModifiers().size());
  }
}