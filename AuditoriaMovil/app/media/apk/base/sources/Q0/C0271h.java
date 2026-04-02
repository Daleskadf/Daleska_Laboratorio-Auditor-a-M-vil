package Q0;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
/* renamed from: Q0.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271h extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final ContentResolver f4277a;

    /* renamed from: b  reason: collision with root package name */
    public final Uri f4278b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C0272i f4279c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0271h(C0272i c0272i, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f4279c = c0272i;
        this.f4277a = contentResolver;
        this.f4278b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z7) {
        C0272i c0272i = this.f4279c;
        c0272i.a(C0268e.b(c0272i.f4280a, c0272i.f4287i, c0272i.f4286h));
    }
}
