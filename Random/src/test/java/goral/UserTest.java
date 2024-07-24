package goral;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserTest {

    @Mock
    DateTimeProvider dateTimeProvider;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void shouldByOlderThenAYear(){

        ZonedDateTime creationDate = ZonedDateTime.of(
                2023,8,30,15,12,0,0,
                ZoneId.of("Europe/Warsaw"));
        User user = new User("", creationDate);


        ZonedDateTime now = ZonedDateTime.of(
                2024,8,30,15,12,0,0,
                ZoneId.of("Europe/Warsaw"));

        when(dateTimeProvider.nowAsZonedDateTime()).thenReturn(now);

        //when
        boolean olderTenAYaer = user.isOlderThanAYear(dateTimeProvider);

        //that
        assertThat(olderTenAYaer).isTrue();
    }

    @Test
    void shouldByNotOlderThenAYear(){

        ZonedDateTime creationDate = ZonedDateTime.of(
                2023,12,30,15,12,0,0,
                ZoneId.of("Europe/Warsaw"));
        User user = new User("", creationDate);


        ZonedDateTime now = ZonedDateTime.of(
                2024,8,30,15,12,0,0,
                ZoneId.of("Europe/Warsaw"));

        when(dateTimeProvider.nowAsZonedDateTime()).thenReturn(now);

        //when
        boolean olderTenAYaer = user.isOlderThanAYear(dateTimeProvider);

        //that
        assertThat(olderTenAYaer).isFalse();
    }

}