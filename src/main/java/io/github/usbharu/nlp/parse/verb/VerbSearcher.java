package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

public interface VerbSearcher {

  SearchedVerb search(List<Instructions> instructions, String sentence);
}