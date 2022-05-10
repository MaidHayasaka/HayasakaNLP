package io.github.usbharu.nlp;

import io.github.usbharu.nlp.instructions.ParsedInstructions;

public interface NLP {

  ParsedInstructions parse(String sentence);
}