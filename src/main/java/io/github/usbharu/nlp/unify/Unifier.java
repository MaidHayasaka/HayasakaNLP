package io.github.usbharu.nlp.unify;

/**
 * 用語、略語を等を統一するクラス
 */
public interface Unifier {

  /**
   * @param formattedSentence フォーマット後の文
   * @return 統一後の文
   */
  String unify(String formattedSentence);
}
