package hi;

import io.smallrye.common.annotation.RunOnVirtualThread;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@RunOnVirtualThread
@Path("/hi2")
@Tag(name = "hi2")
@Produces(MediaType.APPLICATION_JSON)
public class HiResource2 {

    public record Body1(String name, String value, String flag) {}

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("/correct")
    public Body1 getBody1() {
        return null;
    }
}
