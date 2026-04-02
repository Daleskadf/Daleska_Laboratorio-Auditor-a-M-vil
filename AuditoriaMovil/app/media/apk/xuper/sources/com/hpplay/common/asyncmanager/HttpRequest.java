package com.hpplay.common.asyncmanager;

import android.text.TextUtils;
import com.hpplay.common.asyncmanager.AsyncHttpParameter;
import com.hpplay.common.log.LeLog;
import com.hpplay.common.utils.CertUtils;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.zip.GZIPInputStream;
/* loaded from: classes2.dex */
public class HttpRequest {
    private final String TAG = "HttpRequest";
    private int count = 0;
    private AsyncHttpJob mHttpJob;
    private AsyncHttpParameter.In parameter;

    public HttpRequest(AsyncHttpParameter.In in, AsyncHttpJob asyncHttpJob) {
        this.parameter = in;
        this.mHttpJob = asyncHttpJob;
    }

    public HttpResult doGet() {
        HttpURLConnection httpURLConnection;
        boolean headers;
        int responseCode;
        int i10;
        HttpResult httpResult = new HttpResult();
        this.count = 0;
        AsyncHttpParameter.In in = this.parameter;
        String str = in.requestUrl;
        if (!TextUtils.isEmpty(in.params)) {
            if (str.endsWith(Operator.Operation.EMPTY_PARAM)) {
                str = this.parameter.requestUrl + this.parameter.params;
            } else {
                str = this.parameter.requestUrl + Operator.Operation.EMPTY_PARAM + this.parameter.params;
            }
        }
        String replaceAll = str.replaceAll(" ", "%20");
        while (this.count < this.parameter.tryCount) {
            try {
                try {
                    httpURLConnection = CertUtils.getHttpURLConnection(new URL(replaceAll));
                    httpURLConnection.setConnectTimeout(this.parameter.connectTimeout);
                    httpURLConnection.setReadTimeout(this.parameter.readTimeout);
                    httpURLConnection.setDoInput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestMethod("GET");
                    headers = setHeaders(httpURLConnection, this.parameter.requestHeaders);
                    httpURLConnection.connect();
                    AsyncHttpJob asyncHttpJob = this.mHttpJob;
                    if (asyncHttpJob != null) {
                        asyncHttpJob.cancelTimeOut();
                    }
                    responseCode = httpURLConnection.getResponseCode();
                    httpResult.responseCode = responseCode;
                } catch (Exception e10) {
                    LeLog.w("HttpRequest", e10);
                }
            } catch (Error e11) {
                LeLog.w("HttpRequest", e11);
            }
            if (responseCode == 200) {
                String readHttpResult = readHttpResult(httpURLConnection, headers);
                httpResult.resultType = 0;
                httpResult.result = readHttpResult;
                httpResult.headers = httpURLConnection.getHeaderFields();
                this.count++;
                return httpResult;
            }
            LeLog.w("HttpRequest", "doGet" + replaceAll + " responseCode:" + responseCode);
            int i11 = this.count;
            AsyncHttpParameter.In in2 = this.parameter;
            if (i11 < in2.tryCount - 1 && (i10 = in2.trySpace) > 0) {
                try {
                    Thread.sleep(i10);
                } catch (Exception e12) {
                    LeLog.w("HttpRequest", "Exception when doGet retry sleep " + e12);
                }
            }
            this.count++;
        }
        httpResult.resultType = 1;
        httpResult.result = null;
        return httpResult;
    }

    public HttpResult doPost() {
        String str;
        HttpURLConnection httpURLConnection;
        boolean headers;
        int responseCode;
        int i10;
        HttpResult httpResult = new HttpResult();
        this.count = 0;
        while (true) {
            int i11 = this.count;
            AsyncHttpParameter.In in = this.parameter;
            if (i11 < in.tryCount) {
                try {
                    try {
                        str = in.requestUrl;
                        httpURLConnection = CertUtils.getHttpURLConnection(new URL(str));
                        httpURLConnection.setConnectTimeout(this.parameter.connectTimeout);
                        httpURLConnection.setReadTimeout(this.parameter.readTimeout);
                        httpURLConnection.setDoInput(true);
                        httpURLConnection.setDoOutput(true);
                        httpURLConnection.setRequestMethod("POST");
                        httpURLConnection.setUseCaches(false);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setRequestProperty("Content-Type", "application/json");
                        headers = setHeaders(httpURLConnection, this.parameter.requestHeaders);
                        httpURLConnection.connect();
                        AsyncHttpJob asyncHttpJob = this.mHttpJob;
                        if (asyncHttpJob != null) {
                            asyncHttpJob.cancelTimeOut();
                        }
                        if (!TextUtils.isEmpty(this.parameter.params)) {
                            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                            dataOutputStream.write(this.parameter.params.getBytes("UTF-8"));
                            dataOutputStream.flush();
                        }
                        responseCode = httpURLConnection.getResponseCode();
                        httpResult.responseCode = responseCode;
                    } catch (Error e10) {
                        LeLog.w("HttpRequest", e10);
                    }
                } catch (InterruptedIOException unused) {
                    LeLog.w("HttpRequest", "doPost InterruptedIOException");
                } catch (Exception e11) {
                    LeLog.w("HttpRequest", e11);
                }
                if (responseCode == 200) {
                    String readHttpResult = readHttpResult(httpURLConnection, headers);
                    httpResult.resultType = 0;
                    httpResult.result = readHttpResult;
                    httpResult.headers = httpURLConnection.getHeaderFields();
                    this.count++;
                    return httpResult;
                }
                LeLog.w("HttpRequest", "doPost" + str + " responseCode:" + responseCode);
                int i12 = this.count;
                AsyncHttpParameter.In in2 = this.parameter;
                if (i12 < in2.tryCount - 1 && (i10 = in2.trySpace) > 0) {
                    try {
                        Thread.sleep(i10);
                    } catch (Exception e12) {
                        LeLog.w("HttpRequest", "Exception when doPost retry sleep " + e12);
                    }
                }
                this.count++;
            } else {
                httpResult.resultType = 1;
                httpResult.result = null;
                return httpResult;
            }
        }
    }

    public int getCount() {
        return this.count;
    }

    public String readHttpResult(URLConnection uRLConnection, boolean z10) {
        InputStream inputStream;
        StringBuffer stringBuffer;
        if (z10) {
            inputStream = new GZIPInputStream(uRLConnection.getInputStream());
        } else {
            inputStream = uRLConnection.getInputStream();
        }
        String str = null;
        if (inputStream != null) {
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            stringBuffer = new StringBuffer();
            for (int read = inputStreamReader.read(); read != -1; read = inputStreamReader.read()) {
                stringBuffer.append((char) read);
            }
            inputStream.close();
            inputStreamReader.close();
        } else {
            stringBuffer = null;
        }
        if (stringBuffer != null) {
            str = stringBuffer.toString();
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str;
    }

    public boolean setHeaders(URLConnection uRLConnection, Map<String, String> map) {
        boolean z10 = false;
        if (map != null && map.size() > 0) {
            for (String str : map.keySet()) {
                String obj = str.toString();
                String str2 = map.get(obj);
                if ("gzip".equals(str2)) {
                    z10 = true;
                }
                uRLConnection.setRequestProperty(obj, str2);
            }
        }
        return z10;
    }
}
