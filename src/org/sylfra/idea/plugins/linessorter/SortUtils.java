package org.sylfra.idea.plugins.linessorter;

import java.text.Collator;
import java.util.*;

/**
 * Convenient class for sort functions
 * @author <a href="mailto:syllant@gmail.com">Sylvain FRANCOIS</a>
 * @version $Id$
 */
public class SortUtils
{
  private static final Comparator<String> DEFAULT_COMPARATOR = new DefaultComparator();
  private static final Collator ENGLISH_COLLATOR = Collator.getInstance(new Locale("en", "US"));

  public static void defaultSort(List<String> lines)
  {
    lines.sort(DEFAULT_COMPARATOR);
  }

  private static class DefaultComparator implements Comparator<String> {
    public int compare(String s1, String s2) {
      return ENGLISH_COLLATOR.compare(s1, s2);
    }
  }
}