package io.github.usbharu.nlp.instructions;

import java.util.List;

/**
 * 自然言語処理エンジンに登録する指示
 */
public interface Instructions {

  /**
   * @return 登録する動詞のリスト
   */
  List<String> getVerbs();

  /**
   * @return 登録する対象のリスト
   */
  List<String> getTargets();

  /**
   * @return 登録するその他の情報のリスト
   */
  List<Modifier> getModifiers();
}
