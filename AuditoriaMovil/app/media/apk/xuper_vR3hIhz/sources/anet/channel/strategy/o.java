package anet.channel.strategy;

import java.util.Comparator;
/* loaded from: classes.dex */
final class o implements Comparator<StrategyCollection> {
    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        if (strategyCollection.f4148b != strategyCollection2.f4148b) {
            return (int) (strategyCollection.f4148b - strategyCollection2.f4148b);
        }
        return strategyCollection.f4147a.compareTo(strategyCollection2.f4147a);
    }
}
