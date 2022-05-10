package io.github.usbharu.nlp.instructions;

import java.util.List;

public interface Instructions {

  List<String> getVerbs();

  List<String> getTargets();

  List<Modifier> getModifiers();
}