package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

/**
 * 検出された動詞
 */
public interface SearchedVerb {

  /**
   * @return 動詞
   */
  String getVerb();

  /**
   * @return 検出された指示
   */
  List<Instructions> getInstructions();
}
