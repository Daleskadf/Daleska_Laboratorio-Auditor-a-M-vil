package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Sets;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.math.IntMath;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public abstract class AbstractDirectedNetworkConnections<N, E> implements NetworkConnections<N, E> {
    final Map<E, N> inEdgeMap;
    final Map<E, N> outEdgeMap;
    private int selfLoopCount;

    public AbstractDirectedNetworkConnections(Map<E, N> map, Map<E, N> map2, int i10) {
        boolean z10;
        this.inEdgeMap = (Map) Preconditions.checkNotNull(map);
        this.outEdgeMap = (Map) Preconditions.checkNotNull(map2);
        this.selfLoopCount = Graphs.checkNonNegative(i10);
        if (i10 <= map.size() && i10 <= map2.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addInEdge(E e10, N n10, boolean z10) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        boolean z11 = true;
        if (z10) {
            int i10 = this.selfLoopCount + 1;
            this.selfLoopCount = i10;
            Graphs.checkPositive(i10);
        }
        if (this.inEdgeMap.put(e10, n10) != null) {
            z11 = false;
        }
        Preconditions.checkState(z11);
    }

    @Override // com.google.common.graph.NetworkConnections
    public void addOutEdge(E e10, N n10) {
        boolean z10;
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(n10);
        if (this.outEdgeMap.put(e10, n10) == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        Preconditions.checkState(z10);
    }

    @Override // com.google.common.graph.NetworkConnections
    public N adjacentNode(E e10) {
        N n10 = this.outEdgeMap.get(e10);
        Objects.requireNonNull(n10);
        return n10;
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<N> adjacentNodes() {
        return Sets.union(predecessors(), successors());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> inEdges() {
        return Collections.unmodifiableSet(this.inEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> incidentEdges() {
        return new AbstractSet<E>() { // from class: com.google.common.graph.AbstractDirectedNetworkConnections.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(@CheckForNull Object obj) {
                if (!AbstractDirectedNetworkConnections.this.inEdgeMap.containsKey(obj) && !AbstractDirectedNetworkConnections.this.outEdgeMap.containsKey(obj)) {
                    return false;
                }
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return IntMath.saturatedAdd(AbstractDirectedNetworkConnections.this.inEdgeMap.size(), AbstractDirectedNetworkConnections.this.outEdgeMap.size() - AbstractDirectedNetworkConnections.this.selfLoopCount);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                Iterable union;
                if (AbstractDirectedNetworkConnections.this.selfLoopCount == 0) {
                    union = Iterables.concat(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                } else {
                    union = Sets.union(AbstractDirectedNetworkConnections.this.inEdgeMap.keySet(), AbstractDirectedNetworkConnections.this.outEdgeMap.keySet());
                }
                return Iterators.unmodifiableIterator(union.iterator());
            }
        };
    }

    @Override // com.google.common.graph.NetworkConnections
    public Set<E> outEdges() {
        return Collections.unmodifiableSet(this.outEdgeMap.keySet());
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeInEdge(E e10, boolean z10) {
        if (z10) {
            int i10 = this.selfLoopCount - 1;
            this.selfLoopCount = i10;
            Graphs.checkNonNegative(i10);
        }
        N remove = this.inEdgeMap.remove(e10);
        Objects.requireNonNull(remove);
        return remove;
    }

    @Override // com.google.common.graph.NetworkConnections
    public N removeOutEdge(E e10) {
        N remove = this.outEdgeMap.remove(e10);
        Objects.requireNonNull(remove);
        return remove;
    }
}
