package org.apache.tika.mime;

import j$.util.function.Consumer$CC;
import java.net.URL;
import java.util.function.Consumer;
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14610a;

    public /* synthetic */ a(int i7) {
        this.f14610a = i7;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f14610a) {
            case 0:
                MimeTypesFactory.a((URL) obj);
                return;
            case 1:
                ((Process) obj).destroyForcibly();
                return;
            default:
                ((Process) obj).destroyForcibly();
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        int i7 = this.f14610a;
        return Consumer$CC.$default$andThen(this, consumer);
    }
}
