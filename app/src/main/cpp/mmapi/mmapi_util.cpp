//
// Created by woesss on 09.07.2023.
//

#include <cstdio>
#include "mmapi_util.h"
#include "libsonivox/eas_types.h"

const char *MMAPI_GetErrorString(int errorCode) {
    int idx = -errorCode;
    if (idx < sizeof(EAS_ERRORS) / sizeof(EAS_ERRORS[0])) {
        return EAS_ERRORS[idx];
    } else if (errorCode == EAS_EOF) {
        return "EAS_EOF";
    } else {
        static char str[4];
        sprintf(str, "%d", errorCode);
        return str;
    }
}

const char *MMAPI_GetFileTypeString(int type) {
    if (type >= 0 && type < sizeof(EAS_ERRORS) / sizeof(EAS_ERRORS[0])) {
        return EAS_FILE_TYPES[type];
    }
    return EAS_FILE_TYPES[0];
}