package io.github.usbharu.nlp.parse;

import io.github.usbharu.nlp.instructions.ParsedInstructions;

/**
 * 統一後の文から指示を解析
 */
public interface Parser {

  /**
   * @param unifiedSentence 統一後の文
   * @return 解析された指示
   */
  ParsedInstructions parse(String unifiedSentence);
}
