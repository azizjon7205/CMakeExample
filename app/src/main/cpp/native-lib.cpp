#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_example_cmakeexample_MainActivity_getPublicKey(JNIEnv *env, jobject object) {
    std::string publicKey = "myPublicKey";
    return env->NewStringUTF(publicKey.c_str());
}