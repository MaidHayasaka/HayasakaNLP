package io.github.usbharu.nlp.parse.target;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

public interface TargetSearcher {

  SearchedTarget search(List<Instructions> instructions, String sentence, String verb);
}