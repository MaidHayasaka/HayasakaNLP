package io.github.usbharu.nlp.instructions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class InstructionsTest {

  Instructions instructions;

  @Test
  void getVerbs() {
    assertNotNull(instructions.getVerbs());
  }

  @Test
  void getTargets() {
    assertNotNull(instructions.getTargets());
  }

  @Test
  void getModifiers() {
    assertNotNull(instructions.getModifiers());
  }
}