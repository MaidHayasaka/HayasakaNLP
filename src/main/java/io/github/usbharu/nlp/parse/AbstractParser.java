package io.github.usbharu.nlp.parse;

import io.github.usbharu.nlp.instructions.DefaultParsedInstructions;
import io.github.usbharu.nlp.instructions.Instructions;
import io.github.usbharu.nlp.instructions.ParsedInstructions;
import io.github.usbharu.nlp.parse.target.SearchedTarget;
import io.github.usbharu.nlp.parse.target.TargetSearcher;
import io.github.usbharu.nlp.parse.verb.SearchedVerb;
import io.github.usbharu.nlp.parse.verb.VerbSearcher;
import java.util.ArrayList;
import java.util.List;

public abstract class AbstractParser implements Parser {

  private final TargetSearcher targetSearcher;
  private final VerbSearcher verbSearcher;

  private final String inputSentence;
  private final String formattedSentence;

  private final List<Instructions> instructions;

  protected AbstractParser(String inputSentence, String formattedSentence,
      TargetSearcher targetSearcher, VerbSearcher verbSearcher,
      List<Instructions> instructions) {
    this.inputSentence = inputSentence;
    this.formattedSentence = formattedSentence;
    this.targetSearcher = targetSearcher;
    this.verbSearcher = verbSearcher;
    this.instructions = instructions;
  }

  @Override
  public ParsedInstructions parse(String unifiedSentence) {

    SearchedVerb search = verbSearcher.search(instructions, unifiedSentence);
    List<Instructions> instructions1 = search.getInstructions();
    SearchedTarget searchTarget =
        targetSearcher.search(instructions1, unifiedSentence, search.getVerb());
    searchTarget.getTarget();
    return new DefaultParsedInstructions(inputSentence, formattedSentence, unifiedSentence,
        searchTarget.getInstructions(), search.getVerb(), searchTarget.getTarget(),
        new ArrayList<>()) {
    };
  }
}