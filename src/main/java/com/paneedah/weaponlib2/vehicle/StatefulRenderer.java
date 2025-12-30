package com.paneedah.weaponlib2.vehicle;

public interface StatefulRenderer<State> {
    
    public void render(PartRenderContext<State> context);
}
