package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbpn {
    private static final Charset zzc = Charset.forName("UTF-8");
    public static final zzbpk zza = new zzbpm();
    public static final zzbpi zzb = new zzbpi() { // from class: com.google.android.gms.internal.ads.zzbpl
        @Override // com.google.android.gms.internal.ads.zzbpi
        public final Object zza(JSONObject jSONObject) {
            return zzbpn.zza(jSONObject);
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ InputStream zza(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(zzc));
    }
}
