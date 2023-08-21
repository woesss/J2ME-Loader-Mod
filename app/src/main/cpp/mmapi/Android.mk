LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_SRC_FILES = \
	mmapi_jni.cpp \
	mmapi_player.cpp \
	mmapi_util.cpp \
	mmapi_file.cpp \


LOCAL_CFLAGS += -O2 \

LOCAL_C_INCLUDES := $(LOCAL_PATH) \

LOCAL_ARM_MODE := arm

LOCAL_MODULE := mmapi

LOCAL_SHARED_LIBRARIES := oboe sonivox util mmapi_common

ifeq ($(TARGET_ARCH_ABI),armeabi-v7a)
    LOCAL_ARM_NEON := false
endif

# Don't strip debug builds
ifeq ($(NDK_DEBUG),1)
    cmd-strip :=
endif

include $(BUILD_SHARED_LIBRARY)

$(call import-module,prefab/oboe)