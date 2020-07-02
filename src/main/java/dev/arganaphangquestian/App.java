package dev.arganaphangquestian;

import dev.arganaphangquestian.reponse.TodoResponse;
import dev.arganaphangquestian.service.TodoService;
import retrofit2.Retrofit;
import retrofit2.converter.moshi.MoshiConverterFactory;

import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://f7987484ff5c6ac59c261f6f20a51f9c.m.pipedream.net")
                .addConverterFactory(MoshiConverterFactory.create())
                .build();

        TodoService todoService = retrofit.create(TodoService.class);

        TodoResponse result = todoService.postTodo("Todo 1", "This is Body Todo").execute().body();
        System.out.println(result);
    }
}
