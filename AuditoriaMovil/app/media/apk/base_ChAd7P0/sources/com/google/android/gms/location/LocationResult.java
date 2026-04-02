package com.google.android.gms.location;

import X.b;
import X2.a;
import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import c0.AbstractC0622a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.internal.location.zzeo;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import m5.d;
import n3.c0;
import p3.v;
/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: a  reason: collision with root package name */
    public final List f9440a;

    /* renamed from: b  reason: collision with root package name */
    public static final List f9439b = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new c0(15);

    public LocationResult(List list) {
        this.f9440a = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.google.android.gms.location.LocationResult
            r1 = 0
            if (r0 == 0) goto L88
            com.google.android.gms.location.LocationResult r9 = (com.google.android.gms.location.LocationResult) r9
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            java.util.List r3 = r8.f9440a
            if (r0 < r2) goto L16
            java.util.List r9 = r9.f9440a
            boolean r9 = r3.equals(r9)
            return r9
        L16:
            int r0 = r3.size()
            java.util.List r2 = r9.f9440a
            int r2 = r2.size()
            if (r0 == r2) goto L23
            return r1
        L23:
            java.util.Iterator r0 = r3.iterator()
            java.util.List r9 = r9.f9440a
            java.util.Iterator r9 = r9.iterator()
        L2d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L86
            java.lang.Object r2 = r0.next()
            android.location.Location r2 = (android.location.Location) r2
            java.lang.Object r3 = r9.next()
            android.location.Location r3 = (android.location.Location) r3
            double r4 = r2.getLatitude()
            double r6 = r3.getLatitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L4e
            return r1
        L4e:
            double r4 = r2.getLongitude()
            double r6 = r3.getLongitude()
            int r4 = java.lang.Double.compare(r4, r6)
            if (r4 == 0) goto L5d
            return r1
        L5d:
            long r4 = r2.getTime()
            long r6 = r3.getTime()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L6a
            return r1
        L6a:
            long r4 = r2.getElapsedRealtimeNanos()
            long r6 = r3.getElapsedRealtimeNanos()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L77
            return r1
        L77:
            java.lang.String r2 = r2.getProvider()
            java.lang.String r3 = r3.getProvider()
            boolean r2 = com.google.android.gms.common.internal.I.m(r2, r3)
            if (r2 != 0) goto L2d
            return r1
        L86:
            r9 = 1
            return r9
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.LocationResult.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f9440a});
    }

    public final String toString() {
        boolean isFromMockProvider;
        String str;
        boolean z7;
        boolean z8;
        float f;
        boolean z9;
        float f4;
        StringBuilder sb = new StringBuilder("LocationResult");
        DecimalFormat decimalFormat = v.f15139a;
        List<Location> list = this.f9440a;
        int i7 = 100;
        sb.ensureCapacity(list.size() * 100);
        sb.append("[");
        boolean z10 = false;
        for (Location location : list) {
            sb.ensureCapacity(i7);
            String str2 = null;
            if (location == null) {
                sb.append((String) null);
            } else {
                sb.append("{");
                sb.append(location.getProvider());
                sb.append(", ");
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 31) {
                    isFromMockProvider = AbstractC0622a.a(location);
                } else {
                    isFromMockProvider = location.isFromMockProvider();
                }
                if (isFromMockProvider) {
                    sb.append("mock, ");
                }
                DecimalFormat decimalFormat2 = v.f15139a;
                sb.append(decimalFormat2.format(location.getLatitude()));
                sb.append(",");
                sb.append(decimalFormat2.format(location.getLongitude()));
                boolean hasAccuracy = location.hasAccuracy();
                DecimalFormat decimalFormat3 = v.f15140b;
                if (hasAccuracy) {
                    sb.append("±");
                    sb.append(decimalFormat3.format(location.getAccuracy()));
                    sb.append("m");
                }
                float f8 = 0.0f;
                if (location.hasAltitude()) {
                    sb.append(", alt=");
                    sb.append(decimalFormat3.format(location.getAltitude()));
                    if (i8 >= 26) {
                        z9 = b.i(location);
                    } else {
                        Bundle extras = location.getExtras();
                        if (extras != null && extras.containsKey("verticalAccuracy")) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                    }
                    if (z9) {
                        sb.append("±");
                        if (i8 >= 26) {
                            f4 = b.f(location);
                        } else {
                            Bundle extras2 = location.getExtras();
                            if (extras2 == null) {
                                f4 = 0.0f;
                            } else {
                                f4 = extras2.getFloat("verticalAccuracy", 0.0f);
                            }
                        }
                        sb.append(decimalFormat3.format(f4));
                    }
                    sb.append("m");
                }
                if (location.hasSpeed()) {
                    sb.append(", spd=");
                    sb.append(decimalFormat3.format(location.getSpeed()));
                    if (i8 >= 26) {
                        z8 = b.h(location);
                    } else {
                        Bundle extras3 = location.getExtras();
                        if (extras3 != null && extras3.containsKey("speedAccuracy")) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                    }
                    if (z8) {
                        sb.append("±");
                        if (i8 >= 26) {
                            f = b.e(location);
                        } else {
                            Bundle extras4 = location.getExtras();
                            if (extras4 == null) {
                                f = 0.0f;
                            } else {
                                f = extras4.getFloat("speedAccuracy", 0.0f);
                            }
                        }
                        sb.append(decimalFormat3.format(f));
                    }
                    sb.append("m/s");
                }
                if (location.hasBearing()) {
                    sb.append(", brg=");
                    sb.append(decimalFormat3.format(location.getBearing()));
                    if (i8 >= 26) {
                        z7 = b.g(location);
                    } else {
                        Bundle extras5 = location.getExtras();
                        if (extras5 != null && extras5.containsKey("bearingAccuracy")) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                    }
                    if (z7) {
                        sb.append("±");
                        if (i8 >= 26) {
                            f8 = b.b(location);
                        } else {
                            Bundle extras6 = location.getExtras();
                            if (extras6 != null) {
                                f8 = extras6.getFloat("bearingAccuracy", 0.0f);
                            }
                        }
                        sb.append(decimalFormat3.format(f8));
                    }
                    sb.append("°");
                }
                Bundle extras7 = location.getExtras();
                if (extras7 != null) {
                    str = extras7.getString("floorLabel");
                } else {
                    str = null;
                }
                if (str != null) {
                    sb.append(", fl=");
                    sb.append(str);
                }
                Bundle extras8 = location.getExtras();
                if (extras8 != null) {
                    str2 = extras8.getString("levelId");
                }
                if (str2 != null) {
                    sb.append(", lv=");
                    sb.append(str2);
                }
                long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
                sb.append(", ert=");
                sb.append(zzeo.zza(TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()) + currentTimeMillis));
                sb.append('}');
            }
            sb.append(", ");
            z10 = true;
            i7 = 100;
        }
        if (z10) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int G2 = d.G(20293, parcel);
        d.F(parcel, 1, this.f9440a, false);
        d.J(G2, parcel);
    }
}
