package com.google.android.gms.internal.location;

import S.k;
import W2.d;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.InterfaceC0734h;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.internal.AbstractC0763l;
import com.google.android.gms.common.internal.C0760i;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import p3.C1667g;
import p3.j;
import p3.u;
import p3.z;
/* loaded from: classes.dex */
public final class zzdz extends AbstractC0763l {
    public static final /* synthetic */ int zze = 0;
    private final k zzf;
    private final k zzg;
    private final k zzh;
    private final k zzi;

    public zzdz(Context context, Looper looper, C0760i c0760i, InterfaceC0734h interfaceC0734h, r rVar) {
        super(context, looper, 23, c0760i, interfaceC0734h, rVar);
        this.zzf = new k(0);
        this.zzg = new k(0);
        this.zzh = new k(0);
        this.zzi = new k(0);
    }

    private final boolean zzG(d dVar) {
        d dVar2;
        d[] availableFeatures = getAvailableFeatures();
        if (availableFeatures != null) {
            int i7 = 0;
            while (true) {
                if (i7 < availableFeatures.length) {
                    dVar2 = availableFeatures[i7];
                    if (dVar.f6166a.equals(dVar2.f6166a)) {
                        break;
                    }
                    i7++;
                } else {
                    dVar2 = null;
                    break;
                }
            }
            if (dVar2 != null && dVar2.k() >= dVar.k()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        if (queryLocalInterface instanceof zzv) {
            return (zzv) queryLocalInterface;
        }
        return new zzu(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final d[] getApiFeatures() {
        return z.f15164i;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f, com.google.android.gms.common.api.g
    public final int getMinApkVersion() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final String getStartServiceAction() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final void onConnectionSuspended(int i7) {
        super.onConnectionSuspended(i7);
        synchronized (this.zzf) {
            this.zzf.clear();
        }
        synchronized (this.zzg) {
            this.zzg.clear();
        }
        synchronized (this.zzh) {
            this.zzh.clear();
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0757f
    public final boolean usesClientTelemetry() {
        return true;
    }

    public final void zzA(Location location, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f15161e)) {
            ((zzv) getService()).zzB(location, new zzdj(null, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzA(location);
        taskCompletionSource.setResult(null);
    }

    public final void zzB(TaskCompletionSource taskCompletionSource) {
        ((zzv) getService()).zzC(new zzdn(null, taskCompletionSource));
    }

    public final void zzC(C0742p c0742p, C1667g c1667g, TaskCompletionSource taskCompletionSource) {
        C0740n c0740n = c0742p.f9271c;
        Objects.requireNonNull(c0740n);
        synchronized (this.zzh) {
            try {
                zzdq zzdqVar = (zzdq) this.zzh.get(c0740n);
                if (zzdqVar == null) {
                    zzdqVar = new zzdq(c0742p);
                    this.zzh.put(c0740n, zzdqVar);
                } else {
                    zzdqVar.zzc(c0742p);
                }
                ((zzv) getService()).zzF(new zzj(1, new zzh(c1667g, zzh.zza, null), zzdqVar, new zzdn(null, taskCompletionSource)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzD(C0740n c0740n, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzh) {
            try {
                zzdq zzdqVar = (zzdq) this.zzh.remove(c0740n);
                if (zzdqVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdqVar.zze();
                ((zzv) getService()).zzF(new zzj(2, null, zzdqVar, new zzdn(Boolean.TRUE, taskCompletionSource)));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzE(j jVar, PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f15163h)) {
            ((zzv) getService()).zze(jVar, pendingIntent, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzd(jVar, pendingIntent, new zzdg(taskCompletionSource));
        }
    }

    public final void zzF(zzem zzemVar, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f15163h)) {
            ((zzv) getService()).zzg(zzemVar, new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzf(zzemVar, new zzdg(taskCompletionSource));
        }
    }

    public final void zzp(u uVar, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f)) {
            ((zzv) getService()).zzo(uVar, new zzee(5, null, new zzdl(taskCompletionSource), null, null));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzp(getContext().getPackageName()));
        }
    }

    public final void zzq(p3.k kVar, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f)) {
            ((zzv) getService()).zzq(kVar, zzee.zzd(new zzdk(taskCompletionSource)));
        } else if (zzG(z.f15159c)) {
            ((zzv) getService()).zzr(kVar, new zzdk(taskCompletionSource));
        } else {
            taskCompletionSource.setResult(((zzv) getService()).zzs());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzr(p3.C1664d r12, com.google.android.gms.tasks.CancellationToken r13, final com.google.android.gms.tasks.TaskCompletionSource r14) {
        /*
            r11 = this;
            r0 = 1
            r1 = 0
            W2.d r2 = p3.z.f
            boolean r2 = r11.zzG(r2)
            if (r2 == 0) goto L28
            android.os.IInterface r0 = r11.getService()
            com.google.android.gms.internal.location.zzv r0 = (com.google.android.gms.internal.location.zzv) r0
            com.google.android.gms.internal.location.zzdk r1 = new com.google.android.gms.internal.location.zzdk
            r1.<init>(r14)
            com.google.android.gms.internal.location.zzee r14 = com.google.android.gms.internal.location.zzee.zzd(r1)
            com.google.android.gms.common.internal.q r12 = r0.zzt(r12, r14)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzed r14 = new com.google.android.gms.internal.location.zzed
            r14.<init>()
            r13.onCanceledRequested(r14)
            return
        L28:
            W2.d r2 = p3.z.f15158b
            boolean r2 = r11.zzG(r2)
            if (r2 == 0) goto L4a
            android.os.IInterface r0 = r11.getService()
            com.google.android.gms.internal.location.zzv r0 = (com.google.android.gms.internal.location.zzv) r0
            com.google.android.gms.internal.location.zzdk r1 = new com.google.android.gms.internal.location.zzdk
            r1.<init>(r14)
            com.google.android.gms.common.internal.q r12 = r0.zzu(r12, r1)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzeb r14 = new com.google.android.gms.internal.location.zzeb
            r14.<init>()
            r13.onCanceledRequested(r14)
            return
        L4a:
            com.google.android.gms.internal.location.zzdh r2 = new com.google.android.gms.internal.location.zzdh
            r2.<init>(r11, r14)
            java.util.concurrent.Executor r3 = com.google.android.gms.internal.location.zzfc.zza()
            java.lang.String r4 = "GetCurrentLocation"
            com.google.android.gms.common.api.internal.p r2 = a.AbstractC0412a.i(r2, r4, r3)
            com.google.android.gms.common.api.internal.n r3 = r2.f9271c
            j$.util.Objects.requireNonNull(r3)
            com.google.android.gms.internal.location.zzdi r4 = new com.google.android.gms.internal.location.zzdi
            r4.<init>(r11, r2, r14)
            com.google.android.gms.tasks.TaskCompletionSource r2 = new com.google.android.gms.tasks.TaskCompletionSource
            r2.<init>()
            p3.n r5 = new p3.n
            int r6 = r12.f15094c
            r7 = 0
            r5.<init>(r6, r7)
            r5.d(r7)
            long r9 = r12.f15095d
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 <= 0) goto L7c
            r6 = r0
            goto L7d
        L7c:
            r6 = r1
        L7d:
            java.lang.String r7 = "durationMillis must be greater than 0"
            com.google.android.gms.common.internal.I.a(r7, r6)
            r5.f15116e = r9
            int r6 = r12.f15093b
            r5.b(r6)
            long r6 = r12.f15092a
            r5.c(r6)
            boolean r6 = r12.f15096e
            r5.f15121l = r6
            int r6 = r12.f
            if (r6 == 0) goto La0
            if (r6 == r0) goto La0
            r7 = 2
            if (r6 != r7) goto L9d
            r8 = r0
            goto La2
        L9d:
            r8 = r1
        L9e:
            r7 = r6
            goto La2
        La0:
            r8 = r0
            goto L9e
        La2:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r9 = new java.lang.Object[r0]
            r9[r1] = r7
            java.lang.String r1 = "throttle behavior %d must be a ThrottleBehavior.THROTTLE_* constant"
            com.google.android.gms.common.internal.I.b(r1, r8, r9)
            r5.f15120k = r6
            r5.f15118h = r0
            android.os.WorkSource r12 = r12.f15090X
            r5.f15122m = r12
            com.google.android.gms.location.LocationRequest r12 = r5.a()
            r11.zzt(r4, r12, r2)
            com.google.android.gms.tasks.Task r12 = r2.getTask()
            com.google.android.gms.internal.location.zzea r0 = new com.google.android.gms.internal.location.zzea
            r0.<init>()
            r12.addOnCompleteListener(r0)
            if (r13 == 0) goto Ld4
            com.google.android.gms.internal.location.zzec r12 = new com.google.android.gms.internal.location.zzec
            r12.<init>()
            r13.onCanceledRequested(r12)
        Ld4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzdz.zzr(p3.d, com.google.android.gms.tasks.CancellationToken, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0018, B:8:0x0026, B:13:0x003d, B:15:0x0073, B:14:0x0054, B:11:0x002e), top: B:19:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0018, B:8:0x0026, B:13:0x003d, B:15:0x0073, B:14:0x0054, B:11:0x002e), top: B:19:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzs(com.google.android.gms.internal.location.zzdr r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.p r3 = r18.zza()
            com.google.android.gms.common.api.internal.n r4 = r3.f9271c
            j$.util.Objects.requireNonNull(r4)
            W2.d r5 = p3.z.f
            boolean r5 = r1.zzG(r5)
            S.k r6 = r1.zzf
            monitor-enter(r6)
            S.k r7 = r1.zzf     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdy r7 = (com.google.android.gms.internal.location.zzdy) r7     // Catch: java.lang.Throwable -> L2c
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L26
            goto L2e
        L26:
            r7.zzc(r3)     // Catch: java.lang.Throwable -> L2c
            r12 = r7
            r7 = r8
            goto L3b
        L2c:
            r0 = move-exception
            goto L75
        L2e:
            com.google.android.gms.internal.location.zzdy r3 = new com.google.android.gms.internal.location.zzdy     // Catch: java.lang.Throwable -> L2c
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            S.k r9 = r1.zzf     // Catch: java.lang.Throwable -> L2c
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L2c
            r12 = r3
        L3b:
            if (r5 == 0) goto L54
            android.os.IInterface r3 = r17.getService()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzv r3 = (com.google.android.gms.internal.location.zzv) r3     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzee r4 = com.google.android.gms.internal.location.zzee.zza(r7, r12, r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdj r5 = new com.google.android.gms.internal.location.zzdj     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r8, r2)     // Catch: java.lang.Throwable -> L2c
            r3.zzw(r4, r0, r5)     // Catch: java.lang.Throwable -> L2c
            goto L73
        L54:
            android.os.IInterface r3 = r17.getService()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzv r3 = (com.google.android.gms.internal.location.zzv) r3     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzeg r11 = com.google.android.gms.internal.location.zzeg.zza(r8, r0)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdo r15 = new com.google.android.gms.internal.location.zzdo     // Catch: java.lang.Throwable -> L2c
            r15.<init>(r2, r12)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r16 = r4.a()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzei r0 = new com.google.android.gms.internal.location.zzei     // Catch: java.lang.Throwable -> L2c
            r13 = 0
            r14 = 0
            r10 = 1
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2c
            r3.zzv(r0)     // Catch: java.lang.Throwable -> L2c
        L73:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            return
        L75:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzdz.zzs(com.google.android.gms.internal.location.zzdr, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003d A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0018, B:8:0x0026, B:13:0x003d, B:15:0x0073, B:14:0x0054, B:11:0x002e), top: B:19:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:4:0x0018, B:8:0x0026, B:13:0x003d, B:15:0x0073, B:14:0x0054, B:11:0x002e), top: B:19:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzt(com.google.android.gms.internal.location.zzdr r18, com.google.android.gms.location.LocationRequest r19, com.google.android.gms.tasks.TaskCompletionSource r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            com.google.android.gms.common.api.internal.p r3 = r18.zza()
            com.google.android.gms.common.api.internal.n r4 = r3.f9271c
            j$.util.Objects.requireNonNull(r4)
            W2.d r5 = p3.z.f
            boolean r5 = r1.zzG(r5)
            S.k r6 = r1.zzg
            monitor-enter(r6)
            S.k r7 = r1.zzg     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r7 = r7.get(r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdv r7 = (com.google.android.gms.internal.location.zzdv) r7     // Catch: java.lang.Throwable -> L2c
            r8 = 0
            if (r7 == 0) goto L2e
            if (r5 == 0) goto L26
            goto L2e
        L26:
            r7.zzc(r3)     // Catch: java.lang.Throwable -> L2c
            r13 = r7
            r7 = r8
            goto L3b
        L2c:
            r0 = move-exception
            goto L75
        L2e:
            com.google.android.gms.internal.location.zzdv r3 = new com.google.android.gms.internal.location.zzdv     // Catch: java.lang.Throwable -> L2c
            r9 = r18
            r3.<init>(r9)     // Catch: java.lang.Throwable -> L2c
            S.k r9 = r1.zzg     // Catch: java.lang.Throwable -> L2c
            r9.put(r4, r3)     // Catch: java.lang.Throwable -> L2c
            r13 = r3
        L3b:
            if (r5 == 0) goto L54
            android.os.IInterface r3 = r17.getService()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzv r3 = (com.google.android.gms.internal.location.zzv) r3     // Catch: java.lang.Throwable -> L2c
            java.lang.String r4 = r4.a()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzee r4 = com.google.android.gms.internal.location.zzee.zzb(r7, r13, r4)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdj r5 = new com.google.android.gms.internal.location.zzdj     // Catch: java.lang.Throwable -> L2c
            r5.<init>(r8, r2)     // Catch: java.lang.Throwable -> L2c
            r3.zzw(r4, r0, r5)     // Catch: java.lang.Throwable -> L2c
            goto L73
        L54:
            android.os.IInterface r3 = r17.getService()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzv r3 = (com.google.android.gms.internal.location.zzv) r3     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzeg r11 = com.google.android.gms.internal.location.zzeg.zza(r8, r0)     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzdd r15 = new com.google.android.gms.internal.location.zzdd     // Catch: java.lang.Throwable -> L2c
            r15.<init>(r2, r13)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r16 = r4.a()     // Catch: java.lang.Throwable -> L2c
            com.google.android.gms.internal.location.zzei r0 = new com.google.android.gms.internal.location.zzei     // Catch: java.lang.Throwable -> L2c
            r12 = 0
            r14 = 0
            r10 = 1
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L2c
            r3.zzv(r0)     // Catch: java.lang.Throwable -> L2c
        L73:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            return
        L75:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L2c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.location.zzdz.zzt(com.google.android.gms.internal.location.zzdr, com.google.android.gms.location.LocationRequest, com.google.android.gms.tasks.TaskCompletionSource):void");
    }

    public final void zzu(PendingIntent pendingIntent, LocationRequest locationRequest, TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f)) {
            ((zzv) getService()).zzw(zzee.zzc(pendingIntent), locationRequest, new zzdj(null, taskCompletionSource));
            return;
        }
        zzeg zza = zzeg.zza(null, locationRequest);
        zzdn zzdnVar = new zzdn(null, taskCompletionSource);
        int hashCode = pendingIntent.hashCode();
        StringBuilder sb = new StringBuilder(String.valueOf(hashCode).length() + 14);
        sb.append("PendingIntent@");
        sb.append(hashCode);
        ((zzv) getService()).zzv(new zzei(1, zza, null, null, pendingIntent, zzdnVar, sb.toString()));
    }

    public final void zzv(C0740n c0740n, boolean z7, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzf) {
            try {
                zzdy zzdyVar = (zzdy) this.zzf.remove(c0740n);
                if (zzdyVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdyVar.zzf();
                if (z7) {
                    if (zzG(z.f)) {
                        int identityHashCode = System.identityHashCode(zzdyVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                        sb.append("ILocationListener@");
                        sb.append(identityHashCode);
                        ((zzv) getService()).zzx(zzee.zza(null, zzdyVar, sb.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
                    } else {
                        ((zzv) getService()).zzv(new zzei(2, null, zzdyVar, null, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
                    }
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzw(C0740n c0740n, boolean z7, TaskCompletionSource taskCompletionSource) {
        synchronized (this.zzg) {
            try {
                zzdv zzdvVar = (zzdv) this.zzg.remove(c0740n);
                if (zzdvVar == null) {
                    taskCompletionSource.setResult(Boolean.FALSE);
                    return;
                }
                zzdvVar.zzg();
                if (z7) {
                    if (zzG(z.f)) {
                        int identityHashCode = System.identityHashCode(zzdvVar);
                        StringBuilder sb = new StringBuilder(String.valueOf(identityHashCode).length() + 18);
                        sb.append("ILocationCallback@");
                        sb.append(identityHashCode);
                        ((zzv) getService()).zzx(zzee.zzb(null, zzdvVar, sb.toString()), new zzdj(Boolean.TRUE, taskCompletionSource));
                    } else {
                        ((zzv) getService()).zzv(new zzei(2, null, null, zzdvVar, null, new zzdn(Boolean.TRUE, taskCompletionSource), null));
                    }
                } else {
                    taskCompletionSource.setResult(Boolean.TRUE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzx(PendingIntent pendingIntent, TaskCompletionSource taskCompletionSource, Object obj) {
        if (zzG(z.f)) {
            ((zzv) getService()).zzx(zzee.zzc(pendingIntent), new zzdj(null, taskCompletionSource));
        } else {
            ((zzv) getService()).zzv(new zzei(2, null, null, null, pendingIntent, new zzdn(null, taskCompletionSource), null));
        }
    }

    public final void zzy(TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f15160d)) {
            ((zzv) getService()).zzz(true, new zzdj(null, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzy(true);
        taskCompletionSource.setResult(null);
    }

    public final void zzz(TaskCompletionSource taskCompletionSource) {
        if (zzG(z.f15160d)) {
            ((zzv) getService()).zzz(false, new zzdj(Boolean.TRUE, taskCompletionSource));
            return;
        }
        ((zzv) getService()).zzy(false);
        taskCompletionSource.setResult(Boolean.TRUE);
    }
}
