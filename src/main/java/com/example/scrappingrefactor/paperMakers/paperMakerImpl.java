package com.example.scrappingrefactor.paperMakers;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;

@RequiredArgsConstructor
public sealed class paperMakerImpl permits MoorimServiceImpl, HansolServiceImpl, HankookServiceImpl,
        CnServiceImpl, HongwonServiceImpl{
    protected final Environment env;
}
