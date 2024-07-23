package goral;

import java.time.ZonedDateTime;

public class UserCreationService {
    public UserCreationService(DateTimeProvider dateTimeProvider) {
    }

    public User createUser(String name) {
        return new User(name, ZonedDateTime.now());
    }
}
