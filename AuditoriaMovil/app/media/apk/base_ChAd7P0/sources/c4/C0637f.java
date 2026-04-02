package c4;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import w4.InterfaceC1956b;
/* renamed from: c4.f  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0637f implements InterfaceC1956b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8384a;

    public /* synthetic */ C0637f(int i7) {
        this.f8384a = i7;
    }

    @Override // w4.InterfaceC1956b
    public final Object get() {
        switch (this.f8384a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return null;
            case 2:
                n nVar = ExecutorsRegistrar.f9733a;
                StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
                int i7 = Build.VERSION.SDK_INT;
                detectNetwork.detectResourceMismatches();
                if (i7 >= 26) {
                    detectNetwork.detectUnbufferedIo();
                }
                return new d4.f(Executors.newFixedThreadPool(4, new d4.a("Firebase Background", 10, detectNetwork.penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9736d.get());
            case 3:
                n nVar2 = ExecutorsRegistrar.f9733a;
                return new d4.f(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new d4.a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), (ScheduledExecutorService) ExecutorsRegistrar.f9736d.get());
            case 4:
                n nVar3 = ExecutorsRegistrar.f9733a;
                return new d4.f(Executors.newCachedThreadPool(new d4.a("Firebase Blocking", 11, null)), (ScheduledExecutorService) ExecutorsRegistrar.f9736d.get());
            default:
                n nVar4 = ExecutorsRegistrar.f9733a;
                return Executors.newSingleThreadScheduledExecutor(new d4.a("Firebase Scheduler", 0, null));
        }
    }
}
