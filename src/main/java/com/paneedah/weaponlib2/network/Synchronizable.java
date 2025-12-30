package com.paneedah.weaponlib2.network;

public interface Synchronizable<T, SyncContext> {

	public T sync(SyncContext context);
}
