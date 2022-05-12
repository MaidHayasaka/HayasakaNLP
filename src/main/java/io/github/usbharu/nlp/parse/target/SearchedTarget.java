package io.github.usbharu.nlp.parse.target;

import io.github.usbharu.nlp.instructions.Instructions;

public interface SearchedTarget {

  String getTarget();

  Instructions getInstructions();
}