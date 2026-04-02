package W;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.AbstractBinderC0620b;
import c.InterfaceC0621c;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.tika.metadata.TikaCoreProperties;
import org.apache.tika.pipes.pipesiterator.PipesIterator;
/* loaded from: classes.dex */
public final class K implements Handler.Callback, ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    public final Context f6006a;

    /* renamed from: b  reason: collision with root package name */
    public final Handler f6007b;

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f6008c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public HashSet f6009d = new HashSet();

    public K(Context context) {
        this.f6006a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.f6007b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(J j) {
        boolean z7;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = j.f6001a;
        if (isLoggable) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + j.f6004d.size() + " queued tasks");
        }
        if (j.f6004d.isEmpty()) {
            return;
        }
        if (j.f6002b) {
            z7 = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.f6006a;
            boolean bindService = context.bindService(component, this, 33);
            j.f6002b = bindService;
            if (bindService) {
                j.f6005e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z7 = j.f6002b;
        }
        if (z7 && j.f6003c != null) {
            while (true) {
                arrayDeque = j.f6004d;
                H h8 = (H) arrayDeque.peek();
                if (h8 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Sending task " + h8);
                    }
                    h8.a(j.f6003c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e7) {
                    Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e7);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(j);
                return;
            }
            return;
        }
        b(j);
    }

    public final void b(J j) {
        Handler handler = this.f6007b;
        ComponentName componentName = j.f6001a;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i7 = j.f6005e;
        int i8 = i7 + 1;
        j.f6005e = i8;
        if (i8 > 6) {
            StringBuilder sb = new StringBuilder("Giving up on delivering ");
            ArrayDeque arrayDeque = j.f6004d;
            sb.append(arrayDeque.size());
            sb.append(" tasks to ");
            sb.append(componentName);
            sb.append(" after ");
            sb.append(j.f6005e);
            sb.append(" retries");
            Log.w("NotifManCompat", sb.toString());
            arrayDeque.clear();
            return;
        }
        int i9 = (1 << i7) * PipesIterator.DEFAULT_QUEUE_SIZE;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Scheduling retry for " + i9 + " ms");
        }
        handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i9);
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [c.a, java.lang.Object] */
    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i7 = message.what;
        InterfaceC0621c interfaceC0621c = null;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return false;
                    }
                    J j = (J) this.f6008c.get((ComponentName) message.obj);
                    if (j != null) {
                        a(j);
                    }
                    return true;
                }
                J j8 = (J) this.f6008c.get((ComponentName) message.obj);
                if (j8 != null) {
                    if (j8.f6002b) {
                        this.f6006a.unbindService(this);
                        j8.f6002b = false;
                    }
                    j8.f6003c = null;
                }
                return true;
            }
            I i8 = (I) message.obj;
            ComponentName componentName = i8.f5999a;
            IBinder iBinder = i8.f6000b;
            J j9 = (J) this.f6008c.get(componentName);
            if (j9 != null) {
                int i9 = AbstractBinderC0620b.f8320a;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface(InterfaceC0621c.f8321g);
                    if (queryLocalInterface != null && (queryLocalInterface instanceof InterfaceC0621c)) {
                        interfaceC0621c = (InterfaceC0621c) queryLocalInterface;
                    } else {
                        ?? obj = new Object();
                        obj.f8319a = iBinder;
                        interfaceC0621c = obj;
                    }
                }
                j9.f6003c = interfaceC0621c;
                j9.f6005e = 0;
                a(j9);
            }
            return true;
        }
        H h8 = (H) message.obj;
        String string = Settings.Secure.getString(this.f6006a.getContentResolver(), "enabled_notification_listeners");
        synchronized (L.f6010c) {
            if (string != null) {
                try {
                    if (!string.equals(L.f6011d)) {
                        String[] split = string.split(TikaCoreProperties.NAMESPACE_PREFIX_DELIMITER, -1);
                        HashSet hashSet2 = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet2.add(unflattenFromString.getPackageName());
                            }
                        }
                        L.f6012e = hashSet2;
                        L.f6011d = string;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            hashSet = L.f6012e;
        }
        if (!hashSet.equals(this.f6009d)) {
            this.f6009d = hashSet;
            List<ResolveInfo> queryIntentServices = this.f6006a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
            HashSet hashSet3 = new HashSet();
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName2 = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w("NotifManCompat", "Permission present on component " + componentName2 + ", not adding listener record.");
                    } else {
                        hashSet3.add(componentName2);
                    }
                }
            }
            Iterator it = hashSet3.iterator();
            while (it.hasNext()) {
                ComponentName componentName3 = (ComponentName) it.next();
                if (!this.f6008c.containsKey(componentName3)) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Adding listener record for " + componentName3);
                    }
                    this.f6008c.put(componentName3, new J(componentName3));
                }
            }
            Iterator it2 = this.f6008c.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet3.contains(entry.getKey())) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                    }
                    J j10 = (J) entry.getValue();
                    if (j10.f6002b) {
                        this.f6006a.unbindService(this);
                        j10.f6002b = false;
                    }
                    j10.f6003c = null;
                    it2.remove();
                }
            }
        }
        for (J j11 : this.f6008c.values()) {
            j11.f6004d.add(h8);
            a(j11);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.f6007b.obtainMessage(1, new I(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.f6007b.obtainMessage(2, componentName).sendToTarget();
    }
}
