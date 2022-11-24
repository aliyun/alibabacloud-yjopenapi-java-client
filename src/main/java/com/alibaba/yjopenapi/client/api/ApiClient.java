/*
 * 
 * YuanJing OpenAPI SDK
 *
 */

package com.alibaba.yjopenapi.client.api;

import com.squareup.okhttp.*;
import com.squareup.okhttp.internal.http.HttpMethod;
import javax.xml.bind.DatatypeConverter;

import javax.net.ssl.*;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Arrays;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.alibaba.fastjson.JSON;

public class ApiClient {

    public static final String Trace_Id = "Traceid";
    public static final String  Result_Status = "Result-Status";

    private String basePath = "/";

    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();

    private OkHttpClient httpClient;

    /*
     * Constructor for ApiClient
     */
    public ApiClient() {
        httpClient = new OkHttpClient();

    }

    /**
     * Get base path
     *
     * @return Baes path
     */
    public String getBasePath() {
        return basePath;
    }

    /**
     * Set base path
     *
     * @param basePath Base path of the URL (e.g /
     * @return An instance of OkHttpClient
     */
    public ApiClient setBasePath(String basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * Get HTTP client
     *
     * @return An instance of OkHttpClient
     */
    public OkHttpClient getHttpClient() {
        return httpClient;
    }

    /**
     * Set HTTP client
     *
     * @param httpClient An instance of OkHttpClient
     * @return Api Client
     */
    public ApiClient setHttpClient(OkHttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /**
     * Add a default header.
     *
     * @param key The header's key
     * @param value The header's value
     * @return ApiClient
     */
    public ApiClient addDefaultHeader(String key, String value) {
        defaultHeaderMap.put(key, value);
        return this;
    }

    /**
     * Get connection timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getConnectTimeout() {
        return httpClient.getConnectTimeout();
    }

    /**
     * Sets the connect timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     *
     * @param connectionTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setConnectTimeout(int connectionTimeout) {
        httpClient.setConnectTimeout(connectionTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get read timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getReadTimeout() {
        return httpClient.getReadTimeout();
    }

    /**
     * Sets the read timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param readTimeout read timeout in milliseconds
     * @return Api client
     */
    public ApiClient setReadTimeout(int readTimeout) {
        httpClient.setReadTimeout(readTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Get write timeout (in milliseconds).
     *
     * @return Timeout in milliseconds
     */
    public int getWriteTimeout() {
        return httpClient.getWriteTimeout();
    }

    /**
     * Sets the write timeout (in milliseconds).
     * A value of 0 means no timeout, otherwise values must be between 1 and
     * {@link Integer#MAX_VALUE}.
     *
     * @param writeTimeout connection timeout in milliseconds
     * @return Api client
     */
    public ApiClient setWriteTimeout(int writeTimeout) {
        httpClient.setWriteTimeout(writeTimeout, TimeUnit.MILLISECONDS);
        return this;
    }

    /**
     * Format the given parameter object into string.
     *
     * @param param Parameter
     * @return String representation of the parameter
     */
    public static String parameterToString(Object param) {

        List<? extends Class<?>> primitives = Arrays.asList(String.class,Boolean.class,Double.class,Integer.class,Long.class,Float.class);

        if (param == null) {
            return "";
        } else if (param instanceof Date) {
            return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'").format((Date) param);
        } else if (param.getClass().isPrimitive() || primitives.contains(param.getClass())) {
            return String.valueOf(param);
        } else {
            //Serialize to json string and remove the " enclosing characters
            return JSON.toJSONString(param);
            // return jsonStr.substring(1, jsonStr.length() - 1);
        }
    }

    /**
     * Formats the specified query parameter to a list containing a single {@code Pair} object.
     *
     * Note that {@code value} must not be a collection.
     *
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list containing a single {@code Pair} object.
     */
    //public List<Pair> parameterToPair(String name, Object value) {
    //    List<Pair> params = new ArrayList<Pair>();
    //
    //    // preconditions
    //    if (name == null || name.isEmpty() || value == null || value instanceof Collection) {
    //        return params;
    //    }
    //
    //    params.add(new Pair(name, parameterToString(value)));
    //    return params;
    //}

    /**
     * Formats the specified collection query parameters to a list of {@code Pair} objects.
     *
     * Note that the values of each of the returned Pair objects are percent-encoded.
     *
     * @param collectionFormat The collection format of the parameter.
     * @param name The name of the parameter.
     * @param value The value of the parameter.
     * @return A list of {@code Pair} objects.
     */
    //public List<Pair> parameterToPairs(String collectionFormat, String name, Collection value) {
    //    List<Pair> params = new ArrayList<Pair>();
    //
    //    // preconditions
    //    if (name == null || name.isEmpty() || value == null || value.isEmpty()) {
    //        return params;
    //    }
    //
    //    // create the params based on the collection format
    //    if ("multi".equals(collectionFormat)) {
    //        for (Object item : value) {
    //            params.add(new Pair(name, escapeString(parameterToString(item))));
    //        }
    //        return params;
    //    }
    //
    //    // collectionFormat is assumed to be "csv" by default
    //    //String delimiter = ",";
    //
    //    // escape all delimiters except commas, which are URI reserved
    //    // characters
    //    //if ("ssv".equals(collectionFormat)) {
    //    //    delimiter = escapeString(" ");
    //    //} else if ("tsv".equals(collectionFormat)) {
    //    //    delimiter = escapeString("\t");
    //    //} else if ("pipes".equals(collectionFormat)) {
    //    //    delimiter = escapeString("|");
    //    //}
    //
    //    //StringBuilder sb = new StringBuilder() ;
    //    //for (Object item : value) {
    //    //    sb.append(delimiter);
    //    //    sb.append(escapeString(parameterToString(item)));
    //    //}
    //
    //    //params.add(new Pair(name, sb.substring(delimiter.length())));
    //
    //    return params;
    //}

    /**
     * Sanitize filename by removing path.
     * e.g. ../../sun.gif becomes sun.gif
     *
     * @param filename The filename to be sanitized
     * @return The sanitized filename
     */
    public String sanitizeFilename(String filename) {
        return filename.replaceAll(".*[/\\\\]", "");
    }

    /**
     * Check if the given MIME is a JSON MIME.
     * JSON MIME examples:
     *   application/json
     *   application/json; charset=UTF8
     *   APPLICATION/JSON
     *   application/vnd.company+json
     * "* / *" is also default to JSON
     * @param mime MIME (Multipurpose Internet Mail Extensions)
     * @return True if the given MIME is JSON, false otherwise.
     */
    public boolean isJsonMime(String mime) {
      String jsonMime = "(?i)^(application/json|[^;/ \t]+/[^;/ \t]+[+]json)[ \t]*(;.*)?$";
      return mime != null && (mime.matches(jsonMime) || mime.equals("*/*"));
    }

    /**
     * Select the Accept header's value from the given accepts array:
     *   if JSON exists in the given array, use it;
     *   otherwise use all of them (joining into a string)
     *
     * @param accepts The accepts array to select from
     * @return The Accept header to use. If the given array is empty,
     *   null will be returned (not to set the Accept header explicitly).
     */
     public String selectHeaderAccept(List<String> accepts) {
        if (accepts == null || accepts.isEmpty()) {
            return null;
        }
        for (String accept : accepts) {
            if (isJsonMime(accept)) {
                return accept;
            }
        }
        return join(accepts, ",");
    }

    /**
     * Select the Content-Type header's value from the given array:
     *   if JSON exists in the given array, use it;
     *   otherwise use the first one of the array.
     *
     * @param contentTypes The Content-Type array to select from
     * @return The Content-Type header to use. If the given array is empty,
     *   or matches "any", JSON will be used.
     */
    public String selectHeaderContentType(List<String> contentTypes) {
        if (contentTypes == null || contentTypes.isEmpty() || contentTypes.contains("*/*")) {
             return "application/json";
        }
        for (String contentType : contentTypes) {
            if (isJsonMime(contentType)) {
                return contentType;
            }
        }
        return contentTypes.get(0);
    }

    /**
     * Escape the given string to be used as URL query value.
     *
     * @param str String to be escaped
     * @return Escaped string
     */
    public String escapeString(String str) {
        try {
            return URLEncoder.encode(str, "utf8").replaceAll("\\+", "%20");
        } catch (UnsupportedEncodingException e) {
            return str;
        }
    }

    /**
     * Deserialize response body to Java object, according to the return type and
     * the Content-Type response header.
     *
     * @param <T> Type
     * @param response HTTP response
     * @param returnType The type of the Java object
     * @return The deserialized Java object
     * @throws ApiException If fail to deserialize response body, i.e. cannot read response body
     *   or the Content-Type of the response is not supported.
     */
    public <T> T deserialize(Response response, Class<T> returnType) throws ApiException {
        if (response == null || returnType == null) {
            return null;
        }

        String respBody;
        try (ResponseBody body = response.body()) {
            if (body != null) {
                respBody = body.string();
            } else {
                respBody = null;
            }
        } catch (IOException e) {
            throw new ApiException(e);
        }

        if (respBody == null || "".equals(respBody)) {
            return null;
        }

        String contentType = response.headers().get("Content-Type");
        if (contentType == null) {
            // ensuring a default content type
            contentType = "application/json";
        }
        if (isJsonMime(contentType)) {
            return JSON.parseObject(respBody, returnType);
        } else {
            throw new ApiException(
                    "Content type \"" + contentType + "\" is not supported for type: " + returnType,
                    response.code(),
                    response.headers().toMultimap(),
                    respBody);
        }
    }

    /**
     * Serialize the given Java object into request body according to the object's
     * class and the request Content-Type.
     *
     * @param obj The Java object
     * @param contentType The request Content-Type
     * @return The serialized request body
     * @throws ApiException If fail to serialize the given object
     */
    public RequestBody serialize(Object obj, String contentType) throws ApiException {
        if (isJsonMime(contentType)) {
            String content;
            if (obj != null) {
                content = JSON.toJSONString(obj);
            } else {
                content = "";
            }
            return RequestBody.create(MediaType.parse(contentType), content);
        } else {
            throw new ApiException("Content type \"" + contentType + "\" is not supported");
        }
    }

    /**
     * {@link #execute(Call, Class)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @throws ApiException If fail to execute the call
     * @return ApiResponse&lt;T&gt;
     */
    public <T> ApiResponse<T> execute(Call call) throws ApiException {
        return execute(call, null);
    }

    /**
     * Execute HTTP call and deserialize the HTTP response body into the given return type.
     *
     * @param returnType The return type used to deserialize HTTP response body
     * @param <T> The return type corresponding to (same with) returnType
     * @param call Call
     * @return ApiResponse object containing response status, headers and
     *   data, which is a Java object deserialized from response body and would be null
     *   when returnType is null.
     * @throws ApiException If fail to execute the call
     */
    public <T> ApiResponse<T> execute(Call call, Class<T> returnType) throws ApiException {
        try {
            Response response = call.execute();
            T data = handleResponse(response, returnType);
            return new ApiResponse<T>(response.code(), response.headers().toMultimap(), data);
        } catch (IOException e) {
            throw new ApiException(e);
        }
    }

    /**
     * {@link #executeAsync(Call, Class, ApiCallback)}
     *
     * @param <T> Type
     * @param call An instance of the Call object
     * @param callback ApiCallback&lt;T&gt;
     */
    public <T> void executeAsync(Call call, ApiCallback<T> callback) {
        executeAsync(call, null, callback);
    }

    /**
     * Execute HTTP call asynchronously.
     *
     * @see #execute(Call, Class)
     * @param <T> Type
     * @param call The callback to be executed when the API call finishes
     * @param returnType Return type
     * @param callback ApiCallback
     */
    public <T> void executeAsync(Call call, final Class<T> returnType, final ApiCallback<T> callback) {
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                callback.onFailure(new ApiException(e), 0, null);
            }

            @Override
            public void onResponse(Response response) throws IOException {
                T result;
                try {
                    result = (T) handleResponse(response, returnType);
                } catch (ApiException e) {
                    callback.onFailure(e, response.code(), response.headers().toMultimap());
                    return;
                }
                callback.onSuccess(result, response.code(), response.headers().toMultimap());
            }
        });
    }

    /**
     * Handle the given response, return the deserialized object when the response is successful.
     *
     * @param <T> Type
     * @param response Response
     * @param returnType Return type
     * @throws ApiException If the response has a unsuccessful status code or
     *   fail to deserialize the response body
     * @return Type
     */
    public <T> T handleResponse(Response response, Class<T> returnType) throws ApiException {
        if (response.isSuccessful()) {
            if (returnType == null) {
                // returning null if the returnType is not defined,
                // or the status code is 204 (No Content)
                try (ResponseBody body = response.body()) {
                    return null;
                } catch (IOException e) {
                    throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
                }
            } else {
                return deserialize(response, returnType);
            }
        } else {
            try (ResponseBody body = response.body()) {
                String respBody = null;
                if (body != null) {
                    respBody = body.string();
                }
                throw new ApiException(response.message(), response.code(), response.headers().toMultimap(), respBody);
            } catch (IOException e) {
                throw new ApiException(response.message(), e, response.code(), response.headers().toMultimap());
            }
        }
    }

    /**
     * Build HTTP call with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @return The HTTP call
     * @throws ApiException If fail to serialize the request body object
     */
    public Call buildCall(String path, String method, Map<String, String> queryParams, Map<String, String> headerParams, Map<String, Object> formParams, Configuration configuration) throws ApiException {
        Request request = buildRequest(path, method, queryParams, headerParams, formParams, configuration);

        return httpClient.newCall(request);
    }

    /**
     * Build an HTTP request with the given options.
     *
     * @param path The sub-path of the HTTP URL
     * @param method The request method, one of "GET", "HEAD", "OPTIONS", "POST", "PUT", "PATCH" and "DELETE"
     * @param queryParams The query parameters
     * @param headerParams The header parameters
     * @param formParams The form parameters
     * @return The HTTP request
     * @throws ApiException If fail to serialize the request body object
     */
    public Request buildRequest(String path, String method, Map<String, String> queryParams, Map<String, String> headerParams, Map<String, Object> formParams, Configuration configuration) throws ApiException {

        final String url = buildUrl(path, queryParams);
        final Request.Builder reqBuilder = new Request.Builder().url(url);

        Map<String, String> signHeader = prepareSignHeader(queryParams, formParams, method, configuration);
        headerParams.putAll(signHeader);

        processHeaderParams(headerParams, reqBuilder);

        String contentType = (String) headerParams.get("Content-Type");
        // ensuring a default content type
        if (contentType == null) {
            contentType = "application/json";
        }

        RequestBody reqBody = null;
        if (!HttpMethod.permitsRequestBody(method)) {
            reqBody = null;
        } else if ("application/x-www-form-urlencoded".equals(contentType)) {
            reqBody = buildRequestBodyFormEncoding(formParams);
        } else {
            // use an empty request body (for POST, PUT and PATCH)
            reqBody = RequestBody.create(MediaType.parse(contentType), "");
            // reqBody = serialize(null, contentType);
        }

        Request request = reqBuilder.method(method, reqBody).build();
        return request;
    }

    /**
     * Build full URL by concatenating base path, the given sub path and query parameters.
     *
     * @param path The sub path
     * @param queryParams The query parameters
     * @return The full URL
     */
    public String buildUrl(String path, Map<String, String> queryParams) {
        final StringBuilder url = new StringBuilder(path);

        if (queryParams != null && !queryParams.isEmpty()) {
            // support (constant) query string in `path`, e.g. "/posts?draft=1"
            String prefix = path.contains("?") ? "&" : "?";
            for (Entry<String, String> param : queryParams.entrySet()) {
                if (param.getValue() != null) {
                    if (prefix != null) {
                        url.append(prefix);
                        prefix = null;
                    } else {
                        url.append("&");
                    }
                    String value = parameterToString(param.getValue());
                    url.append(escapeString(param.getKey())).append("=").append(escapeString(value));
                }
            }
        }

        //if (collectionQueryParams != null && !collectionQueryParams.isEmpty()) {
        //    String prefix = url.toString().contains("?") ? "&" : "?";
        //    for (Pair param : collectionQueryParams) {
        //        if (param.getValue() != null) {
        //            if (prefix != null) {
        //                url.append(prefix);
        //                prefix = null;
        //            } else {
        //                url.append("&");
        //            }
        //            String value = parameterToString(param.getValue());
        //            // collection query parameter value already escaped as part of parameterToPairs
        //            url.append(escapeString(param.getName())).append("=").append(value);
        //        }
        //    }
        //}

        return url.toString();
    }

    /**
     * Set header parameters to the request builder, including default headers.
     *
     * @param headerParams Header parameters in the ofrm of Map
     * @param reqBuilder Reqeust.Builder
     */
    public void processHeaderParams(Map<String, String> headerParams, Request.Builder reqBuilder) {
        reqBuilder.header("User-Agent", "cgw-client/1.0.0/java");

        for (Entry<String, String> param : headerParams.entrySet()) {
            reqBuilder.header(param.getKey(), parameterToString(param.getValue()));
        }
    }

    /**
     * Build a form-encoding request body with the given form parameters.
     *
     * @param formParams Form parameters in the form of Map
     * @return RequestBody
     */
    public RequestBody buildRequestBodyFormEncoding(Map<String, Object> formParams) {
        FormEncodingBuilder formBuilder  = new FormEncodingBuilder();
        for (Entry<String, Object> param : formParams.entrySet()) {
            formBuilder.add(param.getKey(), parameterToString(param.getValue()));
        }
        return formBuilder.build();
    }

    private static String join(List<String> array, String separator) {
        if (array == null || array.isEmpty()) {
            return "";
        }
        StringBuilder out = new StringBuilder();
        out.append(array.get(0));
        for (int i = 1; i < array.size(); i++) {
            out.append(separator).append(array.get(i));
        }
        return out.toString();
    }

    public static Map<String, String> prepareSignHeader(Map<String, String> queryParams, Map<String, Object> formParams, String method, Configuration configuration)
        throws ApiException {

        String nonce = UUID.randomUUID().toString().replaceAll("-", "");
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        df.setTimeZone(new SimpleTimeZone(0, "GMT"));
        String timestamp = df.format(new Date());
        String signatureMethod = configuration.getSignatureMethod();
        String signatureVersion = configuration.getSignatureVersion();
        String accessKey = configuration.getAccessKey();

        Map<String, String> parameters = new HashMap<String, String>();
        // 加入公共请求参数
        parameters.put("SignatureMethod", signatureMethod);
        parameters.put("SignatureNonce", nonce);
        parameters.put("SignatureVersion", signatureVersion);
        parameters.put("AccessKey", accessKey);
        parameters.put("Timestamp", timestamp);

        if (queryParams != null && !queryParams.isEmpty()) {
            parameters.putAll(queryParams);
        }

        if (formParams != null && !formParams.isEmpty()) {
            for (Entry<String, Object> param : formParams.entrySet()) {
                parameters.put(param.getKey(), parameterToString(param.getValue()));
            }
        }

        try {
            Map<String, String> headers = new HashMap<String, String>();
            headers.put("Signature", md5(getSignRaw(parameters, method, configuration.getSecretKey())));
            headers.put("Accesskey", accessKey);
            headers.put("Signaturenonce", nonce);
            headers.put("Signatureversion", signatureVersion);
            headers.put("Timestamp", timestamp);
            headers.put("Signaturemethod", signatureMethod);

            return headers;
        } catch (Exception e) {
            throw new ApiException(e);
        }
    }

    private static String getSignRaw(Map<String, String> parameters, String method, String sk) throws Exception {
        return sk + "&" + keySignInput(parameters, method);
    }

    private static String keySignInput(Map<String, String> parameters, String method) throws Exception {

        Map<String, String> order = new TreeMap<>(parameters);
        StringBuilder stringToSign = new StringBuilder();
        stringToSign.append(method).append("&").append(encode("/"));

        List<String> keyValPairs = new ArrayList<>();
        for (Entry<String, String> param : order.entrySet()) {
            keyValPairs.add(param.getKey() + "=" + encode(param.getValue()));
        }
        String queryString = join(keyValPairs, "&");

        stringToSign.append("&").append(encode(queryString));
        return stringToSign.toString();

    }

    private static String encode(String stringToEncode) throws Exception {
        return URLEncoder.encode(stringToEncode, "utf8").replaceAll("\\+", "%20").replaceAll("\\*", "%2A").replaceAll("%7E", "~");
    }

    private static String md5(String str) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(str.getBytes());
        byte[] digest = md.digest();
        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    }
}
