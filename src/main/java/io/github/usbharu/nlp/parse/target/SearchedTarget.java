package io.github.usbharu.nlp.parse.target;

import io.github.usbharu.nlp.instructions.Instructions;

/**
 * 検出された対象
 */
public interface SearchedTarget {

  /**
   * @return 対象
   */
  String getTarget();

  /**
   * @return 検出された指示
   */
  Instructions getInstructions();
}
