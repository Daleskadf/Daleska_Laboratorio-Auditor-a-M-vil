package org.apache.tika.parser;

import org.apache.tika.utils.ProcessUtils;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14611a;

    public /* synthetic */ a(int i7) {
        this.f14611a = i7;
    }

    private final void a() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14611a) {
            case 0:
                AbstractExternalProcessParser.a();
                return;
            case 1:
                ProcessUtils.a();
                return;
            default:
                return;
        }
    }
}
