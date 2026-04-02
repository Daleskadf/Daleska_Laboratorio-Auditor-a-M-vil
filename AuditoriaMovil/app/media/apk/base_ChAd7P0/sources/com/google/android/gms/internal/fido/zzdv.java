package com.google.android.gms.internal.fido;

import io.flutter.plugins.pathprovider.b;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdv {
    private final Deque zza = new ArrayDeque(16);

    private zzdv(boolean z7) {
    }

    public static zzdv zza() {
        return new zzdv(false);
    }

    private final long zzh() {
        if (this.zza.isEmpty()) {
            return 0L;
        }
        return ((Long) this.zza.peek()).longValue();
    }

    private final void zzi(long j) {
        this.zza.pop();
        this.zza.push(Long.valueOf(j));
    }

    public final void zzb() {
        if (this.zza.isEmpty()) {
            return;
        }
        int size = this.zza.size();
        long zzh = zzh();
        throw new IOException("data item not completed, stackSize: " + size + " scope: " + zzh);
    }

    public final void zzc() {
        long zzh = zzh();
        if (zzh < 0) {
            if (zzh != -5) {
                this.zza.pop();
                return;
            }
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        throw new IOException(b.g("expected indefinite length scope but found ", zzh));
    }

    public final void zzd() {
        long zzh = zzh();
        if (zzh != -1) {
            if (zzh != -2) {
                return;
            }
            zzh = -2;
        }
        throw new IOException(b.g("expected non-string scope but found ", zzh));
    }

    public final void zze(long j) {
        long zzh = zzh();
        if (zzh != j) {
            if (zzh != -1) {
                if (zzh == -2) {
                    zzh = -2;
                } else {
                    return;
                }
            }
            throw new IOException("expected non-string scope or scope " + j + " but found " + zzh);
        }
    }

    public final void zzf() {
        long zzh = zzh();
        int i7 = (zzh > 1L ? 1 : (zzh == 1L ? 0 : -1));
        if (i7 == 0) {
            this.zza.pop();
        } else if (i7 > 0) {
            zzi(zzh - 1);
        } else if (zzh == -4) {
            zzi(-5L);
        } else if (zzh == -5) {
            zzi(-4L);
        }
    }

    public final void zzg(long j) {
        this.zza.push(Long.valueOf(j));
    }
}
