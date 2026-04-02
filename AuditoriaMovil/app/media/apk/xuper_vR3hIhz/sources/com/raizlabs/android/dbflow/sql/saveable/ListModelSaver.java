package com.raizlabs.android.dbflow.sql.saveable;

import com.raizlabs.android.dbflow.structure.database.DatabaseStatement;
import com.raizlabs.android.dbflow.structure.database.DatabaseWrapper;
import java.util.Collection;
/* loaded from: classes3.dex */
public class ListModelSaver<TModel> {
    private final ModelSaver<TModel> modelSaver;

    public ListModelSaver(ModelSaver<TModel> modelSaver) {
        this.modelSaver = modelSaver;
    }

    public synchronized void deleteAll(Collection<TModel> collection) {
        deleteAll(collection, this.modelSaver.getWritableDatabase());
    }

    public ModelSaver<TModel> getModelSaver() {
        return this.modelSaver;
    }

    public synchronized void insertAll(Collection<TModel> collection) {
        insertAll(collection, this.modelSaver.getWritableDatabase());
    }

    public synchronized void saveAll(Collection<TModel> collection) {
        saveAll(collection, this.modelSaver.getWritableDatabase());
    }

    public synchronized void updateAll(Collection<TModel> collection) {
        updateAll(collection, this.modelSaver.getWritableDatabase());
    }

    public synchronized void deleteAll(Collection<TModel> collection, DatabaseWrapper databaseWrapper) {
        if (collection.isEmpty()) {
            return;
        }
        DatabaseStatement deleteStatement = this.modelSaver.getModelAdapter().getDeleteStatement(databaseWrapper);
        for (TModel tmodel : collection) {
            this.modelSaver.delete(tmodel, deleteStatement, databaseWrapper);
        }
        deleteStatement.close();
    }

    public synchronized void insertAll(Collection<TModel> collection, DatabaseWrapper databaseWrapper) {
        if (collection.isEmpty()) {
            return;
        }
        DatabaseStatement insertStatement = this.modelSaver.getModelAdapter().getInsertStatement(databaseWrapper);
        for (TModel tmodel : collection) {
            this.modelSaver.insert(tmodel, insertStatement, databaseWrapper);
        }
        insertStatement.close();
    }

    public synchronized void saveAll(Collection<TModel> collection, DatabaseWrapper databaseWrapper) {
        if (collection.isEmpty()) {
            return;
        }
        DatabaseStatement insertStatement = this.modelSaver.getModelAdapter().getInsertStatement(databaseWrapper);
        DatabaseStatement updateStatement = this.modelSaver.getModelAdapter().getUpdateStatement(databaseWrapper);
        for (TModel tmodel : collection) {
            this.modelSaver.save((ModelSaver<TModel>) tmodel, databaseWrapper, insertStatement, updateStatement);
        }
        insertStatement.close();
        updateStatement.close();
    }

    public synchronized void updateAll(Collection<TModel> collection, DatabaseWrapper databaseWrapper) {
        if (collection.isEmpty()) {
            return;
        }
        DatabaseStatement updateStatement = this.modelSaver.getModelAdapter().getUpdateStatement(databaseWrapper);
        for (TModel tmodel : collection) {
            this.modelSaver.update((ModelSaver<TModel>) tmodel, databaseWrapper, updateStatement);
        }
        updateStatement.close();
    }
}
