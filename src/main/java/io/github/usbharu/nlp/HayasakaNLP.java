package io.github.usbharu.nlp;

import io.github.usbharu.nlp.format.SentenceFormatter;
import io.github.usbharu.nlp.parse.Parser;
import io.github.usbharu.nlp.unify.Unifier;

public class HayasakaNLP extends AbstractNLP {

  public HayasakaNLP(SentenceFormatter formatter, Unifier unifier, Parser parser) {
    super(formatter, unifier, parser);
  }
}