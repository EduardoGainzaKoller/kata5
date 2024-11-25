package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.User;

public class UserLoader {
    private final UserReader reader;
    private final UserDeserializer deserializer;
    private final UserAdapter adapter;

    public UserLoader(UserReader reader, UserDeserializer deserializer, UserAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public User get() {
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
