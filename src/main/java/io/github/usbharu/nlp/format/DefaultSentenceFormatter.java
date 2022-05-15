package io.github.usbharu.nlp.format;


import java.lang.Character.UnicodeBlock;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultSentenceFormatter
    implements SentenceFormatter {

  private final Logger logger = LoggerFactory.getLogger(getClass());

  @Override
  public String format(String sentence) {
    logger.debug("formatting sentence: {}", sentence);

    String normalized = sentence;
    normalized = removeEmoji(normalized);
    normalized = normalize(normalized);
    normalized = toHiragana(normalized);
    logger.debug("formatted sentence: {}", normalized);

    return normalized;
  }

  protected String normalize(String sentence) {
    logger.debug("normalizing sentence: {}", sentence);
    String normalized = Normalizer.normalize(sentence, Form.NFKC);
    logger.debug("normalized sentence: {}", normalized);
    return normalized;
  }

  protected String removeEmoji(String sentence) {
    logger.debug("removing emoji from sentence: {}", sentence);
    String normalized = sentence.replaceAll("[^\\da-zA-Zぁ-んァ-ヶｱ-ﾝﾞﾟ一-籥]", "");
    logger.debug("removed emoji sentence: {}", normalized);
    return normalized;
  }

  protected String toHiragana(String sentence) {
    logger.debug("converting sentence to hiragana: {}", sentence);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < sentence.length(); i++) {
      char c = sentence.charAt(i);
      logger.trace("converting char: {}", c);
      if (Character.UnicodeBlock.of(c) == UnicodeBlock.KATAKANA) {
        logger.trace("converting katakana: {}", c);
        c -= 0x0060;
        logger.trace("converted katakana: {}", c);
      }
      sb.append(c);
    }
    return sb.toString();
  }


}