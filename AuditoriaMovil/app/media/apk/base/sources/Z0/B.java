package z0;

import D.AbstractC0059i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import y0.AbstractC2032a;
/* loaded from: classes.dex */
public final class B implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    public final L f16627a;

    public B(L l8) {
        this.f16627a = l8;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z7;
        T g3;
        boolean equals = C2040A.class.getName().equals(str);
        L l8 = this.f16627a;
        if (equals) {
            return new C2040A(context, attributeSet, l8);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2032a.f16602a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z7 = AbstractComponentCallbacksC2061v.class.isAssignableFrom(F.b(attributeValue, context.getClassLoader()));
                } catch (ClassNotFoundException unused) {
                    z7 = false;
                }
                if (z7) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    AbstractComponentCallbacksC2061v C7 = resourceId != -1 ? l8.C(resourceId) : null;
                    if (C7 == null && string != null) {
                        C7 = l8.D(string);
                    }
                    if (C7 == null && id != -1) {
                        C7 = l8.C(id);
                    }
                    if (C7 == null) {
                        F H7 = l8.H();
                        context.getClassLoader();
                        C7 = H7.a(attributeValue);
                        C7.f16835i0 = true;
                        C7.f16843r0 = resourceId != 0 ? resourceId : id;
                        C7.f16844s0 = id;
                        C7.f16845t0 = string;
                        C7.f16836j0 = true;
                        C7.f16840n0 = l8;
                        C2063x c2063x = l8.f16677v;
                        C7.f16841o0 = c2063x;
                        AbstractActivityC2064y abstractActivityC2064y = c2063x.f16857e;
                        C7.f16850y0 = true;
                        if ((c2063x != null ? c2063x.f16856d : null) != null) {
                            C7.f16850y0 = true;
                        }
                        g3 = l8.a(C7);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Fragment " + C7 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!C7.f16836j0) {
                        C7.f16836j0 = true;
                        C7.f16840n0 = l8;
                        C2063x c2063x2 = l8.f16677v;
                        C7.f16841o0 = c2063x2;
                        AbstractActivityC2064y abstractActivityC2064y2 = c2063x2.f16857e;
                        C7.f16850y0 = true;
                        if ((c2063x2 != null ? c2063x2.f16856d : null) != null) {
                            C7.f16850y0 = true;
                        }
                        g3 = l8.g(C7);
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Retained Fragment " + C7 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    A0.c cVar = A0.d.f35a;
                    A0.d.b(new A0.a(C7, "Attempting to use <fragment> tag to add fragment " + C7 + " to container " + viewGroup));
                    A0.d.a(C7).getClass();
                    C7.f16851z0 = viewGroup;
                    g3.j();
                    g3.i();
                    throw new IllegalStateException(AbstractC0059i.M("Fragment ", attributeValue, " did not create a view."));
                }
            }
            return null;
        }
        return null;
    }
}
