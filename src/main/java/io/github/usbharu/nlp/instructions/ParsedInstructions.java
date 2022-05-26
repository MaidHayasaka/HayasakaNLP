package io.github.usbharu.nlp.instructions;

import java.util.List;

/**
 * 自然言語処理後の解析された指示
 */
public interface ParsedInstructions {

  /**
   * @return 入力された文
   */
  String getInputSentence();

  /**
   * @return フォーマット後の指示
   */
  String getFormattedSentence();

  /**
   * @return 統一後の指示
   */
  String getUnifiedSentence();

  /**
   * @return 解析された指示
   */
  Instructions getInstructions();

  /**
   * @return 統一後の文から検出された動詞
   */
  String getVerb();

  /**
   * @return 統一後の文から検出された対象
   */
  String getTarget();

  /**
   * @return 統一後の文から検出されたその他の情報のリスト
   */
  List<ParsedModifier> getModifiers();
}
