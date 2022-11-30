package rest;

import java.util.List;

import Entities.TerneraDTO;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestApiInterface {
/*    @POST("/rest/usuario/login")
    Call<ResponseBody> addLibro(@Query("nombre") String nombre, @Query("descripcion") String descripcion, @Query("url") String url);
*/
    @GET("/rest/ternera/obtener")
    Call<List<TerneraDTO>> getTerneras();
}
