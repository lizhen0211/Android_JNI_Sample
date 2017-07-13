//
// Created by Administrator on 2017/7/13.
//

#include "com_lz_example_android_jni_sample_JniUtils.h"
/* *
Class:     io_github_yanbober_ndkapplication_NdkJniUtils
 * Method:    getCLanguageString
* Signature: ()Ljava/lang/String;
*/
JNIEXPORT jstring JNICALL Java_com_lz_example_android_1jni_1sample_JniUtils_getStringFormC  (JNIEnv *env, jobject obj){
    return (*env)->NewStringUTF(env,"This just a test for Android Studio NDK JNI developer!");
 }