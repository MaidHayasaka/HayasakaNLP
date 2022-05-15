package io.github.usbharu.nlp.parse.verb;

import static org.junit.jupiter.api.Assertions.*;

import io.github.usbharu.nlp.instructions.DefaultInstructions;
import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

abstract class VerbSearcherTest {

  protected VerbSearcher verbSearcher;

  @Test
  void search() {
    List<String> verbs = List.of("おしえる", "する", "つける", "けす");
    List<String> targets = List.of("電気", "仕事");
    SearchedVerb search =
        verbSearcher.search(List.of(new DefaultInstructions(verbs, targets, new ArrayList<>())),
            "仕事をする");
    assertNotNull(search);
    assertNotNull(search.getVerb());
    assertEquals("する", search.getVerb());
    assertNotEquals(0, search.getVerb().length());
  }
}