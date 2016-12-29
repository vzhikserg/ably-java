package io.ably.lib.util;

import android.os.Build;

public class Platform {
	/* The msgpack-core library at 0.8.11 has issues on 4.4.2 and probably earlier */
	public static boolean supportsMsgpack() {
		return (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP);
	}
}
