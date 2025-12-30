package com.paneedah.weaponlib2.network;

import io.netty.buffer.ByteBuf;

public interface UniversallySerializable {

	public void init(ByteBuf buf);
	
	public void serialize(ByteBuf buf);
}
