package io.github.usbharu.nlp.instructions;

import java.util.List;

public interface ParsedInstructions {

  String getInputSentence();

  String getFormattedSentence();

  String getUnifiedSentence();

  Instructions getInstructions();

  String getVerb();

  String getTarget();

  List<ParsedModifier> getModifiers();
}