package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class h implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    public final NotificationDetails f9080a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9081b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f9082c;

    public h(NotificationDetails notificationDetails, int i7, ArrayList arrayList) {
        this.f9080a = notificationDetails;
        this.f9081b = i7;
        this.f9082c = arrayList;
    }

    public final String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f9080a + ", startMode=" + this.f9081b + ", foregroundServiceTypes=" + this.f9082c + '}';
    }
}
