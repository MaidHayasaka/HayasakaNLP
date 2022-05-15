package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractVerbSearcher implements VerbSearcher {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public SearchedVerb search(List<Instructions> instructions, String sentence) {
    logger.debug("searching verb  sentence: {}", sentence);
    logger.trace("instructions length: {}", instructions.size());
    String verb = "";
    List<Instructions> instructionsList = new ArrayList<>();
    for (Instructions instruction : instructions) {
      logger.trace("search or add instructions :{}", instruction);
      if (verb.isEmpty()) {
        logger.trace("searching verb instructions: {}", instruction);
        for (String searchingVerb : instruction.getVerbs()) {
          int lastIndexOf = sentence.lastIndexOf(searchingVerb);
          if (lastIndexOf == -1) {
            continue;
          }
          verb = searchingVerb;
          logger.debug("verb :{}", verb);
        }
      } else {
        logger.trace("add instructions: {}", instruction);
        String finalVerb = verb;
        instructionsList = instructions.stream()
            .filter(instructions1 -> instructions1.getVerbs().contains(finalVerb))
            .collect(Collectors.toList());
      }

    }
    return new DefaultSearchedVerb(verb, instructionsList);
  }
}