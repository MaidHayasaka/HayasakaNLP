package io.github.usbharu.nlp.unify;

import java.util.List;
import java.util.Map.Entry;

public class DefaultUnifier implements Unifier {

  UnifyDataMap unifyDataMap;

  public DefaultUnifier(UnifyDataMap unifyDataMap) {
    this.unifyDataMap = unifyDataMap;
  }

  @Override
  public String unify(String formattedSentence) {
    for (Entry<String, List<String>> stringListEntry : unifyDataMap.entrySet()) {
      for (String s : stringListEntry.getValue()) {
        formattedSentence = formattedSentence.replace(s, stringListEntry.getKey());
      }
    }
    return formattedSentence;
  }
}