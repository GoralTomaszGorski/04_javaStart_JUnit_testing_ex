package goral;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class UserCreationServiceTest {


    //given
    DateTimeProvider dateTimeProvider = new DateTimeProvider();
    UserCreationService userCreationService = new UserCreationService();

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