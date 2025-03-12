/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private static Configuration defaultConfiguration = new Configuration();

    /**
     * DefaultHeaders
     *
     */
    protected Map<String, String> defaultHeaders = new HashMap<String, String>();

    /**
     * SignatureVersion
     *
     */
    protected String signatureVersion = "1.0";

    /**
     * SignatureMethod
     *
     */
    protected String signatureMethod = "MD5";

    /**
     * AccessKey
     *
     */
    protected String accessKey = null;

    /**
     * SecretKey
     *
     */
    protected String secretKey = null;

    /**
     * HTTP scheme
     *
     */
    protected String scheme = "https";

    /**
     * Host
     *
     */
    protected String host = "/";

    /**
     *
     * @return default configuration
     */
    public static Configuration getDefaultConfiguration() {
        return defaultConfiguration;
    }

    /**
     *
     * @return headers
     */
    public Map<String, String> getDefaultHeaders() {
        return defaultHeaders;
    }

    /**
     * @param key
     * @param value
     */
    public Configuration addHeader(String key, String value) {
        this.defaultHeaders.put(key, value);
        return this;
    }

    public void setHeaders(Map<String, String> headers) {
        this.defaultHeaders = headers;
    }

    /**
     *
     * @return signature version
     */
    public String getSignatureVersion() {
        return signatureVersion;
    }

    /**
     *
     * @param signatureVersion
     */
    public Configuration signatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
        return this;
    }

    public void setSignatureVersion(String signatureVersion) {
        this.signatureVersion = signatureVersion;
    }

    /**
     *
     * @return signature method
     */
    public String getSignatureMethod() {
        return signatureMethod;
    }

    /**
     *
     * @param signatureMethod
     */
    public Configuration signatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    public void setSignatureMethod(String signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    /**
     *
     * @return access key
     */
    public String getAccessKey() {
        return accessKey;
    }

    /**
     *
     * @param accessKey
     */
    public Configuration accessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    /**
     *
     * @return secret key
     */
    public String getSecretKey() {
        return secretKey;
    }

    /**
     *
     * @param secretKey
     */
    public Configuration secretKey(String secretKey) {
        this.secretKey = secretKey;
        return this;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     *
     * @return scheme
     */
    public String getScheme() {
        return scheme;
    }

    /**
     *
     * @param scheme
     */
    public Configuration scheme(String scheme) {
        this.scheme = scheme;
        return this;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    /**
     *
     * @return host
     */
    public String getHost() {
        return host;
    }

    /**
     *
     * @param host
     */
    public Configuration host(String host) {
        this.host = host;
        return this;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
