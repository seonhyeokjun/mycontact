package com.seonhyeokjun.javaproject.project.mycontact.exception;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RenameIsNotPermittedException extends RuntimeException {
    private static final String MESSAGE = "이름을 변경 허용하지 않습니다.";

    public RenameIsNotPermittedException(){
        super(MESSAGE);
        log.error(MESSAGE);
    }
}
