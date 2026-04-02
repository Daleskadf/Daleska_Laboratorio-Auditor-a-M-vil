package b6;

import a6.AbstractC0495y;
import a6.U;
import a6.V;
import android.content.Context;
/* renamed from: b6.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0618d extends AbstractC0495y {

    /* renamed from: a  reason: collision with root package name */
    public final V f8317a;

    /* renamed from: b  reason: collision with root package name */
    public Context f8318b;

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Unreachable block: B:14:0x002f
        	at jadx.core.dex.visitors.blocks.BlockProcessor.checkForUnreachableBlocks(BlockProcessor.java:81)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:47)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:39)
        */
    static {
        /*
            java.lang.String r0 = "AndroidChannelBuilder"
            java.lang.Class<d6.k> r1 = d6.C0914k.class
            java.lang.Class<a6.W> r2 = a6.W.class
            java.lang.Class r1 = r1.asSubclass(r2)     // Catch: java.lang.ClassCastException -> L28
            r2 = 0
            java.lang.reflect.Constructor r1 = r1.getConstructor(r2)     // Catch: java.lang.Exception -> L21
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Exception -> L21
            a6.W r1 = (a6.W) r1     // Catch: java.lang.Exception -> L21
            boolean r1 = r1.b()
            if (r1 != 0) goto L35
            java.lang.String r1 = "OkHttpChannelProvider.isAvailable() returned false"
            android.util.Log.w(r0, r1)
            goto L35
        L21:
            r1 = move-exception
            java.lang.String r2 = "Failed to construct OkHttpChannelProvider"
            android.util.Log.w(r0, r2, r1)
            goto L35
        L28:
            r1 = move-exception
            java.lang.String r2 = "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider"
            android.util.Log.w(r0, r2, r1)
            goto L35
        L2f:
            r1 = move-exception
            java.lang.String r2 = "Failed to find OkHttpChannelProvider"
            android.util.Log.w(r0, r2, r1)
        L35:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b6.C0618d.<clinit>():void");
    }

    public C0618d(V v6) {
        this.f8317a = v6;
    }

    @Override // a6.AbstractC0494x, a6.V
    public final U a() {
        return new C0617c(this.f8317a.a(), this.f8318b);
    }

    @Override // a6.AbstractC0494x
    public final V d() {
        return this.f8317a;
    }
}
