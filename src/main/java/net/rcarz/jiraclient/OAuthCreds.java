package net.rcarz.jiraclient;

public class OAuthCreds {
    private final String uri;
    private final String privateKey;
    private final String consumerKey;
    private final String tokenSecret;
    private final String accessKey;

    public OAuthCreds(
            String uri,
            String privateKey,
            String consumerKey,
            String tokenSecret,
            String accessKey
    ) {
        this.uri = uri;
        this.privateKey = privateKey;
        this.consumerKey = consumerKey;
        this.tokenSecret = tokenSecret;
        this.accessKey = accessKey;
    }

    public String getUri() {
        return uri;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getTokenSecret() {
        return tokenSecret;
    }

    public String getAccessKey() {
        return accessKey;
    }
}
