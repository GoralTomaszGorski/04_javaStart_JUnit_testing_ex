package goral;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZonedDateTime;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.when;

class UserCreationServiceTest {



    @Mock    DateTimeProvider dateTimeProvider;
    //given
    private UserCreationService userCreationService;
    private ZonedDateTime now;

    @BeforeEach
    void init(){
        MockitoAnnotations.openMocks(this);
        userCreationService = new UserCreationService(dateTimeProvider);

        now = ZonedDateTime.now();
        when(dateTimeProvider.nowAsZonedDateTime()).thenReturn(now);

    }


    @Test
    public void shouldCreateUserWithValidName(){

        //when
        User user = userCreationService.createUser("Ania");

        //then
        assertThat(user.getName()).isEqualTo("Ania");
    }

    @Test
    public void shouldCreateUserWithActualDate(){

        //when
        User user = userCreationService.createUser("Admin");

        //then
        assertThat(user.getCreationDate()).isNotNull();
    }


}