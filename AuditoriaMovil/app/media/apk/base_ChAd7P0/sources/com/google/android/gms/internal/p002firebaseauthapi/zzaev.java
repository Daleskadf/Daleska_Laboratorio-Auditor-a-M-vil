package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.I;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.apache.tika.metadata.HttpHeaders;
import org.json.JSONException;
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaev  reason: invalid package */
/* loaded from: classes.dex */
public final class zzaev {
    private static final boolean zza(int i7) {
        return i7 >= 200 && i7 < 300;
    }

    private static void zza(HttpURLConnection httpURLConnection, zzaew<?> zzaewVar, Type type) {
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                if (zza(responseCode)) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, "UTF-8"));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (!zza(responseCode)) {
                    zzaewVar.zza((String) zzady.zza(sb2, String.class));
                } else {
                    zzaewVar.zza((zzaew<?>) ((zzaea) zzady.zza(sb2, type)));
                }
                httpURLConnection.disconnect();
            } catch (zzabr e7) {
                e = e7;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            } catch (SocketTimeoutException unused) {
                zzaewVar.zza("TIMEOUT");
                httpURLConnection.disconnect();
            } catch (IOException e8) {
                e = e8;
                zzaewVar.zza(e.getMessage());
                httpURLConnection.disconnect();
            }
        } catch (Throwable th3) {
            httpURLConnection.disconnect();
            throw th3;
        }
    }

    public static void zza(String str, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaefVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaewVar, type);
        } catch (SocketTimeoutException unused) {
            zzaewVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzaewVar.zza("<<Network Error>>");
        } catch (IOException e7) {
            zzaewVar.zza(e7.getMessage());
        }
    }

    public static void zza(String str, zzaeb zzaebVar, zzaew<?> zzaewVar, Type type, zzaef zzaefVar) {
        try {
            I.i(zzaebVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzaebVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzaefVar.zza(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                zza(httpURLConnection, zzaewVar, type);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            zzaewVar.zza("TIMEOUT");
        } catch (IOException e7) {
            e = e7;
            zzaewVar.zza(e.getMessage());
        } catch (NullPointerException e8) {
            e = e8;
            zzaewVar.zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            zzaewVar.zza("<<Network Error>>");
        } catch (JSONException e9) {
            e = e9;
            zzaewVar.zza(e.getMessage());
        }
    }
}
