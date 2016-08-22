package disono.webmons.com.clean_architecture.data.services.auth.api;

import disono.webmons.com.clean_architecture.data.services.auth.model.ForgotModel;
import disono.webmons.com.clean_architecture.data.services.auth.model.LoginModel;
import disono.webmons.com.clean_architecture.data.services.auth.model.RegisterModel;
import disono.webmons.com.clean_architecture.data.services.auth.model.UserModel;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Author: Archie, Disono (disono.apd@gmail.com / webmonsph@gmail.com)
 * Website: www.webmons.com
 * License: Apache 2.0
 * Copyright 2016 Webmons Development Studio.
 * Created at: 2016-05-05 12:43 PM
 */
public interface AuthAPI {
    @POST("/auth/register")
    Call<RegisterModel> register(@Field("first_name") String first_name, @Field("last_name") String last_name,
                                 @Field("email") String email, @Field("password") String password,
                                 @Field("username") String username);

    @POST("/auth/login")
    Call<LoginModel> login(@Field("email") String email, @Field("password") String password);

    @POST("/auth/forgot")
    Call<ForgotModel> forgot(@Field("email") String email);

    @POST("/auth/user/{username}")
    Call<UserModel> user(@Path("username") String user, @Field("token") String token);
}
