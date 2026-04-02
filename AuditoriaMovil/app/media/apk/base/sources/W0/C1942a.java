package w0;

import android.text.Editable;
import u0.C1861q;
/* renamed from: w0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1942a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f16313a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile C1942a f16314b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f16315c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f16315c;
        if (cls != null) {
            return new C1861q(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
