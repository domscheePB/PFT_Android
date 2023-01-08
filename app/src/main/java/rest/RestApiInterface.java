package rest;

import java.util.List;

import models.HEnfermedadDTO;
import models.TerneraDTO;
import models.UsuarioDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RestApiInterface {
/*    @POST("/rest/usuario/login")
    Call<ResponseBody> addLibro(@Query("nombre") String nombre, @Query("descripcion") String descripcion, @Query("url") String url);
*/
    @GET("ternera/obtener")
    Call<List<TerneraDTO>> getTerneras();

    @POST("usuario/login")
    Call<UsuarioDTO> iniciarSesion(@Query("usuario") String usuario, @Query("clave") String clave);

    @GET("enfermedad/obtener")
    Call<List<HEnfermedadDTO>> getHistorico();
}
