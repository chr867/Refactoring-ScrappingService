package com.example.scrappingrefactor.paperMakers;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;

@RequiredArgsConstructor
public sealed abstract class paperMakerImpl permits MoorimServiceImpl, HansolServiceImpl, HankookServiceImpl,
        CnServiceImpl, HongwonServiceImpl{
    protected final Environment env;

    /* 공용으로 사용하는 함수(수정이 필요 없는)를 추상 클래스에 구현해 쉽게 사용할 수 있고자 함. */
    void abs(){

    }
}
