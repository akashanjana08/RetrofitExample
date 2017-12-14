package retrofit.test.com.retrofitexampleapplication.model;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Path;
import org.simpleframework.xml.Root;

import java.util.List;

/**
 * Created by akash.sharma on 12/14/2017.
 */
@Root(name="BTAResponse" ,strict=false)
public class XMlBtaResponse {

    @ElementList(name="Movie", inline=true)
    @Path("Movies")
    private List<Movie> Movie;

    public List<XMlBtaResponse.Movie> getMovie() {
        return Movie;
    }

    public void setMovie(List<XMlBtaResponse.Movie> movie) {
        Movie = movie;
    }

    @Root(name="Movie" ,strict=false)
    public static class Movie
    {
        @Element(name = "Subtype")
        private String Subtype;

        public String getSubtype() {
            return Subtype;
        }

        public void setSubtype(String subtype) {
            Subtype = subtype;
        }
    }
}


