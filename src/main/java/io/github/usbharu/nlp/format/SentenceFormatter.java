package io.github.usbharu.nlp.format;

/**
 * 絵文字の削除、使用可能な文字以外を削除などする {@code Formatter}の定義。
 */
public interface SentenceFormatter {

  /**
   * @param sentence フォーマットする文
   * @return フォマットされた文字列
   */
  String format(String sentence);
}
