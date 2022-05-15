package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

public class DefaultSearchedVerb
    extends AbstractSearchedVerb {

  public DefaultSearchedVerb(String verb,
      List<Instructions> instructions) {
    super(verb, instructions);
  }
}