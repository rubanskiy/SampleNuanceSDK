package com.nuance.nmdp.sample;

public class AppInfo
{
    /**
     * The login parameters should be specified in the following manner:
     * 
     * public static final String SpeechKitServer = "ndev.server.name";
     * 
     * public static final int SpeechKitPort = 1000;
     * 
     * public static final String SpeechKitAppId = "ExampleSpeechKitSampleID";
     * 
     * public static final byte[] SpeechKitApplicationKey =
     * {
     *     (byte)0x38, (byte)0x32, (byte)0x0e, (byte)0x46, (byte)0x4e, (byte)0x46, (byte)0x12, (byte)0x5c, (byte)0x50, (byte)0x1d,
     *     (byte)0x4a, (byte)0x39, (byte)0x4f, (byte)0x12, (byte)0x48, (byte)0x53, (byte)0x3e, (byte)0x5b, (byte)0x31, (byte)0x22,
     *     (byte)0x5d, (byte)0x4b, (byte)0x22, (byte)0x09, (byte)0x13, (byte)0x46, (byte)0x61, (byte)0x19, (byte)0x1f, (byte)0x2d,
     *     (byte)0x13, (byte)0x47, (byte)0x3d, (byte)0x58, (byte)0x30, (byte)0x29, (byte)0x56, (byte)0x04, (byte)0x20, (byte)0x33,
     *     (byte)0x27, (byte)0x0f, (byte)0x57, (byte)0x45, (byte)0x61, (byte)0x5f, (byte)0x25, (byte)0x0d, (byte)0x48, (byte)0x21,
     *     (byte)0x2a, (byte)0x62, (byte)0x46, (byte)0x64, (byte)0x54, (byte)0x4a, (byte)0x10, (byte)0x36, (byte)0x4f, (byte)0x64
     * };
     * 
     * Please note that all the specified values are non-functional
     * and are provided solely as an illustrative example.
     * 
     */

    /* Please contact Nuance to receive the necessary connection and login parameters */
    public static final String SpeechKitServer = "sandbox.nmdp.nuancemobility.net";/* Enter your server here */;

    public static final int SpeechKitPort = 443;/* Enter your port here */;
    
    public static final boolean SpeechKitSsl = false;

    public static final String SpeechKitAppId = "NMDPTRIAL_kim105920150326082608";/* Enter your ID here */;

    public static final byte[] SpeechKitApplicationKey = {
    	(byte)0x00, (byte)0xce, (byte)0xff, (byte)0x19, (byte)0xd3, (byte)0x4e, (byte)0xec, (byte)0xad, (byte)0xd7, (byte)0x4e, (byte)0x5d, (byte)0x83, (byte)0xc1, (byte)0x42, (byte)0x04, (byte)0x7d, (byte)0x6c, (byte)0xb2, (byte)0xf6, (byte)0x2e, (byte)0x76, (byte)0x2c, (byte)0xaa, (byte)0xae, (byte)0xf6, (byte)0x35, (byte)0x37, (byte)0xe5, (byte)0x17, (byte)0x4e, (byte)0xaf, (byte)0x17, (byte)0x1c, (byte)0xaf, (byte)0x30, (byte)0xef, (byte)0xfd, (byte)0x1c, (byte)0x9c, (byte)0xd4, (byte)0x6a, (byte)0xf9, (byte)0x58, (byte)0x2b, (byte)0x3b, (byte)0x5c, (byte)0xa8, (byte)0xa8, (byte)0x0e, (byte)0x9e, (byte)0xd6, (byte)0x85, (byte)0xca, (byte)0x80, (byte)0x33, (byte)0xc1, (byte)0xb5, (byte)0x6b, (byte)0xa6, (byte)0xcd, (byte)0xb9, (byte)0x55, (byte)0xe4, (byte)0xd5
    };
}
