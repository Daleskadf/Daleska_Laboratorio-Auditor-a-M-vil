package T4;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.RemoteException;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import s3.C1786n;
/* loaded from: classes.dex */
public final class d extends Handler implements MessageQueue.IdleHandler {

    /* renamed from: X  reason: collision with root package name */
    public final LinkedList f5347X;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f5348Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ h f5349Z;

    /* renamed from: a  reason: collision with root package name */
    public final ReentrantLock f5350a;

    /* renamed from: b  reason: collision with root package name */
    public final Condition f5351b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedList f5352c;

    /* renamed from: d  reason: collision with root package name */
    public final LinkedList f5353d;

    /* renamed from: e  reason: collision with root package name */
    public final LinkedList f5354e;
    public final LinkedList f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(h hVar) {
        super(Looper.getMainLooper());
        this.f5349Z = hVar;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f5350a = reentrantLock;
        this.f5351b = reentrantLock.newCondition();
        this.f5352c = new LinkedList();
        this.f5353d = new LinkedList();
        this.f5354e = new LinkedList();
        this.f = new LinkedList();
        this.f5347X = new LinkedList();
    }

    public final void a(boolean z7, c cVar) {
        ReentrantLock reentrantLock = this.f5350a;
        reentrantLock.lock();
        sendEmptyMessage(0);
        if (z7) {
            this.f5353d.add(cVar);
        } else {
            this.f5352c.add(cVar);
        }
        reentrantLock.unlock();
    }

    public final boolean b() {
        boolean z7;
        ReentrantLock reentrantLock = this.f5350a;
        try {
            reentrantLock.lock();
            if (this.f5352c.isEmpty() && this.f5353d.isEmpty() && this.f.isEmpty() && this.f5354e.isEmpty()) {
                if (this.f5347X.isEmpty()) {
                    z7 = false;
                    return z7;
                }
            }
            z7 = true;
            return z7;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void c() {
        LinkedList linkedList = this.f;
        boolean isEmpty = linkedList.isEmpty();
        h hVar = this.f5349Z;
        if (!isEmpty) {
            C1786n c1786n = (C1786n) linkedList.poll();
            hVar.j.c(c1786n);
            hVar.f5377m.c(c1786n);
            U4.a aVar = (U4.a) hVar.f5369c.f4771a.f5773a.get(c1786n);
            if (aVar != null && aVar.f5767a.remove(c1786n)) {
                aVar.f5768b.f5773a.remove(c1786n);
                c1786n.getClass();
                try {
                    c1786n.f15625a.zzo();
                    return;
                } catch (RemoteException e7) {
                    throw new RuntimeException(e7);
                }
            }
            return;
        }
        LinkedList linkedList2 = this.f5347X;
        if (!linkedList2.isEmpty()) {
            b bVar = (b) linkedList2.poll();
            bVar.getClass();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setInterpolator(h.f5366s);
            ofFloat.setDuration(bVar.f5342g.f5371e);
            ofFloat.addUpdateListener(bVar);
            ofFloat.addListener(bVar);
            ofFloat.start();
            return;
        }
        LinkedList linkedList3 = this.f5353d;
        if (!linkedList3.isEmpty()) {
            c.a((c) linkedList3.poll(), this);
            return;
        }
        LinkedList linkedList4 = this.f5352c;
        if (!linkedList4.isEmpty()) {
            c.a((c) linkedList4.poll(), this);
            return;
        }
        LinkedList linkedList5 = this.f5354e;
        if (!linkedList5.isEmpty()) {
            C1786n c1786n2 = (C1786n) linkedList5.poll();
            hVar.j.c(c1786n2);
            hVar.f5377m.c(c1786n2);
            U4.a aVar2 = (U4.a) hVar.f5369c.f4771a.f5773a.get(c1786n2);
            if (aVar2 != null && aVar2.f5767a.remove(c1786n2)) {
                aVar2.f5768b.f5773a.remove(c1786n2);
                c1786n2.getClass();
                try {
                    c1786n2.f15625a.zzo();
                } catch (RemoteException e8) {
                    throw new RuntimeException(e8);
                }
            }
        }
    }

    public final void d(C1786n c1786n, boolean z7) {
        ReentrantLock reentrantLock = this.f5350a;
        reentrantLock.lock();
        sendEmptyMessage(0);
        if (z7) {
            this.f.add(c1786n);
        } else {
            this.f5354e.add(c1786n);
        }
        reentrantLock.unlock();
    }

    public final void e() {
        while (b()) {
            sendEmptyMessage(0);
            ReentrantLock reentrantLock = this.f5350a;
            reentrantLock.lock();
            try {
                try {
                    if (b()) {
                        this.f5351b.await();
                    }
                } catch (InterruptedException e7) {
                    throw new RuntimeException(e7);
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (!this.f5348Y) {
            Looper.myQueue().addIdleHandler(this);
            this.f5348Y = true;
        }
        removeMessages(0);
        ReentrantLock reentrantLock = this.f5350a;
        reentrantLock.lock();
        for (int i7 = 0; i7 < 10; i7++) {
            try {
                c();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        if (!b()) {
            this.f5348Y = false;
            Looper.myQueue().removeIdleHandler(this);
            this.f5351b.signalAll();
        } else {
            sendEmptyMessageDelayed(0, 10L);
        }
        reentrantLock.unlock();
    }

    @Override // android.os.MessageQueue.IdleHandler
    public final boolean queueIdle() {
        sendEmptyMessage(0);
        return true;
    }
}
