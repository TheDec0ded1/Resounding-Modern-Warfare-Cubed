package com.paneedah.weaponlib2;

import net.minecraft.client.model.ModelBase;

import java.util.List;

public interface ModelSource {

	public List<Tuple<ModelBase, String>> getTexturedModels();
	
	public CustomRenderer<?> getPostRenderer();
}
