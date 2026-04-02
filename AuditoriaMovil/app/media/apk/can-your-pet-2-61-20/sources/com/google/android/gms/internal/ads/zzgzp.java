package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzp;
import com.google.android.gms.internal.ads.zzgzv;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads-lite@@23.1.0 */
/* loaded from: classes3.dex */
public class zzgzp<MessageType extends zzgzv<MessageType, BuilderType>, BuilderType extends zzgzp<MessageType, BuilderType>> extends zzgxp<MessageType, BuilderType> {
    protected MessageType zza;
    private final MessageType zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzgzp(MessageType messagetype) {
        this.zzb = messagetype;
        if (messagetype.zzce()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
    }

    private MessageType zza() {
        return (MessageType) this.zzb.zzbj();
    }

    private static <MessageType> void zzb(MessageType messagetype, MessageType messagetype2) {
        zzhbv.zza().zzb(messagetype.getClass()).zzg(messagetype, messagetype2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzgxp
    protected /* bridge */ /* synthetic */ zzgxp zzaD(zzgxq zzgxqVar) {
        zzbi((zzgzv) zzgxqVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public /* bridge */ /* synthetic */ zzgxp zzaK(zzgyt zzgytVar, zzgzf zzgzfVar) throws IOException {
        zzbk(zzgytVar, zzgzfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public /* bridge */ /* synthetic */ zzgxp zzaN(byte[] bArr, int i, int i2) throws zzhak {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public /* bridge */ /* synthetic */ zzgxp zzaO(byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        zzbm(bArr, i, i2, zzgzfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, com.google.android.gms.internal.ads.zzhbk
    public /* bridge */ /* synthetic */ zzhbk zzaW(zzgyt zzgytVar, zzgzf zzgzfVar) throws IOException {
        zzbk(zzgytVar, zzgzfVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public /* bridge */ /* synthetic */ zzhbk zzaZ(byte[] bArr, int i, int i2) throws zzhak {
        zzbl(bArr, i, i2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    public /* bridge */ /* synthetic */ zzhbk zzba(byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        zzbm(bArr, i, i2, zzgzfVar);
        return this;
    }

    public final BuilderType zzbg() {
        if (this.zzb.zzce()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.zza = zza();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    /* renamed from: zzbh */
    public BuilderType zzaP() {
        BuilderType buildertype = (BuilderType) zzbt().zzcY();
        buildertype.zza = zzbs();
        return buildertype;
    }

    protected BuilderType zzbi(MessageType messagetype) {
        zzbj(messagetype);
        return this;
    }

    public BuilderType zzbj(MessageType messagetype) {
        if (zzbt().equals(messagetype)) {
            return this;
        }
        zzbu();
        zzb(this.zza, messagetype);
        return this;
    }

    public BuilderType zzbk(zzgyt zzgytVar, zzgzf zzgzfVar) throws IOException {
        zzbu();
        try {
            zzhbv.zza().zzb(this.zza.getClass()).zzh(this.zza, zzgyu.zzq(zzgytVar), zzgzfVar);
            return this;
        } catch (RuntimeException e) {
            if (e.getCause() instanceof IOException) {
                throw ((IOException) e.getCause());
            }
            throw e;
        }
    }

    public BuilderType zzbl(byte[] bArr, int i, int i2) throws zzhak {
        zzbm(bArr, i, i2, zzgzf.zza);
        return this;
    }

    public BuilderType zzbm(byte[] bArr, int i, int i2, zzgzf zzgzfVar) throws zzhak {
        zzbu();
        try {
            zzhbv.zza().zzb(this.zza.getClass()).zzi(this.zza, bArr, i, i + i2, new zzgxv(zzgzfVar));
            return this;
        } catch (zzhak e) {
            throw e;
        } catch (IOException e2) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzhak.zzj();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbk
    /* renamed from: zzbn */
    public final MessageType zzbr() {
        MessageType zzbs = zzbs();
        if (zzbs.zzbw()) {
            return zzbs;
        }
        throw zzbb(zzbs);
    }

    @Override // com.google.android.gms.internal.ads.zzhbk
    /* renamed from: zzbo */
    public MessageType zzbs() {
        if (this.zza.zzce()) {
            this.zza.zzbV();
            return this.zza;
        }
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    /* renamed from: zzbp */
    public MessageType zzbt() {
        return this.zzb;
    }

    public /* bridge */ /* synthetic */ zzhbk zzbq() {
        zzbg();
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzbu() {
        if (this.zza.zzce()) {
            return;
        }
        zzbv();
    }

    protected void zzbv() {
        MessageType zza = zza();
        zzb(zza, this.zza);
        this.zza = zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbm
    public final boolean zzbw() {
        return zzgzv.zzcd(this.zza, false);
    }
}
