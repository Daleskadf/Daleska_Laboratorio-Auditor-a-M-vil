package com.google.android.recaptcha.internal;

import java.io.InputStreamReader;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import kotlin.jvm.internal.j;
import l6.c;
import l6.g;
import m5.d;
/* loaded from: classes.dex */
public final class zzfa implements zzey {
    private final c zza;

    public zzfa() {
        int i7 = zzav.zza;
        this.zza = d.m(zzez.zza);
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final zzsc zza(String str, zzto zztoVar) {
        zzew zzewVar = null;
        try {
            try {
                zzewVar = ((zzex) ((g) this.zza).a()).zza(str);
                zzewVar.zzc();
                zzewVar.zze(zztoVar.zzd());
                zzsc zzscVar = (zzsc) zzewVar.zza(zzsc.zzi());
                zzewVar.zzd();
                return zzscVar;
            } catch (zzbd e7) {
                if (zzewVar != null) {
                    if (j.a(e7.zza(), zzba.zzau)) {
                        try {
                            throw zzbc.zza(zztu.zzg(zzewVar.zzb().getErrorStream()).zzi());
                        } catch (Exception e8) {
                            throw new zzbd(zzbb.zzc, zzba.zzG, e8.getMessage());
                        }
                    }
                    throw e7;
                }
                throw e7;
            } catch (Exception e9) {
                throw new zzbd(zzbb.zzc, zzba.zzF, e9.getMessage());
            }
        } catch (Throwable th) {
            if (zzewVar != null) {
                zzewVar.zzd();
            }
            throw th;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzey
    public final String zzb(String str) {
        InputStreamReader inputStreamReader;
        try {
            try {
                URLConnection openConnection = new URL(str).openConnection();
                j.c(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
                HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.setRequestProperty("Accept", "application/x-protobuffer");
                httpURLConnection.setRequestProperty("Accept-Encoding", "gzip");
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 200) {
                    try {
                        if ("gzip".equals(httpURLConnection.getContentEncoding())) {
                            inputStreamReader = new InputStreamReader(new GZIPInputStream(httpURLConnection.getInputStream()));
                        } else {
                            inputStreamReader = new InputStreamReader(httpURLConnection.getInputStream());
                        }
                        StringWriter stringWriter = new StringWriter();
                        char[] cArr = new char[8192];
                        for (int read = inputStreamReader.read(cArr); read >= 0; read = inputStreamReader.read(cArr)) {
                            stringWriter.write(cArr, 0, read);
                        }
                        String stringWriter2 = stringWriter.toString();
                        j.d(stringWriter2, "toString(...)");
                        return stringWriter2;
                    } catch (Exception unused) {
                        throw new zzbd(zzbb.zzc, zzba.zzP, null);
                    }
                }
                throw new zzbd(zzbb.zzc, new zzba(httpURLConnection.getResponseCode()), null);
            } catch (Exception unused2) {
                throw new zzbd(zzbb.zzc, zzba.zzO, null);
            }
        } catch (Exception unused3) {
            throw new zzbd(zzbb.zzb, zzba.zzN, null);
        }
    }
}
