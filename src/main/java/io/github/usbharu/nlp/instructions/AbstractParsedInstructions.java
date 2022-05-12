package io.github.usbharu.nlp.instructions;

import java.util.List;

public abstract class AbstractParsedInstructions implements ParsedInstructions {

  private final String inputSentence;
  private final String formattedSentence;
  private final String unifiedSentence;
  private final Instructions instructions;
  private final String verb;
  private final String target;
  private final List<ParsedModifier> parsedModifiers;


  public AbstractParsedInstructions(String inputSentence, String formattedSentence,
      String unifiedSentence, Instructions instructions, String verb, String target,
      List<ParsedModifier> parsedModifiers) {
    this.inputSentence = inputSentence;
    this.formattedSentence = formattedSentence;
    this.unifiedSentence = unifiedSentence;
    this.instructions = instructions;
    this.verb = verb;
    this.target = target;
    this.parsedModifiers = parsedModifiers;
  }

  @Override
  public String getInputSentence() {
    return inputSentence;
  }

  @Override
  public String getFormattedSentence() {
    return formattedSentence;
  }

  @Override
  public String getUnifiedSentence() {
    return unifiedSentence;
  }

  @Override
  public Instructions getInstructions() {
    return instructions;
  }

  @Override
  public String getVerb() {
    return verb;
  }

  @Override
  public String getTarget() {
    return target;
  }

  @Override
  public List<ParsedModifier> getModifiers() {
    return parsedModifiers;
  }
}