package s2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ b[] $VALUES;
    public static final b activityMissing;
    public static final b errorWhileAcquiringPosition;
    public static final b locationServicesDisabled;
    public static final b permissionDefinitionsNotFound;
    public static final b permissionDenied;
    public static final b permissionRequestInProgress;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Enum, s2.b] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Enum, s2.b] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Enum, s2.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, s2.b] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Enum, s2.b] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Enum, s2.b] */
    static {
        ?? r62 = new Enum("activityMissing", 0);
        activityMissing = r62;
        ?? r7 = new Enum("errorWhileAcquiringPosition", 1);
        errorWhileAcquiringPosition = r7;
        ?? r8 = new Enum("locationServicesDisabled", 2);
        locationServicesDisabled = r8;
        ?? r9 = new Enum("permissionDefinitionsNotFound", 3);
        permissionDefinitionsNotFound = r9;
        ?? r10 = new Enum("permissionDenied", 4);
        permissionDenied = r10;
        ?? r11 = new Enum("permissionRequestInProgress", 5);
        permissionRequestInProgress = r11;
        $VALUES = new b[]{r62, r7, r8, r9, r10, r11};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String a() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return "Already listening for location updates. If you want to restart listening please cancel other subscriptions first";
                            }
                            throw new IndexOutOfBoundsException();
                        }
                        return "User denied permissions to access the device's location.";
                    }
                    return "No location permissions are defined in the manifest. Make sure at least ACCESS_FINE_LOCATION or ACCESS_COARSE_LOCATION are defined in the manifest.";
                }
                return "Location services are disabled. To receive location updates the location services should be enabled.";
            }
            return "An unexpected error occurred while trying to acquire the device's position.";
        }
        return "Activity is missing. This might happen when running a certain function from the background that requires a UI element (e.g. requesting permissions or enabling the location services).";
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return "PERMISSION_REQUEST_IN_PROGRESS";
                            }
                            throw new IndexOutOfBoundsException();
                        }
                        return "PERMISSION_DENIED";
                    }
                    return "PERMISSION_DEFINITIONS_NOT_FOUND";
                }
                return "LOCATION_SERVICES_DISABLED";
            }
            return "ERROR_WHILE_ACQUIRING_POSITION";
        }
        return "ACTIVITY_MISSING";
    }
}
