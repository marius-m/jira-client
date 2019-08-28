package net.rcarz.jiraclient;

import org.apache.http.client.utils.URIBuilder;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Map;

public class RestClientUtils {

    /**
     * Build a URI from a path.
     *
     * @param path Path to append to the base URI
     *
     * @return the full URI
     *
     * @throws URISyntaxException when the path is invalid
     */
    public static URI buildURI(
            URI uri,
            String path,
            Map<String, String> params
    ) throws URISyntaxException {
        URIBuilder ub = new URIBuilder(uri);
        ub.setPath(ub.getPath() + path);
        if (params != null) {
            for (Map.Entry<String, String> ent : params.entrySet())
                ub.addParameter(ent.getKey(), ent.getValue());
        }
        return ub.build();
    }
}
