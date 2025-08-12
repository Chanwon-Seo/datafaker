package net.datafaker.providers.base;

import net.datafaker.Faker;
import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;

class DurationTest {

    private final FakeDuration duration = new Faker().duration();

    @Test
    void testDurationSeconds() {
        final long maxSeconds = 55;
        Duration randomDuration = duration.atMostSeconds(maxSeconds);
        Duration lowerBound = Duration.ofSeconds(0);
        Duration upperBound = Duration.ofSeconds(maxSeconds);

        assertThat(randomDuration).isBetween(lowerBound, upperBound);
    }

    @Test
    void testDurationMinutes() {
        final long maxMins = 45;
        Duration randomDuration = duration.atMostMinutes(maxMins);
        Duration lowerBound = Duration.ofMinutes(0);
        Duration upperBound = Duration.ofMinutes(maxMins);

        assertThat(randomDuration).isBetween(lowerBound, upperBound);
    }

    @Test
    void testDurationHours() {
        final long maxHours = 35;
        Duration randomDuration = duration.atMostHours(maxHours);
        Duration lowerBound = Duration.ofHours(0);
        Duration upperBound = Duration.ofHours(maxHours);

        assertThat(randomDuration).isBetween(lowerBound, upperBound);
    }

    @Test
    void testDurationDays() {
        final long maxDays = 40;
        Duration randomDuration = duration.atMostDays(maxDays);
        Duration lowerBound = Duration.ofDays(0);
        Duration upperBound = Duration.ofDays(maxDays);

        assertThat(randomDuration).isBetween(lowerBound, upperBound);
    }

}
