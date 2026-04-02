package e;

import android.os.Bundle;
import androidx.lifecycle.EnumC0562n;
import androidx.lifecycle.EnumC0563o;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import z0.AbstractActivityC2064y;
/* renamed from: e.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0925f implements Z1.d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f10526a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2064y f10527b;

    public /* synthetic */ C0925f(AbstractActivityC2064y abstractActivityC2064y, int i7) {
        this.f10526a = i7;
        this.f10527b = abstractActivityC2064y;
    }

    @Override // Z1.d
    public final Bundle a() {
        switch (this.f10526a) {
            case 0:
                AbstractActivityC2064y abstractActivityC2064y = this.f10527b;
                Bundle bundle = new Bundle();
                l lVar = abstractActivityC2064y.f10549Y;
                lVar.getClass();
                LinkedHashMap linkedHashMap = lVar.f10539b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(lVar.f10541d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(lVar.f10543g));
                return bundle;
            default:
                AbstractActivityC2064y abstractActivityC2064y2 = this.f10527b;
                do {
                } while (AbstractActivityC2064y.k(abstractActivityC2064y2.j(), EnumC0563o.CREATED));
                abstractActivityC2064y2.f16859o0.e(EnumC0562n.ON_STOP);
                return new Bundle();
        }
    }
}
