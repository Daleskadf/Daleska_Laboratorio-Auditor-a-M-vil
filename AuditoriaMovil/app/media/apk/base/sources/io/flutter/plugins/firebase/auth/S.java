package io.flutter.plugins.firebase.auth;

import B5.AbstractActivityC0032e;
import a4.C0448A;
import android.app.Activity;
import b4.C0597e;
import b4.C0603k;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public final class S implements L5.i {

    /* renamed from: f0  reason: collision with root package name */
    public static final HashMap f11831f0 = new HashMap();

    /* renamed from: X  reason: collision with root package name */
    public final C0603k f11832X;

    /* renamed from: Y  reason: collision with root package name */
    public final String f11833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Integer f11834Z;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicReference f11835a;

    /* renamed from: b  reason: collision with root package name */
    public final FirebaseAuth f11836b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11837c;

    /* renamed from: d  reason: collision with root package name */
    public final C0448A f11838d;

    /* renamed from: e  reason: collision with root package name */
    public final int f11839e;

    /* renamed from: e0  reason: collision with root package name */
    public L5.h f11840e0;
    public final com.it_nomads.fluttersecurestorage.ciphers.d f;

    public S(AbstractActivityC0032e abstractActivityC0032e, C1150m c1150m, O o7, C0603k c0603k, C0448A c0448a, com.it_nomads.fluttersecurestorage.ciphers.d dVar) {
        AtomicReference atomicReference = new AtomicReference(null);
        this.f11835a = atomicReference;
        atomicReference.set(abstractActivityC0032e);
        this.f11832X = c0603k;
        this.f11838d = c0448a;
        this.f11836b = C1140c.a(c1150m);
        this.f11837c = o7.f11822a;
        long longValue = o7.f11823b.longValue();
        int i7 = (int) longValue;
        if (longValue == i7) {
            this.f11839e = i7;
            String str = o7.f11825d;
            if (str != null) {
                this.f11833Y = str;
            }
            Long l8 = o7.f11824c;
            if (l8 != null) {
                long longValue2 = l8.longValue();
                int i8 = (int) longValue2;
                if (longValue2 == i8) {
                    this.f11834Z = Integer.valueOf(i8);
                } else {
                    throw new ArithmeticException();
                }
            }
            this.f = dVar;
            return;
        }
        throw new ArithmeticException();
    }

    @Override // L5.i
    public final void a(Object obj, L5.h hVar) {
        String str;
        C0603k c0603k;
        C0448A c0448a;
        a4.x xVar;
        boolean z7;
        a4.x xVar2;
        this.f11840e0 = hVar;
        Q q2 = new Q(this);
        String str2 = this.f11833Y;
        String str3 = this.f11837c;
        FirebaseAuth firebaseAuth = this.f11836b;
        if (str2 != null) {
            C0597e c0597e = firebaseAuth.f9708g;
            c0597e.f8248c = str3;
            c0597e.f8249d = str2;
        }
        com.google.android.gms.common.internal.I.i(firebaseAuth);
        Activity activity = (Activity) this.f11835a.get();
        if (str3 != null) {
            str = str3;
        } else {
            str = null;
        }
        C0603k c0603k2 = this.f11832X;
        if (c0603k2 != null) {
            c0603k = c0603k2;
        } else {
            c0603k = null;
        }
        C0448A c0448a2 = this.f11838d;
        if (c0448a2 != null) {
            c0448a = c0448a2;
        } else {
            c0448a = null;
        }
        long convert = TimeUnit.SECONDS.convert(this.f11839e, TimeUnit.MILLISECONDS);
        Long valueOf = Long.valueOf(convert);
        Integer num = this.f11834Z;
        if (num != null && (xVar2 = (a4.x) f11831f0.get(num)) != null) {
            xVar = xVar2;
        } else {
            xVar = null;
        }
        if (convert >= 0 && convert <= 120) {
            boolean z8 = false;
            if (c0603k == null) {
                com.google.android.gms.common.internal.I.f(str, "The given phoneNumber is empty. Please set a non-empty phone number with #setPhoneNumber()");
                if (c0448a == null) {
                    z8 = true;
                }
                com.google.android.gms.common.internal.I.a("A phoneMultiFactorInfo must be set for second factor sign-in.", z8);
            } else if (c0603k.f8270a != null) {
                com.google.android.gms.common.internal.I.e(str);
                if (c0448a == null) {
                    z8 = true;
                }
                com.google.android.gms.common.internal.I.a("Invalid MultiFactorSession - use the getSession method in MultiFactorResolver to get a valid sign-in session.", z8);
            } else {
                if (c0448a != null) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                com.google.android.gms.common.internal.I.a("A phoneMultiFactorInfo must be set for second factor sign-in.", z7);
                if (str == null) {
                    z8 = true;
                }
                com.google.android.gms.common.internal.I.a("A phone number must not be set for MFA sign-in. A PhoneMultiFactorInfo should be set instead.", z8);
            }
            FirebaseAuth.l(new a4.w(firebaseAuth, valueOf, q2, firebaseAuth.f9701A, str, activity, xVar, c0603k, c0448a));
            return;
        }
        throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
    }

    @Override // L5.i
    public final void b() {
        this.f11840e0 = null;
        this.f11835a.set(null);
    }
}
