package X5;

import D.RunnableC0053c;
import android.webkit.JavascriptInterface;
/* renamed from: X5.x  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0397x {

    /* renamed from: a  reason: collision with root package name */
    public final String f6534a;

    /* renamed from: b  reason: collision with root package name */
    public final C0388n f6535b;

    public C0397x(String str, C0388n c0388n) {
        this.f6534a = str;
        this.f6535b = c0388n;
    }

    @JavascriptInterface
    public void postMessage(String str) {
        C0388n c0388n = this.f6535b;
        c0388n.f6519a.s(new RunnableC0053c(21, this, str));
    }
}
