package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzalk implements zzaem {
    private final zzaem zza;
    private final zzalf zzb;
    private zzalh zzh;
    private zzam zzi;
    private final zzaky zzc = new zzaky();
    private int zze = 0;
    private int zzf = 0;
    private byte[] zzg = zzfx.zzf;
    private final zzfo zzd = new zzfo();

    public zzalk(zzaem zzaemVar, zzalf zzalfVar) {
        this.zza = zzaemVar;
        this.zzb = zzalfVar;
    }

    private final void zzb(int i) {
        int length = this.zzg.length;
        int i2 = this.zzf;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.zze;
        int max = Math.max(i3 + i3, i + i3);
        byte[] bArr = this.zzg;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.zze, bArr2, 0, i3);
        this.zze = 0;
        this.zzf = i3;
        this.zzg = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(long j, int i, zzakz zzakzVar) {
        zzek.zzb(this.zzi);
        zzfzn<zzec> zzfznVar = zzakzVar.zza;
        long j2 = zzakzVar.zzc;
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(zzfznVar.size());
        for (zzec zzecVar : zzfznVar) {
            arrayList.add(zzecVar.zza());
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j2);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        zzfo zzfoVar = this.zzd;
        int length = marshall.length;
        zzfoVar.zzI(marshall, length);
        this.zza.zzq(this.zzd, length);
        int i2 = i & Integer.MAX_VALUE;
        long j3 = zzakzVar.zzb;
        if (j3 == -9223372036854775807L) {
            zzek.zzf(this.zzi.zzq == Long.MAX_VALUE);
        } else {
            long j4 = this.zzi.zzq;
            j = j4 == Long.MAX_VALUE ? j + j3 : j3 + j4;
        }
        this.zza.zzs(j, i2, length, 0, null);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ int zzf(zzu zzuVar, int i, boolean z) {
        return zzaek.zza(this, zzuVar, i, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final int zzg(zzu zzuVar, int i, boolean z, int i2) throws IOException {
        if (this.zzh == null) {
            return this.zza.zzg(zzuVar, i, z, 0);
        }
        zzb(i);
        int zza = zzuVar.zza(this.zzg, this.zzf, i);
        if (zza != -1) {
            this.zzf += zza;
            return zza;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzl(zzam zzamVar) {
        String str = zzamVar.zzm;
        str.getClass();
        zzek.zzd(zzcb.zzb(str) == 3);
        if (!zzamVar.equals(this.zzi)) {
            this.zzi = zzamVar;
            this.zzh = this.zzb.zzc(zzamVar) ? this.zzb.zzb(zzamVar) : null;
        }
        if (this.zzh == null) {
            this.zza.zzl(zzamVar);
            return;
        }
        zzaem zzaemVar = this.zza;
        zzak zzb = zzamVar.zzb();
        zzb.zzW("application/x-media3-cues");
        zzb.zzz(zzamVar.zzm);
        zzb.zzaa(Long.MAX_VALUE);
        zzb.zzD(this.zzb.zza(zzamVar));
        zzaemVar.zzl(zzb.zzac());
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final /* synthetic */ void zzq(zzfo zzfoVar, int i) {
        zzaek.zzb(this, zzfoVar, i);
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzr(zzfo zzfoVar, int i, int i2) {
        if (this.zzh == null) {
            this.zza.zzr(zzfoVar, i, i2);
            return;
        }
        zzb(i);
        zzfoVar.zzG(this.zzg, this.zzf, i);
        this.zzf += i;
    }

    @Override // com.google.android.gms.internal.ads.zzaem
    public final void zzs(final long j, final int i, int i2, int i3, zzael zzaelVar) {
        if (this.zzh == null) {
            this.zza.zzs(j, i, i2, i3, zzaelVar);
            return;
        }
        zzek.zze(zzaelVar == null, "DRM on subtitles is not supported");
        int i4 = (this.zzf - i3) - i2;
        this.zzh.zza(this.zzg, i4, i2, zzalg.zza(), new zzep() { // from class: com.google.android.gms.internal.ads.zzalj
            @Override // com.google.android.gms.internal.ads.zzep
            public final void zza(Object obj) {
                zzalk.this.zza(j, i, (zzakz) obj);
            }
        });
        int i5 = i4 + i2;
        this.zze = i5;
        if (i5 == this.zzf) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}
