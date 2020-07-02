package dev.arganaphangquestian.service;


import dev.arganaphangquestian.reponse.TodoResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface TodoService {
    @FormUrlEncoded
    @POST("/todo")
    Call<TodoResponse> postTodo(@Field("todo") String todo, @Field("body") String body);
}
