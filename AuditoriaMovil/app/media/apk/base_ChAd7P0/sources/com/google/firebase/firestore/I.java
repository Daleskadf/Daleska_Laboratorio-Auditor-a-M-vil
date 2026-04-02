package com.google.firebase.firestore;

import android.util.SparseArray;
/* loaded from: classes.dex */
public enum I {
    OK(0),
    CANCELLED(1),
    UNKNOWN(2),
    INVALID_ARGUMENT(3),
    DEADLINE_EXCEEDED(4),
    NOT_FOUND(5),
    ALREADY_EXISTS(6),
    PERMISSION_DENIED(7),
    RESOURCE_EXHAUSTED(8),
    FAILED_PRECONDITION(9),
    ABORTED(10),
    OUT_OF_RANGE(11),
    UNIMPLEMENTED(12),
    INTERNAL(13),
    UNAVAILABLE(14),
    DATA_LOSS(15),
    UNAUTHENTICATED(16);
    
    private static final SparseArray<I> STATUS_LIST;
    private final int value;

    static {
        I[] values;
        SparseArray<I> sparseArray = new SparseArray<>();
        for (I i7 : values()) {
            I i8 = sparseArray.get(i7.value);
            if (i8 == null) {
                sparseArray.put(i7.value, i7);
            } else {
                throw new IllegalStateException("Code value duplication between " + i8 + "&" + i7.name());
            }
        }
        STATUS_LIST = sparseArray;
    }

    I(int i7) {
        this.value = i7;
    }

    public static I a(int i7) {
        return STATUS_LIST.get(i7, UNKNOWN);
    }
}
