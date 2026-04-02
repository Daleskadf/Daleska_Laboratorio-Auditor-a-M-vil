package com.google.android.gms.internal.location;

import B5.M;
import W2.d;
import X0.c;
import a.AbstractC0412a;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC0751z;
import com.google.android.gms.common.api.internal.C0740n;
import com.google.android.gms.common.api.internal.C0742p;
import com.google.android.gms.common.api.internal.C0746u;
import com.google.android.gms.common.api.internal.InterfaceC0747v;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.CancellationToken;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.Executor;
import p3.C1664d;
import p3.C1667g;
import p3.InterfaceC1666f;
import p3.InterfaceC1668h;
import p3.m;
import p3.z;
/* loaded from: classes.dex */
public final class zzbi extends l implements InterfaceC1668h {
    static final h zza;
    public static final i zzb;
    private static final Object zzc;
    private static Object zzd;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.h, java.lang.Object] */
    static {
        ?? obj = new Object();
        zza = obj;
        zzb = new i("LocationServices.API", new zzbf(), obj);
        zzc = new Object();
    }

    public zzbi(Activity activity) {
        super(activity, activity, zzb, e.f9157U, k.f9283c);
    }

    private final Task zza(final LocationRequest locationRequest, C0742p c0742p) {
        final zzbh zzbhVar = new zzbh(this, c0742p, zzcd.zza);
        InterfaceC0747v interfaceC0747v = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbt
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzs(zzbh.this, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        c a7 = C0746u.a();
        a7.f6249c = interfaceC0747v;
        a7.f6250d = zzbhVar;
        a7.f6251e = c0742p;
        a7.f6248b = 2435;
        return doRegisterEventListener(a7.c());
    }

    private final Task zzb(final LocationRequest locationRequest, C0742p c0742p) {
        final zzbh zzbhVar = new zzbh(this, c0742p, zzbz.zza);
        InterfaceC0747v interfaceC0747v = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbu
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzt(zzbh.this, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        c a7 = C0746u.a();
        a7.f6249c = interfaceC0747v;
        a7.f6250d = zzbhVar;
        a7.f6251e = c0742p;
        a7.f6248b = 2436;
        return doRegisterEventListener(a7.c());
    }

    private final Task zzc(final C1667g c1667g, final C0742p c0742p) {
        InterfaceC0747v interfaceC0747v = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbm
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzC(C0742p.this, c1667g, (TaskCompletionSource) obj2);
            }
        };
        InterfaceC0747v interfaceC0747v2 = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbn
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final void accept(Object obj, Object obj2) {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                zzdz zzdzVar = (zzdz) obj;
                i iVar = zzbi.zzb;
                C0740n c0740n = C0742p.this.f9271c;
                if (c0740n != null) {
                    zzdzVar.zzD(c0740n, taskCompletionSource);
                }
            }
        };
        c a7 = C0746u.a();
        a7.f6249c = interfaceC0747v;
        a7.f6250d = interfaceC0747v2;
        a7.f6251e = c0742p;
        a7.f6248b = 2434;
        return doRegisterEventListener(a7.c());
    }

    public final Task<Void> flushLocations() {
        M a7 = AbstractC0751z.a();
        a7.f330c = zzca.zza;
        a7.f329b = 2422;
        return doWrite(a7.a());
    }

    @Override // com.google.android.gms.common.api.l
    public final String getApiFallbackAttributionTag(Context context) {
        return null;
    }

    public final Task<Location> getCurrentLocation(int i7, CancellationToken cancellationToken) {
        z.b(i7);
        C1664d c1664d = new C1664d(10000L, 0, i7, Long.MAX_VALUE, false, 0, new WorkSource(null), null);
        if (cancellationToken != null) {
            I.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        M a7 = AbstractC0751z.a();
        a7.f330c = new zzbp(c1664d, cancellationToken);
        a7.f329b = 2415;
        Task<Location> doRead = doRead(a7.a());
        if (cancellationToken != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
            doRead.continueWith(new zzbq(taskCompletionSource));
            return taskCompletionSource.getTask();
        }
        return doRead;
    }

    @Override // p3.InterfaceC1668h
    public final Task<Location> getLastLocation() {
        M a7 = AbstractC0751z.a();
        a7.f330c = zzby.zza;
        a7.f329b = 2414;
        return doRead(a7.a());
    }

    public final Task<LocationAvailability> getLocationAvailability() {
        M a7 = AbstractC0751z.a();
        a7.f330c = zzbr.zza;
        a7.f329b = 2416;
        return doRead(a7.a());
    }

    public final Task<Void> removeDeviceOrientationUpdates(InterfaceC1666f interfaceC1666f) {
        return doUnregisterEventListener(AbstractC0412a.j(interfaceC1666f, InterfaceC1666f.class.getSimpleName()), 2440).continueWith(zzcg.zza, zzbo.zza);
    }

    public final Task<Void> removeLocationUpdates(final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbx
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzx(pendingIntent, (TaskCompletionSource) obj2, null);
            }
        };
        a7.f329b = 2418;
        return doWrite(a7.a());
    }

    public final Task<Void> requestDeviceOrientationUpdates(C1667g c1667g, InterfaceC1666f interfaceC1666f, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            I.j(looper, "invalid null looper");
        }
        return zzc(c1667g, AbstractC0412a.h(looper, interfaceC1666f, InterfaceC1666f.class.getSimpleName()));
    }

    public final Task<Void> requestLocationUpdates(final LocationRequest locationRequest, final PendingIntent pendingIntent) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbs
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzu(pendingIntent, locationRequest, (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2417;
        return doWrite(a7.a());
    }

    public final Task<Void> setMockLocation(final Location location) {
        boolean z7;
        if (location != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.c(z7);
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbl
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzA(location, (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2421;
        return doWrite(a7.a());
    }

    public final Task<Void> setMockMode(boolean z7) {
        synchronized (zzc) {
            try {
                if (z7) {
                    if (zzd == null) {
                        Object obj = new Object();
                        zzd = obj;
                        c a7 = C0746u.a();
                        a7.f6249c = zzcb.zza;
                        a7.f6250d = zzcc.zza;
                        a7.f6251e = AbstractC0412a.h(Looper.getMainLooper(), obj, "Object");
                        a7.f6248b = 2420;
                        return doRegisterEventListener(a7.c());
                    }
                } else {
                    Object obj2 = zzd;
                    if (obj2 != null) {
                        zzd = null;
                        return doUnregisterEventListener(AbstractC0412a.j(obj2, "Object"), 2420).continueWith(zzcf.zza, zzbk.zza);
                    }
                }
                return Tasks.forResult(null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public zzbi(Context context) {
        super(context, null, zzb, e.f9157U, k.f9283c);
    }

    public final Task<Location> getLastLocation(final p3.k kVar) {
        M a7 = AbstractC0751z.a();
        a7.f330c = new InterfaceC0747v() { // from class: com.google.android.gms.internal.location.zzbj
            @Override // com.google.android.gms.common.api.internal.InterfaceC0747v
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                i iVar = zzbi.zzb;
                ((zzdz) obj).zzq(p3.k.this, (TaskCompletionSource) obj2);
            }
        };
        a7.f329b = 2414;
        a7.f331d = new d[]{z.f15159c};
        return doRead(a7.a());
    }

    @Override // p3.InterfaceC1668h
    public final Task<Void> removeLocationUpdates(p3.l lVar) {
        return doUnregisterEventListener(AbstractC0412a.j(lVar, p3.l.class.getSimpleName()), 2418).continueWith(zzce.zza, zzbw.zza);
    }

    public final Task<Void> requestDeviceOrientationUpdates(C1667g c1667g, Executor executor, InterfaceC1666f interfaceC1666f) {
        return zzc(c1667g, AbstractC0412a.i(interfaceC1666f, InterfaceC1666f.class.getSimpleName(), executor));
    }

    @Override // p3.InterfaceC1668h
    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, p3.l lVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            I.j(looper, "invalid null looper");
        }
        return zzb(locationRequest, AbstractC0412a.h(looper, lVar, p3.l.class.getSimpleName()));
    }

    public final Task<Void> removeLocationUpdates(m mVar) {
        return doUnregisterEventListener(AbstractC0412a.j(mVar, m.class.getSimpleName()), 2418).continueWith(zzch.zza, zzbv.zza);
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, m mVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            I.j(looper, "invalid null looper");
        }
        return zza(locationRequest, AbstractC0412a.h(looper, mVar, m.class.getSimpleName()));
    }

    public final Task<Location> getCurrentLocation(C1664d c1664d, CancellationToken cancellationToken) {
        if (cancellationToken != null) {
            I.a("cancellationToken may not be already canceled", !cancellationToken.isCancellationRequested());
        }
        M a7 = AbstractC0751z.a();
        a7.f330c = new zzbp(c1664d, cancellationToken);
        a7.f329b = 2415;
        Task<Location> doRead = doRead(a7.a());
        if (cancellationToken != null) {
            TaskCompletionSource taskCompletionSource = new TaskCompletionSource(cancellationToken);
            doRead.continueWith(new zzbq(taskCompletionSource));
            return taskCompletionSource.getTask();
        }
        return doRead;
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, p3.l lVar) {
        return zzb(locationRequest, AbstractC0412a.i(lVar, p3.l.class.getSimpleName(), executor));
    }

    public final Task<Void> requestLocationUpdates(LocationRequest locationRequest, Executor executor, m mVar) {
        return zza(locationRequest, AbstractC0412a.i(mVar, m.class.getSimpleName(), executor));
    }
}
