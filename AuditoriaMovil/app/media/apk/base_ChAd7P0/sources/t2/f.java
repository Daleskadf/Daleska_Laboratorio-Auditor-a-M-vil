package t2;

import B5.AbstractActivityC0032e;
import android.app.PendingIntent;
import android.content.Context;
import android.content.IntentSender;
import android.os.Build;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.common.internal.I;
import com.google.android.gms.internal.location.zzbi;
import com.google.android.gms.internal.location.zzda;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.OnFailureListener;
import e0.C0927b;
import java.security.SecureRandom;
import java.util.ArrayList;
import l0.C1411b;
import p3.z;
import s2.InterfaceC1765a;
/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15725a;

    /* renamed from: b  reason: collision with root package name */
    public final d f15726b;

    /* renamed from: c  reason: collision with root package name */
    public final zzbi f15727c;

    /* renamed from: d  reason: collision with root package name */
    public final r f15728d;

    /* renamed from: e  reason: collision with root package name */
    public final int f15729e;
    public final o f;

    /* renamed from: g  reason: collision with root package name */
    public InterfaceC1765a f15730g;

    /* renamed from: h  reason: collision with root package name */
    public s f15731h;

    public f(Context context, o oVar) {
        int nextInt;
        this.f15725a = context;
        int i7 = p3.o.f15123a;
        this.f15727c = new zzbi(context);
        this.f = oVar;
        this.f15728d = new r(context, oVar);
        synchronized (this) {
            nextInt = new SecureRandom().nextInt(65536);
        }
        this.f15729e = nextInt;
        this.f15726b = new d(this, oVar, context);
    }

    public static LocationRequest f(o oVar) {
        boolean z7;
        float f;
        long j;
        long j8;
        long j9;
        long j10;
        boolean z8;
        boolean z9;
        boolean z10;
        int i7 = 104;
        boolean z11 = false;
        if (Build.VERSION.SDK_INT < 33) {
            LocationRequest locationRequest = new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 0.0f, true, 3600000L, 0, 0, false, new WorkSource(), null);
            if (oVar != null) {
                int i8 = e.f15724a[oVar.f15745a.ordinal()];
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            i7 = 100;
                        } else {
                            i7 = 102;
                        }
                    }
                } else {
                    i7 = 105;
                }
                z.b(i7);
                locationRequest.f9429a = i7;
                long j11 = oVar.f15747c;
                if (j11 >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                I.a("intervalMillis must be greater than or equal to 0", z10);
                long j12 = locationRequest.f9431c;
                long j13 = locationRequest.f9430b;
                if (j12 == j13 / 6) {
                    locationRequest.f9431c = j11 / 6;
                }
                if (locationRequest.f9428Z == j13) {
                    locationRequest.f9428Z = j11;
                }
                locationRequest.f9430b = j11;
                long j14 = j11 / 2;
                Object[] objArr = {Long.valueOf(j14)};
                if (j14 >= 0) {
                    z11 = true;
                }
                I.b("illegal fastest interval: %d", z11, objArr);
                locationRequest.f9431c = j14;
                float f4 = (float) oVar.f15746b;
                if (f4 >= 0.0f) {
                    locationRequest.f9426X = f4;
                } else {
                    StringBuilder sb = new StringBuilder(String.valueOf(f4).length() + 22);
                    sb.append("invalid displacement: ");
                    sb.append(f4);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return locationRequest;
        }
        if (0 >= 0) {
            z7 = true;
        } else {
            z7 = false;
        }
        I.a("intervalMillis must be greater than or equal to 0", z7);
        if (oVar != null) {
            int i9 = e.f15724a[oVar.f15745a.ordinal()];
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i7 = 100;
                    } else {
                        i7 = 102;
                    }
                }
            } else {
                i7 = 105;
            }
            z.b(i7);
            j8 = oVar.f15747c;
            if (j8 >= 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            I.a("intervalMillis must be greater than or equal to 0", z8);
            if (j8 == -1 || j8 >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            I.a("minUpdateIntervalMillis must be greater than or equal to 0, or IMPLICIT_MIN_UPDATE_INTERVAL", z9);
            float f8 = (float) oVar.f15746b;
            if (f8 >= 0.0f) {
                z11 = true;
            }
            I.a("minUpdateDistanceMeters must be greater than or equal to 0", z11);
            f = f8;
            j = j8;
        } else {
            f = 0.0f;
            i7 = 102;
            j = 0;
            j8 = -1;
        }
        if (j8 == -1) {
            j9 = j;
        } else {
            if (i7 != 105) {
                j8 = Math.min(j8, j);
            }
            j9 = j8;
        }
        long max = Math.max(0L, j);
        if (-1 == -1) {
            j10 = j;
        } else {
            j10 = -1;
        }
        return new LocationRequest(i7, j, j9, max, Long.MAX_VALUE, Long.MAX_VALUE, com.google.android.gms.common.api.f.API_PRIORITY_OTHER, f, true, j10, 0, 0, false, new WorkSource(null), null);
    }

    @Override // t2.k
    public final boolean a(int i7, int i8) {
        if (i7 == this.f15729e) {
            if (i8 == -1) {
                o oVar = this.f;
                if (oVar == null || this.f15731h == null || this.f15730g == null) {
                    return false;
                }
                g(oVar);
                return true;
            }
            InterfaceC1765a interfaceC1765a = this.f15730g;
            if (interfaceC1765a != null) {
                interfaceC1765a.a(s2.b.locationServicesDisabled);
            }
        }
        return false;
    }

    @Override // t2.k
    public final void b(final AbstractActivityC0032e abstractActivityC0032e, s sVar, final InterfaceC1765a interfaceC1765a) {
        this.f15731h = sVar;
        this.f15730g = interfaceC1765a;
        LocationRequest f = f(this.f);
        ArrayList arrayList = new ArrayList();
        arrayList.add(f);
        p3.p pVar = new p3.p(arrayList, false, false);
        int i7 = p3.o.f15123a;
        new zzda(this.f15725a).checkLocationSettings(pVar).addOnSuccessListener(new C1411b(this, 4)).addOnFailureListener(new OnFailureListener() { // from class: t2.b
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                boolean z7;
                f fVar = f.this;
                fVar.getClass();
                boolean z8 = exc instanceof com.google.android.gms.common.api.s;
                InterfaceC1765a interfaceC1765a2 = interfaceC1765a;
                if (z8) {
                    AbstractActivityC0032e abstractActivityC0032e2 = abstractActivityC0032e;
                    if (abstractActivityC0032e2 == null) {
                        interfaceC1765a2.a(s2.b.locationServicesDisabled);
                        return;
                    }
                    com.google.android.gms.common.api.s sVar2 = (com.google.android.gms.common.api.s) exc;
                    if (sVar2.getStatusCode() == 6) {
                        try {
                            int i8 = fVar.f15729e;
                            PendingIntent pendingIntent = sVar2.getStatus().f9155c;
                            if (pendingIntent != null) {
                                z7 = true;
                            } else {
                                z7 = false;
                            }
                            if (z7) {
                                I.i(pendingIntent);
                                abstractActivityC0032e2.startIntentSenderForResult(pendingIntent.getIntentSender(), i8, null, 0, 0, 0);
                                return;
                            }
                            return;
                        } catch (IntentSender.SendIntentException unused) {
                            interfaceC1765a2.a(s2.b.locationServicesDisabled);
                            return;
                        }
                    }
                    interfaceC1765a2.a(s2.b.locationServicesDisabled);
                } else if (((com.google.android.gms.common.api.j) exc).getStatusCode() == 8502) {
                    fVar.g(fVar.f);
                } else {
                    interfaceC1765a2.a(s2.b.locationServicesDisabled);
                }
            }
        });
    }

    @Override // t2.k
    public final void c(C0927b c0927b) {
        int i7 = p3.o.f15123a;
        new zzda(this.f15725a).checkLocationSettings(new p3.p(new ArrayList(), false, false)).addOnCompleteListener(new C1810a(c0927b, 0));
    }

    @Override // t2.k
    public final void d(K5.m mVar, K5.m mVar2) {
        this.f15727c.getLastLocation().addOnSuccessListener(new C1411b(mVar, 5)).addOnFailureListener(new c(mVar2, 0));
    }

    @Override // t2.k
    public final void e() {
        this.f15728d.c();
        this.f15727c.removeLocationUpdates(this.f15726b);
    }

    public final void g(o oVar) {
        LocationRequest f = f(oVar);
        this.f15728d.b();
        this.f15727c.requestLocationUpdates(f, this.f15726b, Looper.getMainLooper());
    }
}
