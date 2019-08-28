package net.rcarz.utils;

import org.apache.http.Header;
import org.apache.http.HeaderElement;
import org.apache.http.ParseException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CollectionUtils {

    public static Header[] toHeaderArray(Map<String, String> headersAsMap) {
        final List<Header> headers = new ArrayList<Header>();
        for (int i = 0; i < headersAsMap.entrySet().size(); i++) {
            headers.add(new Header() {
                public String getName() {
                    return null;
                }

                public String getValue() {
                    return null;
                }

                public HeaderElement[] getElements() throws ParseException {
                    return new HeaderElement[0];
                }
            });
        }
        return headers.toArray(new Header[headers.size()]);
    }
}
