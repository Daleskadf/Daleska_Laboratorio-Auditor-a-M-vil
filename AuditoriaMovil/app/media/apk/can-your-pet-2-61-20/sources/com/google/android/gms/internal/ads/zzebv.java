package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.net.HttpHeaders;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzebv {
    public ListenableFuture zza;
    private final zzdbj zzb;
    private final zzebd zzc;
    private final zzfkn zzd;
    private final zzfgi zze;
    private final VersionInfoParcel zzf;
    private final zzflk zzg;
    private final zzflh zzh;
    private final Context zzi;
    private final zzgep zzj;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzebv(zzdbj zzdbjVar, zzebd zzebdVar, zzfkn zzfknVar, zzfgi zzfgiVar, VersionInfoParcel versionInfoParcel, zzflk zzflkVar, zzflh zzflhVar, Context context, zzgep zzgepVar) {
        this.zzb = zzdbjVar;
        this.zzc = zzebdVar;
        this.zzd = zzfknVar;
        this.zze = zzfgiVar;
        this.zzf = versionInfoParcel;
        this.zzg = zzflkVar;
        this.zzh = zzflhVar;
        this.zzi = context;
        this.zzj = zzgepVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzbwi zza(zzbxd zzbxdVar, zzedg zzedgVar) {
        zzedgVar.zzc.put(HttpHeaders.CONTENT_TYPE, zzedgVar.zze);
        zzedgVar.zzc.put(HttpHeaders.USER_AGENT, com.google.android.gms.ads.internal.zzu.zzp().zzc(this.zzi, zzbxdVar.zzb.afmaVersion));
        Bundle bundle = new Bundle();
        for (Map.Entry entry : zzedgVar.zzc.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return new zzbwi(zzedgVar.zza, zzedgVar.zzb, bundle, zzedgVar.zzd, zzedgVar.zzf, zzbxdVar.zzd, zzbxdVar.zzh);
    }

    public final ListenableFuture zzc(final zzbxd zzbxdVar, final JSONObject jSONObject, final zzbxg zzbxgVar) {
        this.zzb.zzdn(zzbxdVar);
        zzfke zzb = this.zzd.zzb(zzfkh.PROXY, zzgee.zzm(this.zzd.zzb(zzfkh.PREPARE_HTTP_REQUEST, zzgee.zzh(new zzedk(jSONObject, zzbxgVar))).zze(new zzedl(zzbxdVar.zzg, this.zzh, zzfkv.zza(this.zzi, zzflo.CUI_NAME_ADREQUEST_BUILDURL))).zza(), new zzfwf() { // from class: com.google.android.gms.internal.ads.zzebr
            @Override // com.google.android.gms.internal.ads.zzfwf
            public final Object apply(Object obj) {
                return zzebv.this.zza(zzbxdVar, (zzedg) obj);
            }
        }, this.zzj));
        final zzebd zzebdVar = this.zzc;
        Objects.requireNonNull(zzebdVar);
        zzfjs zza = zzb.zzf(new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebs
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzebd.this.zzc((zzbwi) obj);
            }
        }).zza();
        this.zza = zza;
        ListenableFuture zzn = zzgee.zzn(this.zzd.zzb(zzfkh.PRE_PROCESS, zza).zze(new zzfjq() { // from class: com.google.android.gms.internal.ads.zzebq
            @Override // com.google.android.gms.internal.ads.zzfjq
            public final Object zza(Object obj) {
                return new zzect(zzedh.zza(new InputStreamReader((InputStream) obj)), jSONObject, zzbxgVar);
            }
        }).zzf(com.google.android.gms.ads.internal.zzu.zzf().zza(this.zzi, this.zzf, this.zzg).zza("google.afma.response.normalize", zzect.zza, zzbpn.zzb)).zza(), new zzgdl() { // from class: com.google.android.gms.internal.ads.zzebt
            @Override // com.google.android.gms.internal.ads.zzgdl
            public final ListenableFuture zza(Object obj) {
                return zzebv.this.zzd(zzbxdVar, (InputStream) obj);
            }
        }, this.zzj);
        zzgee.zzr(zzn, new zzebu(this), this.zzj);
        return zzn;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ ListenableFuture zzd(zzbxd zzbxdVar, InputStream inputStream) throws Exception {
        return zzgee.zzh(new zzffz(new zzffw(this.zze), zzffy.zza(new InputStreamReader(inputStream), zzbxdVar)));
    }
}
