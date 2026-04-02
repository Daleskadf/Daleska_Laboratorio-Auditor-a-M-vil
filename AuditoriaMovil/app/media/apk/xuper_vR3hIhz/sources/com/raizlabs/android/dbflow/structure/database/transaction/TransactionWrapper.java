package com.raizlabs.android.dbflow.structure.database.transaction;

import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
/* loaded from: classes3.dex */
public class TransactionWrapper implements ITransaction {
    private final List<ITransaction> transactions;

    public TransactionWrapper(ITransaction... iTransactionArr) {
        ArrayList arrayList = new ArrayList();
        this.transactions = arrayList;
        arrayList.addAll(Arrays.asList(iTransactionArr));
    }

    @Override // com.raizlabs.android.dbflow.structure.database.transaction.ITransaction
    public void execute(DatabaseWrapper databaseWrapper) {
        for (ITransaction iTransaction : this.transactions) {
            iTransaction.execute(databaseWrapper);
        }
    }

    public TransactionWrapper(Collection<ITransaction> collection) {
        ArrayList arrayList = new ArrayList();
        this.transactions = arrayList;
        arrayList.addAll(collection);
    }
}
