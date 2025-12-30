package com.paneedah.weaponlib2;

public enum AttachmentCategory {
    SCOPE, GRIP, SILENCER, LASER, MAGAZINE, BULLET, SKIN, RAILING, GUARD, STOCK, BACKGRIP, RECEIVER, FRONTSIGHT, EXTRA, EXTRA2, EXTRA3, EXTRA4, EXTRA5, EXTRA6, EXTRA7, EXTRA8, EXTRA9, EXTRA10, EXTRA11, EXTRA12, MAGICMAG, ACTION, BARREL, REARSIGHT, ADAPTER, STOCKADAPTER, RAILADAPTER, RECEIVER2, HANDLE, DECOR;
    
    public static final AttachmentCategory[] values = values();
    
    public static AttachmentCategory valueOf(int ordinal) {
        return values[ordinal];
    }
}
