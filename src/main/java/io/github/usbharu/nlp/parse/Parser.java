package io.github.usbharu.nlp.parse;

import io.github.usbharu.nlp.instructions.ParsedInstructions;

public interface Parser {

  ParsedInstructions parse(String unifiedSentence);
}