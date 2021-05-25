package com.sk.flutterpatch;

import android.util.Log;

/**
 * |                   quu..__
 * |                    $$  `---.__
 * |                     "$        `--.                          ___.---uuudP
 * |                      `$           `.__.------.__     __.---'      $$$$"              .
 * |                        "          -'            `-.-'            $$$"              .'|
 * |                          ".                                       d$"             _.'  |
 * |                            `.   /                              ..."             .'     |
 * |                              `./                           ..::-'            _.'       |
 * |                               /                         .:::-'            .-'         .'
 * |                              :                          ::''\          _.'            |
 * |                             .' .-.             .-.           `.      .'               |
 * |                             : /'$$|           .@"$\           `.   .'              _.-'
 * |                            .'|$$|          |$$,$$|           |  <            _.-'
 * |                            | `:$$:'          :$$$$$:           `.  `.       .-'
 * |                            :                  `"--'             |    `-.     \
 * |                           :$$.       ==             .$$$.       `.      `.    `\
 * |                           |$$:                      :$$$:        |        >     >
 * |                           |$'     `..'`..'          `$$$'        x:      /     /
 * |                            \                                   xXX|     /    ./
 * |                             \                                xXXX'|    /   ./
 * |                             /`-.                                  `.  /   /
 * |                            :    `-  ...........,                   | /  .'
 * |                            |         ``:::::::'       .            |<    `.
 * |                            |             ```          |           x| \ `.:``.
 * |                            |                         .'    /'   xXX|  `:`M`M':.
 * |                            |    |                    ;    /:' xXXX'|  -'MMMMM:'
 * |                            `.  .'                   :    /:'       |-'MMMM.-'
 * |                             |  |                   .'   /'        .'MMM.-'
 * |                             `'`'                   :  ,'          |MMM<
 * |                               |                     `'            |tbap\
 * |                                \                                  :MM.-'
 * |                                 \                 |              .''
 * |                                  \.               `.            /
 * |                                   /     .:::::::.. :           /
 * |                                  |     .:::::::::::`.         /
 * |                                  |   .:::------------\       /
 * |                                 /   .''               >::'  /
 * |                                 `',:                 :    .'
 * |
 * |                                                      `:.:'
 * |
 * |
 * |
 *
 * @author SK on 2021/5/25
 * contact magicbaby810@gmail.com
 */


public class TinkerLog {
    private static final String TAG = "Tinker.TinkerLog";
    private static TinkerLog.TinkerLogImp debugLog = new TinkerLog.TinkerLogImp() {
        public void v(String tag, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            Log.v(tag, log);
        }

        public void i(String tag, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            Log.i(tag, log);
        }

        public void d(String tag, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            Log.d(tag, log);
        }

        public void w(String tag, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            Log.w(tag, log);
        }

        public void e(String tag, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            Log.e(tag, log);
        }

        public void printErrStackTrace(String tag, Throwable tr, String format, Object... params) {
            String log = params != null && params.length != 0 ? String.format(format, params) : format;
            if (log == null) {
                log = "";
            }

            log = log + "  " + Log.getStackTraceString(tr);
            Log.e(tag, log);
        }
    };
    private static TinkerLog.TinkerLogImp tinkerLogImp;

    public TinkerLog() {
    }

    public static void setTinkerLogImp(TinkerLog.TinkerLogImp imp) {
        tinkerLogImp = imp;
    }

    public static TinkerLog.TinkerLogImp getImpl() {
        return tinkerLogImp;
    }

    public static void v(String tag, String msg, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.v(tag, msg, obj);
        }

    }

    public static void e(String tag, String msg, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.e(tag, msg, obj);
        }

    }

    public static void w(String tag, String msg, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.w(tag, msg, obj);
        }

    }

    public static void i(String tag, String msg, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.i(tag, msg, obj);
        }

    }

    public static void d(String tag, String msg, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.d(tag, msg, obj);
        }

    }

    public static void printErrStackTrace(String tag, Throwable tr, String format, Object... obj) {
        if (tinkerLogImp != null) {
            tinkerLogImp.printErrStackTrace(tag, tr, format, obj);
        }

    }

    static {
        tinkerLogImp = debugLog;
    }

    public interface TinkerLogImp {
        void v(String var1, String var2, Object... var3);

        void i(String var1, String var2, Object... var3);

        void w(String var1, String var2, Object... var3);

        void d(String var1, String var2, Object... var3);

        void e(String var1, String var2, Object... var3);

        void printErrStackTrace(String var1, Throwable var2, String var3, Object... var4);
    }
}
