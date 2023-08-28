package handshake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class HandshakeCalculator {
/*
1 = wink
10 = double blink
100 = close your eyes
1000 = jump
10000 = Reverse the order of the operations in the secret handshake.
 */
List<Signal> calculateHandshake(int number) {
    List<Signal> ops = new ArrayList<>();
    for (Signal signal : Signal.values()) {
        if ((number & signal.getCode()) != 0) {
            if (signal == Signal.REVERSE) {
                Collections.reverse(ops);
            } else {
                ops.add(signal);
            }
        }
    }
    return ops;
}

}
