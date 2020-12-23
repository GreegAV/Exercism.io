package gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class Gigasecond {
    private LocalDateTime ldt;

    public Gigasecond(LocalDate moment) {
        ldt = moment.atStartOfDay();
    }

    public Gigasecond(LocalDateTime moment) {
        ldt = moment;
    }

    public LocalDateTime getDateTime() {
        return ldt.plusSeconds(1000000000);
    }
}
