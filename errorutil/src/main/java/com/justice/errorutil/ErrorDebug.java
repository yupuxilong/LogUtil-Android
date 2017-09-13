package com.justice.errorutil;
/**
 *
 */

import android.util.Log;

/**
 * ******************************************************************************
 * <p/>
 * Project Name  : LogUtilExample
 * Package       : com.justice.errorutil
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

public class ErrorDebug {

    public static final String TAG = "Awesome App";

    public static void e(String message) {
        Log.e(TAG, message);
    }
}
