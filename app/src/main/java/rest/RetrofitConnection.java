package rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitConnection {

    private static Retrofit retrofit = null;

    private static String URL = "http://192.168.0.20:8080/PFT/rest/";

    public static Retrofit getConecction()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(URL).addConverterFactory(GsonConverterFactory.create()).build();

        }

        return retrofit;
    }
}
