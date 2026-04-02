package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public class zzaru extends zzaqq {
    private final Object zza;
    private final zzaqv zzb;

    public zzaru(int i, String str, zzaqv zzaqvVar, zzaqu zzaquVar) {
        super(i, str, zzaquVar);
        this.zza = new Object();
        this.zzb = zzaqvVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqq
    public final zzaqw zzh(zzaqm zzaqmVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzaqmVar.zzb;
            Map map = zzaqmVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzaqmVar.zzb);
        }
        return zzaqw.zzb(str, zzarn.zzb(zzaqmVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzaqq
    /* renamed from: zzz */
    public void zzo(String str) {
        zzaqv zzaqvVar;
        synchronized (this.zza) {
            zzaqvVar = this.zzb;
        }
        zzaqvVar.zza(str);
    }
}
