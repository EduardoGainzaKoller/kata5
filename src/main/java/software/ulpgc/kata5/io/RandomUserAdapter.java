package software.ulpgc.kata5.io;

import software.ulpgc.kata5.io.pojos.RandomUserGetResponse;
import software.ulpgc.kata5.model.User;

public class RandomUserAdapter implements UserAdapter{
    @Override
    public User adapt(Object object) {
        return adapt(((RandomUserGetResponse) object).results().get(0));
    }

    private User adapt(RandomUserGetResponse.User user) {
        return new User(userNameOf(user));
    }

    private String userNameOf(RandomUserGetResponse.User user) {
        return user.name().title() + " " + user.name().first() + " " + user.name().last();
    }
}
