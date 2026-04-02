package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.play_billing.zzcz;
import com.google.android.gms.internal.play_billing.zzdd;
/* compiled from: com.android.billingclient:billing@@6.2.1 */
/* loaded from: classes3.dex */
public class zzcz<MessageType extends zzdd<MessageType, BuilderType>, BuilderType extends zzcz<MessageType, BuilderType>> extends zzbl<MessageType, BuilderType> {
    protected zzdd zza;
    private final zzdd zzb;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzcz(MessageType messagetype) {
        this.zzb = messagetype;
        if (!messagetype.zzx()) {
            this.zza = messagetype.zzj();
            return;
        }
        throw new IllegalArgumentException("Default instance must be immutable.");
    }

    @Override // com.google.android.gms.internal.play_billing.zzbl
    /* renamed from: zzb */
    public final zzcz zza() {
        zzcz zzczVar = (zzcz) this.zzb.zzy(5, null, null);
        zzczVar.zza = zze();
        return zzczVar;
    }

    public final MessageType zzc() {
        MessageType zze = zze();
        if (zze.zzw()) {
            return zze;
        }
        throw new zzfl(zze);
    }

    @Override // com.google.android.gms.internal.play_billing.zzej
    /* renamed from: zzd */
    public MessageType zze() {
        if (this.zza.zzx()) {
            this.zza.zzr();
            return (MessageType) this.zza;
        }
        return (MessageType) this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzel
    public final /* bridge */ /* synthetic */ zzek zzf() {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzg() {
        if (this.zza.zzx()) {
            return;
        }
        zzh();
    }

    protected void zzh() {
        zzdd zzj = this.zzb.zzj();
        zzes.zza().zzb(zzj.getClass()).zzg(zzj, this.zza);
        this.zza = zzj;
    }
}
