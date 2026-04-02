package com.google.common.graph;

import com.google.common.annotations.Beta;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
@Beta
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public final class Graphs {

    /* loaded from: classes2.dex */
    public enum NodeVisitState {
        PENDING,
        COMPLETE
    }

    /* loaded from: classes2.dex */
    public static class TransposedGraph<N> extends ForwardingGraph<N> {
        private final Graph<N> graph;

        public TransposedGraph(Graph<N> graph) {
            this.graph = graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n10, N n11) {
            return delegate().hasEdgeConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n10) {
            return delegate().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public Set<EndpointPair<N>> incidentEdges(N n10) {
            return new IncidentEdgeSet<N>(this, n10) { // from class: com.google.common.graph.Graphs.TransposedGraph.1
                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<EndpointPair<N>> iterator() {
                    return Iterators.transform(TransposedGraph.this.delegate().incidentEdges(this.node).iterator(), new Function<EndpointPair<N>, EndpointPair<N>>() { // from class: com.google.common.graph.Graphs.TransposedGraph.1.1
                        @Override // com.google.common.base.Function
                        public /* bridge */ /* synthetic */ Object apply(Object obj) {
                            return apply((EndpointPair) ((EndpointPair) obj));
                        }

                        public EndpointPair<N> apply(EndpointPair<N> endpointPair) {
                            return EndpointPair.of((Graph<?>) TransposedGraph.this.delegate(), (Object) endpointPair.nodeV(), (Object) endpointPair.nodeU());
                        }
                    });
                }
            };
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n10) {
            return delegate().inDegree(n10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
            return predecessors((TransposedGraph<N>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
            return successors((TransposedGraph<N>) obj);
        }

        @Override // com.google.common.graph.ForwardingGraph
        public Graph<N> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return delegate().successors((Graph<N>) n10);
        }

        @Override // com.google.common.graph.ForwardingGraph, com.google.common.graph.AbstractGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return delegate().predecessors((Graph<N>) n10);
        }
    }

    /* loaded from: classes2.dex */
    public static class TransposedNetwork<N, E> extends ForwardingNetwork<N, E> {
        private final Network<N, E> network;

        public TransposedNetwork(Network<N, E> network) {
            this.network = network;
        }

        @Override // com.google.common.graph.ForwardingNetwork
        public Network<N, E> delegate() {
            return this.network;
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @CheckForNull
        public E edgeConnectingOrNull(N n10, N n11) {
            return delegate().edgeConnectingOrNull(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(N n10, N n11) {
            return delegate().edgesConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(N n10, N n11) {
            return delegate().hasEdgeConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int inDegree(N n10) {
            return delegate().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> inEdges(N n10) {
            return delegate().outEdges(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public EndpointPair<N> incidentNodes(E e10) {
            EndpointPair<N> incidentNodes = delegate().incidentNodes(e10);
            return EndpointPair.of((Network<?, ?>) this.network, (Object) incidentNodes.nodeV(), (Object) incidentNodes.nodeU());
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public int outDegree(N n10) {
            return delegate().inDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.Network
        public Set<E> outEdges(N n10) {
            return delegate().inEdges(n10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
            return predecessors((TransposedNetwork<N, E>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
            return successors((TransposedNetwork<N, E>) obj);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        @CheckForNull
        public E edgeConnectingOrNull(EndpointPair<N> endpointPair) {
            return delegate().edgeConnectingOrNull(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public Set<E> edgesConnecting(EndpointPair<N> endpointPair) {
            return delegate().edgesConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return delegate().successors((Network<N, E>) n10);
        }

        @Override // com.google.common.graph.ForwardingNetwork, com.google.common.graph.AbstractNetwork, com.google.common.graph.Network, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return delegate().predecessors((Network<N, E>) n10);
        }
    }

    /* loaded from: classes2.dex */
    public static class TransposedValueGraph<N, V> extends ForwardingValueGraph<N, V> {
        private final ValueGraph<N, V> graph;

        public TransposedValueGraph(ValueGraph<N, V> valueGraph) {
            this.graph = valueGraph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph
        public ValueGraph<N, V> delegate() {
            return this.graph;
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @CheckForNull
        public V edgeValueOrDefault(N n10, N n11, @CheckForNull V v10) {
            return delegate().edgeValueOrDefault(n11, n10, v10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(N n10, N n11) {
            return delegate().hasEdgeConnecting(n11, n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int inDegree(N n10) {
            return delegate().outDegree(n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public int outDegree(N n10) {
            return delegate().inDegree(n10);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public /* bridge */ /* synthetic */ Iterable predecessors(Object obj) {
            return predecessors((TransposedValueGraph<N, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public /* bridge */ /* synthetic */ Iterable successors(Object obj) {
            return successors((TransposedValueGraph<N, V>) obj);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.ValueGraph
        @CheckForNull
        public V edgeValueOrDefault(EndpointPair<N> endpointPair, @CheckForNull V v10) {
            return delegate().edgeValueOrDefault(Graphs.transpose(endpointPair), v10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph
        public boolean hasEdgeConnecting(EndpointPair<N> endpointPair) {
            return delegate().hasEdgeConnecting(Graphs.transpose(endpointPair));
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.PredecessorsFunction
        public Set<N> predecessors(N n10) {
            return delegate().successors((ValueGraph<N, V>) n10);
        }

        @Override // com.google.common.graph.ForwardingValueGraph, com.google.common.graph.AbstractValueGraph, com.google.common.graph.AbstractBaseGraph, com.google.common.graph.BaseGraph, com.google.common.graph.SuccessorsFunction
        public Set<N> successors(N n10) {
            return delegate().predecessors((ValueGraph<N, V>) n10);
        }
    }

    private Graphs() {
    }

    private static boolean canTraverseWithoutReusingEdge(Graph<?> graph, Object obj, @CheckForNull Object obj2) {
        if (!graph.isDirected() && Objects.equal(obj2, obj)) {
            return false;
        }
        return true;
    }

    @CanIgnoreReturnValue
    public static int checkNonNegative(int i10) {
        Preconditions.checkArgument(i10 >= 0, "Not true that %s is non-negative.", i10);
        return i10;
    }

    @CanIgnoreReturnValue
    public static int checkPositive(int i10) {
        Preconditions.checkArgument(i10 > 0, "Not true that %s is positive.", i10);
        return i10;
    }

    public static <N> MutableGraph<N> copyOf(Graph<N> graph) {
        MutableGraph<N> mutableGraph = (MutableGraph<N>) GraphBuilder.from(graph).expectedNodeCount(graph.nodes().size()).build();
        for (N n10 : graph.nodes()) {
            mutableGraph.addNode(n10);
        }
        for (EndpointPair<N> endpointPair : graph.edges()) {
            mutableGraph.putEdge(endpointPair.nodeU(), endpointPair.nodeV());
        }
        return mutableGraph;
    }

    public static <N> boolean hasCycle(Graph<N> graph) {
        int size = graph.edges().size();
        if (size == 0) {
            return false;
        }
        if (graph.isDirected() || size < graph.nodes().size()) {
            HashMap newHashMapWithExpectedSize = Maps.newHashMapWithExpectedSize(graph.nodes().size());
            for (N n10 : graph.nodes()) {
                if (subgraphHasCycle(graph, newHashMapWithExpectedSize, n10, null)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static <N> MutableGraph<N> inducedSubgraph(Graph<N> graph, Iterable<? extends N> iterable) {
        MutableGraph<N> mutableGraph;
        if (iterable instanceof Collection) {
            mutableGraph = GraphBuilder.from(graph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableGraph = GraphBuilder.from(graph).build();
        }
        for (N n10 : iterable) {
            mutableGraph.addNode(n10);
        }
        for (N n11 : mutableGraph.nodes()) {
            for (N n12 : graph.successors((Graph<N>) n11)) {
                if (mutableGraph.nodes().contains(n12)) {
                    mutableGraph.putEdge(n11, n12);
                }
            }
        }
        return mutableGraph;
    }

    public static <N> Set<N> reachableNodes(Graph<N> graph, N n10) {
        Preconditions.checkArgument(graph.nodes().contains(n10), "Node %s is not an element of this graph.", n10);
        return ImmutableSet.copyOf(Traverser.forGraph(graph).breadthFirst((Traverser) n10));
    }

    private static <N> boolean subgraphHasCycle(Graph<N> graph, Map<Object, NodeVisitState> map, N n10, @CheckForNull N n11) {
        NodeVisitState nodeVisitState = map.get(n10);
        if (nodeVisitState == NodeVisitState.COMPLETE) {
            return false;
        }
        NodeVisitState nodeVisitState2 = NodeVisitState.PENDING;
        if (nodeVisitState == nodeVisitState2) {
            return true;
        }
        map.put(n10, nodeVisitState2);
        for (N n12 : graph.successors((Graph<N>) n10)) {
            if (canTraverseWithoutReusingEdge(graph, n12, n11) && subgraphHasCycle(graph, map, n12, n10)) {
                return true;
            }
        }
        map.put(n10, NodeVisitState.COMPLETE);
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.graph.MutableGraph, com.google.common.graph.Graph<N>] */
    public static <N> Graph<N> transitiveClosure(Graph<N> graph) {
        ?? build = GraphBuilder.from(graph).allowsSelfLoops(true).build();
        if (graph.isDirected()) {
            for (N n10 : graph.nodes()) {
                for (Object obj : reachableNodes(graph, n10)) {
                    build.putEdge(n10, obj);
                }
            }
        } else {
            HashSet hashSet = new HashSet();
            for (N n11 : graph.nodes()) {
                if (!hashSet.contains(n11)) {
                    Set reachableNodes = reachableNodes(graph, n11);
                    hashSet.addAll(reachableNodes);
                    int i10 = 1;
                    for (Object obj2 : reachableNodes) {
                        int i11 = i10 + 1;
                        for (Object obj3 : Iterables.limit(reachableNodes, i10)) {
                            build.putEdge(obj2, obj3);
                        }
                        i10 = i11;
                    }
                }
            }
        }
        return build;
    }

    public static <N> Graph<N> transpose(Graph<N> graph) {
        if (graph.isDirected()) {
            if (graph instanceof TransposedGraph) {
                return ((TransposedGraph) graph).graph;
            }
            return new TransposedGraph(graph);
        }
        return graph;
    }

    @CanIgnoreReturnValue
    public static long checkNonNegative(long j10) {
        Preconditions.checkArgument(j10 >= 0, "Not true that %s is non-negative.", j10);
        return j10;
    }

    @CanIgnoreReturnValue
    public static long checkPositive(long j10) {
        Preconditions.checkArgument(j10 > 0, "Not true that %s is positive.", j10);
        return j10;
    }

    public static <N, V> ValueGraph<N, V> transpose(ValueGraph<N, V> valueGraph) {
        if (valueGraph.isDirected()) {
            if (valueGraph instanceof TransposedValueGraph) {
                return ((TransposedValueGraph) valueGraph).graph;
            }
            return new TransposedValueGraph(valueGraph);
        }
        return valueGraph;
    }

    public static <N, V> MutableValueGraph<N, V> copyOf(ValueGraph<N, V> valueGraph) {
        MutableValueGraph<N, V> mutableValueGraph = (MutableValueGraph<N, V>) ValueGraphBuilder.from(valueGraph).expectedNodeCount(valueGraph.nodes().size()).build();
        for (N n10 : valueGraph.nodes()) {
            mutableValueGraph.addNode(n10);
        }
        for (EndpointPair<N> endpointPair : valueGraph.edges()) {
            N nodeU = endpointPair.nodeU();
            N nodeV = endpointPair.nodeV();
            V edgeValueOrDefault = valueGraph.edgeValueOrDefault(endpointPair.nodeU(), endpointPair.nodeV(), null);
            java.util.Objects.requireNonNull(edgeValueOrDefault);
            mutableValueGraph.putEdgeValue(nodeU, nodeV, edgeValueOrDefault);
        }
        return mutableValueGraph;
    }

    public static boolean hasCycle(Network<?, ?> network) {
        if (network.isDirected() || !network.allowsParallelEdges() || network.edges().size() <= network.asGraph().edges().size()) {
            return hasCycle(network.asGraph());
        }
        return true;
    }

    public static <N, E> Network<N, E> transpose(Network<N, E> network) {
        if (network.isDirected()) {
            if (network instanceof TransposedNetwork) {
                return ((TransposedNetwork) network).network;
            }
            return new TransposedNetwork(network);
        }
        return network;
    }

    public static <N, V> MutableValueGraph<N, V> inducedSubgraph(ValueGraph<N, V> valueGraph, Iterable<? extends N> iterable) {
        MutableValueGraph<N, V> mutableValueGraph;
        if (iterable instanceof Collection) {
            mutableValueGraph = ValueGraphBuilder.from(valueGraph).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableValueGraph = ValueGraphBuilder.from(valueGraph).build();
        }
        for (N n10 : iterable) {
            mutableValueGraph.addNode(n10);
        }
        for (N n11 : mutableValueGraph.nodes()) {
            for (N n12 : valueGraph.successors((ValueGraph<N, V>) n11)) {
                if (mutableValueGraph.nodes().contains(n12)) {
                    V edgeValueOrDefault = valueGraph.edgeValueOrDefault(n11, n12, null);
                    java.util.Objects.requireNonNull(edgeValueOrDefault);
                    mutableValueGraph.putEdgeValue(n11, n12, edgeValueOrDefault);
                }
            }
        }
        return mutableValueGraph;
    }

    public static <N> EndpointPair<N> transpose(EndpointPair<N> endpointPair) {
        return endpointPair.isOrdered() ? EndpointPair.ordered(endpointPair.target(), endpointPair.source()) : endpointPair;
    }

    public static <N, E> MutableNetwork<N, E> copyOf(Network<N, E> network) {
        MutableNetwork<N, E> mutableNetwork = (MutableNetwork<N, E>) NetworkBuilder.from(network).expectedNodeCount(network.nodes().size()).expectedEdgeCount(network.edges().size()).build();
        for (N n10 : network.nodes()) {
            mutableNetwork.addNode(n10);
        }
        for (E e10 : network.edges()) {
            EndpointPair<N> incidentNodes = network.incidentNodes(e10);
            mutableNetwork.addEdge(incidentNodes.nodeU(), incidentNodes.nodeV(), e10);
        }
        return mutableNetwork;
    }

    public static <N, E> MutableNetwork<N, E> inducedSubgraph(Network<N, E> network, Iterable<? extends N> iterable) {
        MutableNetwork<N, E> mutableNetwork;
        if (iterable instanceof Collection) {
            mutableNetwork = NetworkBuilder.from(network).expectedNodeCount(((Collection) iterable).size()).build();
        } else {
            mutableNetwork = NetworkBuilder.from(network).build();
        }
        for (N n10 : iterable) {
            mutableNetwork.addNode(n10);
        }
        for (N n11 : mutableNetwork.nodes()) {
            for (E e10 : network.outEdges(n11)) {
                N adjacentNode = network.incidentNodes(e10).adjacentNode(n11);
                if (mutableNetwork.nodes().contains(adjacentNode)) {
                    mutableNetwork.addEdge(n11, adjacentNode, e10);
                }
            }
        }
        return mutableNetwork;
    }
}
