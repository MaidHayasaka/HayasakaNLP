package io.github.usbharu.nlp.format;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

abstract class SentenceFormatterTest {

  public SentenceFormatter sentenceFormatter;

  @Test
  void format() {
    String format = sentenceFormatter.format("コンニチハ👩🏻🧑😚☺😶🧈🥪🥠🦼🚝🚠💌☮🛐💚㊙🆎❎2️⏸🔽⏫");
    assertEquals("こんにちは2", format);
  }
}