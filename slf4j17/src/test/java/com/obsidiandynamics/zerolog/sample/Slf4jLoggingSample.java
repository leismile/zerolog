package com.obsidiandynamics.zerolog.sample;

import java.lang.invoke.*;
import java.util.*;

import com.obsidiandynamics.zerolog.*;

public final class Slf4jLoggingSample {
  private static final Zlg zlg = Zlg.forClass(MethodHandles.lookup().lookupClass()).get();
  
  public static void main(String[] args) {
    zlg.i("Starting with %d args: %s", z -> z.arg(args.length).arg(Arrays.asList(args)));
    zlg.w("An error occurred at %s", z -> z.arg(new Date()).threw(new RuntimeException()).tag("I/O"));
  }
}