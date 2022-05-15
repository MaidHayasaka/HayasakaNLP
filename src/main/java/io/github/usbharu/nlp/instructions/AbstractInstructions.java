package io.github.usbharu.nlp.instructions;

import java.util.List;

public abstract class AbstractInstructions
    implements Instructions {

  private final List<String> verbs;
  private final List<String> targets;
  private final List<Modifier> modifiers;

  protected AbstractInstructions(List<String> verbs, List<String> targets,
      List<Modifier> modifiers) {
    this.verbs = verbs;
    this.targets = targets;
    this.modifiers = modifiers;
  }

  @Override
  public List<String> getVerbs() {
    return verbs;
  }

  @Override
  public List<String> getTargets() {
    return targets;
  }

  @Override
  public List<Modifier> getModifiers() {
    return modifiers;
  }
}