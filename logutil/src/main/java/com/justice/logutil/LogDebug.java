package com.justice.logutil;
/**
 *
 */

import android.util.Log;

/**
 * ******************************************************************************
 * <p/>
 * Project Name  : LogUtilExample
 * Package       : com.justice.logutil
 * <p/>
 * <p/>
 * Copyright 派沃特科技
 * <p/>
 * <Pre>
 * TODO
 * </Pre>
 * Created by Justice on 2017/9/13.
 * <p/>
 * <p/>
 * ********************************************************************************
 */

public class LogDebug {
    
    public static final String TAG = "Awesome App";

    public static void d(String message) {
        Log.d(TAG, message);
    }
}
