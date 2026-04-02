package com.google.android.gms.internal.ads;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzdog {
    private final Executor zza;
    private final zzdob zzb;

    public zzdog(Executor executor, zzdob zzdobVar) {
        this.zza = executor;
        this.zzb = zzdobVar;
    }

    public final ListenableFuture zza(JSONObject jSONObject, String str) {
        ListenableFuture zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgee.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                zzh = zzgee.zzh(null);
            } else {
                final String optString = optJSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.NAME);
                if (optString == null) {
                    zzh = zzgee.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    if (TypedValues.Custom.S_STRING.equals(optString2)) {
                        zzh = zzgee.zzh(new zzdof(optString, optJSONObject.optString("string_value")));
                    } else if ("image".equals(optString2)) {
                        zzh = zzgee.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdod
                            @Override // com.google.android.gms.internal.ads.zzfwf
                            public final Object apply(Object obj) {
                                return new zzdof(optString, (zzbgr) obj);
                            }
                        }, this.zza);
                    } else {
                        zzh = zzgee.zzh(null);
                    }
                }
            }
            arrayList.add(zzh);
        }
        return zzgee.zzm(zzgee.zzd(arrayList), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzdoe
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdof zzdofVar : (List) obj) {
                    if (zzdofVar != null) {
                        arrayList2.add(zzdofVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
