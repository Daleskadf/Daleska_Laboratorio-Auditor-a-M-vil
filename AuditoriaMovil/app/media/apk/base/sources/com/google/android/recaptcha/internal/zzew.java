package com.google.android.recaptcha.internal;

import G.i;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.jvm.internal.j;
/* loaded from: classes.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    private final InputStream zzf() {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e9.getMessage());
        }
    }

    private final OutputStream zzg() {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e9.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode != 400) {
                    if (responseCode != 503 && responseCode != 403) {
                        if (responseCode != 404) {
                            throw new zzbd(zzbb.zzc, zzba.zzK, null);
                        }
                        throw new zzbd(zzbb.zzc, zzba.zzi, null);
                    }
                    throw new zzbd(zzbb.zzi, zzba.zzJ, null);
                }
                throw new zzbd(zzbb.zzc, zzba.zzau, null);
            }
            InputStream zzf = zzf();
            j.e(zzf, "<this>");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, zzf.available()));
            i.u(zzf, byteArrayOutputStream, 8192);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j.d(byteArray, "toByteArray(...)");
            if (byteArray.length != 0) {
                try {
                    Object zzb = zzoiVar.zzD().zzb(byteArray);
                    j.c(zzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                    return (zzoi) zzb;
                } catch (Exception e7) {
                    throw new zzbd(zzbb.zzc, zzba.zzG, e7.getMessage());
                }
            }
            throw new zzbd(zzbb.zzc, zzba.zzat, null);
        } catch (Exception e8) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e8.getMessage());
        }
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    public final void zzc() {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e7) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e7.getMessage());
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e9.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) {
        try {
            zzg().write(bArr);
        } catch (zzbd e7) {
            throw e7;
        } catch (IOException e8) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e8.getMessage());
        } catch (Exception e9) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e9.getMessage());
        }
    }
}
