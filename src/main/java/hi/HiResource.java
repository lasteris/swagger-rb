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
@Path("/hi")
@Tag(name = "hi")
public class HiResource {

    public record Body1(String name, String value, String flag) {}
    public record Body2(String id, String code) {}

    @Produces(MediaType.APPLICATION_JSON)
    @GET
    @Path("/correct")
    public Body1 getBody1() {
        return null;
    }

    @APIResponse(
        responseCode = "200",
        description = "",
        content = @Content(schema = @Schema(implementation = Body2.class))
    )
    @Path("/not-correct")
    @GET
    public Body2 getBody2() {
        return null;
    }
}
