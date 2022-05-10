package io.github.usbharu.nlp.instructions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class ParsedInstructionsTest {

  ParsedInstructions parsedInstructions;

  @Test
  void getInputSentence() {
    assertNotNull(parsedInstructions.getInputSentence());
    assertFalse(parsedInstructions.getInputSentence().isBlank());
  }

  @Test
  void getFormattedSentence() {
    assertNotNull(parsedInstructions.getFormattedSentence());
    assertFalse(parsedInstructions.getFormattedSentence().isBlank());
  }

  @Test
  void getUnifiedSentence() {
    assertNotNull(parsedInstructions.getUnifiedSentence());
    assertFalse(parsedInstructions.getUnifiedSentence().isBlank());
  }

  @Test
  void getInstructions() {
    assertNotNull(parsedInstructions.getInstructions());
  }

  @Test
  void getVerb() {
    assertNotNull(parsedInstructions.getVerb());
    assertFalse(parsedInstructions.getVerb().isBlank());
  }

  @Test
  void getTarget() {
    assertNotNull(parsedInstructions.getTarget());
    assertFalse(parsedInstructions.getTarget().isBlank());
  }

  @Test
  void getModifiers() {
    assertNotNull(parsedInstructions.getModifiers());
    assertNotEquals(0, parsedInstructions.getModifiers().size());
  }
}