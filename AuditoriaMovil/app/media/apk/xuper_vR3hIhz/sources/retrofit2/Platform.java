package retrofit2;

import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import retrofit2.CallAdapter;
import retrofit2.Converter;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class Platform {
    private static final Platform PLATFORM = findPlatform();
    private final boolean hasJava8Types;

    /* loaded from: classes2.dex */
    public static final class Android extends Platform {

        /* loaded from: classes2.dex */
        public static class MainThreadExecutor implements Executor {
            private final Handler handler = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.handler.post(runnable);
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public Android() {
            /*
                r2 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                r2.<init>(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: retrofit2.Platform.Android.<init>():void");
        }

        @Override // retrofit2.Platform
        public Executor defaultCallbackExecutor() {
            return new MainThreadExecutor();
        }
    }

    public Platform(boolean z10) {
        this.hasJava8Types = z10;
    }

    private static Platform findPlatform() {
        try {
            Class.forName("android.os.Build");
            return new Android();
        } catch (ClassNotFoundException unused) {
            return new Platform(true);
        }
    }

    public static Platform get() {
        return PLATFORM;
    }

    public List<? extends CallAdapter.Factory> defaultCallAdapterFactories(@Nullable Executor executor) {
        DefaultCallAdapterFactory defaultCallAdapterFactory = new DefaultCallAdapterFactory(executor);
        if (this.hasJava8Types) {
            return Arrays.asList(CompletableFutureCallAdapterFactory.INSTANCE, defaultCallAdapterFactory);
        }
        return Collections.singletonList(defaultCallAdapterFactory);
    }

    public int defaultCallAdapterFactoriesSize() {
        if (this.hasJava8Types) {
            return 2;
        }
        return 1;
    }

    @Nullable
    public Executor defaultCallbackExecutor() {
        return null;
    }

    public List<? extends Converter.Factory> defaultConverterFactories() {
        if (this.hasJava8Types) {
            return Collections.singletonList(OptionalConverterFactory.INSTANCE);
        }
        return Collections.emptyList();
    }

    public int defaultConverterFactoriesSize() {
        return this.hasJava8Types ? 1 : 0;
    }

    @Nullable
    public Object invokeDefaultMethod(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        MethodHandle unreflectSpecial;
        MethodHandle bindTo;
        Object invokeWithArguments;
        Constructor declaredConstructor = i.a().getDeclaredConstructor(Class.class, Integer.TYPE);
        declaredConstructor.setAccessible(true);
        unreflectSpecial = j.a(declaredConstructor.newInstance(cls, -1)).unreflectSpecial(method, cls);
        bindTo = unreflectSpecial.bindTo(obj);
        invokeWithArguments = bindTo.invokeWithArguments(objArr);
        return invokeWithArguments;
    }

    public boolean isDefaultMethod(Method method) {
        boolean isDefault;
        if (this.hasJava8Types) {
            isDefault = method.isDefault();
            if (isDefault) {
                return true;
            }
        }
        return false;
    }
}
