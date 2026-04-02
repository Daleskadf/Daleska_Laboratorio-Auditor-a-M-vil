package j$.util;

import java.security.AccessController;
import java.security.PrivilegedAction;
/* loaded from: classes2.dex */
abstract class v0 {

    /* renamed from: a  reason: collision with root package name */
    static final boolean f13415a = ((Boolean) AccessController.doPrivileged((PrivilegedAction<Object>) new Object())).booleanValue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Class cls, String str) {
        throw new UnsupportedOperationException(cls + " tripwire tripped but logging not supported: " + str);
    }
}
