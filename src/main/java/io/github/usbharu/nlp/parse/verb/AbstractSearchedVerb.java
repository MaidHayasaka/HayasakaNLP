package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

public abstract class AbstractSearchedVerb implements SearchedVerb {

  private final String verb;
  private final List<Instructions> instructions;

  protected AbstractSearchedVerb(String verb, List<Instructions> instructions) {
    this.verb = verb;
    this.instructions = instructions;
  }

  @Override
  public String getVerb() {
    return verb;
  }

  @Override
  public List<Instructions> getInstructions() {
    return instructions;
  }
}