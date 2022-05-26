package io.github.usbharu.nlp.parse.verb;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

/**
 * 文から動詞を探す
 */
public interface VerbSearcher {

  /**
   * @param instructions 登録された指示のリスト
   * @param sentence     解析する文
   * @return 検出された動詞
   */
  SearchedVerb search(List<Instructions> instructions, String sentence);
}
