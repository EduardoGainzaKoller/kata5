package software.ulpgc.kata5;

import software.ulpgc.kata5.io.RandomUserAdapter;
import software.ulpgc.kata5.io.RandomUserDeserializer;
import software.ulpgc.kata5.io.RandomUserReader;
import software.ulpgc.kata5.io.UserLoader;

public class Main {
    public static void main(String[] args) {
        UserLoader loader = new UserLoader(
                new RandomUserReader(),
                new RandomUserDeserializer(),
                new RandomUserAdapter()
        );

        for (int i = 0; i < 15; i++) {
            System.out.println(loader.get().name());
        }
    }
}
