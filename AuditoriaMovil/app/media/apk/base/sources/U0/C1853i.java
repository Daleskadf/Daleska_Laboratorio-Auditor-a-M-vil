package u0;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.lifecycle.AbstractC0564p;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC0568u;
/* renamed from: u0.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1853i implements DefaultLifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AbstractC0564p f15927a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ EmojiCompatInitializer f15928b;

    public C1853i(EmojiCompatInitializer emojiCompatInitializer, AbstractC0564p abstractC0564p) {
        this.f15928b = emojiCompatInitializer;
        this.f15927a = abstractC0564p;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void g(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(InterfaceC0568u interfaceC0568u) {
        Handler handler;
        this.f15928b.getClass();
        if (Build.VERSION.SDK_INT >= 28) {
            handler = AbstractC1845a.a(Looper.getMainLooper());
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.postDelayed(new e5.l(1), 500L);
        this.f15927a.b(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(InterfaceC0568u interfaceC0568u) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(InterfaceC0568u interfaceC0568u) {
    }
}
