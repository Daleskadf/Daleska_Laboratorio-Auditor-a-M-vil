package io.flutter.plugin.platform;

import android.app.AlertDialog;
import android.content.Context;
import android.content.ContextWrapper;
/* loaded from: classes.dex */
public final class s extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public final B f11741a;

    /* renamed from: b  reason: collision with root package name */
    public B f11742b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f11743c;

    public s(Context context, B b5, Context context2) {
        super(context);
        this.f11741a = b5;
        this.f11743c = context2;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if ("window".equals(str)) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            for (int i7 = 0; i7 < stackTrace.length && i7 < 11; i7++) {
                if (stackTrace[i7].getClassName().equals(AlertDialog.class.getCanonicalName()) && stackTrace[i7].getMethodName().equals("<init>")) {
                    return this.f11743c.getSystemService(str);
                }
            }
            if (this.f11742b == null) {
                this.f11742b = this.f11741a;
            }
            return this.f11742b;
        }
        return super.getSystemService(str);
    }
}
