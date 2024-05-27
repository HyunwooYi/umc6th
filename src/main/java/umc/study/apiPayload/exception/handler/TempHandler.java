package umc.study.apiPayload.exception.handler;

import umc.study.apiPayload.code.status.BaseErrorCode;

public class TempHandler extends GeneralException {

    public TempHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}