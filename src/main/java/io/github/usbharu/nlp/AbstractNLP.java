package io.github.usbharu.nlp;

import io.github.usbharu.nlp.format.SentenceFormatter;
import io.github.usbharu.nlp.instructions.ParsedInstructions;
import io.github.usbharu.nlp.parse.Parser;
import io.github.usbharu.nlp.unify.Unifier;

public abstract class AbstractNLP implements NLP {

  private final SentenceFormatter formatter;
  private final Unifier unifier;
  private final Parser parser;

  protected AbstractNLP(SentenceFormatter formatter, Unifier unifier, Parser parser) {
    this.formatter = formatter;
    this.unifier = unifier;
    this.parser = parser;
  }

  @Override
  public ParsedInstructions parse(String sentence) {
    String formatted = formatter.format(sentence);
    String unified = unifier.unify(formatted);
    return parser.parse(unified);
  }
}