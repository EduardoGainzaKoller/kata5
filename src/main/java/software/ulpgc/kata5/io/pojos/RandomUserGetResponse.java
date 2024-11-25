package software.ulpgc.kata5.io.pojos;

import software.ulpgc.kata5.model.User;

import java.util.List;

public record RandomUserGetResponse(List<User> results, Info info) {
    public record User(Name name, String gender, String email, Login login){}

    public record Name(String title, String first, String last){}

    public record Login(String uuid, String username, String password, String salt) {}

    public record Info(String seed, int results, int page, String version){}
}
