package p4;

import java.util.PriorityQueue;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final K1.d f15284c = new K1.d(22);

    /* renamed from: a  reason: collision with root package name */
    public int f15285a;

    /* renamed from: b  reason: collision with root package name */
    public Object f15286b;

    public void a(Long l8) {
        PriorityQueue priorityQueue = (PriorityQueue) this.f15286b;
        if (priorityQueue.size() < this.f15285a) {
            priorityQueue.add(l8);
        } else if (l8.longValue() < ((Long) priorityQueue.peek()).longValue()) {
            priorityQueue.poll();
            priorityQueue.add(l8);
        }
    }
}
