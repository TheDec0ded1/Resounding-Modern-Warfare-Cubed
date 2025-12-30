package com.paneedah.weaponlib2.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ConfigSync {
	
	String category();
	String comment();

}
