package io.github.usbharu.nlp.parse.target;

import io.github.usbharu.nlp.instructions.Instructions;
import java.util.List;

/**
 * 文から指定された動詞の表す対象を探す
 */
public interface TargetSearcher {

  /**
   * @param instructions 登録された指示のリスト
   * @param sentence     解析する文
   * @param verb         動詞
   * @return 検出された対象
   */
  SearchedTarget search(List<Instructions> instructions, String sentence, String verb);
}
