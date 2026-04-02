package e;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import z0.AbstractActivityC2064y;
import z0.C2063x;
/* loaded from: classes.dex */
public final /* synthetic */ class g {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10528a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10529b;

    public /* synthetic */ g(AbstractActivityC2064y abstractActivityC2064y, int i7) {
        this.f10528a = i7;
        this.f10529b = abstractActivityC2064y;
    }

    public final void a(n it) {
        switch (this.f10528a) {
            case 0:
                AbstractActivityC2064y abstractActivityC2064y = this.f10529b;
                kotlin.jvm.internal.j.e(it, "it");
                Bundle a7 = ((K5.s) abstractActivityC2064y.f10553d.f690c).a("android:support:activity-result");
                if (a7 != null) {
                    l lVar = abstractActivityC2064y.f10549Y;
                    lVar.getClass();
                    ArrayList<Integer> integerArrayList = a7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList != null && integerArrayList != null) {
                        ArrayList<String> stringArrayList2 = a7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                        if (stringArrayList2 != null) {
                            lVar.f10541d.addAll(stringArrayList2);
                        }
                        Bundle bundle = a7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                        Bundle bundle2 = lVar.f10543g;
                        if (bundle != null) {
                            bundle2.putAll(bundle);
                        }
                        int size = stringArrayList.size();
                        for (int i7 = 0; i7 < size; i7++) {
                            String str = stringArrayList.get(i7);
                            LinkedHashMap linkedHashMap = lVar.f10539b;
                            boolean containsKey = linkedHashMap.containsKey(str);
                            LinkedHashMap linkedHashMap2 = lVar.f10538a;
                            if (containsKey) {
                                Integer num = (Integer) linkedHashMap.remove(str);
                                if (!bundle2.containsKey(str)) {
                                    kotlin.jvm.internal.u.a(linkedHashMap2).remove(num);
                                }
                            }
                            Integer num2 = integerArrayList.get(i7);
                            kotlin.jvm.internal.j.d(num2, "rcs[i]");
                            int intValue = num2.intValue();
                            String str2 = stringArrayList.get(i7);
                            kotlin.jvm.internal.j.d(str2, "keys[i]");
                            String str3 = str2;
                            linkedHashMap2.put(Integer.valueOf(intValue), str3);
                            linkedHashMap.put(str3, Integer.valueOf(intValue));
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C2063x c2063x = (C2063x) this.f10529b.f16858n0.f10587a;
                c2063x.f16854X.b(c2063x, c2063x, null);
                return;
        }
    }
}
