package com.proto.app;
import static spark.Spark.get;
import static spark.Spark.post;
import com.google.gson.Gson;




public class Api {
    public static UserService userService = new UserService();

    public static void main(String[] args) {

        final Gson gson = new Gson();

        post("/add", (req, res) -> {
            res.type("application/json");
            User user = gson.fromJson(req.body(), User.class);

            return userService.addUSer(user);
        }, gson ::toJson);
    }
}
