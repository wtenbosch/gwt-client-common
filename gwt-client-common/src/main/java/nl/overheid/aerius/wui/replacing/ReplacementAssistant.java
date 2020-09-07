package nl.overheid.aerius.wui.replacing;

import nl.overheid.aerius.wui.event.HasEventBus;

public interface ReplacementAssistant extends HasEventBus {
  String replace(String origin);

  /**
   * Replace the given string, and throw an error when there are tags that cannot
   * be replaced.
   */
  String replaceStrict(String origin);
}
