package u2;

import B5.AbstractActivityC0032e;
import K5.m;
import L5.v;
import W.AbstractC0359b;
import X.d;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import j3.f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import s2.c;
/* renamed from: u2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1868b implements v {

    /* renamed from: d  reason: collision with root package name */
    public static C1868b f15974d;

    /* renamed from: a  reason: collision with root package name */
    public AbstractActivityC0032e f15975a;

    /* renamed from: b  reason: collision with root package name */
    public m f15976b;

    /* renamed from: c  reason: collision with root package name */
    public m f15977c;

    public static EnumC1867a a(Context context) {
        Iterator it = b(context).iterator();
        while (it.hasNext()) {
            if (d.checkSelfPermission(context, (String) it.next()) == 0) {
                if (Build.VERSION.SDK_INT < 29) {
                    return EnumC1867a.always;
                }
                if (!f.y(context, "android.permission.ACCESS_BACKGROUND_LOCATION")) {
                    return EnumC1867a.whileInUse;
                }
                if (d.checkSelfPermission(context, "android.permission.ACCESS_BACKGROUND_LOCATION") == 0) {
                    return EnumC1867a.always;
                }
                return EnumC1867a.whileInUse;
            }
        }
        return EnumC1867a.denied;
    }

    public static ArrayList b(Context context) {
        boolean y2 = f.y(context, "android.permission.ACCESS_FINE_LOCATION");
        boolean y3 = f.y(context, "android.permission.ACCESS_COARSE_LOCATION");
        if (!y2 && !y3) {
            throw new Exception();
        }
        ArrayList arrayList = new ArrayList();
        if (y2) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
        }
        if (y3) {
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        return arrayList;
    }

    public static boolean c(Context context) {
        EnumC1867a a7 = a(context);
        if (a7 != EnumC1867a.whileInUse && a7 != EnumC1867a.always) {
            return false;
        }
        return true;
    }

    public final void d(AbstractActivityC0032e abstractActivityC0032e, m mVar, m mVar2) {
        if (abstractActivityC0032e == null) {
            mVar2.a(s2.b.activityMissing);
            return;
        }
        int i7 = Build.VERSION.SDK_INT;
        ArrayList b5 = b(abstractActivityC0032e);
        if (i7 >= 29 && f.y(abstractActivityC0032e, "android.permission.ACCESS_BACKGROUND_LOCATION") && a(abstractActivityC0032e) == EnumC1867a.whileInUse) {
            b5.add("android.permission.ACCESS_BACKGROUND_LOCATION");
        }
        this.f15976b = mVar2;
        this.f15977c = mVar;
        this.f15975a = abstractActivityC0032e;
        AbstractC0359b.a(abstractActivityC0032e, (String[]) b5.toArray(new String[0]), 109);
    }

    @Override // L5.v
    public final boolean onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        EnumC1867a enumC1867a;
        int indexOf;
        int i8 = 0;
        if (i7 != 109) {
            return false;
        }
        AbstractActivityC0032e abstractActivityC0032e = this.f15975a;
        if (abstractActivityC0032e == null) {
            Log.e("Geolocator", "Trying to process permission result without an valid Activity instance");
            m mVar = this.f15976b;
            if (mVar != null) {
                mVar.a(s2.b.activityMissing);
            }
            return false;
        }
        try {
            ArrayList b5 = b(abstractActivityC0032e);
            if (iArr.length == 0) {
                Log.i("Geolocator", "The grantResults array is empty. This can happen when the user cancels the permission request");
                return false;
            }
            EnumC1867a enumC1867a2 = EnumC1867a.denied;
            Iterator it = b5.iterator();
            char c8 = 65535;
            boolean z7 = false;
            boolean z8 = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                int indexOf2 = Arrays.asList(strArr).indexOf(str);
                if (indexOf2 >= 0) {
                    z7 = true;
                }
                if (iArr[indexOf2] == 0) {
                    c8 = 0;
                }
                if (AbstractC0359b.b(this.f15975a, str)) {
                    z8 = true;
                }
            }
            if (!z7) {
                Log.w("Geolocator", "Location permissions not part of permissions send to onRequestPermissionsResult method.");
                return false;
            }
            if (c8 == 0) {
                if (Build.VERSION.SDK_INT >= 29 && ((indexOf = Arrays.asList(strArr).indexOf("android.permission.ACCESS_BACKGROUND_LOCATION")) < 0 || iArr[indexOf] != 0)) {
                    enumC1867a = EnumC1867a.whileInUse;
                } else {
                    enumC1867a = EnumC1867a.always;
                }
                enumC1867a2 = enumC1867a;
            } else if (!z8) {
                enumC1867a2 = EnumC1867a.deniedForever;
            }
            m mVar2 = this.f15977c;
            if (mVar2 != null) {
                int ordinal = enumC1867a2.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i8 = 2;
                        if (ordinal != 2) {
                            i8 = 3;
                            if (ordinal != 3) {
                                throw new IndexOutOfBoundsException();
                            }
                        }
                    } else {
                        i8 = 1;
                    }
                }
                mVar2.f2706b.a(Integer.valueOf(i8));
            }
            return true;
        } catch (c unused) {
            m mVar3 = this.f15976b;
            if (mVar3 != null) {
                mVar3.a(s2.b.permissionDefinitionsNotFound);
            }
            return false;
        }
    }
}
