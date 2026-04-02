package p3;

import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.Task;
/* renamed from: p3.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1668h {
    Task getLastLocation();

    Task removeLocationUpdates(l lVar);

    Task requestLocationUpdates(LocationRequest locationRequest, l lVar, Looper looper);
}
