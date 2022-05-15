package io.github.usbharu.nlp.instructions;

import java.util.List;

public class DefaultParsedInstructions
    extends AbstractParsedInstructions {

  protected DefaultParsedInstructions(String inputSentence, String formattedSentence,
      String unifiedSentence, Instructions instructions, String verb, String target,
      List<ParsedModifier> parsedModifiers) {
    super(inputSentence, formattedSentence, unifiedSentence, instructions, verb, target,
        parsedModifiers);
  }
}