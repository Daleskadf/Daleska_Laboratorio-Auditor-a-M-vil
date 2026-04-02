package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;
/* renamed from: com.google.android.gms.common.internal.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0764m {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f9380a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static T f9381b;

    /* renamed from: c  reason: collision with root package name */
    public static HandlerThread f9382c;

    public static T a(Context context) {
        synchronized (f9380a) {
            try {
                if (f9381b == null) {
                    f9381b = new T(context.getApplicationContext(), context.getMainLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f9381b;
    }

    public static HandlerThread b() {
        synchronized (f9380a) {
            try {
                HandlerThread handlerThread = f9382c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                f9382c = handlerThread2;
                handlerThread2.start();
                return f9382c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(P p7, ServiceConnection serviceConnection);

    public abstract boolean d(P p7, ServiceConnection serviceConnection, String str, Executor executor);
}
