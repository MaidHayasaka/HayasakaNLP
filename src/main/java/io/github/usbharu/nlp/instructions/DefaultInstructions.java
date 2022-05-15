package io.github.usbharu.nlp.instructions;

import java.util.List;

public class DefaultInstructions
    extends AbstractInstructions {

  public DefaultInstructions(List<String> verbs, List<String> targets,
      List<Modifier> modifiers) {
    super(verbs, targets, modifiers);
  }
}